package compi1.pro_1cliente;

import Analizadores.parserCli;
import Analizadores.scannerCli;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Registro extends javax.swing.JFrame {
        
    boolean BanderaRegisrar;
    public static String arr[]=new String[5];
    public static String arrr[]=new String[8];
    public static LinkedList<Panel> listTiendas=new LinkedList();
    public static LinkedList<PanelProducto> listProductos=new LinkedList();
        
    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
         BanderaRegisrar=false;
        this.jTextField5.setText("ca@compiladores1.com");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de usuario SAAS");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                alCerrrar(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel1.setText("Registro de Usuario");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Id:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Nombres:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Apellidos:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Contraseña:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Telefono:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Correo:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Direccion:");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EsDigito(evt);
            }
        });

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EsDigito(evt);
            }
        });

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                VerificarCorreo(evt);
            }
        });

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                VerificarCotra(evt);
            }
        });

        jButton1.setText("Registrarme");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Iniciar Sesion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText(" ");

        jLabel10.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)))
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(jButton1)))))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(92, 92, 92))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         abrirLogin();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void alCerrrar(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_alCerrrar
        abrirLogin();
    }//GEN-LAST:event_alCerrrar

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        verificarCampoLleno(jTextField1);
        verificarCampoLleno(jTextField2);
        verificarCampoLleno(jTextField3);
        if(jPasswordField1.getText().equals(""))
            jPasswordField1.setBackground(Color.red);
        if(jTextField5.getText().equals(""))
            jTextField5.setBackground(Color.red);
        if(jPasswordField1.getBackground().equals(Color.white) &&jTextField5.getBackground().equals(Color.white) &&jTextField1.getBackground().equals(Color.white)&&jTextField2.getBackground().equals(Color.white)&&jTextField3.getBackground().equals(Color.white))
            BanderaRegisrar=true;
        else BanderaRegisrar=false;
        
        if(this.BanderaRegisrar)
        {
            try {
            Socket socke=new Socket(InetAddress.getLocalHost().getHostAddress(),9596);
            DataOutputStream flujoout=new DataOutputStream(socke.getOutputStream());
            String telefono=(this.jTextField4.getText().equals(""))?"":"		$telefono$ "+this.jTextField4.getText()+" $telefono-$  \n";
            String direccion=(this.jTextField6.getText().equals(""))?"":"		$direccion$ \""+this.jTextField6.getText()+"\" $direccion-$\n";
            flujoout.writeUTF("$request$\n" +
                              "     $CrearUsuario$\n" +
                              "		$id$ "+this.jTextField1.getText()+" $id-$ \n" +
                              "		$nombre$ \""+this.jTextField2.getText()+"\" $nombre-$\n" +
                              "		$apellido$ \""+this.jTextField3.getText()+"\" $apellido-$\n" +
                              "		$password$  "+this.jPasswordField1.getText()+" $password-$ \n" +
                                telefono +//opcional
                              "		$email$  "+this.jTextField5.getText()+"  $email-$ \n" +
                                direccion +//opcional
                              "	    $CrearUsuario-$\n" +
                              "$request-$");
            
            flujoout.close();
            
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        else mensaje("Revise que haya llenado los campos correctamente","Mensaje",1);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void VerificarCorreo(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VerificarCorreo
        if(!jTextField5.getText().equals("")&&this.jTextField5.getText().contains("@compiladores1.com") && jTextField5.getText().length()>18){
            BanderaRegisrar=true;
            jTextField5.setBackground(Color.white);
            this.jLabel10.setText("");
        }
        else {
            BanderaRegisrar=false;
            jTextField5.setBackground(Color.red);
            this.jLabel10.setText("escriba correo@compiladores1.com");
        }
    }//GEN-LAST:event_VerificarCorreo

    private void VerificarCotra(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VerificarCotra
        if(!jPasswordField1.getText().equals("")&&jPasswordField1.getText().length()>5 && Character.isLetter(this.jPasswordField1.getText().charAt(jPasswordField1.getText().length()-1) ) &&Character.isLetter(this.jPasswordField1.getText().charAt(0)) ){
            BanderaRegisrar=true;
            jPasswordField1.setBackground(Color.white);
            this.jLabel9.setText("");
        }
        else {
            BanderaRegisrar=false;
            jPasswordField1.setBackground(Color.red);
            this.jLabel9.setText("mas de 5 caracters y letra inicio y final");
        }
    }//GEN-LAST:event_VerificarCotra

    private void EsDigito(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EsDigito
        JTextField j=(JTextField) evt.getComponent();
        try{
        if(Character.isLetter(j.getText().charAt(j.getText().length()-1)))
            j.setText("");
        }catch(Exception E){}
    }//GEN-LAST:event_EsDigito
    private void abrirLogin(){
        new PrincipalCliente().setVisible(true);
         this.setVisible(false);
         this.dispose();
    }
    private void verificarCampoLleno(JTextField JtextF){
        if(JtextF.getText().equals("")){
            BanderaRegisrar=false;
            JtextF.setBackground(Color.red);
        }
        else {
            BanderaRegisrar=true;
            JtextF.setBackground(Color.white);
        }
    }
    public static void Seregistro(String id,String reg){
        if(reg.equalsIgnoreCase("true"))
            mensaje("Registro correcto id="+id,"Notificacion",1);
        else mensaje("Registro incorrecto id="+id,"Advertencia",2);
    }
    public static void Semodifico(String reg,String val){
        if(val.equalsIgnoreCase("true"))
            mensaje("Modificacion Existosa id="+reg,"Notificacion",1);
        else mensaje("Modificaicon Fallida id="+reg,"Advertencia",2);
    }
    public static void SeElimino(String reg,String val){
        if(val.equalsIgnoreCase("true"))
            mensaje("Eliminacion Existosa id="+reg,"Notificacion",1);
        else mensaje("Eliminacion Fallida id="+reg,"Advertencia",2);
    }
    //Comprobacion login
    public static void Ingresara(String id,String reg){
        if(reg.equalsIgnoreCase("true")){
            try{
            Socket socke=new Socket(InetAddress.getLocalHost().getHostAddress(),9596);
                DataOutputStream flujoout=new DataOutputStream(socke.getOutputStream());
                flujoout.writeUTF("$request$\n" +
"	$get tipo=\"tiendas\" propietario="+id+" -$\n" +
"$request-$");
                flujoout.close();
                socke.close();
            }catch(Exception e){
            
            
            }
            mensaje("Iniciando Sesion ","Notificacion",1);
            
            
             
        }
        else if(reg.equalsIgnoreCase("falso")){
            mensaje("Contraseña incorrecta","Advertencia",2);
            new PrincipalCliente().setVisible(true);
        }else {mensaje("Usuario no existe","Advertencia",2);
            new PrincipalCliente().setVisible(true);
        }
    }
    //mensje flotatnte
    public static void mensaje(String mensaje,String titulo, int tipo){
        JOptionPane.showMessageDialog(null, mensaje, titulo,tipo );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

    
}
