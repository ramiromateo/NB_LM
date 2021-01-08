/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientecompi;

import javax.swing.UIManager;

/**
 *
 * @author sebas
 */
public class ClienteCompi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            UIManager.setLookAndFeel("com.alee.laf.WebLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        new VentanaPrincipal();
    }

}
