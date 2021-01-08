package pkg201603189_evaluacion3;

import Analizador.parser;
import Analizador.scanner;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.LinkedList;

public class Main {
    public static int Contadorloop=0;

    public static void main(String[] args) {
        LinkedList<Intruccion> arbol=null;
        try {
            parser pars = new parser(new scanner(new BufferedReader( new StringReader(""
                    + "Int a=10;"
                    + " while(a!=0||true){"
                    + "imprimir(\"El valor de A es :\"+a);"
                    + "if(a>0){"
                    + "a=a-1;"
                    + "}else {"
                    + "break;"
                    + "}"
                    + "} "
                    + "Break;"))));
            pars.parse();        
            arbol=pars.getAST();
        } catch (Exception ex) {
            System.out.println("Error ");
        } 
        
        if(arbol==null){
           Main.me();
           return;
        }
        TablaSimbolo ts=new TablaSimbolo();
        for(Intruccion ins:arbol){
            if(ins!=null)
                ins.ejecutar(ts);
        }
        
        
        
        Main.me();
    }
    public static void me(){
    int a=10;
        
    while(a>=0){
        System.out.println("El valor de A es :"+a);
        a--;
    }
        
    }
    
}
