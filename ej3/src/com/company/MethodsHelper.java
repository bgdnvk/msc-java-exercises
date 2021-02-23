package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MethodsHelper {
    public static void verHashSet() throws IOException {

        // Se recogen los datos de la consola
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        //se crean los arrays para usar
        Set<Integer> integerSet1 = new HashSet<>(Arrays.asList(20, 19, 4, 5, 10, 43 , 2, 8, 9));
        Set<Integer> integerSet2 = new HashSet<>(Arrays.asList(1, 2, 5, 8, 9, 10));


        //depende del input imprimir el método indicado
        boolean exit = false;

        System.out.println("Estas viendo HashSet: "+ integerSet1);
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
                    imprimirSet(integerSet1);
                    break;
                case "hashcode":
                    System.out.println(integerSet1.hashCode());
                    break;
                case "agregar":
                    agregarElemento(integerSet1);
                    break;
                case "salir":
                    exit = true;
                    break;
                default:
                    System.out.println("código erroneo");
            }
        }

    }

    public static void verTreeMap() throws IOException {
        // Se recogen los datos de la consola
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        //se crean los arrays para usar
        Set<Integer> integerSet1 = new TreeSet<>(Arrays.asList(20, 19, 4, 5, 10, 43 , 2, 8, 9));
        //depende del input imprimir el método indicado
        boolean exit = false;

        System.out.println("todos los métodos son iguales en hashset menos agregar");
        System.out.println("Estas viendo TreeSet: "+ integerSet1);

        while (!exit){
            System.out.println("introduce: agregar, imprimir o salir");

            String input = reader.readLine();
            System.out.println("has introducido "+input);

            switch (input){
                case "agregar":
                    agregarElemento(integerSet1);
                    break;
                case "print":
                    imprimirSet(integerSet1);
                case "salir":
                    exit = true;
                    break;
                default:
                    System.out.println("código erroneo");
            }
        }
    }

    //depende del input se entra a ver hashset o treemap
    public static void imprimir(String input) throws IOException {
        if (input.equals("hashset")){
            verHashSet();
        } else if(input.equals("treemap")){
            verTreeMap();
        }
    }

    public static void agregarElemento( Set mySet) throws IOException {

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("escribe el numero por agregar");
        String input2 = reader.readLine();
        //la consola recibe un string que lo pasamos a int porque set esta hecho de ints
        mySet.add(Integer.parseInt(input2));

        System.out.println("elemento agregado: "+input2);
        System.out.println("el array es: ");

        for (Object i: mySet){
            System.out.println(i);
        }
    }

    public static void imprimirSet(Set mySet){
        for (Object i: mySet){
            System.out.println(i);
        }
    }
}
