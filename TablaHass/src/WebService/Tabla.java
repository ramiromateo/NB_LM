package WebService;



public class Tabla{
    Librera arreglo[];
    Librera arregloaux[];
    Lista<Integer> listDclave;
    Lista<Integer> listDclaveaux;
    int tamano;
    int contador;
    
    public Tabla(int tamano){
       this.tamano=tamano;
       arreglo=new Librera[tamano];
       listDclave=new Lista<Integer>();
       for(int i=0;i<arreglo.length;i++)
           arreglo[i]=null;
       contador=0;
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
            System.out.println("codigo"+arreglo[iterador.objeto].getIdLibreria());;
            iterador=iterador.siguiente;
        }
    }
    
    private int funcionHash(int id){
        int numeroceros=numDigitos(tamano);
        int posicion=0;
        int idcopia=id;
        
        while(idcopia!=0){
            posicion+=idcopia;
            idcopia=idcopia/numeroceros;
            posicion-=idcopia*numeroceros;
        }
        //retorno el numeros
        if(posicion<tamano)
        return posicion;
        else return posicion%tamano;
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
