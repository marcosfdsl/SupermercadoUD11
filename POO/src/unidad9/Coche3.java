package unidad9;

public class Coche3 {
	
	// atributos
	private int ruedas;
	private boolean automatico;
	private int puertas;
	private String color;
	private int potencia;
	
	// constructor SIEMPRE PUBLICO
	public Coche3(boolean automatico, int puertas, String color, int potencia) {
	
		this.ruedas = 4;
		this.automatico = automatico;
		this.puertas = puertas;
		this.color = color;
		this.potencia = potencia;
		
	}
	
	public int getRuedas() {
		return ruedas;
	}

	public boolean isAutomatico() {
		return automatico;
	}

	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
}
