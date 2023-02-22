package unidad9_1;

public class Humano {

	private String nombre;
	private int edad;
	private float peso;
	private float estatura;
	
	public Humano(String nombre, int edad, float peso, float estatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.estatura = estatura;
	}

	public String getNombre() {
		return nombre;
	}
	
	public int getAnos() {
		return edad;
	}

	public void cumplirAnos() {
		this.edad+=1;
	}

	public void cambiarPeso(float peso) {
		this.peso = peso;
	}
	
	public void cambiarEstatura(float estatura) {
		this.peso = estatura;
	}

}
