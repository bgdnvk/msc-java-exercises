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

    //se crean las plantas con las plazas, el nº de coches y sus colores
    public void setCochesAparcados(int cochesAparcados) {
        this.cochesAparcados = cochesAparcados;
        //temp se usa para el ciclo de colores en el array de @coloresArr
        //cuando llega a [2] se reinicia
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
    //rellena la planta con los coches sobrantes que no han cabido en las plantas full
    public void setCochesSobra( int plantas, int cochesTotal){
        System.out.println("setcochasobraaaaaaaa");
        //el nº del primer coche de la última planta
        int primerCocheRellenar = plantas*13+1;
        //temp = ciclo de colores
        // se rellena la planta sobrante, empieza por el coche con el nº mayor
        // cicla a través de los coches sobrantes y cuando
        for (int i = 0, temp =0; i < plazasArr.length && cochesTotal  >= primerCocheRellenar; i++, cochesTotal--){
            if(temp >= 0 && temp < 3){
                this.plazasArr[i] = new Plaza(cochesTotal, coloresArr[temp]);
                temp++;
            } else {
                this.plazasArr[i] = new Plaza(cochesTotal, coloresArr[temp]);
                temp = 0;
            }
        }
    }

    public int getCochesAparcados() {
        return cochesAparcados;
    }
}
