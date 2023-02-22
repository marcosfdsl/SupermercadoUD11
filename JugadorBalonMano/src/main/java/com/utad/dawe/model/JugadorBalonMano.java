package com.utad.dawe.model;

public class JugadorBalonMano {
	private String Nombre;
	private int Dorsal;
	private int Anotacion;
	private int Bloqueo;
	private int TiempoJugadoEnSegundos;
	
	public JugadorBalonMano(String Nombre, int Dorsal) {
		this.Nombre = Nombre;
		this.Dorsal = Dorsal;	
	} 

	public void setAnotacion(int Anotacion) {
		this.Anotacion = Anotacion;
	}

	public void setBloqueo(int Bloqueo) {
		this.Bloqueo = Bloqueo;
	}

	public void setTiempoJugadoEnSegundos(int TiempoJugadoEnSegundos) {
		this.TiempoJugadoEnSegundos = TiempoJugadoEnSegundos;
	}

	public String getNombre() {
		return Nombre;
	}

	public int getDorsal() {
		return Dorsal;
	}

	public int getAnotacion() {
		return Anotacion;
	}

	public int getBloqueo() {
		return Bloqueo;
	}

	public int getTiempoJugadoEnSegundos() {
		return TiempoJugadoEnSegundos;
	}

	@Override
	public String toString() {
		return "JugadorBalonMano [Nombre=" + Nombre + ", Dorsal=" + Dorsal + ", Anotacion=" + Anotacion + ", Bloqueo="
				+ Bloqueo + ", TiempoJugadoEnSegundos=" + TiempoJugadoEnSegundos + "]";
	}
	
	public void estadisticas(int sumaAnotacion, int sumaBloqueo, int sumaTiempoJugado, int size) {
		
		int mediaAnotacionj1 = sumaAnotacion/size;
		int mediaBloqueoj1 = sumaBloqueo/size;
		int mediaTiempoJugadoj1 = sumaTiempoJugado/size;
		
		System.out.println("media anotación = " + mediaAnotacionj1 + ", media bloqueos = "
		+ mediaBloqueoj1 + ", media tiempo jugado en segundos = " + mediaTiempoJugadoj1);
		
	}
	
}
