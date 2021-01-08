package ht1compi1;

public   class objeto implements Comparable<objeto>{
    int uno;
    int dos;
    int getUno=10;
    static public  int d=10;
    //int d=10;
    
    Object og;
    public objeto(int uno, int dos) {
        this.uno = dos;
        this.dos = uno;
    }

    public int getUno() {
        return uno;
    }

    public void setUno(int uno) {
        this.uno = uno;
    }

    public int getDos() {
        return dos;
    }

    public void setDos(int dos) {
        this.dos = dos;
    }
    public int compareTo(objeto t) {
        
           if(this.uno<t.getUno()){return -1;}
           if(this.uno>t.getUno()){return 1;}
           return 0;
        
    }
}
