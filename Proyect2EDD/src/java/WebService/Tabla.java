package WebService;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;



public class Tabla{
    Librera arreglo[];
    Librera arregloaux[];
    Lista<Integer> listDclave;
    Lista<Integer> listDclaveaux;
    int tamano;
    int contador;
    public static JSONArray arrayLibros;
    int contadorpos;
    
    public Tabla(int tamano){
       this.tamano=tamano;
       arreglo=new Librera[tamano];
       listDclave=new Lista<Integer>();
       for(int i=0;i<arreglo.length;i++)
           arreglo[i]=null;
       contador=0;
       contadorpos=0;
    }
    
    public void eliminarLibrera(int idLibrera){
        
        Nodo<Integer> iterador=this.listDclave.primero;
        while(iterador!=null){
            if(arreglo[iterador.objeto].getIdLibreria()==idLibrera){
                arreglo[iterador.objeto]=null;
                int posdelete=iterador.objeto;
                this.listDclave.eliminarLD(posdelete);
                return;
            }
            iterador=iterador.siguiente;
        }
        
    
    }
    
    public String obtenerJSONLibros(){
        if(this.listDclave.primero==null)
            return "";
        JSONObject root = new JSONObject();
        arrayLibros = new JSONArray();
            ///terminasr de leer para pasarlos a la pagina como los unicos
            Nodo<Integer> itera=this.listDclave.primero;
            while(itera!=null){
                arreglo[itera.objeto].estante.obtenerJsonlibros();
                itera=itera.siguiente;
            }    
                
            root.put("libro",arrayLibros.toJSONString() );
            return root.toJSONString();
    
    }
    
    public String obtenerJSONLibrera(){
        if(this.listDclave.primero==null)
            return "";
        JSONObject root = new JSONObject();
        JSONArray Usuarios = new JSONArray();
            
            Nodo<Integer> itera=this.listDclave.primero;
            while(itera!=null){
                JSONObject usuarioObjeto = new JSONObject();
                usuarioObjeto.put("idLibrera", ""+arreglo[itera.objeto].getIdLibreria());
                usuarioObjeto.put("genero", ""+arreglo[itera.objeto].getGenero());
                usuarioObjeto.put("cantidadLibros", ""+arreglo[itera.objeto].getCantidaLibros());
                usuarioObjeto.put("niveles", ""+arreglo[itera.objeto].getNiveles());
                Usuarios.add(usuarioObjeto);
                itera=itera.siguiente;
            }    
                
            root.put("librera",Usuarios.toJSONString() );
            return root.toJSONString();
    
    }
    
    public void escribirSistema(){
        if(this.listDclave.primero==null)return;
        
        String toprint="digraph g { rankdir=\"TB\" \n node [shape=record, fontcolor=black, fontsize=14]; \n hash [label=\"";
        
        Nodo<Integer> itera=this.listDclave.primero;
        if(itera!=null){
            toprint+="<f"+itera.objeto+">"+"Pos:"+itera.objeto+",ID:"+arreglo[itera.objeto].getIdLibreria()+",Genero:"+arreglo[itera.objeto].getGenero()+",CantidadLibros:"+arreglo[itera.objeto].getCantidaLibros();
            itera=itera.siguiente;
        }
        while(itera!=null){
            toprint+="|<f"+itera.objeto+">"+"Pos:"+itera.objeto+",ID:"+arreglo[itera.objeto].getIdLibreria()+",Genero:"+arreglo[itera.objeto].getGenero()+",CantidadLibros:"+arreglo[itera.objeto].getCantidaLibros();
            itera=itera.siguiente;
        }
        toprint+="\", color=blue, fillcolor=lightblue, style=filled]; node [shape=record];  ";
        //apuntamos e imprimimos el arbol b
        itera=this.listDclave.primero;
        String apuntadores="";
        while(itera!=null){
            if(arreglo[itera.objeto].estante.raiz!=null){
                apuntadores+=" hash:f"+itera.objeto+"->"+arreglo[itera.objeto].estante.raiz.getDotName();
                toprint+=" "+arreglo[itera.objeto].estante.raiz.obtenerDot();
            }
            itera=itera.siguiente;
        }
        
        toprint+=apuntadores+" }";
        FileWriter f;
        try {
            f = new FileWriter( "C:\\Users\\José\\Documents\\NetBeansProjects\\Proyect2EDD\\build\\web\\files\\sistem.dot");
            f.write(toprint);

            f.close();

        } catch (IOException ex) {}
        try{
            Runtime rt=Runtime.getRuntime();
            rt.exec("dot -Tpng C:\\Users\\José\\Documents\\NetBeansProjects\\Proyect2EDD\\build\\web\\files\\sistem.dot -o C:\\Users\\José\\Documents\\NetBeansProjects\\Proyect2EDD\\build\\web\\files\\sistem.png");
            
        }catch(Exception e){}
        
    }
    
    public void insertarLibro(Libro libro){
        int posicion=funcionHash(libro.getIdGenero());
        
        if(arreglo[posicion].getIdLibreria()==libro.getIdGenero()){
            arreglo[posicion].estante.insertar(libro);
            arreglo[posicion].setCantidadLibros(libro.getEjemplares());
            return;
        }
        Nodo<Integer> iterador=this.listDclave.primero;
        while(iterador!=null){
            if(arreglo[iterador.objeto].getIdLibreria()==libro.getIdGenero()){
                arreglo[iterador.objeto].estante.insertar(libro);
                arreglo[iterador.objeto].setCantidadLibros(libro.getEjemplares());
                return;
            }
            iterador=iterador.siguiente;
        }
        
    
    }
    public void insertar(Librera objeto){
        int posicion=funcionHash(objeto.getIdLibreria());
        
        if(arreglo[posicion]==null){
            arreglo[posicion]=objeto;
            listDclave.insertarLD(posicion);
        }
        else{
            int i=1,pos;
            pos=posicion+i;
            if(pos==tamano)
                pos=0;
            while(arreglo[pos]!=null){
                i++;
                pos=posicion+(i*i);
                if(pos>=tamano)
                    pos=pos%tamano;
            }
            arreglo[pos]=objeto;
            listDclave.insertarLD(pos);
        }
        contador++;
        if(((contador*100)/tamano)>80)
            reHash();
    }
    private void reHash(){
        this.contadorpos=0;
        this.arregloaux=this.arreglo;
        this.listDclaveaux=this.listDclave;
        
        this.tamano=primocercano(2*contador);
        contador=0;
        
        this.arreglo=new Librera[tamano];
        this.listDclave=new Lista<Integer>();
        
        for(int i=0;i<arreglo.length;i++)
           arreglo[i]=null;
        
        Nodo<Integer> iterador=this.listDclaveaux.primero;
        while(iterador!=null){
            insertar(arregloaux[iterador.objeto]);
            iterador=iterador.siguiente;
        }
        this.arregloaux=null;
        this.listDclaveaux=null;
        
    }
    //preubas
    public int gettamano(){return this.tamano;}
    //preubas
    public void imprimirelementos(){
        Nodo<Integer> iterador=this.listDclave.primero;
        while(iterador!=null){
            System.out.println("codigo"+arreglo[iterador.objeto]);;
            iterador=iterador.siguiente;
        }
    }
    
    private int funcionHash(int id){
        int cont=contadorpos;
        this.contadorpos++;
        return cont;
    }
    
    private int primocercano(int num){
        int nume=num;
        
        while(nume>3 && !primoRecursivo(nume,2)){
            nume++;
        }
        
        return nume;
    }
    
    private boolean primoRecursivo(int numero, int c){
        if(numero%c==0 && numero!=2)
            return false;
        else if(c>numero/2)
            return true;
        else return primoRecursivo(numero, c+1);
    }

    private   int numDigitos(int numero){
        if(numero<=0)return 1;
        else{
            return 10*numDigitos(numero/10);
        }
    }
}
