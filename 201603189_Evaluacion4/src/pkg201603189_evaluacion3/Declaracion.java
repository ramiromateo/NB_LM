package pkg201603189_evaluacion3;


public class Declaracion implements Intruccion{

    private String id;
    private Simbolo.Tipo tipo;
    private Operacion valor;
    
    public Declaracion(String id, Simbolo.Tipo tipo,Operacion valor) {
        this.id=id;
        this.tipo=tipo;
        this.valor=valor;
    }
    
    @Override
    public Object ejecutar(TablaSimbolo tb) {
        Simbolo sim=new Simbolo(this.id,this.tipo);
        tb.add(sim);
        if(valor!=null)
            sim.setValor(valor.ejecutar(tb));
        return null;
    }
    
}
