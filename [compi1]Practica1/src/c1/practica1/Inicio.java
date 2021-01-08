package c1.practica1;


import Analizador.parser;
import Analizador.scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import javax.swing.text.Utilities;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.Font;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Image;
import java.awt.Desktop;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedList;





public class Inicio extends javax.swing.JFrame{
    
    public static LinkedList<String> lisErrores=new LinkedList<String>();
    public static LinkedList<Encabezado> lisEncabezado=new LinkedList<Encabezado>();
    public static LinkedList<Estudiante> lisEstudiante=new LinkedList<Estudiante>();
    
    public static Integer Tareas;
    public static Integer Hojas;
    public static Integer ExamenCorto;
    public static Integer Practicas;
    public static Integer Proyectos;
    public static Integer Final;
    
    public static boolean ra;
    public static boolean rr;
    public static boolean re;
    public static boolean rp;
    
    public static boolean aprobado;
    public static boolean reprobado;
    
    private Reporte generadorReportes;
    
    LinkedList<JButton> listabtn;
    int x,y;
    boolean bandera;
    
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("XML REPORT ESTUDENT");
        jLabel4.setText("Linea:0 Columna:0");
        listabtn=new LinkedList<JButton>();
        x=40;
        y=10;
        bandera=true;
        ra=rr=re=rp=aprobado=reprobado=false;
    }
    
    private void actualizarPos(){
        CampoTexto area = (CampoTexto) this.jTabbedPane1.getSelectedComponent();
        JTextPane campo = area.getTexto();
        campo.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                try {
                    campoCaretUpdate(e);
                } catch (BadLocationException ex) {
                    
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

                jLabel4.setText("Linea:"+fila+" Columna:"+columna);
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(252, 252, 252));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setForeground(new java.awt.Color(255, 245, 245));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText("Archivos Cargados");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel2.setText("Reportes Creados");

        jLabel3.setText("Consola de Errores");

        jLabel4.setText("Linea:0 Columna:0 ");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jMenu2.setText("Archivo");

        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem3.setText("Cerrar Pestaña");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Analizar");

        jMenuItem2.setText("Analizar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analizar(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(241, 241, 241)
                                .addComponent(jLabel4))
                            .addComponent(jLabel1)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 214, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void abrirArchivo(){
        String texto = "", aux = "";
        try {
            JFileChooser abridor = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de XML", "XML");
            abridor.setFileFilter(filtro);
            abridor.showOpenDialog(this);
            File archivo = abridor.getSelectedFile();
            if (archivo != null) {

                FileReader lector = new FileReader(archivo);
                BufferedReader buffer = new BufferedReader(lector);
                while ((aux = buffer.readLine()) != null) {
                    texto += aux + "\n";
                }
                this.jTabbedPane1.add(archivo.getName(), new CampoTexto(new JPanel(),texto));
                jTabbedPane1.setSelectedIndex(jTabbedPane1.getTabCount()-1);
                jLabel4.setText("Linea:0 Columna:0");
                this.actualizarPos();
                
            }
        } catch (Exception e) {
            System.out.println("Algo salió mal");
            e.printStackTrace();
        }
    }
    
    private void abrir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir
        abrirArchivo();
    }//GEN-LAST:event_abrir
    
    private void abrir1(java.awt.event.ActionEvent evt) {   
        
        try{
            File path=new File(evt.getActionCommand());
            Desktop.getDesktop().open(path);
            
        }catch(Exception e){}
    }
    
    private void cerrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar
        if (this.jTabbedPane1.getTabCount() > 0) {
            jTabbedPane1.remove(jTabbedPane1.getSelectedIndex());
        }
    }//GEN-LAST:event_cerrar
    private void calcularCantidadActividades(){
        for(Estudiante estu:lisEstudiante){
            if(estu.getListatarea().size()>Estudiante.cantidaTareas)
                Estudiante.cantidaTareas=estu.getListatarea().size();
            if(estu.getLisht().size()>Estudiante.cantidaHojas)
                Estudiante.cantidaHojas=estu.getLisht().size();
            if(estu.getLisec().size()>Estudiante.cantidaExamenes)
                Estudiante.cantidaExamenes=estu.getLisec().size();
            if(estu.getListpra().size()>Estudiante.cantidaPracticas)
                Estudiante.cantidaPracticas=estu.getListpra().size();
            if(estu.getListpro().size()>Estudiante.cantidaProyectos)
                Estudiante.cantidaProyectos=estu.getListpro().size();
        }
    }
    private void analizar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analizar
        String texto="";
        JTextPane campo;
        if (this.jTabbedPane1.getTabCount() > 0) {
            CampoTexto area = (CampoTexto) this.jTabbedPane1.getSelectedComponent();
            campo = area.getTexto();
            texto=campo.getText();
        }else return;
        
        ///analizar
          parser parser = new parser(new scanner(new BufferedReader( new StringReader(texto))));
        try {
            parser.parse();
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        //////Poner errors en la caja de texto y cortar flujo si existen dichos errores
        this.jTextArea1.setText("");
        if(!lisErrores.isEmpty()){
            this.jTextArea1.setText("");
            lisErrores.forEach((ele) -> {
                this.jTextArea1.setText(jTextArea1.getText()+ele);
            });
            lisErrores.clear();
            lisEncabezado.clear();
            Encabezado.estiloContenido="";
            Encabezado.estiloDato="";
            Encabezado.logo="";
            lisEstudiante.clear();
            ra=rr=re=rp=aprobado=reprobado=false;
            Tareas=Hojas=ExamenCorto=Practicas=Proyectos=Final=0;
            this.generadorReportes=new Reporte();
            return;
        }
        
        /////dar formato a encabezado
        String Tsi="",Tsd="",Tci="",Tcd="",Tii="",Tid="",si="",sd="",ci="",cd="",ii="",id="";
        for(Encabezado ele: lisEncabezado) {
                if(ele.getPosicion().equalsIgnoreCase("Superior-Izq")){
                    Tsi=ele.getDato();
                    si=ele.getContenido();
                }
                else if(ele.getPosicion().equalsIgnoreCase("Superior-Der")){
                    Tsd=ele.getDato();
                    sd=ele.getContenido();
                }
                else if(ele.getPosicion().equalsIgnoreCase("Centro-Izq")){
                    Tci=ele.getDato();
                    ci=ele.getContenido();
                }
                else if(ele.getPosicion().equalsIgnoreCase("Centro-Der")){
                    Tcd=ele.getDato();
                    cd=ele.getContenido();
                }
                else if(ele.getPosicion().equalsIgnoreCase("Inferior-Izq")){
                    Tii=ele.getDato();
                    ii=ele.getContenido();
                }
                else if(ele.getPosicion().equalsIgnoreCase("Inferior-Der")){
                    Tid=ele.getDato();
                    id=ele.getContenido();
                }
        }
        
        Chunk CTsi,CTsd,CTci,CTcd,CTii,CTid,Csi,Csd,Cci,Ccd,Cii,Cid;
        
            CTsi=new Chunk(Tsi+"  ",this.getColorLetra(Encabezado.estiloDato));
            CTsd=new Chunk(Tsd+"  ",this.getColorLetra(Encabezado.estiloDato));
            CTci=new Chunk(Tci+"  ",this.getColorLetra(Encabezado.estiloDato));
            CTcd=new Chunk(Tcd+"  ",this.getColorLetra(Encabezado.estiloDato));
            CTii=new Chunk(Tii+"  ",this.getColorLetra(Encabezado.estiloDato));
            CTid=new Chunk(Tid+"  ",this.getColorLetra(Encabezado.estiloDato));
        
        
            Csi=new Chunk(si+"                                      ",this.getColorLetra(Encabezado.estiloContenido));
            Csd=new Chunk(sd,this.getColorLetra(Encabezado.estiloContenido));
            Cci=new Chunk(ci+"                                      ",this.getColorLetra(Encabezado.estiloContenido));
            Ccd=new Chunk(cd,this.getColorLetra(Encabezado.estiloContenido));
            Cii=new Chunk(ii+"                                      ",this.getColorLetra(Encabezado.estiloContenido));
            Cid=new Chunk(id,this.getColorLetra(Encabezado.estiloContenido));
        
            Paragraph sup=new Paragraph();
            sup.add(CTsi);sup.add(Csi);sup.add(CTsd);sup.add(Csd);
            Paragraph cen=new Paragraph();
            cen.add(CTci);cen.add(Cci);cen.add(CTcd);cen.add(Ccd);
            Paragraph infe=new Paragraph();
            infe.add(CTii);infe.add(Cii);infe.add(CTid);infe.add(Cid);
        
        ///crear Tablas
        this.calcularCantidadActividades();
        
        for(Estudiante estu:lisEstudiante)
            System.out.println(estu.getTodo());
        
        System.out.println(Inicio.Tareas);
        System.out.println(Inicio.Hojas);
        System.out.println(Inicio.ExamenCorto);
        System.out.println(Inicio.Practicas);
        System.out.println(Inicio.Proyectos);
        System.out.println(Inicio.Final+"\n");
        
        System.out.println(Inicio.ra);
        System.out.println(Inicio.rr);
        System.out.println(Inicio.re);
        System.out.println(Inicio.rp);
        
        System.out.println(Inicio.aprobado);
        System.out.println(Inicio.reprobado);
        
        //imprimir pdf
        Document documeto=new Document(PageSize.A4);
        try {
            PdfWriter.getInstance(documeto, new FileOutputStream("pdf"+(this.listabtn.size()+1)+".pdf"));
            documeto.open();
            try{
                Image imagen=Image.getInstance(Encabezado.logo);
                imagen.setAlignment(Image.RIGHT);
                documeto.add(imagen);
            }catch(Exception es){}
            documeto.add(sup);
            documeto.add(cen);
            documeto.add(infe);
            this.generadorReportes=new Reporte();
            this.generadorReportes.AgregarEncabezado();
            if(ra){
                Paragraph par=new Paragraph("Reporte de Aprobados",new Font(Font.getFamily("ARIAL"),16,Font.BOLD,BaseColor.GREEN));
                par.setAlignment(1);
                documeto.add(par);
                documeto.add(new Paragraph("    ",new Font(Font.getFamily("ARIAL"),5,Font.BOLD,BaseColor.GREEN)));
                documeto.add(this.generadorReportes.getRA());
            }else this.generadorReportes.getRA();
            if(rr){
                Paragraph par=new Paragraph("Reporte de Reprobados",new Font(Font.getFamily("ARIAL"),16,Font.BOLD,BaseColor.RED));
                par.setAlignment(1);
                documeto.add(par);
                documeto.add(new Paragraph("    ",new Font(Font.getFamily("ARIAL"),5,Font.BOLD,BaseColor.GREEN)));
                documeto.add(this.generadorReportes.getRR());
            }
            if(rp){
                Paragraph par=new Paragraph("Reporte de Publicacion",new Font(Font.getFamily("ARIAL"),16,Font.BOLD,BaseColor.GRAY));
                par.setAlignment(1);
                documeto.add(par);
                documeto.add(new Paragraph("    ",new Font(Font.getFamily("ARIAL"),5,Font.BOLD,BaseColor.GREEN)));
                documeto.add(this.generadorReportes.getRP());
            }
            if(re){
                Paragraph par=new Paragraph("Reporte de Exelencia",new Font(Font.getFamily("ARIAL"),16,Font.BOLD,BaseColor.YELLOW));
                par.setAlignment(1);
                documeto.add(par);
                documeto.add(new Paragraph("    ",new Font(Font.getFamily("ARIAL"),5,Font.BOLD,BaseColor.GREEN)));
                documeto.add(this.generadorReportes.getRE());
            }
                ;
            documeto.close();
            
            //poner boton
            JButton but=new JButton("pdf"+(this.listabtn.size()+1)+".pdf");
            listabtn.add(but);
            but.setBounds(x, y, 110, 30);
            this.jPanel1.add(but);
            this.jPanel1.paintAll(this.jPanel1.getGraphics());
            but.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    abrir1(evt);
                }
            });
            if(bandera){
                x+=150;
                bandera=false;
            }else{
                y+=40;
                x=40;
                bandera=true;
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
         //limpiar variables
        lisEncabezado.clear();
        Encabezado.estiloContenido="";
        Encabezado.estiloDato="";
        Encabezado.logo="";
        lisEstudiante.clear();
        ra=rr=re=rp=aprobado=reprobado=false;
        Tareas=Hojas=ExamenCorto=Practicas=Proyectos=Final=0;
    
    }//GEN-LAST:event_analizar

    private Font getColorLetra(String color){
        if(color.equalsIgnoreCase("rojo"))
            return new Font(Font.getFamily("ARIAL"),12,Font.BOLD,BaseColor.RED);
        else if(color.equalsIgnoreCase("azul"))
            return new Font(Font.getFamily("ARIAL"),12,Font.BOLD,BaseColor.BLUE);
        else if(color.equalsIgnoreCase("amarillo"))
            return new Font(Font.getFamily("ARIAL"),12,Font.BOLD,BaseColor.YELLOW);
        else if(color.equalsIgnoreCase("verde"))
            return new Font(Font.getFamily("ARIAL"),12,Font.BOLD,BaseColor.GREEN);
        else if(color.equalsIgnoreCase("anaranjado"))
            return new Font(Font.getFamily("ARIAL"),12,Font.BOLD,BaseColor.ORANGE);
        else return new Font(Font.getFamily("ARIAL"),12,Font.BOLD,BaseColor.BLACK);
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            
            
                new Inicio().setVisible(true);
            
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
