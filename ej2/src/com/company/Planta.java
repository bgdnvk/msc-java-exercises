package com.company;

import java.util.Arrays;

public class Planta {
    String[] coloresArr = {"ROJO", "AZUL", "AMARILLO", "VERDE"};
    String[] plazas = new String[13];
    String nombre;
    int cochesAparcados;
    Plaza plazasArr[] = new Plaza[13];

    public Planta(String nombre, int cochesAparcados){

        this.nombre = nombre;
        this.cochesAparcados = cochesAparcados;

        setCochesAparcados(cochesAparcados);

    }

    //se imprimen todas las plazas con sus correspondientes colores


    public void verPlanta(){
        System.out.println("--- PLANTA CREADA: " +this.nombre+" ---");

        for(Plaza plaza: plazasArr){
            System.out.print("[plaza con color: "+plaza.getColor() +" y coche nº: "+plaza.getCoche()+"] ");
        }
        System.out.println("");
        System.out.println("Nombre de la planta: "+this.nombre);
    }

    @Override
    public String toString() {
        return "Planta{" +
                ", nombre='" + nombre + '\'' +
                ", cochesAparcados=" + cochesAparcados +
                '}';
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
        int temp = 0;
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
            //System.out.println("color de plaza: "+plazasArr[i].getColor());
            //System.out.println("coche aparcado "+plazasArr[i].getCoche());

        }
    }

    public int getCochesAparcados() {
        return cochesAparcados;
    }
}
