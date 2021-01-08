/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg201603189_ejercicio3_1;

import Analizador.parser;
import Analizador.scanner;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author José
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          parser parser = new parser(new scanner(new BufferedReader( new StringReader(""
                  + "[1,2,[],7,[9],[9,3,[1,3,5,7],1],[5,0],[4,3,[2,1],1]]"))));
        try {
            parser.parse();
        } catch (Exception ex) {
            
        }
        
    }
    
}
