package com.company;

import java.util.*;

class Driver {
    public static void main(String[] arg) {
        //pruebas
        System.out.println("--PRUEBAS--");
        Sotano s = new Sotano();
        String[] sotanoPlazas = s.getPlazas();
        System.out.println(Arrays.toString(sotanoPlazas));

        System.out.println("--PRUEBAS--");
		/* Asignamos al tipo leyenda true porque queremos que nos pinte la
		   cadena Garaje vac�o que es lo primero que vamos a mostrar*/
        boolean leyenda = true;

		/* Inicializa un garaje de asignando colores de forma aleatoria
		   Debe tener cada planta todos lo colores*/
        Garaje g = new Garaje();

        // Mostramos la asignacion de colores a las plazas con el garaje vac�o
        g.pintarGaraje(leyenda);

		/* Si no caben m�s devuelve el valor de los coches que no ha podido
		   aparcar
		   Si devuelve un valor negativo (-1) es que el random ha sido 0, ning�n
		   coche a aparcar
		   Calculo el n�mero de veh�culos a entrar de forma aleatoria*/
        Random random = new Random();
        int aleatorio = random.nextInt(100);
        int sobra = g.entradaCoches(aleatorio);
        leyenda = false;

        if (aleatorio > 0) {
            // Entra m�s de un coche
            System.out.println("Resultado de veh�culos aparcados:\n");
            g.pintarGaraje(leyenda);
            System.out.println("Se han intentado aparcar " + aleatorio
                    + " coches.");
            if (sobra != 0) {
                // Han sobrado coches.
                System.out.println("No han cabido " + sobra + " coches");
            }

        } else {
            System.out.println("No hay coches");
        }
    }
}
