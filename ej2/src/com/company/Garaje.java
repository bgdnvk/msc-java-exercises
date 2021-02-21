package com.company;

import java.util.ArrayList;

public class Garaje {
    int plantas = 5;
    int plazas = 65;

    //plantas
    Planta pSotano = new Planta("Sotano", 0);
    Planta p0 = new Planta("0", 0);
    Planta p1 = new Planta("1", 0);
    Planta p2 = new Planta("2", 0);
    Planta p3 = new Planta("3", 0);


    //ArrayList<String> nombresPlantas = new ArrayList<>();
    String[] nombresPlantas = {"Sotano", "0", "1", "2", "3"};

    ArrayList<Planta> garajeList = new ArrayList<>();

    public Garaje(){
        this.garajeList.add(pSotano);
        this.garajeList.add(p0);
        this.garajeList.add(p1);
        this.garajeList.add(p2);
        this.garajeList.add(p3);
    }
    //pintar con deepToString?
    public void pintarGaraje( boolean leyenda){
        if (!leyenda){
            //mostrar garaje pintado

        } else {
            //garaje no pintado
        }
    }
    public int entradaCoches ( int aleatorio) {
        return aleatorio > 65? aleatorio - plazas: 0;
    }

    public void verGaraje(){
        for(int i = 0; i < garajeList.size(); i++){
            System.out.println(garajeList.get(i));
            garajeList.get(i).verPlanta();
        }

    }

    public void crearGaraje( int numCoches ){
        int plantasLlenas = plantasPintar(numCoches)[0];
        int sobra = plantasPintar(numCoches)[1];
        //comprobar si sobran coches, al sobrar se pinta la planta adicional
        //para los coches sobrantes
        //int plantasUsadas = sobra > 1 ? plantasLlenas +1: plantasLlenas;

        System.out.println("inside crear garaje: ");
        System.out.println("plantasLlenas "+plantasLlenas);
        System.out.println("sobra "+sobra);
        //se llenan todas las plantas full
        for (int i = 0; i < plantasLlenas; i++){
            this.garajeList.get(i).setCochesAparcados(13);

        }
        //se rellena la última planta con los coches sobrantes
        if(sobra>1){
            this.garajeList.get(plantasLlenas).setCochesAparcados(sobra);
        }
        String list = garajeList.toString();
        System.out.println(list);

    }

    //[0] devuelve plantas llenas de coches
    //[1] devuelve nº de coches en la última planta
    public int[] plantasPintar(int coches){
        int[] res = new int[2];

        if(coches > 65){
            res[0] = 5;
            res[1] = 0;
            return res;
        }
        int plantas = coches/13;
        int sobra = coches%13;
        res[0] = plantas;
        res[1] = sobra;
        return res;
    }




}
