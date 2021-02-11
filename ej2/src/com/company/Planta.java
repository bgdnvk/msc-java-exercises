package com.company;

import java.util.Arrays;

public class Planta {
    String[] coloresArr = {"ROJO", "AZUL", "AMARILLO", "VERDE"};
    String[] plazas = new String[13];
    String nombre;

    public Planta(String nombre){
        this.nombre = nombre;
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

    public String getNombre() {
        return nombre;
    }
}
