package com.mycompany.procalculator;

public class ProCalculator {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Calculator instancia = new Calculator(15, 10);
        
        System.out.println("La suma es : " +instancia.suma()+
                "\nLa resta es : " +instancia.resta()+
                "\nEl producto es : "+instancia.producto());
        if(instancia.y==0)
            System.out.println("No se puede dividir por cero");
        else
            System.out.println("LA división es : "+instancia.division());
    }
}
