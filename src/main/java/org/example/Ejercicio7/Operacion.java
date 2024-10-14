package org.example.Ejercicio7;

public class Operacion implements Operable{

    private Integer valor;

    //Creamos el objeto
    public Operacion(Integer valor){
        this.valor = valor;
    }

    //this function will plus the object an the value of "valor"
    @Override
    public Object sumar(Object objeto) {
        Integer o = Integer.parseInt(objeto.toString());
        return valor + o;
    }

    //This function will subtract the value of valor and the object
    @Override
    public Object restar(Object objeto) {
       Integer o = Integer.parseInt(objeto.toString());
       return valor - o;
    }


    //This function will multiply the value of valor and the object
    @Override
    public Object multiplicar(Object objeto) {
        Integer o = Integer.parseInt(objeto.toString());
        return valor * o;
    }

    //This function will divide the value of valor an the object
    //if the object is equal to 0 it will print an error message
    @Override
    public Object dividir(Object objeto) {
        Integer o = Integer.parseInt(objeto.toString());
        if(o == valor){
            System.out.println("El valor es 0, porque se divide por si mismo");
        }
        return valor / o;
    }


}
