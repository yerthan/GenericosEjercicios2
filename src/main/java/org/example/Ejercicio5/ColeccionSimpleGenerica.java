package org.example.Ejercicio5;

public interface ColeccionSimpleGenerica<T>{

    public boolean estaVacia();

    public T extract();

    public T primero();


    public void anadirElemento(T elemento);
}
