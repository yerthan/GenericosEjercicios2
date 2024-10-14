package org.example.Ejercicio6;

public class main {
    public static void main(String[] args) {
        listaOrdenada lista = new listaOrdenada();

        System.out.println(lista.toString());
        lista.anaidir(1);
        lista.anaidir(2);
        System.out.println(lista.toString());
        int i = lista.indexOf(2);
        System.out.println(i);
        System.out.println(lista.toString());
    }
}
