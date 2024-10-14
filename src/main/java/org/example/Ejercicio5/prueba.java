package org.example.Ejercicio5;

public class prueba {
    public static void main(String[] args) {

        ColeccionSimpleGenerica csg = new ColeccionSimple();

        csg.anadirElemento(2);
        csg.anadirElemento("es verdadero");
        csg.anadirElemento(true);

        System.out.println(csg.toString());
        csg.extract();
        System.out.println(csg.toString());

    }
}
