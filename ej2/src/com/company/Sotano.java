package com.company;

import java.util.Arrays;

public class Sotano {
    String[] coloresArr = {"ROJO", "AZUL", "AMARILLO", "VERDE"};
    String[] plazas = new String[13];

    public Sotano(){

        int temp = 0;
        for(int i = 0; i < plazas.length; i++){
            if(temp >= 0 && temp < 3){
                this.plazas[i] = coloresArr[temp];
                temp++;
            } else {
                this.plazas[i] = coloresArr[3];
                temp = 0;
            }
            //System.out.println(plazas[i]);
        }

        //System.out.println(Arrays.toString(plazas));
    }

    //return con this o no?
    public String[] getPlazas() {
        return plazas;
    }
}
