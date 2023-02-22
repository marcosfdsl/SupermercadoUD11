package unidad9;

public class Cuenta {
	
	private String numero;
	private String titular;
	private float saldo;
	private float interesAnual;
	
	public Cuenta(String numero, String titular, float saldo, float interes) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.interesAnual = interes;
	}
	
	public void ingreso (float cantidad) {
		saldo+=cantidad;
	}

	public void reintegro (float cantidad) {
		saldo-=cantidad;
	}
	
	public void ingresoInteres () {
		saldo+=saldo*interesAnual;
	}
	
	public boolean enRojos () {
		return saldo<0;
	}
	
	public float leerSaldo () {
		return saldo;
	}

	public String getNumero() {
		return numero;
	}
	
	public String getTitular() {
		return titular;
	}
	
}
