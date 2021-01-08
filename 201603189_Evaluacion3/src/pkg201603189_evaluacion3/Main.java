package pkg201603189_evaluacion3;

import Analizador.parser;
import Analizador.scanner;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Intruccion> arbol=null;
        try {
            parser pars = new parser(new scanner(new BufferedReader( new StringReader(""
                    + "int x=4+2*3;"
                    + " double y=x/2*3; "
                    + "Imprimir(y);"
                    + "Imprimir(y*a);"
                    + "Imprimir((y*x)/(10-x));"
                    + "Imprimir(y*x/4);"))));
            pars.parse();        
            arbol=pars.getAST();
        } catch (Exception ex) {
            System.out.println("Error ");
        } 
        
        if(arbol==null){
            System.out.println("Error de compilacion");
            return;
        }
        TablaSimbolo ts=new TablaSimbolo();
        for(Intruccion ins:arbol){
            if(ins!=null)
                ins.ejecutar(ts);
        }
    }
    
    
}
