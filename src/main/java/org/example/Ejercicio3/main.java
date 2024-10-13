package org.example.Ejercicio3;

public class main {
    public static void main(String[] args) {
        Matriz<Integer> matriz = new Matriz<>(3, 3);

        // Insertamos elementos en la matriz
        matriz.set(0, 0, 1);
        matriz.set(0, 1, 2);
        matriz.set(0, 2, 3);
        matriz.set(1, 0, 4);
        matriz.set(1, 1, 5);
        matriz.set(1, 2, 6);
        matriz.set(2, 0, 7);
        matriz.set(2, 1, 8);
        matriz.set(2, 2, 9);

        // Imprimimos la matriz
        System.out.println("Matriz:");
        System.out.println(matriz);

        // Obtenemos un elemento específico
        System.out.println("Elemento en la posición (1, 1): " + matriz.get(1, 1));

        // Imprimimos el número de filas y columnas
        System.out.println("Número de filas: " + matriz.filas());
        System.out.println("Número de columnas: " + matriz.columnas());
    }
}
