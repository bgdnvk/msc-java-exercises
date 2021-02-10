package com.company;

public class Garaje {
    int plazas = 65;

    public Garaje(){

    }
    public void pintarGaraje( boolean leyenda){
        if (leyenda){
            //mostrar garaje pintado
        }
    }
    public int entradaCoches ( int aleatorio) {
        return aleatorio > 65? aleatorio - plazas: 0;
    }
}
