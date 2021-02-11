package com.company;

import java.util.Arrays;

public class Planta {
    String[] coloresArr = {"ROJO", "AZUL", "AMARILLO", "VERDE"};
    String[] plazas = new String[13];
    String nombre;
    int cochesAparcados;

    Plaza plazaObj = new Plaza(0, "amarillo");
    Plaza plazasArr[] = new Plaza[13];
    //no se pueden hacer loops dentro de clases?


    public Planta(String nombre, int cochesAparcados){

        this.nombre = nombre;
        this.cochesAparcados = cochesAparcados;
        int temp = 0;

        //this.plazasArr[0].setColor(coloresArr[0]);
        //null pointer
        //this.plazasArr[0].setColor("color");


        for (int i = 0; i < plazasArr.length; i++){
            if(temp >= 0 && temp < 3){
                this.plazasArr[i] = new Plaza(cochesAparcados, coloresArr[temp]);
                temp++;
            } else {
                this.plazasArr[i] = new Plaza(cochesAparcados, coloresArr[temp]);
                temp = 0;
            }

            if (cochesAparcados <= 0) {
                cochesAparcados = 0;
            } else {
                cochesAparcados--;
            }
            System.out.println("color de plaza: "+plazasArr[i].getColor());
            System.out.println("coche aparcado "+plazasArr[i].getCoche());

        }

        System.out.println("color of 0 is "+plazasArr[0].getColor());
        System.out.println(this.plazaObj.getColor());
        System.out.println(Arrays.toString(this.plazasArr));


        /*
        for(int i = 0; i < plazasArr.length; i++){
            if(temp >= 0 && temp < 3){
                this.plazasArr[i].setColor(coloresArr[temp]);
                temp++;
            } else {
                this.plazasArr[i].setColor(coloresArr[temp]);
                temp = 0;
            }
            System.out.println(plazasArr[i]);
        }

         */

        /* ANTIGUO
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
            */
        //System.out.println(Arrays.toString(plazas));
    }

    //return con this o no?
    public String[] getPlazas() {
        return plazas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCochesAparcados(int cochesAparcados) {
        this.cochesAparcados = cochesAparcados;
    }

    public int getCochesAparcados() {
        return cochesAparcados;
    }
}
