package unidad10;

public class EjemploStatic {

	private int dato = 0;
	private static int datoEstatico = 0;
	
	public void incrementar() {
		this.datoEstatico++;
	}
	
	public static void metodoEstatico() {
		datoEstatico++;
	}
	
}
