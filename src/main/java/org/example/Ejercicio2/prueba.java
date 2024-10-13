package org.example.Ejercicio2;

public class prueba {
    public static void main(String[] args) {


        PilaArray p = new PilaArray<>(5);

        p.add(1);
        p.add(2);
        p.add(true);
        System.out.println(p.toString());
        p.extract();
        System.out.println(p.toString());
        p.primero();
        System.out.println(p.toString());
        p.add("Hola");
        System.out.println(p.toString());
        p.add("Adios");
        System.out.println(p.toString());

    }
}
