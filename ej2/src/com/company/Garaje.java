package com.company;

import java.util.ArrayList;

public class Garaje {
    //int plantas = 5;
    int plazas = 65;

    //plantas
    Planta pSotano = new Planta("Sotano", 0);
    Planta p0 = new Planta("0", 0);
    Planta p1 = new Planta("1", 0);
    Planta p2 = new Planta("2", 0);
    Planta p3 = new Planta("3", 0);


    //ArrayList<String> nombresPlantas = new ArrayList<>();
    //String[] nombresPlantas = {"Sotano", "0", "1", "2", "3"};

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
        if (leyenda){
            //mostrar garaje con coches
            System.out.println(">>>>>>>>>>>>>>>>GARAJE VACIO <<<<<<<<<<<<<<<<<<<<<<");

        } else {
            //garaje sin coches
            System.out.println("_____________________GARAJE LLENO _____________________");
        }
        verGaraje();
    }
    public int entradaCoches ( int aleatorio) {
        crearGaraje(aleatorio);
        return aleatorio > 65? aleatorio - plazas: 0;
    }
    //se imprime el garaje planta por planta en la consola
    public void verGaraje(){

        for(int i = 0; i < garajeList.size(); i++){
            System.out.println(garajeList.get(i));
            garajeList.get(i).verPlanta();
        }
    }

    public void crearGaraje( int numCoches ){
        int plantasLlenas = plantasPintar(numCoches)[0];
        int sobra = plantasPintar(numCoches)[1];

        //System.out.println("plantasLlenas: "+plantasLlenas);
        //System.out.println("coches que sobran:  "+sobra);

        //se llenan todas las plantas full
        for (int i = 0, cochesPorPlanta = 13; i < plantasLlenas; i++, cochesPorPlanta+=13 ){
            this.garajeList.get(i).setCochesAparcados(cochesPorPlanta);
        }
        //se rellena la última planta con los coches sobrantes
        if(sobra>1){
            this.garajeList.get(plantasLlenas).setCochesSobra( plantasLlenas, numCoches);
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
