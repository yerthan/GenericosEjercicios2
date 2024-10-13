package org.example.Ejercicio3;

import java.util.Arrays;

public class Matriz <T> {

    private T[][] matriz;
    private int filas;
    private int columnas;

    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = (T[][]) new Object[filas][columnas];
    }

    //This function is to insert an element in the posicion that the user give us
    public void set(int fila, int columna, T elemento) {
        matriz[fila][columna] = elemento;
    }

    //This will
    public T get(int fila, int columna) {
        return matriz[fila][columna];
    }

    public int columnas() {
        return columnas;
    }

    public int filas() {
        return filas;
    }

    @Override
    public String toString() {
        String resulado = "";
        for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    resulado += matriz[i][j] + " ";
            }
                resulado = resulado + "\n";
        }
        return resulado;
    }
}
