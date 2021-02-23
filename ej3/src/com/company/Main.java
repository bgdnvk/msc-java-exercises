package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("introduce hashset o treemap");

        //reader para leer el input
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String input = reader.readLine();
        //objeto que inicia el programa
        MethodsHelper helper = new MethodsHelper();
        helper.imprimir(input);
    }
}
