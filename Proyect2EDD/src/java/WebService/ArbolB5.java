package WebService;

import static WebService.Tabla.arrayLibros;
import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;


public class ArbolB5 {
    public Pagina raiz;
    
    public ArbolB5(){
        raiz=null;
        
    }
    
    public void insertar(Libro libro){
        raiz=insertarRecursivo(raiz,libro);
    }
    public void obtenerJsonlibros(){
       
        raiz.obtenerJsonLibros();
    }
    
    public void verdot() {
        String toprint="digraph g { \n node [shape=record];\n ";
        
        toprint+=raiz.obtenerDot();
        toprint+="}";
        
        
            FileWriter f;
        try {
            f = new FileWriter( "arbolB.dot");
            f.write(toprint);

            f.close();

        } catch (IOException ex) {
            Logger.getLogger(ArbolB5.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            Runtime rt=Runtime.getRuntime();
            rt.exec("dot -Tpng arbolB.dot -o arbolB.png");
            //Desktop.getDesktop().open(new File("arbolB.png"));
        }catch(Exception e){}
            
    }
    
    private Pagina insertarRecursivo(Pagina ra,Libro libro){
        boolean subir;
        ContenedorLibro contmedio=new ContenedorLibro();
        ContenedorPagina contnd=new ContenedorPagina();
        subir=toPush(ra,libro,contmedio,contnd);
        
        if(subir){
            Pagina page;
            page=new Pagina();
            page.setContador(1);
            page.libros[1]=contmedio.medio;
            page.ramas[0]=ra;
            page.ramas[1]=contnd.nd;
            ra=page;
        }
        return ra;
    }
    
    private boolean toPush(Pagina ra,Libro libro,ContenedorLibro contmedio,ContenedorPagina contnd){
        Contenedorint k=new Contenedorint();
        boolean goUp=false;
        if(ra==null){
            goUp=true;
            contmedio.medio=libro;
            contnd.nd=null;
        }else{
            boolean esta;
            esta=buscarEnNodo(ra, libro.getIdLibro(),k);
            if(esta){
                ra.libros[k.numero].aumentarEjemplares();
                return false;
            }
            
            goUp=toPush(ra.ramas[k.numero],libro,contmedio,contnd);
            if(goUp )
                if(ra.estaLleno())
                    partirNodo(ra,contmedio,contnd,k.numero);
            else{
                goUp=false;
                insertarEnPagina(ra,contmedio.medio,contnd.nd,k.numero);
            }
        }
        return goUp;
    }
    
    private boolean buscarEnNodo(Pagina ra,int clave,Contenedorint k){
        int index;
        boolean encontrado;
        if(clave<ra.libros[1].getIdLibro()){
            encontrado=false;
            index=0;
        }else{
           index=ra.getContador();
           while(clave<ra.libros[index].getIdLibro()&& index>1)
               index--;
               encontrado=(clave==ra.libros[index].getIdLibro());
               
               
        }
        k.numero=index;
        return encontrado;
    }
    
    private void partirNodo(Pagina ra, ContenedorLibro contmedio, ContenedorPagina contnd,int kk) {
    
        int i, posMdna, k;
        Pagina nuevaPag;
        k = kk;
        
        posMdna = (k <= 5/2) ? (5/2) : (5/2 + 1);
        nuevaPag = new Pagina();
        for (i = posMdna + 1; i < 5; i++){
            nuevaPag.libros[i - posMdna]= ra.libros[i];
            nuevaPag.ramas[i - posMdna]=ra.ramas[i];
        }
        
        nuevaPag.setContador(4 - posMdna); 
        ra.setContador(posMdna); 
        
        if (k <= 5/2){
            insertarEnPagina(ra, contmedio.medio,contnd.nd,kk); 
            
        }
        else{
            kk = k - posMdna;
            insertarEnPagina(nuevaPag, contmedio.medio, contnd.nd,kk);
            
        }
        
        contmedio.medio = ra.libros[ra.getContador()];
    
        nuevaPag.ramas[0]= ra.ramas[ra.getContador()];
        ra.setContador(ra.getContador()-1); // se quita la mediana
        contnd.nd = nuevaPag; // devuelve la nueva Página
        if (!(k <= 5/2) ||(k <= 5/2)){
            ra.libros[3]=null;
            ra.libros[4]=null;
            ra.ramas[3]=null;
            ra.ramas[4]=null;
        }
    }
    
    private void insertarEnPagina(Pagina ra, Libro contmedio, Pagina contnd,int k) {
        for(int i=ra.getContador();i>=(k+1);i--){
            ra.libros[i+1]=ra.libros[i];
            ra.ramas[i+1]=ra.ramas[i];
        }
        ra.libros[k+1]=contmedio;
        ra.ramas[k+1]=contnd;
        ra.setContador((ra.getContador()+1));
    }
    
    public void aumentarPrestados(int clave){
        aumentarPrestados(raiz,clave);
    }
    
    
    
    private void aumentarPrestados(Pagina ra,int clave){
        Contenedorint kk=new Contenedorint();
        if(ra==null)
            return;
        else{
            if(buscarEnNodo(ra, clave,kk))
                ra.libros[kk.numero].aumentarPrestados();
            else aumentarPrestados(ra.ramas[kk.numero],clave);
        }
    }

    

    
}

class ContenedorPagina{
    Pagina nd;
    ContenedorPagina(){
        nd=null;
    }
}

class ContenedorLibro{
    Libro medio;
    ContenedorLibro(){
        medio=null;
    }
}

class Contenedorint{
    int numero;
    
}

class Pagina{
    Pagina ramas[];
    Libro libros[];
    private int contador;
    
    Pagina(){
        ramas=new Pagina[5];
        libros=new Libro[5];
        contador=0;
        for(int i=0;i<5;i++){
            ramas[i]=null;
            libros[i]=null;
        }
    }
    
    public String getDotName(){
        return "Nodo"+this.hashCode();
    }
    
    public void obtenerJsonLibros(){
        for( int i = 0; i < 5; i++ ) {
            if(libros[i]!=null && (libros[i].getEjemplares()-libros[i].getNumeroPrestados())>=1){
                JSONObject librojoson = new JSONObject();
                librojoson.put("idLibro", ""+libros[i].getIdLibro());
                librojoson.put("titulo", ""+libros[i].getTitulo());
                librojoson.put("autor", ""+libros[i].getAutor());
                librojoson.put("nuPaginas", ""+libros[i].getNuPaginas());
                librojoson.put("ejemplares", ""+libros[i].getEjemplares());
                librojoson.put("nuPrestrados", ""+libros[i].getNumeroPrestados());
                librojoson.put("idGenero", ""+libros[i].getIdGenero());
                Tabla.arrayLibros.add(librojoson);
            }
        }
        for( int i = 0; i < 5; i++ ) {
            if(ramas[i]!=null ){
                ramas[i].obtenerJsonLibros();
            }
        }
        
    }
    
    public String obtenerDot(){
    StringBuilder b = new StringBuilder();
        
        b.append(getDotName());
        b.append("[label=\"<P0>");
        for( int i = 0; i < 5; i++ ) {
            if(libros[i]!=null){
                b.append( "|" +"ID:"+libros[i].getIdLibro()+",T:"+libros[i].getTitulo()+",E:"+libros[i].getEjemplares());
                b.append( "|<P" + (i) + ">" );                
            }
        }
        
        b.append("\"];\n");
        
        for( int i = 0; i < 5 ; i++ ) {
            if( ramas[i] != null )   {
                b.append( ramas[i].obtenerDot() );
                b.append( getDotName() + ":P" + i + " -> " + ramas[i].getDotName() + ";\n" );
            }
        }
        
        return b.toString();
    
    }
    
    public boolean estaLleno(){
        return contador==4;
    }
    
    public boolean estaSemiLLeno(){
        return (contador<5/2);
    }
    
    public int getContador(){
        return contador;
    }
    public void  setContador(int contador){
        this.contador=contador;
    }
}
