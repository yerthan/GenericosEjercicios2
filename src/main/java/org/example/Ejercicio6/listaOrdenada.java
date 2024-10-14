package org.example.Ejercicio6;

import java.util.ArrayList;
import java.util.Collections;

public class listaOrdenada<E extends Comparable<E>> {

    private ArrayList<E> lista;

    public listaOrdenada() {
        this.lista = new ArrayList<>();
    }

    //This function will add an element, and letter
    //sort the list
    public void anaidir(E element){
            lista.add(element);
            Collections.sort(lista);
    }


    //This function will search the element
    public E get(E elemnt){
        int index = lista.indexOf(elemnt);
        if(index == -1){
            System.out.println("No se ha encontrado el elemento");
            return null;
        }
        return lista.get(index);
    }

    //This function will return the size of the collection
    public int size(){
        return lista.size();
    }

    //this function will return true or false if the collection is empty
    public boolean isEmpty(){
        return lista.isEmpty();
    }

    public boolean remove(E o){

    }

}
