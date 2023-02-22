package com.utad.dawe.app;

import java.util.*;
import com.utad.dawe.model.*;

public class Equipo {
	
	public static void main(String[] args) {
		
		ArrayList<JugadorBalonMano> alj1 = new ArrayList<>();
		ArrayList<JugadorBalonMano> alj2 = new ArrayList<>();
		int sumaAnotacionj1=0;
		int sumaBloqueoj1=0;
		int sumaTiempoJugadoj1=0;
		int sumaAnotacionj2=0;
		int sumaBloqueoj2=0;
		int sumaTiempoJugadoj2=0;
			
		for (int j=1; j<=10; j++) {
			
			JugadorBalonMano j1 = new JugadorBalonMano("Marcos", 7);
			j1.setAnotacion((int)(Math.random()*10));
			sumaAnotacionj1+=j1.getAnotacion();
			j1.setBloqueo((int)(Math.random()*20));
			sumaBloqueoj1+=j1.getBloqueo();
			j1.setTiempoJugadoEnSegundos((int)(Math.random()*2000));
			sumaTiempoJugadoj1+=j1.getTiempoJugadoEnSegundos();
			alj1.add(j1);
				
			JugadorBalonMano j2 = new JugadorBalonMano("Alejandro", 13);
			j2.setAnotacion((int)(Math.random()*10));
			sumaAnotacionj2+=j2.getAnotacion();
			j2.setBloqueo((int)(Math.random()*20));
			sumaBloqueoj2+=j2.getBloqueo();
			j2.setTiempoJugadoEnSegundos((int)(Math.random()*2000));
			sumaTiempoJugadoj2+=j2.getTiempoJugadoEnSegundos();
			alj2.add(j2);
			
			if (j==5||j==10) {

				System.out.println("Estadísticas jugador 1 hasta la jornada " + j);
				j1.estadisticas(sumaAnotacionj1, sumaBloqueoj1, sumaTiempoJugadoj1, alj1.size());
				System.out.println("Estadísticas jugador 2 hasta la jornada " + j);
				j1.estadisticas(sumaAnotacionj2, sumaBloqueoj2, sumaTiempoJugadoj2, alj2.size());
				System.out.println();
				
			}
		
		}
		
		for (int i=0; i<10; i++) {
			System.out.println("Jornada " + (i+1) + ": " + alj1.get(i));
		}
		
		System.out.println();
		
		for (int i=0; i<10; i++) {
			System.out.println("Jornada " + (i+1) + ": " + alj2.get(i));
		}
		
	}
 
}
