
#ifndef ABB_H
#define ABB_H
#include<stdio.h>
#include"NodoBinario.h"
#include<string>
using namespace std;


template <class T>
class ABB {
public:
    ABB();
    ABB(const ABB& orig);
    bool insertar(T dato);
    bool insertarRecursivo(NodoBinario<T>*& raiz1,T dato);
    void inOrder();
    void inOrderRecursivo(NodoBinario<T>* raiz);
    void Print(NodoBinario<T>* ra);
    void imprimirdot();
    bool eliminar(T dato);
    bool eliminarRecursivo(NodoBinario<T>*& raiz1,T dato);
    virtual ~ABB();
private:
    NodoBinario<T>* raiz;
    FILE *archivo;
};

#endif // ABB_H
