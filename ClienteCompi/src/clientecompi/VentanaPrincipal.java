package clientecompi;


import estructuras.ListaArchivo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import javax.swing.text.Utilities;

public class VentanaPrincipal extends JFrame implements ActionListener {

    private JMenuBar barraMenu;
    private JMenu archivo;
    private JMenu editar;
    private JMenuItem nuevo;
    private JMenuItem abrir;
    private JMenuItem guardar;
    private JMenuItem guardarComo;
    private JMenuItem agregarPestana;
    private JMenuItem quitarPestana;
    private JPanel panelSuperior;
    private JPanel panelInferior;
    private JTabbedPane tabPestanas;
    private int contadorPestanas;
    private JLabel fil2, col1;

    public VentanaPrincipal() throws HeadlessException {
        super("VC9000");
        initComponents();
        contadorPestanas = 0;
        ingresarNuevo();
        this.setVisible(true);
    }

    private void initComponents() {
        this.setLayout(null);
        this.setBounds(85, 20, 1200, 700);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.iniciarMenu();
        this.iniciarPaneles();
    }

    private void ingresarNuevo() {
        tabPestanas.addTab("", new Pestana(this));
        contadorPestanas = tabPestanas.getTabCount() - 1;
        tabPestanas.setTabComponentAt(contadorPestanas, new JLabel("Nuevo " + contadorPestanas));
        tabPestanas.setSelectedIndex(contadorPestanas);
        this.agregarBarraEstado();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == agregarPestana || e.getSource() == nuevo) {
            ingresarNuevo();
        }
        if (e.getSource() == quitarPestana) {
            quitarNuevo();
        }
        if (e.getSource() == abrir) {
            abrirArchivo();
        }
        if (e.getSource() == guardarComo) {
            guardarComoArchivo();
        }

        if (e.getSource() == guardar) {
            guardarArchivo();
        }
    }

    private void quitarNuevo() {
        if (tabPestanas.getTabCount() > 0) {
            tabPestanas.remove(tabPestanas.getSelectedIndex());
            contadorPestanas = tabPestanas.getTabCount() - 1;
        }
    }

    private void guardarArchivo() {
        Pestana cuadroDeTexto = (Pestana) tabPestanas.getSelectedComponent();
        if (!cuadroDeTexto.isGuardado()) {
            guardarComoArchivo();
        } else {
            try {
                File guardar = new File(cuadroDeTexto.getRuta());
                FileWriter escritor = new FileWriter(guardar);
                escritor.write(cuadroDeTexto.getCampo().getTexto().getText());
                escritor.close();
            } catch (Exception e) {
                System.out.println("Algo salió mal");
            }
        }
    }

    private void abrirArchivo() {
        String texto = "", aux = "";
        try {
            JFileChooser abridor = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de CP", "cp");
            abridor.setFileFilter(filtro);
            abridor.showOpenDialog(this);
            File archivo = abridor.getSelectedFile();
            if (archivo != null) {

                FileReader lector = new FileReader(archivo);
                BufferedReader buffer = new BufferedReader(lector);
                while ((aux = buffer.readLine()) != null) {
                    texto += aux + "\n";
                }
                if (!esUnico()) {
                    ingresarNuevo(archivo.getName());
                    tabPestanas.setSelectedIndex(tabPestanas.getTabCount() - 1);
                } else {
                    tabPestanas.setTabComponentAt(tabPestanas.getSelectedIndex(), new JLabel(archivo.getName()));
                }
                //String nuevo = texto.substring(1);
                Pestana cuadroDeTexto = (Pestana) tabPestanas.getSelectedComponent();
                cuadroDeTexto.getCampo().getTexto().setText(texto);
                cuadroDeTexto.setGuardado(true);
                cuadroDeTexto.setRuta(archivo.getPath());
            }
        } catch (Exception e) {
            System.out.println("Algo salió mal");
            e.printStackTrace();
        }
    }

    private boolean esUnico() {
        if (tabPestanas.getTabCount() > 0) {
            Pestana condicion = (Pestana) tabPestanas.getComponentAt(0);
            return (tabPestanas.getTabCount() == 1 && condicion.isGuardado());
        }
        return false;
    }

    private void ingresarNuevo(String nombre) {
        tabPestanas.addTab("", new Pestana(this));
        contadorPestanas = tabPestanas.getTabCount() - 1;
        tabPestanas.setTabComponentAt(contadorPestanas, new JLabel(nombre));
        tabPestanas.setSelectedIndex(contadorPestanas);
        this.agregarBarraEstado();
    }

    private void guardarComoArchivo() {
        Pestana area = (Pestana) tabPestanas.getSelectedComponent();
        JFileChooser guardador = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos CP", "cp");
        guardador.setFileFilter(filtro);
        guardador.showSaveDialog(this);
        if (guardador.getSelectedFile() != null) {
            File archivo;
            if (guardador.getSelectedFile().getAbsolutePath().endsWith(".cp")) {
                archivo = new File(guardador.getSelectedFile().getAbsolutePath());
            } else {
                archivo = new File(guardador.getSelectedFile().getAbsolutePath() + ".cp");
            }
            try {
                FileWriter escritor = new FileWriter(archivo);
                escritor.write(area.getCampo().getTexto().getText());
                escritor.close();
            } catch (IOException ex) {
                System.out.println("Algo salió mal");
            }
            tabPestanas.setTabComponentAt(tabPestanas.getSelectedIndex(), new JLabel(archivo.getName()));
            area.setRuta(archivo.getPath());
            area.setGuardado(true);
            System.out.println(area.getRuta());
        }
    }

    private void iniciarPaneles() {
        panelSuperior = new JPanel();
        panelSuperior.setLayout(null);
        panelSuperior.setBounds(0, 0, 1194, 75);
        
        col1 = new JLabel();
        fil2 = new JLabel();
        
        col1.setBounds(15, 15, 80, 20);
        fil2.setBounds(15, 25, 80, 30);
        
        panelSuperior.add(col1);
        panelSuperior.add(fil2);

        panelInferior = new JPanel();
        panelInferior.setLayout(new BorderLayout());
        panelInferior.setBounds(0, 75, 1194, 569);

        tabPestanas = new JTabbedPane();
        tabPestanas.setOpaque(false);
        panelInferior.add(tabPestanas, BorderLayout.CENTER);
        //------------------------
        this.add(panelInferior);
        this.add(panelSuperior);
    }

    private void iniciarMenu() {
        barraMenu = new JMenuBar();
        archivo = new JMenu("Archivo");
        editar = new JMenu("Editar");
        //----
        nuevo = new JMenuItem("Nuevo");
        nuevo.addActionListener(this);
        abrir = new JMenuItem("Abrir");
        abrir.addActionListener(this);
        guardar = new JMenuItem("Guardar");
        guardar.addActionListener(this);
        guardarComo = new JMenuItem("Guardar como");
        guardarComo.addActionListener(this);
        agregarPestana = new JMenuItem("Agregar nueva pestaña");
        agregarPestana.addActionListener(this);
        quitarPestana = new JMenuItem("Quitar pestaña actual");
        quitarPestana.addActionListener(this);
        archivo.add(nuevo);
        archivo.add(abrir);
        archivo.add(guardar);
        archivo.add(guardarComo);
        editar.add(agregarPestana);
        editar.add(quitarPestana);
        barraMenu.add(archivo);
        barraMenu.add(editar);

        this.setJMenuBar(barraMenu);

    }

    public JsonObject crearSolicitud(ListaArchivo listaUno, ListaArchivo listaDos) {
        try {
            Socket envio = new Socket("localhost", 4500);

            ObjectOutputStream salida = new ObjectOutputStream(envio.getOutputStream());

            salida.writeObject(listaUno);
            salida.writeObject(listaDos);

            ObjectInputStream entrada = new ObjectInputStream(envio.getInputStream());
            String cosa = (String) entrada.readObject();
            System.out.println(cosa);

            JsonObject json = (JsonObject) entrada.readObject();

            System.out.println(json);

            salida.close();
            entrada.close();
            envio.close();
            return json;

        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private void agregarBarraEstado() {
        Pestana area = (Pestana) tabPestanas.getSelectedComponent();
        JTextPane campo = area.getCampo().getTexto();
        campo.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                try {
                    campoCaretUpdate(e);
                } catch (BadLocationException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            private void campoCaretUpdate(CaretEvent e) throws BadLocationException {
                int fila = 0;
                int columna = 0;
                try {
                    int caretPos = campo.getCaretPosition();
                    fila = (caretPos == 0) ? 1 : 0;
                    for (int offsets = caretPos; offsets > 0;) {
                        offsets = Utilities.getRowStart(campo, offsets) - 1;
                        fila++;
                    }
                } catch (Exception evt) {
                }
                int offset = campo.getCaretPosition();
                columna = offset - Utilities.getRowStart(campo, offset);

                fil2.setText("Fila: " + fila);
                col1.setText("Columna: " + columna);
            }
        });
    }
}
