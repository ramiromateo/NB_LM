package compi1.pro_1servidor;

import Analizadores.parserSer;
import Analizadores.scannerSer;
import Objetos.ErrorLexico;
import Objetos.Producto;
import Objetos.Tienda;
import Objetos.Usuario;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;

public class ConsoleServer extends javax.swing.JFrame implements Runnable{
    
    public static LinkedList<Usuario> usuarios=new LinkedList<>();
    public static LinkedList<Tienda> tiendas=new LinkedList<>();
    public static LinkedList<Producto> productos=new LinkedList<>();
    
    public static LinkedList<Usuario> usuariosaux=new LinkedList<>();
    public static LinkedList<Tienda> tiendasaux=new LinkedList<>();
    public static LinkedList<Producto> productosaux=new LinkedList<>();
    public static LinkedList<ErrorLexico> error=new LinkedList<>();
    
    public static String RespuestaCliente="";
    public static String arr[]=new String[6];
    public static String arrP[]=new String[9];
    public static String RespuestaClienteaux="";
    public static String Enconsola="";
    public static String Enconsolaaux="";
    public static Integer EstadoTabla=0;
    public static boolean esEnConsola ;
    
    CampoTexto cam;
    Thread esperandocliente;
    //constructor
    public ConsoleServer() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        cam=new CampoTexto(new JPanel(),"");
        this.jPanel1.add(cam);
            leerObjeto();//leemos los objetos
            leerObjetoT();//leemos los objetos
            leerObjetoP();//leemos los objetos
        esperandocliente=new Thread(this);
        esperandocliente.start();
        crearJson();
        esEnConsola=false;
        for(int i=0; i<ConsoleServer.arrP.length;i++)
            ConsoleServer.arrP[i]="";
        for(int i=0; i<ConsoleServer.arr.length;i++)
            ConsoleServer.arr[i]="";
    }
    private void crearJson(){
        
        JSONArray Usuarios = new JSONArray();
        
        for(Tienda tie:tiendas){
            JSONObject usuarioObjeto = new JSONObject();
            usuarioObjeto.put("id", ""+tie.getCodigo());
            usuarioObjeto.put("direccion", ""+tie.getDireccion());
            usuarioObjeto.put("telefono", ""+tie.getTelefono());
            usuarioObjeto.put("img", ""+tie.getPath());
            usuarioObjeto.put("name", ""+tie.getName());
            Usuarios.add(usuarioObjeto);
        }
        
        
        FileWriter f;
        try {
            f = new FileWriter( "C:\\Users\\José\\Desktop\\nuevojs\\public\\Tiendas.json");
            f.write(Usuarios.toJSONString());

            f.close();

        } catch (IOException ex) {
            
        }
        
        JSONArray productoss = new JSONArray();
        
        for(Producto tie: productos){
            JSONObject usuarioObjeto = new JSONObject();
            usuarioObjeto.put("id", ""+tie.getCodigo());
            usuarioObjeto.put("nombre", ""+tie.getName());
            usuarioObjeto.put("marca", ""+tie.getMarca());
            usuarioObjeto.put("tamano", ""+tie.getTamano());
            usuarioObjeto.put("color", ""+tie.getColor());
            usuarioObjeto.put("cantidad", ""+tie.getCantidad());
            usuarioObjeto.put("sucursal", ""+tie.getSucursal());
            usuarioObjeto.put("precio", ""+tie.getPrecio());
            usuarioObjeto.put("img", ""+tie.getPath());
            productoss.add(usuarioObjeto);
        }
        
        
        FileWriter f2;
        try {
            f2 = new FileWriter( "C:\\Users\\José\\Desktop\\nuevojs\\public\\roductos.json");
            f2.write(productoss.toJSONString());

            f2.close();

        } catch (IOException ex) {
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consola Servidor");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                EscribirObjeto(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                EscribirObjeto(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 778, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Consola");

        jButton1.setText("Limpiar Consola");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Ejecutar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Cargar Archivo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Error Semantico");

        jButton5.setText("Error Sintactico");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Error Lexico");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jButton4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton6)
                                .addComponent(jButton2)
                                .addComponent(jButton3)
                                .addComponent(jButton5))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 955, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton1)
                        .addGap(29, 29, 29)
                        .addComponent(jButton3)
                        .addGap(29, 29, 29)
                        .addComponent(jButton2)
                        .addGap(34, 34, 34)
                        .addComponent(jButton6)
                        .addGap(30, 30, 30)
                        .addComponent(jButton5)
                        .addGap(29, 29, 29)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        abrirArchivo();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.cam.setTexto("");
        this.jTextArea1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
    PdfPCell tipo=new PdfPCell(new Paragraph("Tipo",FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK)));tipo.setBackgroundColor(BaseColor.GREEN);
    PdfPCell linea=new PdfPCell(new Paragraph("Linea",FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK)));linea.setBackgroundColor(BaseColor.GREEN);
    PdfPCell columna=new PdfPCell(new Paragraph("Columna",FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK)));columna.setBackgroundColor(BaseColor.GREEN);
    PdfPCell lexema=new PdfPCell(new Paragraph("Lexema",FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK)));lexema.setBackgroundColor(BaseColor.GREEN);
    PdfPCell descripcion=new PdfPCell(new Paragraph("Descripcion",FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK)));descripcion.setBackgroundColor(BaseColor.GREEN);
    
    PdfPTable tablarp=new PdfPTable(5);
    tablarp.addCell(tipo);
    tablarp.addCell(linea);
    tablarp.addCell(columna);
    tablarp.addCell(lexema);
    tablarp.addCell(descripcion);
    tablarp.setWidthPercentage(100);
    
    for(ErrorLexico ee:error){
        tablarp.addCell(new PdfPCell(new Paragraph(ee.getTipo(),FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
        tablarp.addCell(new PdfPCell(new Paragraph(ee.getLinea(),FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
        tablarp.addCell(new PdfPCell(new Paragraph(ee.getColumna(),FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
        tablarp.addCell(new PdfPCell(new Paragraph(ee.getLexema(),FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
        tablarp.addCell(new PdfPCell(new Paragraph(ee.getDescripcion(),FontFactory.getFont("ARIAL", 7, Font.BOLD, BaseColor.BLACK))));
    }
    
    Document documeto=new Document(PageSize.A4);
        
        try {
            PdfWriter.getInstance(documeto, new FileOutputStream("reporte.pdf"));
            documeto.open();
            documeto.add(new Paragraph("Reportes de Errores",FontFactory.getFont("ARIAL", 18, Font.BOLD, BaseColor.BLACK)));
            documeto.add(new Paragraph("",FontFactory.getFont("ARIAL", 18, Font.BOLD, BaseColor.BLACK)));
            documeto.add(tablarp);
            documeto.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConsoleServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(ConsoleServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            File path=new File("reporte.pdf");
            Desktop.getDesktop().open(path);
            
        }catch(Exception e){}
            
    
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        esEnConsola =true;
        System.out.println(this.cam.getTexto().getText());
        Enconsola="";
        Enconsolaaux="";
        parserSer parser = new parserSer(new scannerSer(new BufferedReader( new StringReader(this.cam.getTexto().getText()))));
        try {
            parser.parse();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        this.jTextArea1.setText(this.jTextArea1.getText()+"\n"+Enconsola);
        
        esEnConsola =false;
        RespuestaClienteaux="";
        RespuestaCliente="";
        escribirObjeto();
        escribirObjetoT();
        escribirObjetoP();
        crearJson();
    }//GEN-LAST:event_jButton3ActionPerformed
    
    public static void ResultadoConsulta(String objeto){
        if(objeto.equalsIgnoreCase("usuario")){
            Enconsola="Id:     Nombre:     Apellido:    Password:   Telefono:  Correo:     Direccion\n";
            for(Usuario user:usuarios){    
                Enconsola+=user.getId()+"   "+user.getName()+"   "+user.getApellido()+"   "+user.getPassword()+"   "+user.getTelefono()+"        "+user.getCorreo()+" "+user.getDireccion()+"\n";
            }
        }else if(objeto.equalsIgnoreCase("tienda")){
            Enconsola="Codigo:     Propietario:     Nombre:    Direccion:   Telefono:  Pathimg:\n";
            for(Tienda user:tiendas){    
                Enconsola+=user.getCodigo()+"   "+user.getPropietario()+"   "+user.getName()+"   "+user.getDireccion()+"   "+user.getTelefono()+"        "+user.getPath()+"\n";
            }
        }else if(objeto.equalsIgnoreCase("producto")){
            Enconsola="Codigo:     Nombre:     Cantidad:    Marca:   Color:  Tamaño:     Pathimg\n";
            for(Producto user:productos){    
                Enconsola+=user.getCodigo()+"   "+user.getName()+"   "+user.getCantidad()+"   "+user.getMarca()+"   "+user.getColor()+"        "+user.getTamano()+" "+user.getPath()+"\n";
            }
        }
    }
   
    public static void setTabla(String st){
        if(st.equalsIgnoreCase("usuario")){
            EstadoTabla=0;
            usuariosaux=(LinkedList<Usuario>) usuarios.clone();
        }
        else if(st.equalsIgnoreCase("tienda")){
            EstadoTabla=1;
            tiendasaux=(LinkedList<Tienda>) tiendas.clone();
        }
        else if(st.equalsIgnoreCase("producto")){
            EstadoTabla=2;
            productosaux=(LinkedList<Producto>) productos.clone();
        }
    
    }
    
    private void EscribirObjeto(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_EscribirObjeto
        escribirObjeto();
        escribirObjetoT();
        escribirObjetoP();
    }//GEN-LAST:event_EscribirObjeto
    
    private void abrirArchivo(){
        String texto = "", aux = "";
        try {
            JFileChooser abridor = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de SL", "SL");
            abridor.setFileFilter(filtro);
            abridor.showOpenDialog(this);
            File archivo = abridor.getSelectedFile();
            if (archivo != null) {

                FileReader lector = new FileReader(archivo);
                BufferedReader buffer = new BufferedReader(lector);
                while ((aux = buffer.readLine()) != null) {
                    texto += aux + "\n";
                }
                this.cam.setTexto(texto);
            }
        } catch (Exception e) {
            System.out.println("Algo salió mal");
            e.printStackTrace();
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsoleServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsoleServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsoleServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsoleServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConsoleServer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    private void escribirObjeto() {
        
        File archivo = new File("Users.txt");
        FileOutputStream salida = null;
        ObjectOutputStream writer = null;
        
        try {
            System.out.println("Escribiendo en archivo");
            archivo.createNewFile();
            salida = new FileOutputStream(archivo);
            writer = new ObjectOutputStream(salida);
            //escribir objetos
            writer.writeObject(usuarios);
            
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } finally {
            if (salida != null) {
                try {
                    salida.close();
                    if (writer != null) {
                        writer.close();
                    }
                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }
    }
    
    private void escribirObjetoT() {
        
        File archivo = new File("Tiendas.txt");
        FileOutputStream salida = null;
        ObjectOutputStream writer = null;
        
        try {
            System.out.println("Escribiendo en archivo");
            archivo.createNewFile();
            salida = new FileOutputStream(archivo);
            writer = new ObjectOutputStream(salida);
            //escribir objetos
            writer.writeObject(tiendas);
            
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } finally {
            if (salida != null) {
                try {
                    salida.close();
                    if (writer != null) {
                        writer.close();
                    }
                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }
    }
   
    private void escribirObjetoP() {
        
        File archivo = new File("Productos.txt");
        FileOutputStream salida = null;
        ObjectOutputStream writer = null;
        
        try {
            System.out.println("Escribiendo en archivo");
            archivo.createNewFile();
            salida = new FileOutputStream(archivo);
            writer = new ObjectOutputStream(salida);
            //escribir objetos
            writer.writeObject(productos);
            
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } finally {
            if (salida != null) {
                try {
                    salida.close();
                    if (writer != null) {
                        writer.close();
                    }
                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }
    }
    
    private void leerObjeto() {
        System.out.println("Leyendo archivo");
        File archivo = new File("Users.txt");
        FileInputStream entrada=null;
        ObjectInputStream reader=null;
        try {
            entrada = new FileInputStream(archivo);
            reader = new ObjectInputStream(entrada);
            //leer objet5os
            usuarios=(LinkedList<Usuario>) reader.readObject();
            System.out.println("**Usuarios**");
            for(Usuario use:ConsoleServer.usuarios)
                System.out.println("Id:"+use.getId()+" Name:"+use.getName()+" Apellido:"+use.getApellido()+" Password:"+use.getPassword()+" tel:"+use.getTelefono()+" Correo:"+use.getCorreo()+" Direcio:"+use.getDireccion());
            System.out.println("**Usuarios**");
            
                
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
            usuarios=new LinkedList<>();
        } 
        finally{
            if(entrada != null){
                try {
                    entrada.close();
                    if(reader != null){
                        reader.close();
                    }
                } catch (IOException ex) {
                    
                }
            }
        }
    }
   
    private void leerObjetoT() {
        System.out.println("Leyendo archivo");
        File archivo = new File("Tiendas.txt");
        FileInputStream entrada=null;
        ObjectInputStream reader=null;
        try {
            entrada = new FileInputStream(archivo);
            reader = new ObjectInputStream(entrada);
            //leer objet5os
            tiendas=(LinkedList<Tienda>) reader.readObject();
            System.out.println("**Tiendas**");
            for(Tienda use:ConsoleServer.tiendas)
                System.out.println("Codigo:"+use.getCodigo()+"  Nombre:"+use.getName()+"  Propietario:"+use.getPropietario()+"  Telefono:"+use.getTelefono()+"  Direccion:"+use.getDireccion()+"  Path:"+use.getPath());
            System.out.println("**Tiendas**");
            
                
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
            tiendas=new LinkedList<>();
        } 
        finally{
            if(entrada != null){
                try {
                    entrada.close();
                    if(reader != null){
                        reader.close();
                    }
                } catch (IOException ex) {
                    
                }
            }
        }
    }
    
    private void leerObjetoP() {
        System.out.println("Leyendo archivo");
        File archivo = new File("Productos.txt");
        FileInputStream entrada=null;
        ObjectInputStream reader=null;
        try {
            entrada = new FileInputStream(archivo);
            reader = new ObjectInputStream(entrada);
            //leer objet5os
            productos=(LinkedList<Producto>) reader.readObject();
            System.out.println("**Productos**");
            for(Producto use:ConsoleServer.productos)
                System.out.println("Codigo:"+use.getCodigo()+"  Nombre:"+use.getName()+"  Cantidad:"+use.getCantidad()+"  Marca:"+use.getMarca()+"  color:"+use.getColor()+"  tam:"+use.getTamano()+"   sucursal"+use.getSucursal()+"   precio"+use.getPrecio()+"   parh"+use.getPath());
            System.out.println("**Productos**");
            
                
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
            productos=new LinkedList<>();
        } 
        finally{
            if(entrada != null){
                try {
                    entrada.close();
                    if(reader != null){
                        reader.close();
                    }
                } catch (IOException ex) {
                    
                }
            }
        }
    }
///escucha para espera de socket
    
    @Override
    public void run() {
        try {
            ServerSocket servidor=new ServerSocket(9596);
            while(true){
                
                Socket misocket=servidor.accept();
                DataInputStream flujoin=new DataInputStream(misocket.getInputStream());
                String recibidoDeCliente=flujoin.readUTF();
                this.cam.setTexto(this.cam.getTexto().getText()+recibidoDeCliente);
                RegistroEstatico.CrearUser(recibidoDeCliente);
                flujoin.close();
                misocket.close();
                //////
                if(recibidoDeCliente.contains("$img$")){
                        FileOutputStream fw=null;
                        ServerSocket servidor1=null;
                    try{
                        servidor1=new ServerSocket(5000);
                        misocket=servidor1.accept();
                        flujoin=new DataInputStream(misocket.getInputStream());
                        String name=flujoin.readUTF();
                        name=name.substring(name.indexOf('\\')+1,name.length());
                        System.out.println("\n  path de la imagen enviada "+name+"\n");
                        
                        if(recibidoDeCliente.contains("producto"))
                            productos.getLast().setPath(name);
                        else if(recibidoDeCliente.contains("tienda"))
                            tiendas.getLast().setPath(name);
                        
                        fw=new FileOutputStream("C:\\Users\\José\\Desktop\\nuevojs\\public\\img\\"+name);
                        byte[] buf=new byte[1024];
                        int i=0;
                        while((i=flujoin.read(buf))!=-1)
                            fw.write(buf,0,i);
                        
                        fw.close();
                        flujoin.close();
                        misocket.close();
                        servidor1.close();
                    }catch(Exception e){
                        e.printStackTrace();
                        if(fw!=null)fw.close();
                        if(servidor1!=null)servidor1.close();
                        flujoin.close();
                        misocket.close();}
                }
                /////
                /*
                
                *///responder
                Socket socke=new Socket(InetAddress.getLocalHost().getHostAddress(),9597);
                DataOutputStream flujoout=new DataOutputStream(socke.getOutputStream());
                flujoout.writeUTF(RespuestaCliente);
                RespuestaClienteaux="";
                RespuestaCliente="";
                Enconsola="";
                Enconsolaaux="";
                
                flujoout.close();
                socke.close();
                escribirObjeto();
                escribirObjetoT();
                escribirObjetoP();
                crearJson();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(ConsoleServer.class.getName()).log(Level.SEVERE, null, ex);
        } 
                
    }
    
}
