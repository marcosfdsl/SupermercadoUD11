package casopractico;

import java.util.*;

public class Supermercado {
	
	private ArrayList<Producto> productosSupermercado;	

	public Supermercado() {
		this.productosSupermercado = new ArrayList<>();
		rellenarProductos();
	}
	
	public void rellenarProductos() {
		Producto tomate = new Producto("tomate", 3, Seccion.FRUTERÍA);
		productosSupermercado.add(tomate);
		tomate.setStock((int) (Math.random()*30));
		
		Producto aceite = new Producto("aceite", 2, Seccion.OTROS);
		productosSupermercado.add(aceite);
		aceite.setStock((int) (Math.random()*30));
		
		Producto pan = new Producto("pan", 1, Seccion.OTROS);
		productosSupermercado.add(pan);
		pan.setStock((int) (Math.random()*30));
		
		Producto leche = new Producto("leche", 3, Seccion.LÁCTEOS);
		productosSupermercado.add(leche);
		leche.setStock((int) (Math.random()*30));
		
		Producto yogur = new Producto("yogur", 2, Seccion.LÁCTEOS);
		productosSupermercado.add(yogur);
		yogur.setStock((int) (Math.random()*30));
		
		Producto queso = new Producto("queso", 2, Seccion.LÁCTEOS);
		productosSupermercado.add(queso);
		queso.setStock((int) (Math.random()*30));
		
		Producto jamón = new Producto("jamón", 4, Seccion.CARNICERÍA);
		productosSupermercado.add(jamón);
		jamón.setStock((int) (Math.random()*30));
		
		Producto harina = new Producto("harina", 1, Seccion.OTROS);
		productosSupermercado.add(harina);
		harina.setStock((int) (Math.random()*30));
		
		Producto manzana = new Producto("manzana", 1, Seccion.FRUTERÍA);
		productosSupermercado.add(manzana);
		manzana.setStock((int) (Math.random()*30));
		
		Producto salmón = new Producto("salmón", 1, Seccion.PESCADERÍA);
		productosSupermercado.add(salmón);
		salmón.setStock((int) (Math.random()*30));
		
		Producto sartén = new Producto("sartén", 1, Seccion.HOGAR);
		productosSupermercado.add(sartén);
		sartén.setStock((int) (Math.random()*30));
		
		Producto agua = new Producto("agua", 1, Seccion.BEBIDAS);
		productosSupermercado.add(agua);
		agua.setStock((int) (Math.random()*30));
	}

	public ArrayList<Producto> productosDisponibles() {
		return productosSupermercado;
	}
	
	public Producto productoConcreto(Producto producto) {
		return productosSupermercado.get(productosSupermercado.indexOf(producto));
	}
	
	// MOSTRAR PRODUCTOS POR SECCIONES

	public void porSecciones() {
		
		System.out.print("BEBIDAS: ");
		for (int i=0; i<productosSupermercado.size(); i++) {
			if (productosSupermercado.get(i).getSeccion().equals(Seccion.BEBIDAS)) {
				System.out.print(productosSupermercado.get(i).toString() + " |  ");
			}
		}
		
		System.out.print("\nLACTEOS: ");
		for (int i=0; i<productosSupermercado.size(); i++) {
			if (productosSupermercado.get(i).getSeccion().equals(Seccion.LÁCTEOS)) {
				System.out.print(productosSupermercado.get(i).toString() + " | ");
			}
		}

		System.out.print("\nFRUTERIA: ");
		for (int i=0; i<productosSupermercado.size(); i++) {
			if (productosSupermercado.get(i).getSeccion().equals(Seccion.FRUTERÍA)) {
				System.out.print(productosSupermercado.get(i).toString() + " | ");
			}
		}
		
		System.out.print("\nCARNICERIA: ");
		for (int i=0; i<productosSupermercado.size(); i++) {
			if (productosSupermercado.get(i).getSeccion().equals(Seccion.CARNICERÍA)) {
				System.out.print(productosSupermercado.get(i).toString() + " | ");
			}
		}
		
		System.out.print("\nPESCADERIA: ");
		for (int i=0; i<productosSupermercado.size(); i++) {
			if (productosSupermercado.get(i).getSeccion().equals(Seccion.PESCADERÍA)) {
				System.out.print(productosSupermercado.get(i).toString() + " | ");
			}
		}
		
		System.out.print("\nOTROS: ");
		for (int i=0; i<productosSupermercado.size(); i++) {
			if (productosSupermercado.get(i).getSeccion().equals(Seccion.OTROS)) {
				System.out.print(productosSupermercado.get(i).toString() + " | ");
			}
		}
		
		System.out.print("\nHOGAR: ");
		for (int i=0; i<productosSupermercado.size(); i++) {
			if (productosSupermercado.get(i).getSeccion().equals(Seccion.HOGAR)) {
				System.out.print(productosSupermercado.get(i).toString() + " | ");
			}
		}
		
		System.out.println();
	}
	
	// MOSTRAR PRODUCTOS POR SECCIÓN

	public void porSeccion(String seccion) {
		
		int contador = 0;
		
		for(Seccion s:Seccion.values()) {
			if (s.name().equalsIgnoreCase(seccion)) {
				System.out.print(s.name() + ": ");
				for (int i=0; i<productosSupermercado.size(); i++) {
					if (productosSupermercado.get(i).getSeccion().equals(s)) {
						System.out.print(productosSupermercado.get(i).toString() + " |  ");
					}
				}
			}
			else {
				contador+=1;
			}
		}
		
		if (contador == Seccion.values().length) {
			System.out.println("La categoría indicada no existe.");
		}
		
		else {
			System.out.println();
		}
		
	}
	
	public void añadirProducto() {
		Scanner sc = new Scanner(System.in);
		String producto = sc.nextLine();
		System.out.println("Indica el precio del producto (número entero):");
		int precio = sc.nextInt();
		System.out.println("Indica la sección del producto (FRUTERÍA, CARNICERÍA, PESCADERÍA, HOGAR, BEBIDAS, LÁCTEOS, OTROS) respetando tildes:");
		sc.nextLine();
		String seccion = sc.nextLine();
		
		int contador = 0;
		
		for(Seccion s:Seccion.values()) {
			if (s.name().equalsIgnoreCase(seccion)) {
				// ENCAJA
				Producto prod = new Producto(producto, precio, s);
				System.out.println("Indica el stock del producto:");
				int stock = sc.nextInt();
				prod.setStock(stock);
				productosSupermercado.add(prod);
				System.out.println("El producto " + producto.toLowerCase() + " fue añadido a la categoría "
				+ s.name() + " por un precio de " + precio + "€ y un stock de " + stock + ".");
			}
			else {
				contador+=1;
			}
		}
		if (contador == Seccion.values().length) {
			System.out.println("La categoría indicada no existe.");
		}
		
		else {
			System.out.println();
		}
	}
	
	public void eliminarProducto() {
		Scanner sc = new Scanner(System.in);
		String producto = sc.nextLine();
		
		int contador = 0;
		
		for (int i=0; i<productosSupermercado.size(); i++) {
			
			if (producto.equalsIgnoreCase(productosSupermercado.get(i).getNombre())) {
				productosSupermercado.remove(i);
				System.out.println("El producto " + producto.toLowerCase() + " fue eliminado del supermercado.");
				contador-=1;
			}
			else {
				contador+=1;
			}
			
		}
		if (contador==productosSupermercado.size()) {
			System.out.println("El producto " + producto.toLowerCase() + " no se encuentra en el supermercado.");
		}
	}
	
	public void modificarProducto() {
		Scanner sc = new Scanner(System.in);
		String productoAntiguo = sc.nextLine();
		
		int contador = 0;
		
		for (int i=0; i<productosSupermercado.size(); i++) {
			
			if (productoAntiguo.equalsIgnoreCase(productosSupermercado.get(i).getNombre())) {
				contador-=1;
				System.out.println("Indica el producto por el cual quieres modificar el producto " + productoAntiguo + " respetando tildes:");
				String productoNuevo = sc.nextLine();
				System.out.println("Indica el precio del producto (número entero):");
				int precio = sc.nextInt();
				System.out.println("Indica la sección del producto (FRUTERÍA, CARNICERÍA, PESCADERÍA, HOGAR, BEBIDAS, LÁCTEOS, OTROS) respetando tildes:");
				sc.nextLine();
				String seccion = sc.nextLine();
				
				int contador2 = 0;
				
				for(Seccion s:Seccion.values()) {
					if (s.name().equalsIgnoreCase(seccion)) {
						// ENCAJA
						productosSupermercado.remove(i);
						Producto prod = new Producto(productoNuevo, precio, s);
						System.out.println("Indica el stock del producto:");
						int stock = sc.nextInt();
						prod.setStock(stock);
						productosSupermercado.add(prod);
						System.out.println("El producto " + productoNuevo.toLowerCase() + " fue añadido a la categoría "
						+ s.name() + " por un precio de " + precio + "€ y un stock de " + stock + ", reemplazando el producto " + productoAntiguo + ".");
					}
					else {
						contador2+=1;
					}
				}
				if (contador2 == Seccion.values().length) {
					System.out.println("La categoría indicada no existe.");
				}
				
				else {
					System.out.println();
				}
			}
			else {
				contador+=1;
			}
		}
		if (contador==productosSupermercado.size()) {
			System.out.println("El producto " + productoAntiguo.toLowerCase() + " no se encuentra en el supermercado.");
		}
		
	}
	
	public void consultarStockBajo() {
		System.out.println("Los productos con un stock por debajo de 10 son los siguientes:");
		for (int i=0; i<productosSupermercado.size(); i++) {
			if (productosSupermercado.get(i).getStock()<10) {
				System.out.print(productosSupermercado.get(i).toString() + "\n");
			}
		}
	}
	
}
