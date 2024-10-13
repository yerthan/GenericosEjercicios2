package org.example.Ejercicio1;

import java.util.LinkedList;

public class Pila<T> {

    private LinkedList<T> lista;

    public Pila(){
        lista = new LinkedList<>();
    }


    //This function returns true or false
    //if the list is empty
    public boolean isEmpty(){
        return lista.isEmpty();
    }

    public T extract(){

        Pila aux = new Pila();
        

       if(lista.isEmpty()){
           System.out.println("Esta vacia, no podemos extraer nada");
           return null;
       }
       return lista.removeFirst();
    }



    public T primero(){

        T t = lista.getFirst();
        return t;

    }

    public void anaidair(T tipo){

        if(lista.get(0) != null){
            lista.addFirst(tipo);
        }else{
            lista.addLast(tipo);
        }


    }

    @Override
    public String toString() {
        return "Esta es la lista " + lista.toString();
    }
}
