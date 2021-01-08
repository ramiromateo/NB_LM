
package pkg201603189_evaluacion3;

import java.util.LinkedList;

public class Mientras implements Intruccion{
    private final Operacion condicion;
    private final LinkedList<Intruccion> listaInstrucciones;
    public Mientras(Operacion a, LinkedList<Intruccion> b) {
        this.condicion=a;
        this.listaInstrucciones=b;
    }
    @Override
    public Object ejecutar(TablaSimbolo ts) {
        while((Boolean)condicion.ejecutar(ts)){
            TablaSimbolo tablaLocal=new TablaSimbolo();
            tablaLocal.addAll(ts);
            for(Intruccion ins:listaInstrucciones){
                ins.ejecutar(tablaLocal);
            }
        }
        return null;
    }   
}