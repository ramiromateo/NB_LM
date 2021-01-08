package WebService;

public class ArbolBinario {
    private NodoBinario raiz;
    
    
    public ArbolBinario(){
        this.raiz=null;
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
    public void inorde(){
        inOrdeRecursivo(this.raiz);
    }
    
    private void inOrdeRecursivo(NodoBinario ra){
        if(ra==null)return;
            inOrdeRecursivo(ra.izquierdo);
            System.out.println(ra.getEmpleado().getIdentificacion());
            inOrdeRecursivo(ra.derecho);
    }
    
    private boolean verificarRecursivo(NodoBinario ra,int identificacion,String contrasena){
        System.out.println("verificando");
        
        if(ra!=null){
            if(ra.getEmpleado().getIdentificacion()==identificacion && ra.getEmpleado().getContrasena().equals(contrasena))
                return true;
            else if(ra.getEmpleado().getIdentificacion()<identificacion){
                return verificarRecursivo(ra.derecho,identificacion,contrasena);
            }else if(ra.getEmpleado().getIdentificacion()>identificacion){
                return verificarRecursivo(ra.izquierdo,identificacion,contrasena);
            }else{
                return true;
            }
        }
        else{
            
            return false;
            
        }
        
    }
}

class NodoBinario{
    
    private Empleado empleado;
    public NodoBinario derecho;
    public NodoBinario izquierdo;

    public NodoBinario(Empleado empleado){
        this.empleado=empleado;
        this.izquierdo=this.derecho=null;
    }
    
    public Empleado getEmpleado() {
        return empleado;
    } 
}

