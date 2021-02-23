package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

        verHashSet();

    }

    public static void verHashSet() throws IOException {

        // Se recogen los datos de la consola
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        Set<Integer> integerSet1 = new HashSet<>(Arrays.asList(20, 19, 4, 5, 10, 43 , 2, 8, 9));
        Set<Integer> integerSet2 = new HashSet<>(Arrays.asList(1, 2, 5, 8, 9, 10));


        //depende del input imprimir el método indicado
        boolean exit = false;

        System.out.println("el array original es: "+ integerSet1);
        while (!exit){
            System.out.println("introduce: union, interseccion, print, hashcode, agregar o salir");

            String input = reader.readLine();
            System.out.println("has introducido "+input);

            switch (input){
                case "union":
                    Set<Integer> union = new HashSet<>(integerSet1);
                    union.addAll(integerSet2);
                    System.out.println("union: "+ union);
                    break;
                case "interseccion":
                    Set<Integer> interseccion = new HashSet<>(integerSet1);
                    interseccion.retainAll(integerSet2);
                    System.out.println("interseccion: "+interseccion);
                    break;
                case "print":
                    for(Integer i: integerSet1){
                        System.out.println(i);
                    }
                    break;
                case "hashcode":
                    System.out.println(integerSet1.hashCode());
                    break;
                case "agregar":
                    System.out.println("escribe el numero por agregar");
                    String input2 = reader.readLine();
                    integerSet1.add(Integer.parseInt(input2));
                    System.out.println("elemento agregado: "+input2);
                    System.out.println("el array es: ");
                    for (int i: integerSet1){
                        System.out.println(i);
                    }
                    System.out.println("^ último elemento");
                    break;
                case "salir":
                    exit = true;
                    break;
                default:
                    System.out.println("código erroneo");
            }
        }

    }
}
