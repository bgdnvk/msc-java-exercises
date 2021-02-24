package com.company;

public class Main {

    public static void main(String[] args) {
        Bolsa bolsa = new Bolsa();
        bolsa.calculate(84);
        bolsa.calculate(90);


        System.out.println(bolsa.toString());
    }
}
