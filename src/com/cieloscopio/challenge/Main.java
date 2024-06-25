package com.cieloscopio.challenge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Tome su desicion!");

        int opcion = 0;

        while(opcion != 7){

            String Menu = """
                    Challenge Cioloscopio:
                    ***********************************************************
                    **Elija una ciudad para obtener los datos meteorológicos**
                    1 - Ciudad de Mexico
                    2 - Buenos Aires
                    3 - Bogota
                    4 - Lima
                    5 - Santiago
                    6 - Deseos consultar otra ciudad
                    7 - Salir
                    ************************************************************
                    Elija una opcion basada en el número:
                    """;
            System.out.println(Menu);

            Scanner sc = new Scanner(System.in);

            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor invalido");
            }

            switch (opcion){
                case 1:
                    System.out.println("Ciudad Mexico");
                    break;
                case 2:
                    System.out.println("Buenos Aires");
                    break;
                case 3:
                    System.out.println("Bogota");
                    break;
                case 4:
                    System.out.println("Lima");
                    break;
                case 5:
                    System.out.println("Santiago");
                case 6:
                    System.out.println("Deseos consultar");
                case 7:
                    System.out.println("Fin del programa, muchas gracias por usar nuestros Servicios");
                    break;
                default:
                    System.out.println("Por favor ingrese un valor correspondiente a la lista");

            }




        }





    }
}