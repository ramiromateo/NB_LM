package javaapplication2;

public class JavaApplication2 {

    public static void main(String[] args) {
        /*int ar[]={5,10,10,12,10};
        System.out.println(JavaApplication2.mcd(80844, 25320));*/
        //for(int i=1;i<21;i++)
        //System.out.println(JavaApplication2.DectoBin(296,-1));
        
        System.out.println(JavaApplication2.BintoDec(11100001,0));
        /*System.out.println(JavaApplication2.sumaA(ar, 0));
        System.out.println(JavaApplication2.reversestring("raar"));*/
    }
    //#3
    public static long BintoDec(long num, int cont){
        if(num==0)return 0;
	return num%10*pow(2,cont)+BintoDec(num/10,++cont);
    }
    //#1MCD entre dos numeros
    public static int mcd(int n,int m){
	if(m==0) return n;
	return mcd(m,n%m);
    }
    
    
    //#2 Decial a binario
    public static int DectoBin(int num, int cont){
	if(num<1)return 0;
        return DectoBin(num/10,++cont)+num%10*pow(12,cont);
	
    }
    
    public static int pow(int base, int cant){
        if( cant <= 0 ) return 1;
        return base * pow( base, --cant);
    }

    
    
    
    //#4
    public static int sumaA(int arr[],int cont){
	if(cont==arr.length)return 0;
	return arr[cont]+sumaA(arr,++cont);
    }
    //#5comprobar si una palabra es palindromas
    public static boolean reversestring(String str){
        if(str.length()<=1) return true;
        if(str.charAt(0)==str.charAt(str.length()-1)){
            return reversestring(str.substring(1, str.length()-1));
        }
        return false;
    }
}
