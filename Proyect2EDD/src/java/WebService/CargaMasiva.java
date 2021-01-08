package WebService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class CargaMasiva {
    
    public static ArbolBinario ar=new ArbolBinario();
    public static Lista<Estudiante> listaEstudiantes=new Lista<Estudiante>();
    public static Tabla estantes=new Tabla(23);
    public static Lista<Prestamo> prestamos=new Lista<Prestamo>();
    
    public CargaMasiva(String path,int num){
        parsearCSV(path,num);
    }
    
    
    private void parsearCSV(String ruta, int opcion)
    {
        FileReader fr=null;
        try{    
            File archivo = new File (ruta);
            fr = new FileReader (archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            
            while((linea=br.readLine())!=null)
            {
                    
                    String[] informacion;
                    informacion=linea.split(",");
                    switch(opcion){
                        case 1:
                            ar.insertar(new Empleado(Integer.parseInt(informacion[0]),informacion[1],informacion[2],Integer.parseInt(informacion[3]),informacion[4]));
                            break;
                        case 2:
                            listaEstudiantes.insertarLDC(new Estudiante(Integer.parseInt(informacion[0]),informacion[1],informacion[2], Integer.parseInt(informacion[4])));
                            break;
                        case 3:
                            estantes.insertar(new Librera(Integer.parseInt(informacion[0]),informacion[1]));
                            break;
                        case 4:
                            estantes.insertarLibro(new Libro(Integer.parseInt(informacion[0]),informacion[1],informacion[2],Integer.parseInt(informacion[3]),Integer.parseInt(informacion[4]),Integer.parseInt(informacion[5])));
                            break;
                    }
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
