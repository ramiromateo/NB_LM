package Analizadores;

import compi1.pro_1cliente.InicioCliente;
import compi1.pro_1cliente.Productos;

public class compilacion {
    public static void main(String args[]) {
        try {
            String ruta = "src/Analizadores/"; //ruta donde tenemos los archivos con extension .jflex y .cup
            String opcFlex[] = { ruta + "Lexico.jflex", "-d", ruta };
            jflex.Main.generate(opcFlex);
            String opcCUP[] = { "-destdir", ruta, "-parser", "parserCli", ruta + "Sintactico.cup" };
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
           System.out.println("holamundo");
           String cad="";
           
           if(cad.equalsIgnoreCase("vacio"))new InicioCliente("").setVisible(true);
           else new Productos("").setVisible(true);
        }  //compilacion cliente
    }
}
