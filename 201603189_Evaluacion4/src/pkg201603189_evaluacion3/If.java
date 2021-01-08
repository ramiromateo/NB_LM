

package pkg201603189_evaluacion3;

import java.util.LinkedList;

public class If implements Intruccion{
    private final Operacion condicion;
    private final LinkedList<Intruccion> listaInstrucciones;
    private LinkedList<Intruccion> listaInsElse;
    public If(Operacion a, LinkedList<Intruccion> b) {
        condicion=a;
        listaInstrucciones=b;
    }
    public If(Operacion a, LinkedList<Intruccion> b, LinkedList<Intruccion> c) {
        condicion=a;
        listaInstrucciones=b;
        listaInsElse=c;
    }
    @Override
    public Object ejecutar(TablaSimbolo ts) {
        if((Boolean)condicion.ejecutar(ts)){
            TablaSimbolo tablaLocal=new TablaSimbolo();
            tablaLocal.addAll(ts);
            for(Intruccion in: listaInstrucciones){
                in.ejecutar(tablaLocal);
            }
        }else{
            if(listaInsElse!=null){
                TablaSimbolo tablaLocal=new TablaSimbolo();
                tablaLocal.addAll(ts);
                for(Intruccion in: listaInsElse){
                    in.ejecutar(tablaLocal);
                }            
            }
        }
        return null;
    }
}
