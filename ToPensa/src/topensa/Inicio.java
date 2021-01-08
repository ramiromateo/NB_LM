package topensa;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.Desktop;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Inicio extends javax.swing.JFrame{
    
    public static LinkedList<String> lisErrores=new LinkedList<String>();
    public static String text="";
    
    
    LinkedList<JButton> listabtn;
    int x,y;
    boolean bandera;
    int indicePestañas=0;
    public static DefaultTableModel modelo;
    
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("IDE");
        
        listabtn=new LinkedList<JButton>();
        x=40;
        y=10;
        bandera=true;
        this.jTabbedPane1.setOpaque(false);
        
        modelo = new DefaultTableModel();
        
        modelo.addColumn("Tipo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Fila");
        modelo.addColumn("Columna");
        
        jTable1.setModel(modelo);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(142);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(900);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(60);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(80);
        
        
    }
    public static void ParsearXml(String path){
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(252, 252, 252));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setForeground(new java.awt.Color(255, 245, 245));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText("Archivos Cargados");

        jLabel3.setText("Consola de Errores");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jButton1.setText("Ejecutar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jMenu2.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Guardar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Guardar Como");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Pestañas");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Nueva Pestaña");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analizar(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Cerrar Pestaña");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItem6.setText("Ejecutar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(374, 374, 374)
                                .addComponent(jButton1)))
                        .addGap(0, 602, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void abrirArchivo(){
        String texto = "", aux = "";
        try {
            JFileChooser abridor = new JFileChooser();
            abridor.setCurrentDirectory(new File("C:\\Users\\José\\Desktop"));
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos GXML o FS", "GXML","FS");
            
            
            
            
            abridor.setFileFilter(filtro);
            abridor.showOpenDialog(this);
            File archivo = abridor.getSelectedFile();
            
            //System.out.println(archivo.getName().replaceAll("^.*\\.(.*)$", "$1"));
            
            if (archivo != null) {
                
                FileReader lector = new FileReader(archivo);
                BufferedReader buffer = new BufferedReader(lector);
                while ((aux = buffer.readLine()) != null) {
                    texto += aux + "\n";
                }
                
                CampoTexto cam=(archivo.getName().replaceAll("^.*\\.(.*)$", "$1").equalsIgnoreCase("gxml"))?new CampoTexto(true):new CampoTexto(false);
                cam.setTexto(texto);
                cam.setPath(archivo.getAbsoluteFile().toString());
                
                this.jTabbedPane1.add(archivo.getName(),cam );
                jTabbedPane1.setSelectedIndex(jTabbedPane1.getTabCount()-1);
                
                
                
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
            
        }catch(Exception e){
        
        }
    }
    
    private void cerrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar
        if (this.jTabbedPane1.getTabCount() > 0) {
            jTabbedPane1.remove(jTabbedPane1.getSelectedIndex());
            this.indicePestañas--;
        }
    }//GEN-LAST:event_cerrar
    
    private void analizar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analizar

        
        try {
            String[] archi={"FS","GXML"};
            String res=(String)JOptionPane.showInputDialog(null,"Seleccione un tipo de Archivo","Archivo",JOptionPane.DEFAULT_OPTION,null,archi,archi[0]);
            
            System.out.println(res);
            CampoTexto cam=(res.replaceAll("^.*\\.(.*)$", "$1").equalsIgnoreCase("Gxml"))?new CampoTexto(true):new CampoTexto(false);
            cam.setTexto("");
            cam.setPath("");
                
            this.jTabbedPane1.add("new"+this.indicePestañas,cam );
            this.indicePestañas++;
            jTabbedPane1.setSelectedIndex(jTabbedPane1.getTabCount()-1);
            
            
            
        } catch (Exception e) {
            System.out.println("Algo salió mal");
            e.printStackTrace();
        }
        
        
        /*        String texto="";
        JTextPane campo;
        if (this.jTabbedPane1.getTabCount() > 0) {
            CampoTexto area = (CampoTexto) this.jTabbedPane1.getSelectedComponent();
            campo = area.getTexto();
            texto=campo.getText();
        } */
        
    }//GEN-LAST:event_analizar

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try
          {
            if (this.jTabbedPane1.getTabCount() > 0) {
                CampoTexto area = (CampoTexto) this.jTabbedPane1.getSelectedComponent();
                if(area.getPath().equals("")){
                    guardarArchivo();
                    return;
                }
                File fichero=new File(area.getPath());
                if(fichero !=null)
                {
                    FileWriter  save=new FileWriter(fichero);
                    save.write(area.getTexto());
                    save.close();
                }
            }
            
        }catch(IOException ex){ }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        guardarArchivo();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(this.jTabbedPane1.getTabCount()==0)return;
        CampoTexto area = (CampoTexto) this.jTabbedPane1.getSelectedComponent();
        String texto=area.getTexto();
        ejecutar(texto);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void ejecutar(String texto){
    
        modelo = new DefaultTableModel();
        
        modelo.addColumn("Tipo");
        modelo.addColumn("Descripcion");
        
        modelo.addColumn("Fila");
        modelo.addColumn("Columna");
        
        jTable1.setModel(modelo);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(142);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(900);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(60);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(80);
        

     
    }
    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        
    }//GEN-LAST:event_jButton1KeyPressed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        if(this.jTabbedPane1.getTabCount()==0)return;
        CampoTexto area = (CampoTexto) this.jTabbedPane1.getSelectedComponent();
        String texto=area.getTexto();
        ejecutar(texto);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    public void guardarArchivo() {    
    try
    {
        if(this.jTabbedPane1.getTabCount() == 0)return;
        fileCh=new javax.swing.JFileChooser();
        
        
        int status=fileCh.showSaveDialog(this);
        ///*****poner el filtor
  
        File fichero =fileCh.getSelectedFile();
 
        if(fichero !=null&&status==0)
        {
    
            FileWriter  save=new FileWriter(fichero);
    
            if (this.jTabbedPane1.getTabCount() > 0) {
                CampoTexto area = (CampoTexto) this.jTabbedPane1.getSelectedComponent();
                    save.write(area.getTexto());    
            }
            
            save.close();
            JOptionPane.showMessageDialog(null,
            "El archivo  "+fichero+"  se a guardado Exitosamente",
             "Información",JOptionPane.INFORMATION_MESSAGE);
        }else{
        JOptionPane.showMessageDialog(null,
            "Su archivo no se ha guardado",
            "Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }catch(IOException ex)
    {
        JOptionPane.showMessageDialog(null,
            "Su archivo no se ha guardado",
            "Advertencia",JOptionPane.WARNING_MESSAGE);
   }
 }
    private javax.swing.JFileChooser fileCh;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
