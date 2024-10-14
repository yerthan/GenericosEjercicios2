package org.example.Ejercicio7;

public class Operacion implements Operable{

    private Integer valor;

    public Operacion(Integer valor){
        this.valor = valor;
    }

    @Override
    public Object sumar(Object objeto) {
        Integer o = Integer.parseInt(objeto.toString());
        return valor + o;
    }

    @Override
    public Object restar(Object objeto) {
       Integer o = Integer.parseInt(objeto.toString());
       return valor - o;
    }

    @Override
    public Object multiplicar(Object objeto) {
        Integer o = Integer.parseInt(objeto.toString());
        return valor * o;
    }

    @Override
    public Object dividir(Object objeto) {
        Integer o = Integer.parseInt(objeto.toString());
        return valor / o;
    }


}
