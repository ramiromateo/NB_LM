#include <cstdlib>

using namespace std;
#include"ABB.h"
#include"ABB.cpp"

int main(int argc, char** argv) {
        ABB<int> arbol;
        arbol.insertar(50);
        arbol.insertar(25);
        arbol.insertar(75);
        arbol.insertar(36);
        arbol.insertar(65);
        arbol.insertar(12);
        arbol.insertar(16);
        arbol.insertar(49);
        arbol.insertar(77);
        arbol.insertar(15);
        arbol.insertar(14);
        arbol.insertar(43);
        arbol.insertar(27);
        arbol.insertar(101);
        arbol.insertar(99);
        arbol.insertar(88);
        arbol.insertar(60);
        arbol.insertar(17);
        arbol.insertar(27);
        arbol.insertar(26);
        arbol.insertar(28);
        arbol.insertar(11);
        arbol.inOrder();
        arbol.imprimirdot();
        system("xdot listacajeros.dot");
        arbol.eliminar(25);
        arbol.imprimirdot();
        system("xdot listacajeros.dot");
        arbol.eliminar(27);
        arbol.imprimirdot();
        system("xdot listacajeros.dot");
        arbol.eliminar(49);
        arbol.eliminar(4955);
        arbol.imprimirdot();
        system("xdot listacajeros.dot");
        
    return 0;
}

/*char* concatenar(char* cad, char* cad1){
    char* cadena;
    int tam;
    tam = strlen(cad) + strlen(cad1);
    cadena =(char*)malloc((sizeof(char)*(tam+1)));
    strcpy(cadena,cad);
    strcat(cadena,cad1);
    return cadena;
}
char* IntToString(int numero){
    char *toint=(char*)malloc(sizeof(char)*10);
    sprintf(toint,"%d",numero);
    return toint;
}

int main(int argc, char** argv) {
    
    char* cadena = "ttt0j ";    
    if(!strcmp(cadena,"ttt0j "))
        printf("Hola mundo!!!  %s",concatenar("if() ",cadena));
    else printf("  %s",concatenar("if() ",cadena));
    return 0;
    
}*/

