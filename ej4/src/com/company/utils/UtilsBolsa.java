package com.company.utils;

import java.util.ArrayList;
import java.util.List;

public class UtilsBolsa {
    //se devuelve una lista con factores primos
    public static List<Integer> getPrimeFactors(int num){

        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                factors.add(i);
                num /= i;
            }
        }
        return factors;
    }
}
