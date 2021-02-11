package com.company;

public class Garaje {
    int plantas = 5;
    int plazas = 65;

    //plantas
    Planta pSotano = new Planta("Sotano", 0);
    Planta p0 = new Planta("0", 0);
    Planta p1 = new Planta("1", 0);
    Planta p2 = new Planta("2", 0);
    Planta p3 = new Planta("3", 13);

    public Garaje(){

    }
    //pintar con deepToString
    public void pintarGaraje( boolean leyenda){
        if (leyenda){
            //mostrar garaje pintado

        }
    }
    public int entradaCoches ( int aleatorio) {
        return aleatorio > 65? aleatorio - plazas: 0;
    }
}
