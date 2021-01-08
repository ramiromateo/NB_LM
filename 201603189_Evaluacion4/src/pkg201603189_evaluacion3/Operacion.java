package pkg201603189_evaluacion3;

public class Operacion implements Intruccion{
    
    private  TipoOperacion tipo;
    private Operacion operadorIzq;
    private Operacion operadorDer;
    private Object valor;
    
    public Operacion(Operacion operadorIzq, Operacion operadorDer, TipoOperacion tipo) {
        this.tipo = tipo;
        this.operadorIzq = operadorIzq;
        this.operadorDer = operadorDer;
    }
    
    public Operacion(Operacion operadorIzq, TipoOperacion tipo) {
        this.tipo = tipo;
        this.operadorIzq = operadorIzq;
    }
    
    public Operacion(String valor, TipoOperacion tipo) {
        this.valor=valor;
        this.tipo = tipo;
    }
    
    public Operacion(Double a) {
        this.valor=a;
        this.tipo = TipoOperacion.Numero;
    }
    @Override
    public Object ejecutar(TablaSimbolo ts) {
        try{
        if(tipo== TipoOperacion.Division){
            double dod=(Double)operadorDer.ejecutar(ts);
            if(dod==0)System.out.println("Error Division Por 0");
            return (Double)operadorIzq.ejecutar(ts) /dod ;
        }else if(tipo== TipoOperacion.Multiplicacion){
            return (Double)operadorIzq.ejecutar(ts) * (Double)operadorDer.ejecutar(ts);
        }else if(tipo== TipoOperacion.Resta){
            return (Double)operadorIzq.ejecutar(ts) - (Double)operadorDer.ejecutar(ts);
        }else if(tipo== TipoOperacion.Suma){
            return (Double)operadorIzq.ejecutar(ts) + (Double)operadorDer.ejecutar(ts);
        }else if(tipo== TipoOperacion.Negativo){
            return (Double)operadorIzq.ejecutar(ts) * -1;
        }else if(tipo== TipoOperacion.Numero){
            return new Double(valor.toString());
        }else if(tipo== TipoOperacion.Identificador){
            return ts.getValor(valor.toString());
        }else if(tipo== TipoOperacion.Cadena){
            return valor.toString();
        }else if(tipo== TipoOperacion.MayorQue){
            return ((Double)operadorIzq.ejecutar(ts)).doubleValue()>((Double)operadorDer.ejecutar(ts)).doubleValue();
        }else if(tipo== TipoOperacion.MenorQue){
            return ((Double)operadorIzq.ejecutar(ts)).doubleValue()<((Double)operadorDer.ejecutar(ts)).doubleValue();
        }else if(tipo== TipoOperacion.MayorIgualQue){
            return ((Double)operadorIzq.ejecutar(ts)).doubleValue()>=((Double)operadorDer.ejecutar(ts)).doubleValue();
        }else if(tipo== TipoOperacion.MenorIgualQue){
            return ((Double)operadorIzq.ejecutar(ts)).doubleValue()<=((Double)operadorDer.ejecutar(ts)).doubleValue();
        }else if(tipo== TipoOperacion.Diferente){
            return ((Double)operadorIzq.ejecutar(ts)).doubleValue()!=((Double)operadorDer.ejecutar(ts)).doubleValue();
        }else if(tipo== TipoOperacion.Igual){
            return ((Double)operadorIzq.ejecutar(ts)).doubleValue()==((Double)operadorDer.ejecutar(ts)).doubleValue();
        }else if(tipo== TipoOperacion.Negacion){
            return (!Boolean.parseBoolean(operadorIzq.ejecutar(ts).toString()));
        }else if(tipo== TipoOperacion.Ylogico){
            return (Boolean.parseBoolean(operadorIzq.ejecutar(ts).toString())&&Boolean.parseBoolean(operadorDer.ejecutar(ts).toString()));
        }else if(tipo== TipoOperacion.Ologico){
            return (Boolean.parseBoolean(operadorIzq.ejecutar(ts).toString())||Boolean.parseBoolean(operadorDer.ejecutar(ts).toString()));
        }else{
            return null;
        }}catch(Exception e){
            return null;
        }
    }  
    
    public static enum TipoOperacion{
        Suma,
        Resta,
        Multiplicacion,
        Division,
        
        Negativo,
        Numero,
        
        Identificador,
        Cadena,
        
        MayorQue,
        MenorQue,
        MayorIgualQue,
        MenorIgualQue,
        Diferente,
        Igual,
        
        Negacion,
        Ylogico,
        Ologico
        
        
    }
    
}
