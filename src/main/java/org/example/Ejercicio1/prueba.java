package org.example.Ejercicio1;

public class prueba {
    public static void main(String[] args) {
        Pila p =  new Pila<>();

        System.out.println(p.toString());
        p.isEmpty();
        p.anaidair("1");
        System.out.println(p.toString());
        p.extract();
        p.toString();
        p.anaidair("2");
        p.anaidair(23);
        System.out.println(p.toString());
        System.out.println(p.primero());
        System.out.println(p.toString());



    }
}
