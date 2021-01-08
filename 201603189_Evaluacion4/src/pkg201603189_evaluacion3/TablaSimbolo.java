package pkg201603189_evaluacion3;

import java.util.LinkedList;

public class TablaSimbolo extends LinkedList<Simbolo> {
    public TablaSimbolo() {
        super();
    }
    Object getValor(String id) {
        for(Simbolo s:this){
            if(s.getId().equals(id)){
                return s.getValor();
            }
        }
        System.out.println("variable "+id+" no existe ");
        return "Desconocido";
    }
    void setValor(String id, Object valor) {
        for(Simbolo s:this){
            if(s.getId().equals(id)){
                s.setValor(valor);
                return;
            }
        }
        System.out.println("La variable "+id+" no existe");
    }
}
