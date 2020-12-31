/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   NodoBinario.h
 * Author: ramiro
 *
 * Created on 20 de junio de 2018, 05:37 PM
 */

#ifndef NODOBINARIO_H
#define NODOBINARIO_H

template <class T>
class NodoBinario {
public:

    NodoBinario(T dato){
        this->dato=dato;
        this->izquiero=this->derecho=0;
    }
    NodoBinario(const NodoBinario& orig);
    virtual ~NodoBinario();

    T getDato(){
        return this->dato;
    }
    NodoBinario<T> *izquiero;
    NodoBinario<T> *derecho;
private:

    T dato;
};


#endif // NODOBINARIO_H
