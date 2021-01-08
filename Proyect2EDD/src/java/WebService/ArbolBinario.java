package WebService;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArbolBinario {
    private NodoBinario raiz;
    String toPrint;
    
    public ArbolBinario(){
        this.raiz=null;
        toPrint="";
    }
    
    public void dibujarDot(){
        toPrint="digraph g {\nnode [fontcolor=\"black\", height=0.5, color=\"black\"] [shape=oval, style=filled, color=lightblue]	edge  [color=\"black\", dir=fordware] ";
        dibujarRecursivo(this.raiz);
	toPrint+=" }";
	FileWriter f;
        try {
            f = new FileWriter( "C:\\Users\\José\\Documents\\NetBeansProjects\\Proyect2EDD\\build\\web\\files\\arbolbin.dot");
            f.write(toPrint);

            f.close();

        } catch (IOException ex) {
            Logger.getLogger(ArbolB5.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            Runtime rt=Runtime.getRuntime();
            rt.exec("dot -Tpng C:\\Users\\José\\Documents\\NetBeansProjects\\Proyect2EDD\\build\\web\\files\\arbolbin.dot -o C:\\Users\\José\\Documents\\NetBeansProjects\\Proyect2EDD\\build\\web\\files\\arbolbin.png");
            
        }catch(Exception e){}
    }
    
    public void dibujarRecursivo(NodoBinario rai) {
	if (rai != null) {
            toPrint+="\"Registro: "+rai.getEmpleado().getRegistro()+"\nNombre: "+rai.getEmpleado().getNombres()+"\nApellido: "+rai.getEmpleado().getApellidos()+"\nIdentificacion :"+rai.getEmpleado().getIdentificacion()+"\nContra :"+rai.getEmpleado().getContrasena()+"\"";
            toPrint+= "->";
            if (rai.izquierdo != null)
		dibujarRecursivo(rai.izquierdo);
            else toPrint+= "\""+rai.hashCode()+"Inull\"";

            toPrint+=" \"Registro: "+rai.getEmpleado().getRegistro()+"\nNombre: "+rai.getEmpleado().getNombres()+"\nApellido: "+rai.getEmpleado().getApellidos()+"\nIdentificacion :"+rai.getEmpleado().getIdentificacion()+"\nContra :"+rai.getEmpleado().getContrasena()+"\"";
            toPrint+= "->";
            if (rai.derecho != null)
		dibujarRecursivo(rai.derecho);
            else toPrint+= "\""+rai.hashCode()+"Dnull\"";
	}	
    }
    
    public void insertar(Empleado empleado){
        if(raiz==null)
            raiz=new NodoBinario(empleado);
        else
            insertarRecursivo(this.raiz,empleado);
    }
    private void insertarRecursivo(NodoBinario ra,Empleado empleado){
        if(ra.getEmpleado().getIdentificacion()<empleado.getIdentificacion()){
           if(ra.derecho==null )
               ra.derecho=new NodoBinario(empleado);
           else
            this.insertarRecursivo(ra.derecho,empleado);
        }else if(ra.getEmpleado().getIdentificacion()>empleado.getIdentificacion()){
            if(ra.izquierdo==null)
                ra.izquierdo=new NodoBinario(empleado);
            else
                this.insertarRecursivo(ra.izquierdo,empleado);
        }
    }
    
    public boolean verificar(int identificacion,String contrasena){
        return verificarRecursivo(this.raiz,identificacion,contrasena);
    }
    
    public boolean verificarRecursivo(NodoBinario ra,int identificacion,String contrasena){
        if(ra==null)return false;
        else{
            
            if(ra.getEmpleado().getIdentificacion()==identificacion && ra.getEmpleado().getContrasena().equals(contrasena))
                return true;
            else if(ra.getEmpleado().getIdentificacion()<identificacion){
                return verificarRecursivo(ra.derecho,identificacion,contrasena);
            }else if(ra.getEmpleado().getIdentificacion()>identificacion){
                return verificarRecursivo(ra.izquierdo,identificacion,contrasena);
            }else{
                return false;
            }
        }
        
    }
}

class NodoBinario{
    
    private Empleado empleado;
    NodoBinario derecho;
    NodoBinario izquierdo;

    public NodoBinario (Empleado empleado){
        this.empleado=empleado;
        this.izquierdo=this.derecho=null;
    }
    
    public Empleado getEmpleado() {
        return empleado;
    } 
}
