package org.example.Ejercicio5;

import java.util.ArrayList;

public class ColeccionSimple<T> implements ColeccionSimpleGenerica{

    private ArrayList<T> lista;

    public ColeccionSimple() {
        this.lista = new ArrayList<T>();
    }

    @Override
    public boolean estaVacia() {
        if(lista.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object extract() {
        Object c = null ;
        if(lista.isEmpty()){
            System.out.println("Lista vacia");
        }
            return c =  lista.remove(0);

    }

    @Override
    public Object primero() {
        if(lista.isEmpty()){
            System.out.println("Lista vacia");
        }
        return lista.get(0);

    }

    @Override
    public void anadirElemento(Object elemento) {
        T t = (T)elemento;
        lista.add(t);
    }

    @Override
    public String toString() {
        return "ColeccionSimple{" +
                "lista=" + lista +
                '}';
    }
}
