package WebService;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class Lista<T> {
    Nodo<T> primero;
    Nodo<T> ultimo;
    
    public Lista(){
        this.primero=null;
        this.ultimo=null;
    }
    
   public void insertarLS(T objeto){
       if(primero==null)primero=ultimo=new Nodo<T>(objeto);
       else{
           ultimo.siguiente=new Nodo<T>(objeto);
           ultimo=ultimo.siguiente;
       }
   }
   
   public void insertarLD(T objeto){
       if(primero==null)primero=ultimo=new Nodo<T>(objeto);
       else{
           Nodo<T> nuevo=new Nodo<T>(objeto);
           ultimo.siguiente=nuevo;
           nuevo.anterior=ultimo;
           ultimo=nuevo;
       }
   }
   
   public boolean insertarLDC(T objeto){
       
       
       if(primero==null){
           primero=ultimo=new Nodo<T>(objeto);
           primero.anterior=primero.siguiente=primero;
       }
       else{
           Estudiante est=(Estudiante) objeto;
           Nodo<Estudiante> iterador=(Nodo<Estudiante>) primero;
           do{
               if(iterador.objeto.getCarne()==est.getCarne())
                   return false;
               iterador=iterador.siguiente;
           }while(iterador!=primero);
           
           Nodo<T> nuevo=new Nodo<T>(objeto);
           ultimo.siguiente=nuevo;
           nuevo.siguiente=primero;
           primero.anterior=nuevo;
           nuevo.anterior=ultimo;
           ultimo=nuevo;
       }
       return true;
   }
   
   public String obtenerJsonEstudiantes(){
        if (primero==null)return "";
        
        JSONObject root = new JSONObject();
        JSONArray Usuarios = new JSONArray();
        
        Nodo<Estudiante> iterador=(Nodo<Estudiante>) primero;
        
        do{
            JSONObject usuarioObjeto = new JSONObject();
            usuarioObjeto.put("carne", ""+iterador.objeto.getCarne());
            usuarioObjeto.put("nombre", ""+iterador.objeto.getNombre());
            usuarioObjeto.put("apellido", ""+iterador.objeto.getApellido());
            usuarioObjeto.put("semestre", ""+iterador.objeto.getSemestre());
            Usuarios.add(usuarioObjeto);
            
            iterador=iterador.siguiente;
        }while(iterador!=primero);
            
        root.put("estudiante",Usuarios.toJSONString() );
        return root.toJSONString();
   }
   
   public void imprimirEstudiantes(){
        if (primero==null)return;
        
        Nodo<Estudiante> iterador=(Nodo<Estudiante>) primero;
        String  print="digraph g{ node [fontcolor=\"white\", height=0.5, color=\"black\"] [shape=box, style=filled, color=black]	edge  [color=\"black\", dir=fordware]; rankdir=\"LR\";";
        do{
            print+=" \""+iterador.objeto.getCarne()+"\n"+iterador.objeto.getNombre()+"\n"+iterador.objeto.getApellido()+"\n"+iterador.objeto.getSemestre()+"\n"+"\"";
            iterador=iterador.siguiente;
            print+="->\""+iterador.objeto.getCarne()+"\n"+iterador.objeto.getNombre()+"\n"+iterador.objeto.getApellido()+"\n"+iterador.objeto.getSemestre()+"\n"+"\"";
            
            iterador=iterador.anterior;
            print+="->\""+iterador.objeto.getCarne()+"\n"+iterador.objeto.getNombre()+"\n"+iterador.objeto.getApellido()+"\n"+iterador.objeto.getSemestre()+"\n"+"\"";
            
            iterador=iterador.siguiente;
        }while(iterador!=primero);
        print+=" }";
        
        FileWriter f;
        try {
            f = new FileWriter( "C:\\Users\\José\\Documents\\NetBeansProjects\\Proyect2EDD\\build\\web\\files\\Estu.dot");
            f.write(print);

            f.close();

        } catch (IOException ex) {
            Logger.getLogger(ArbolB5.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            Runtime rt=Runtime.getRuntime();
            rt.exec("dot -Tpng C:\\Users\\José\\Documents\\NetBeansProjects\\Proyect2EDD\\build\\web\\files\\Estu.dot -o C:\\Users\\José\\Documents\\NetBeansProjects\\Proyect2EDD\\build\\web\\files\\Estu.png");
            
        }catch(Exception e){}
            
        
   }
   
   public void eliminarLD(int posicion){
       Nodo<Integer> iterador=(Nodo<Integer>) this.primero;
       Nodo<Integer> previo=null;
       while(iterador!=null && iterador.objeto!=posicion){
            previo=iterador;
            iterador=iterador.siguiente;
        }
       if(previo==null){
        this.primero=primero.siguiente;
        if(primero!=null)
        primero.anterior=null;
        if(primero==null)ultimo=null;
       }else{
           previo.siguiente=iterador.siguiente;
           iterador=iterador.siguiente;
           if(iterador!=null)
               iterador.anterior=previo;
           else ultimo=ultimo.anterior;
       }
   }
}
class Nodo<T>{
    public T objeto;
    public Nodo<T> anterior;
    public Nodo<T> siguiente;
    public Nodo(T objeto){
        this.objeto=objeto;
        this.siguiente=this.anterior=null;
    }
    
}
