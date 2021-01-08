package compi1.pro_1cliente;

import static compi1.pro_1cliente.PrincipalCliente.usuarioLogueado;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel extends JPanel {
    private String codigo;
    private String propietario;
    private String nombre;
    private String direccion;
    private String telefono;
    private JFrame frame;
    public static String ultimaSucursal;

    public Panel(String codigo, String propietario, String nombre, String direccion, String telefono) {
        this.codigo = codigo;
        this.propietario = propietario;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        initComponents();
        this.jLabel1.setText(nombre);
        
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
    

    public String getCodigo() {
        return codigo;
    }

    public String getPropietario() {
        return propietario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(260, 230));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("n");

        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1)
                            .addComponent(jButton3))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addComponent(jButton2)
                .addGap(33, 33, 33)
                .addComponent(jButton3)
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ultimaSucursal=this.codigo;
        
        try{
                Socket socke=new Socket(InetAddress.getLocalHost().getHostAddress(),9596);
                DataOutputStream flujoout=new DataOutputStream(socke.getOutputStream());
                flujoout.writeUTF("$request$\n" +
"	$get tipo=\"productos\" propietario="+this.propietario+" sucursal="+this.codigo+" -$\n" +
"$request-$");
                flujoout.close();
                socke.close();
        }catch(Exception e){
            
            
        }
        this.frame.setVisible(false);
        
        this.frame.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //modificar
        this.frame.setVisible(false);
        this.frame.dispose();
        try{
                Socket socke=new Socket(InetAddress.getLocalHost().getHostAddress(),9596);
                DataOutputStream flujoout=new DataOutputStream(socke.getOutputStream());
                flujoout.writeUTF("$request$\n" +
"	$get tipo=\"tiendas\" propietario="+PrincipalCliente.usuarioLogueado+" -$\n" +
"$request-$");
                flujoout.close();
                socke.close();
        }catch(Exception e){
            
            
        }
        new ModificarTienda(this.codigo).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //eliminar
        try {
                Socket socke=new Socket(InetAddress.getLocalHost().getHostAddress(),9596);
                DataOutputStream flujoout=new DataOutputStream(socke.getOutputStream());
                flujoout.writeUTF("$request$\n" +
"	$tienda  codigo="+this.codigo+",	\n" +
"	Propietario="+this.propietario+",tipo=\"eliminar\" -$ \n" +
"$request-$ ");
                flujoout.close();
                socke.close();
                
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        this.frame.setVisible(false);
        this.frame.dispose();
            try{
            Socket socke=new Socket(InetAddress.getLocalHost().getHostAddress(),9596);
                DataOutputStream flujoout=new DataOutputStream(socke.getOutputStream());
                flujoout.writeUTF("$request$\n" +
"	$get tipo=\"tiendas\" propietario="+PrincipalCliente.usuarioLogueado+" -$\n" +
"$request-$");
                flujoout.close();
                socke.close();
            }catch(Exception e){
            
            
            }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
