package unidad10;

public class Humano {

	private String nombre;
	private int edad;
	private static int poblacion;
	
	public Humano (String nombre) {
		this.nombre = nombre;
		this.edad = 0;
		Humano.poblacion++;
	}
	
	public void crecer() {
		this.edad++;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public static int getPoblacion() {
		return poblacion;
	}
	
}
