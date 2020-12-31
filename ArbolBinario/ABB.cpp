#include "ABB.h"

#include"NodoBinario.h"
#include"NodoBinario.cpp"
#include<stdio.h>
#include<iostream>
#include<string>
using namespace std;



template <class T>
ABB<T>::ABB() {
    this->raiz=NULL;
}
template <class T>
ABB<T>::ABB(const ABB& orig) {
}
template <class T>
ABB<T>::~ABB() {
}
template <class T>
bool ABB<T>::insertar(T dato){
    return this->insertarRecursivo(this->raiz, dato);
}
template <class T>
bool ABB<T>::insertarRecursivo(NodoBinario<T>*& raiz1,T dato){
    if(raiz1==NULL){
        raiz1=new NodoBinario<T>(dato);
        return true;

    }else if(raiz1->getDato()<dato){
        return this->insertarRecursivo(raiz1->derecho,dato);
    }else if(raiz1->getDato()>dato){
        return this->insertarRecursivo(raiz1->izquiero,dato);
    }else{
        cout<< "ya existe"<< endl;
        return false;
    }
}
template <class T>
void ABB<T>::inOrder(){
    inOrderRecursivo(this->raiz);
}
template <class T>
void ABB<T>::inOrderRecursivo(NodoBinario<T>* raiz){
    if(raiz==NULL)return;
    inOrderRecursivo(raiz->izquiero);
    cout<<raiz->getDato()<<endl;
    inOrderRecursivo(raiz->derecho);
}

template <class T>
void ABB<T>::imprimirdot(){
    
    this->archivo = fopen("listacajeros.dot", "w");
    fprintf(this->archivo, "digraph G {\n");
    this->Print(this->raiz);
    fprintf(this->archivo, "}");
    fclose(this->archivo);

}
template <class T>
void ABB<T>::Print(NodoBinario<T>* ra){
    
    if(ra!=NULL){
        fprintf(this->archivo," %i",ra->getDato());
        if(ra->izquiero!=NULL){
            fprintf(this->archivo,"->");
            Print(ra->izquiero);
        }
        fprintf(this->archivo," %i",ra->getDato());
        if(ra->derecho!=NULL){
            fprintf(this->archivo,"->");
            Print(ra->derecho);
        }
        
        
        
        
    }
}
template <class T>
bool ABB<T>::eliminar(T dato){
    return this->eliminarRecursivo(this->raiz, dato);
}
template <class T>
bool ABB<T>::eliminarRecursivo(NodoBinario<T>*& raiz1,T dato){
    if(raiz1!=NULL){
        if(raiz1->getDato()<dato){
            return this->eliminarRecursivo(raiz1->derecho,dato);
        }else if(raiz1->getDato()>dato){
            return this->eliminarRecursivo(raiz1->izquiero,dato);
        }else if(raiz1->getDato()==dato){
            NodoBinario<T> *liberar;
            if(raiz1->derecho==NULL){
		liberar=raiz1;		
                raiz1=raiz1->izquiero;
            }
            else if(raiz1->izquiero==NULL){
		liberar=raiz1;
		raiz1=raiz1->derecho;
            }else{
                    
                NodoBinario<T> *previo,*actual;
                liberar=raiz1;
                raiz1=raiz1->derecho;
                previo=raiz1;
                actual=raiz1->izquiero;
                while(actual!=NULL && actual->izquiero!=NULL){
                    previo=actual;
                    actual=actual->izquiero;
                }
                if(actual==NULL){
                    raiz1->izquiero=liberar->izquiero;
                }else{
                    previo->izquiero=actual->derecho;
                    raiz1=actual;
                    raiz1->izquiero=liberar->izquiero;
                    raiz1->derecho=liberar->derecho;

                }
            }           
	    return true;
        }
    }else{
        cout<< "No existe dicho valor"<< endl;
        return false;
    }
}

