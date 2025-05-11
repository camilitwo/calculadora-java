package com.clases.fran.calculadorajava.controller;

import java.util.Scanner;

public class Sumar {

    public static void main(String[] args) {

        // String = cadena de texto por ejemplo "hola"
        // int = numero entero por ejemplo 10
        // double = numero decimal por ejemplo 10.5
        // float = numero decimal por ejemplo 10.5
        // boolean = verdadero o falso por ejemplo true o false

        int numeroUno;
        int numeroDos;

        //System.out.println("el numero uno es igual a: " + numeroUno);

        // if, switch, do while

        /*if(resultado >= 30){
            System.out.println("El resultado es mayor o igual a 30");
        }else if(resultado == 29){
            System.out.println("el resultado es 29");
        }else{
            System.out.println("el resultado es menor a 29");
        }*/

       /* switch (resultado){
            case 29:
                System.out.println("El resultado es 29");
                break;
            case 30:
                System.out.println("El resultado es mayor o igual a 30");
                break;
            default:
                System.out.println("el resultado es menor a 29");
        }*/

        //pedir que ingrese por teclado el numero uno
        //pedir que ingrese por teclado el numero dos

        Scanner sc = new Scanner(System.in);
        /*System.out.println("Ingrese el primer numero: ");
        numeroUno = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numeroDos = sc.nextInt();*/

        System.out.println("Escribe tu nombre " );
        String nombre = sc.next();

        System.out.println("Ingresa tu edad ");
        int edad = 0;
        try{
            edad = sc.nextInt();
        }catch (Exception e){
            System.out.println("Error no es un valor numerico, escribe bien");

            System.out.println("Ingresa tu edad nuevamente");
            edad = sc.nextInt();
        }

        //int resultado = numeroUno + numeroDos;
        System.out.println("Hola! " + nombre);
        
        String mensajeSalida = "eres menor de edad";
        /*if(edad>=18 && edad<65){
            System.out.println(mensajeSalida);
        }else if(edad > 64){
            mensajeSalida = "Eres tercera edad";
            System.out.println(mensajeSalida);
        }
        else {
            mensajeSalida = "Eres menor de edad";
            System.out.println(mensajeSalida);
        }*/

        if (edad > 64) {
            mensajeSalida = "Eres anciano";
        }else if(edad > 17){
            mensajeSalida = "Eres mayor de edad";
        }

        System.out.println(mensajeSalida);



        //System.out.println("La suma de ambos numeros es igual a: " + resultado);

    }
}
