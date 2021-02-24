package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.company.utils.UtilsBolsa.getPrimeFactors;


public class Bolsa {

    HashMap<Integer, List<Integer>> bolsa = new HashMap<>();

    public Bolsa(){
        this.bolsa = bolsa;
    }

    public void calculate(int num){
        int key = num;
        List<Integer> list = getPrimeFactors(key);
        addElement(key, list);

        System.out.println("key: "+key);
        System.out.println("val: "+ list);
    }

    public void addElement(int key, List<Integer> list){
        this.bolsa.put(key,list);
    }

    @Override
    public String toString() {

        return "Bolsa{ " +
                "bolsa=" + this.bolsa +
                '}';
    }
}
