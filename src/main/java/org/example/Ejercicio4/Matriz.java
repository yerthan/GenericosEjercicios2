package org.example.Ejercicio4;

public class Matriz {

    private Integer[][] matriz;

    public Matriz() {
        matriz = new Integer[4][2];
    }

    public void rellenar(){
        int contador = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = contador;
                contador++;
            }
        }
    }

    public void imprimir(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    public void imprimir2(){
        System.out.println(matriz[0][1]);
    }

}
