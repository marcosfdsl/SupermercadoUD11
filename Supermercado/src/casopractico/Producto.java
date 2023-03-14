package casopractico;

public class Producto {
	
	private String nombre;
	private int precio;
	private Seccion seccion;
	int stock;
	
	public Producto(String nombre, int precio, Seccion seccion) {
		this.nombre = nombre;
		this.precio = precio;
		this.seccion = seccion;
		stock = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}
	
	public Seccion getSeccion() {
		return seccion;
	}
	
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return nombre + " " + precio + "€ (stock: " + stock + ")";
	}
	
}
