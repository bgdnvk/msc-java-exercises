package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        start();
    }
    //inicio del programa
    public static void start() throws IOException {
        System.out.println("Se sale con 0");
        System.out.println("Escribe los numeros a poner en bolsa");

        Bolsa bolsa = new Bolsa();
        menu(bolsa);
        System.out.println(bolsa.toString());
    }

    //funcion donde el usuario interactua con el menu
    public static void menu(Bolsa bolsa) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        //si el usuario introduce 0 se sale del programa
        if (input != 0){
            bolsa.calculate(input);
            menu(bolsa);
        }
    }

}
