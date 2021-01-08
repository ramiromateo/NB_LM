package ht1compi1;

import Analizador.parser;
import Analizador.scanner;
import java.io.BufferedReader;
import java.io.StringReader;

public class Ht1compi1 {

    public static void main(String[] args) {
        
        for(int i=0;i<10;i++)
            System.out.println(i<<i);
       
//  Ht1compi1.generar();
//       LinkedList<objeto> lisobjeto=new LinkedList<>();
//       lisobjeto.add(new objeto(3,6));
//       lisobjeto.add(new objeto(3,10));
//       lisobjeto.add(new objeto(3,13));
//       lisobjeto.add(new objeto(3,2));
//       lisobjeto.add(new objeto(3,55));
//       lisobjeto.add(new objeto(3,1));
//       lisobjeto.add(new objeto(3,4));
//       Collections.sort(lisobjeto);
//       
//       for(objeto obj:lisobjeto)
//            System.out.println(obj.getUno());
//       
//        
        
        
    }
    public static void generar(){
        try {
            String ruta = "src/Analizador/"; //ruta donde tenemos los archivos con extension .jflex y .cup
            String opcFlex[] = { ruta + "lexico.jflex", "-d", ruta };
            jflex.Main.generate(opcFlex);
            String opcCUP[] = { "-destdir", ruta, "-parser", "parser", ruta + "sintactico.cup" };
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String texto="{(7*8.9+17*1.9)/(10.33+Rq(Ptn(10)+10))}";
            String texto1="extraer(5,3,hola,mundo,desde,java,jflex);";
            String texto2="extraer(2,1,Esta,No,Saca,Nada);";
            
            
            System.out.println("*******Inicia el analisis...\n");
            scanner scan = new scanner(new BufferedReader( new StringReader(texto)));
            parser parser = new parser(scan);
            parser.parse();
            System.out.println("\n******Finaliza el analisis...");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
abstract class hol{
}
class hola extends hol{


    void gull(int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}