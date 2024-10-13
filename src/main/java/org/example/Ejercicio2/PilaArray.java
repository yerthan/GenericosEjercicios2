package org.example.Ejercicio2;

import java.util.Arrays;

public class PilaArray<T> {

    //Atributtes
    private T[] array;
    private int contador;
    private int capacidad;


    //Consttructor
    public PilaArray(int capacidad) {
        this.capacidad = capacidad;
        this.array = (T[]) new Object[capacidad];
        this.contador = 0;
    }

    //This function is to see if the array is empty

    public boolean isEmpty() {
        return contador == 0;
    }

    //Thsi function it's to add an element

    public void add(T elemento) {

        if (contador == capacidad) {
            System.out.println("La pila no se le puede añadir, nada más");
        }
        if (this.array[0] == null) {
            this.array[0] = elemento;
            this.contador = contador + 1;
        }else{
            this.array[contador] = elemento;
            this.contador = contador + 1;
        }


    }

    //this function

    public T extract() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia");
            return null;
        } else {
            contador--;
            T t = array[0];
            array[0] = null;
            return t;
        }
    }

    public T primero() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia");
            return null;
        } else {
            return array[contador - 1];
        }
    }

    @Override
    public String toString() {
        return "PilaArray{" +
                "array=" + Arrays.toString(array) +
                ", contador=" + contador +
                ", capacidad=" + capacidad +
                '}';
    }


}

