package pkg201603189_evaluacion3;


public class Imprimir implements Intruccion{

    
    private  Intruccion contenido;
     
    public Imprimir(Intruccion contenido) {
        this.contenido = contenido;
    }
    @Override
    public Object ejecutar(TablaSimbolo tb) {
        try{
            String cad=contenido.ejecutar(tb).toString();
            if(!cad.equals("Infinity"))
        System.out.println(cad);
        }catch(Exception e){}
        return null;
    }
    
}
