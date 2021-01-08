package WebService;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Arbolbin {
    private NodoBin raiz;
    String toPrint;
    
    public Arbolbin(){
        this.raiz=null;
        toPrint="";
    } 
    
    public void dibujarDot(){
        toPrint="digraph g {\nnode [fontcolor=\"black\", height=0.5, color=\"black\"] [shape=oval, style=filled, color=lightblue]	edge  [color=\"black\", dir=fordware] ";
        dibujarRecursivo(this.raiz);
	toPrint+=" }";
	FileWriter f;
        try {
            f = new FileWriter( "C:\\Users\\José\\Documents\\NetBeansProjects\\Proyect2EDD\\build\\web\\files\\Estu.dot");
            f.write(toPrint);

            f.close();

        } catch (IOException ex) {
            Logger.getLogger(ArbolB5.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            Runtime rt=Runtime.getRuntime();
            rt.exec("dot -Tpng C:\\Users\\José\\Documents\\NetBeansProjects\\Proyect2EDD\\build\\web\\files\\Estu.dot -o C:\\Users\\José\\Documents\\NetBeansProjects\\Proyect2EDD\\build\\web\\files\\Estu.png");
            
        }catch(Exception e){}
    }
    
    public void dibujarRecursivo(NodoBin rai) {
	if (rai != null) {
            toPrint+="\"Carne: "+rai.getEmpleado().getCarne()+"\nNombre: "+rai.getEmpleado().getNombre()+"\nApellido: "+rai.getEmpleado().getApellido()+"\nSemestre :"+rai.getEmpleado().getSemestre()+"\"";
            toPrint+= "->";
            if (rai.izquierdo != null)
		dibujarRecursivo(rai.izquierdo);
            else toPrint+= "\""+rai.hashCode()+"Inull\"";

            toPrint+="\"Carne: "+rai.getEmpleado().getCarne()+"\nNombre: "+rai.getEmpleado().getNombre()+"\nApellido: "+rai.getEmpleado().getApellido()+"\nSemestre :"+rai.getEmpleado().getSemestre()+"\"";
            toPrint+= "->";
            if (rai.derecho != null)
		dibujarRecursivo(rai.derecho);
            else toPrint+= "\""+rai.hashCode()+"Dnull\"";
	}	
    }
    
    public void insertar(Estudiante empleado){
        if(raiz==null)
            raiz=new NodoBin(empleado);
        else
            insertarRecursivo(this.raiz,empleado);
    }
    private void insertarRecursivo(NodoBin ra,Estudiante empleado){
        if(ra.getEmpleado().getCarne()<empleado.getCarne()){
           if(ra.derecho==null )
               ra.derecho=new NodoBin(empleado);
           else
            this.insertarRecursivo(ra.derecho,empleado);
        }else if(ra.getEmpleado().getCarne()>empleado.getCarne()){
            if(ra.izquierdo==null)
                ra.izquierdo=new NodoBin(empleado);
            else
                this.insertarRecursivo(ra.izquierdo,empleado);
        }
    }
    
    
}

class NodoBin{
    
    private Estudiante estudiante;
    NodoBin derecho;
    NodoBin izquierdo;

    public NodoBin(Estudiante estudiante){
        this.estudiante=estudiante;
        this.izquierdo=this.derecho=null;
    }
    
    public Estudiante getEmpleado() {
        return estudiante;
    } 
}