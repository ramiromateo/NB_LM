package tablahass;

import WebService.*;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import org.json.simple.*;

public class TablaHass {
    public static File fichero;
    public static JFileChooser fileCh;
    
    public static void main(String[] args){
        JSONObject root = new JSONObject();
        JSONArray Usuarios = new JSONArray();
                
                JSONObject usuarioObjeto = new JSONObject();
                usuarioObjeto.put("id usuario", "55");
                usuarioObjeto.put("nickname", "minick");
                usuarioObjeto.put("nombre", "miname");
                Usuarios.add(usuarioObjeto);
                
                usuarioObjeto = new JSONObject();
                usuarioObjeto.put("id usuario", "559");
                usuarioObjeto.put("nickname", "minick6");
                usuarioObjeto.put("nombre", "miname5");
                Usuarios.add(usuarioObjeto);
                String st="99";
                usuarioObjeto = new JSONObject();
                usuarioObjeto.put("id usuario", st);
                usuarioObjeto.put("nickname", "minick8");
                usuarioObjeto.put("nombre", "miname8");
                Usuarios.add(usuarioObjeto);
                
                root.put("user",Usuarios.toJSONString() );
                System.out.println(root.toJSONString());
    }
    public static String abrirCSV()
    {
        String cadena="";
        fileCh=new JFileChooser();
        int seleccion = fileCh.showDialog(null,"Seleccionar archivo");
        if(seleccion == JFileChooser.APPROVE_OPTION)
        {
            fichero = fileCh.getSelectedFile();
            cadena = fichero.getAbsolutePath();
        }
        System.out.println(cadena);
        return cadena;
    }
    
    public static void parsearCSV(String ruta)
    {
        FileReader fr=null;
        String cadena=""; 
        
        try{    
            File archivo = new File (ruta);
            fr = new FileReader (archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            
            while((linea=br.readLine())!=null)
            {
                    
                    String[] informacion;
                    informacion=linea.split(",");
                    for(int i=0;i<informacion.length;i++)
                        System.out.println(informacion[i]);
                    System.out.println("");
                    
                    
                    
                    
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            try{                    
                if( null != fr ){   
                   fr.close();     
                }                  
            }catch (Exception e2){ 
                e2.printStackTrace();
            }
        }
        
    }
    
}
