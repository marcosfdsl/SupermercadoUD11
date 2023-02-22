package unidad9;

public class Coche {
	
	// atributos
	private int ruedas;
	private boolean automatico;
	private int puertas;
	private String color;
	private int potencia;
	
	// constructor SIEMPRE PUBLICO
	public Coche(boolean automatico, int puertas, String color, int potencia) {
	
		this.ruedas = 4;
		this.automatico = automatico;
		this.puertas = puertas;
		this.color = color;
		this.potencia = potencia;
		
	}

	public int getRuedas() {
		return ruedas;
	}
	
	public boolean getAutomatico() {
		return automatico;
	}
	
	public int getPuertas() {
		return puertas;		
	}
	
	public String getColor() {
		return color;
	}
	
	public int getPotencia() {
		return potencia;
	}
	
	public void setAutomatico(boolean nuevoValor) {
		this.automatico = nuevoValor;
	}
	
	public void setPuertas(int nuevoValor) {
		this.puertas = nuevoValor;
	}
	
	public void setColor(String nuevoValor) {
		this.color = nuevoValor;
	}
	
	public void setPotencia(int nuevoValor) {
		this.potencia = nuevoValor;
	}
	
}
