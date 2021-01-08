package clientecompi;

import analizadores.LexicoCP;
import analizadores.LexicoHTML;
import analizadores.SintacticoCP;
import analizadores.SintacticoHTML;

import estructuras.ListaArchivo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Pestana extends JPanel implements ActionListener {

    private JLabel noti;
    private JPanel panelDerecho;
    private JPanel panelIzquierdo;
    private CampoTexto campo;
    private String ruta;
    private ListaArchivo proyectoDos;
    private ListaArchivo proyectoUno;
    private boolean guardado;
    private VentanaPrincipal ventana;
    private JButton obtenerTree;
    private JButton generar;
    private JButton agregarUno;
    private JButton agregarDos;
    private JTextField rutaUno;
    private JTextField rutaDos;
    private JButton solicitar;
    private Juanson reporte;
    private JTextArea console;

    public Pestana(VentanaPrincipal ventana) {
        this.ventana = ventana;
        this.setLayout(null);
        this.setBounds(0, 0, 1194, 569);
        ajustarCosas();
        guardado = false;
        ruta = "";
        proyectoDos = new ListaArchivo();
        proyectoUno = new ListaArchivo();
        reporte = new Juanson();
    }

    private void ajustarCosas() {
        panelIzquierdo = new JPanel();
        panelIzquierdo.setLayout(new BorderLayout());
        panelIzquierdo.setBounds(0, 0, 800, 542);
        campo = new CampoTexto(new JPanel());
        panelIzquierdo.add(campo, BorderLayout.CENTER);

        //---
        panelDerecho = new JPanel();
        panelDerecho.setLayout(null);
        panelDerecho.setBounds(800, 0, 387, 542);

        this.add(panelIzquierdo);
        this.add(panelDerecho);

        this.ajustarBotones();
    }

    private void ajustarBotones() {
        agregarUno = new JButton("Agregar proyecto");
        agregarUno.setBounds(25, 15, 160, 30);
        agregarUno.addActionListener(this);

        rutaUno = new JTextField();
        rutaUno.setEditable(false);
        rutaUno.setBounds(25, 50, 160, 30);

        agregarDos = new JButton("Agregar proyecto");
        agregarDos.setBounds(25, 85, 160, 30);
        agregarDos.addActionListener(this);

        rutaDos = new JTextField();
        rutaDos.setBounds(25, 120, 160, 30);
        rutaDos.setEditable(false);

        solicitar = new JButton("Solicitar JSON");
        solicitar.addActionListener(this);
        solicitar.setBounds(25, 160, 160, 30);

        noti = new JLabel("<html><body>No hay archivo<br>JSON disponible.</body></html>");
        noti.setFont(new java.awt.Font("Arial", 0, 14));
        noti.setBounds(200, 15, 160, 40);

        obtenerTree = new JButton("Obtener Árbol");
        obtenerTree.setBounds(200, 70, 160, 30);
        obtenerTree.addActionListener(this);
        obtenerTree.setEnabled(false);

        generar = new JButton("Generar reporte");
        generar.setBounds(200, 115, 160, 30);
        generar.addActionListener(this);
        generar.setEnabled(false);
        
        console = new JTextArea();
        console.setBounds(10, 200, 370, 325);
        console.setEditable(false);
        console.setOpaque(false);

        panelDerecho.add(agregarUno);
        panelDerecho.add(rutaUno);
        panelDerecho.add(agregarDos);
        panelDerecho.add(rutaDos);
        panelDerecho.add(solicitar);
        panelDerecho.add(noti);
        panelDerecho.add(obtenerTree);
        panelDerecho.add(generar);
        panelDerecho.add(console);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == agregarUno) {
            ingresarProyecto(rutaUno, proyectoUno);
        }
        if (e.getSource() == agregarDos) {
            ingresarProyecto(rutaDos, proyectoDos);
        }
        if (e.getSource() == solicitar) {
            verificarSolicitud();
        }
        if (e.getSource() == obtenerTree){
            new Arbol(reporte.getArbol());
        }
        if (e.getSource() == generar){
            analizar();
        }
    }

    private void ingresarProyecto(JTextField campo, ListaArchivo lista) {
        lista.vaciar();
        JFileChooser abrir = new JFileChooser();
        abrir.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        abrir.showOpenDialog(null);
        try {
            File directorioPrincipal = abrir.getSelectedFile();
            if (directorioPrincipal != null) {
                guardarArchivos(directorioPrincipal, lista);
                campo.setText(obtenerNombre(directorioPrincipal.getAbsolutePath()));
                lista.setTitulo(campo.getText().trim());
            } else {
                campo.setText("");
            }
        } catch (Exception e) {
        }
    }

    private String obtenerNombre(String path) {
        char[] arreglo = path.toCharArray();
        String ret = "";
        int end = arreglo.length;
        int start = end - 1;
        while (arreglo[start] != '\\') {
            start--;
        }
        start++;
        ret = path.substring(start, end);
        return ret;
    }

    private void guardarArchivos(File directorio, ListaArchivo lista) {
        File[] archivos = directorio.listFiles();
        for (File archivo : archivos) {
            if (archivo.isDirectory()) {
                guardarArchivos(archivo, lista);
            } else if (archivo.getAbsolutePath().endsWith(".java")) {
                lista.insertar(archivo.getAbsolutePath());
            }
        }
    }

    private void verificarSolicitud() {
        if (!proyectoUno.esVacia() && !proyectoDos.esVacia()) {
            JsonObject archivo = ventana.crearSolicitud(proyectoUno, proyectoDos);
            if (archivo != null) {
                
                reporte.setVacio(false);
                obtenerTree.setEnabled(true);
                generar.setEnabled(true);
                noti.setText("<html><body>Archivo<br>JSON disponible.</body></html>");
            } else {
                obtenerTree.setEnabled(false);
                generar.setEnabled(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe incluir dos proyectos con"
                    + " archivos .java");
        }
    }
    
    private void analizar(){
        try {
            console.setText("");
            String text = campo.getTexto().getText();
            LexicoHTML lex = new LexicoHTML(new BufferedReader(new StringReader(text)));
            SintacticoHTML sin = new SintacticoHTML(lex);
            sin.parse();
            System.out.println("C:\n");
            LexicoCP anotherlex = new LexicoCP(new BufferedReader(new StringReader(text)));
            anotherlex.consola = console;
            SintacticoCP anothersin = new SintacticoCP(anotherlex);
            anothersin.consola = console;
            anothersin.objetoJson = reporte;
            anothersin.parse();
            System.out.println("FIN");
        } catch (IOException ex) {
            Logger.getLogger(Pestana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Pestana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the campo
     */
    public CampoTexto getCampo() {
        return campo;
    }

    /**
     * @param campo the campo to set
     */
    public void setCampo(CampoTexto campo) {
        this.campo = campo;
    }

    /**
     * @return the ruta
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * @param ruta the ruta to set
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    /**
     * @return the proyectoDos
     */
    public ListaArchivo getProyectoDos() {
        return proyectoDos;
    }

    /**
     * @param proyectoDos the proyectoDos to set
     */
    public void setProyectoDos(ListaArchivo proyectoDos) {
        this.proyectoDos = proyectoDos;
    }

    /**
     * @return the proyectoUno
     */
    public ListaArchivo getProyectoUno() {
        return proyectoUno;
    }

    /**
     * @param proyectoUno the proyectoUno to set
     */
    public void setProyectoUno(ListaArchivo proyectoUno) {
        this.proyectoUno = proyectoUno;
    }

    /**
     * @return the guardado
     */
    public boolean isGuardado() {
        return guardado;
    }

    /**
     * @param guardado the guardado to set
     */
    public void setGuardado(boolean guardado) {
        this.guardado = guardado;
    }

    /**
     * @return the reporte
     */
    public Juanson getReporte() {
        return reporte;
    }

    /**
     * @param reporte the reporte to set
     */
    public void setReporte(Juanson reporte) {
        this.reporte = reporte;
    }

}
