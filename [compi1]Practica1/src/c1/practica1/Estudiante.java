package c1.practica1;

import java.util.LinkedList;

public class Estudiante implements Comparable<Estudiante>{
    private String nombre;
    private String apellido;
    private String carne;
    private Integer fina;
    private LinkedList<Integer> listatarea;
    private LinkedList<Integer> lisht;
    private LinkedList<Integer> lisec;
    private LinkedList<Integer> listpra;
    private LinkedList<Integer> listpro;
    
    public static Integer cantidaTareas=0;
    public static Integer cantidaHojas=0;
    public static Integer cantidaExamenes=0;
    public static Integer cantidaPracticas=0;
    public static Integer cantidaProyectos=0;

    public Estudiante() {
        this.nombre = "";
        this.apellido = "";
        this.carne = "";
        this.fina = 0;
        this.listatarea = new LinkedList<>();
        this.lisht = new LinkedList<>();
        this.lisec = new LinkedList<>();
        this.listpra = new LinkedList<>();
        this.listpro = new LinkedList<>();
    }
    
    public void addTarea(String cont){
        this.listatarea.add(Integer.parseInt(cont));
    }
    public void addHT(String cont){
        this.lisht.add(Integer.parseInt(cont));
    }
    public void addEC(String cont){
        this.lisec.add(Integer.parseInt(cont));
    }
    public void addPro(String cont){
        this.listpro.add(Integer.parseInt(cont));
    }
    public void addPra(String cont){
        this.listpra.add(Integer.parseInt(cont));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public Integer getFina() {
        return fina;
    }

    public void setFina(Integer fina) {
        this.fina = fina;
    }
    @Override
    public int compareTo(Estudiante t) {
        if(this.fina<t.getFina())return -1;
        else if(this.fina>t.getFina())return 1;
        else return 0;
    }

    public LinkedList<Integer> getListatarea() {
        return listatarea;
    }

    public LinkedList<Integer> getLisht() {
        return lisht;
    }

    public LinkedList<Integer> getLisec() {
        return lisec;
    }

    public LinkedList<Integer> getListpra() {
        return listpra;
    }

    public LinkedList<Integer> getListpro() {
        return listpro;
    }
    public Integer getSumaTareas(){
        Integer cont=0;
        for(Integer to:this.listatarea)
            cont+=to;
        return cont;
    }
    public Integer getSumaHt(){
        Integer cont=0;
        for(Integer to:this.lisht)
            cont+=to;
        return cont;
    }
    public Integer getSumaEc(){
        Integer cont=0;
        for(Integer to:this.lisec)
            cont+=to;
        return cont;
    }
    public Integer getSumaPra(){
        Integer cont=0;
        for(Integer to:this.listpra)
            cont+=to;
        return cont;
    }
    public Integer getSumaPro(){
        Integer cont=0;
        for(Integer to:this.listpro)
            cont+=to;
        return cont;
    }
    
    public String getTodo(){
        String st="\n";
        st+=this.carne+"\n";
        st+=this.nombre+"\n";
        st+=this.apellido+"\nTareas------------\n";
        for(Integer inn:this.listatarea)
            st+=inn+"\n";
        st+="\nHojas------------\n";
        for(Integer inn:this.lisht)
            st+=inn+"\n";
        st+="\nEsamecorto------------\n";
        for(Integer inn:this.lisec)
            st+=inn+"\n";
        st+="\nPracticas------------\n";
        for(Integer inn:this.listpra)
            st+=inn+"\n";
        st+="\nProyectos------------\n";
        for(Integer inn:this.listpro)
            st+=inn+"\n";
        st+="Finasl "+this.fina;
        return st;
    }
    
}
