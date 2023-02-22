package unidad11;

public class Disco {
	
	private String nombre;
	private int año_pub;
	private double precio;
	private int numCanciones;
	private Cantante cantante;
	
	public Disco(String nombre, int año_pub, double precio, int numCanciones, Cantante cantante) {
		this.nombre = nombre;
		this.año_pub = año_pub;
		this.precio = precio;
		this.numCanciones = numCanciones;
		this.cantante = cantante;
	}

	public String getNombre() {
		return nombre;
	}

	public int getAño_pub() {
		return año_pub;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getNumCanciones() {
		return numCanciones;
	}

	public Cantante getCantante() {
		return cantante;
	}

	@Override
	public String toString() {
		return "Disco [nombre=" + nombre + ", año_pub=" + año_pub + ", precio=" + precio + ", numCanciones="
				+ numCanciones + ", cantante=" + cantante + "]";
	}
	
}
