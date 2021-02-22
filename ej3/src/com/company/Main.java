package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> hSet = new HashSet<>();
        hSet.add("primer");
        hSet.add("second");
        hSet.add("tercer");
        hSet.add("primer");
        for (String e: hSet){
            System.out.println(e);
        }

        Set<Integer> integerSet1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> integerSet2 = new HashSet<>(Arrays.asList(1, 2, 5, 8, 9, 10));

        //diferencia/interseccion
        Set<Integer> interseccion = new HashSet<>(integerSet1);
        Set<Integer> union = new HashSet<>(integerSet1);

        //intersección
        interseccion.retainAll(integerSet2);
        System.out.println("interseccion: "+interseccion);

        union.addAll(integerSet2);
        System.out.println("union: "+ union);

    }
}
