package pkg201603189_evaluacion3;

public class Simbolo {
    private  Tipo tipo;
    private  String id;
    private Object valor;    
    public Simbolo(String id, Tipo tipo) {
        this.tipo = tipo;
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public Object getValor() {
        return valor;
    }
    void setValor(Object v) {
        valor=v;
    }
    public static enum Tipo{
        Num
    }
}
