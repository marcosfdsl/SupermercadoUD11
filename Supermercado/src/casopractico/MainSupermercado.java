package casopractico;

import java.util.*;

public class MainSupermercado {
	
	static Scanner sc;
	static String respuesta;
	static Carrito carrito = new Carrito();
	static Supermercado supermercado = new Supermercado();

	public static void main(String[] args) {
		
		sc = new Scanner (System.in);
		
		int num1 = 0;
		
		// INVOCAMOS EL PRIMER SWITCH (ELEGIR ENTRE EMPLEADO Y CLIENTE)
		
		invocarSwitch(num1);
		
		num1 = sc.nextInt();
		
		sc.close();

	}
	
	public static void invocarSwitch (int num1) {
		
		// MOSTRAMOS EL MENÚ (EMPLEADO O CLIENTE)
		
		mostrarMenu();
			
		num1 = sc.nextInt();
		
		while (!(num1==1)&&!(num1==2)) {
			System.out.println("No le he entendido, escriba un número entre el 1 y el 2.");
			num1 = sc.nextInt();
		}
			
		switch (num1) {

		case 1:
			// INVOCAMOS EL INICIO DE SESIÓN
			inicioSesion();
			break;
	
		case 2:
			int num2 = 0;
			// INVOCAMOS EL SWITCH DE CLIENTE
			invocarSwitchC(num2);
			break;
		}
	}
	
	public static void mostrarMenu () {
		
		// IMPRIMIMOS EL MENÚ (EMPLEADO O CLIENTE)
		
		System.out.println("----------------ACCESO----------------");
		System.out.println("1. Personal del supermercado.");
		System.out.println("2. Cliente.");
		System.out.println("--------------------------------------");
	}
	
	public static String opcionesMenu () {
		
		// SE PREGUNTA SI SE DESEA MOSTRAR DE NUEVO EL MENÚ O FINALIZAR EL PROGRAMA
		
		System.out.println("\n¿Desea elegir otra opción de MENÚ? (si/no):");
		respuesta = sc.nextLine().toLowerCase();
		if (respuesta.isEmpty()) {
			respuesta = sc.nextLine().toLowerCase();
		}
		
		while (!(respuesta.equals("si"))&&!(respuesta.equals("no"))) {
			System.out.println("No le he entendido, ¿desea elegir otra opción de MENÚ? (si/no):");
			respuesta = sc.nextLine().toLowerCase();
		}
		
		return respuesta;
	}
	
	public static void inicioSesion () {
		
		// INICIO DE SESIÓN EMPLEADO
		
		System.out.println("Escriba la contraseña:");
		
		String intento;
		final String pw = "J4v4d0n4";
		
		intento = sc.nextLine();
		if (intento.isEmpty()) {
			intento = sc.nextLine();
		}

		for (int i = 2; i > 0&&!intento.equals(pw); i--) {
		System.out.println("Respuesta incorrecta, le quedan " + i + " intentos."); 
		intento = sc.nextLine();
		}
		
		if (!intento.equals(pw)) {
		System.out.println("Se le acabaron los intentos");
		System.exit(0);
		}
		
		else {
		System.out.println("Respuesta correcta.");
		int num3 = 0;
		// INVOCAMOS EL SWITCH DE EMPLEADO SI LA CONTRASEÑA ES CORRECTA
		invocarSwitchE(num3);
		}
	}
	
	public static void mostrarMenuE () {
		
		// IMPRIME EL MENÚ DE EMPLEADO
		
		System.out.println("-----------------MENÚ-----------------");
		System.out.println("1. Mostrar productos del supermercado por sección.");
		System.out.println("2. Añadir producto.");
		System.out.println("3. Eliminar producto.");
		System.out.println("4. Modificar producto.");
		System.out.println("5. Consultar productos con stock bajo (<10).");
		System.out.println("6. Salir.");
		System.out.println("--------------------------------------");
	}
	
	public static void invocarSwitchE (int num) {
		
		// SWITCH DE EMPLEADO
		
		do {

			mostrarMenuE();
			num = sc.nextInt();
			
			while (num<1||num>6) {
				System.out.println("No le he entendido, escriba un número entre el 1 y el 6.");
				num = sc.nextInt();
			}
			
			switch (num) {

			case 1:
				supermercado.porSecciones();
				opcionesMenu();
				break;

			case 2:
				System.out.println("Indica el producto que quieres añadir al supermercado respetando tildes:");
				supermercado.añadirProducto();
				// SE PREGUNTA SI SE DESEA MOSTRAR DE NUEVO EL MENÚ O FINALIZAR EL PROGRAMA
				opcionesMenu();
				break;

			case 3:
				System.out.println("Indica el producto que quieres eliminar del supermercado respetando tildes:");
				supermercado.eliminarProducto();
				// SE PREGUNTA SI SE DESEA MOSTRAR DE NUEVO EL MENÚ O FINALIZAR EL PROGRAMA
				opcionesMenu();
				break;

			case 4:
				System.out.println("Indica el producto que quieres modificar del supermercado respetando tildes:");
				
				supermercado.modificarProducto();
				// SE PREGUNTA SI SE DESEA MOSTRAR DE NUEVO EL MENÚ O FINALIZAR EL PROGRAMA
				opcionesMenu();
				break;
				
			case 5:
				supermercado.consultarStockBajo();
				// SE PREGUNTA SI SE DESEA MOSTRAR DE NUEVO EL MENÚ O FINALIZAR EL PROGRAMA
				opcionesMenu();
				break;

			case 6:
				respuesta = "";
				break;
			}
		}
		
		while (respuesta.equals("si"));
		
		System.out.println("¡Hasta pronto!");
		
		System.exit(0);
	}
	
	public static void mostrarMenuC () {
		
		// IMPRIME EL MENÚ DE CLIENTE
		
		System.out.println("-----------------MENÚ-----------------");
		System.out.println("1. Ver productos del supermercado por sección con sus precios.");
		System.out.println("2. Ver productos de una sección determinada con sus precios.");
		System.out.println("3. Añadir productos al carrito");
		System.out.println("4. Mostrar carrito de la compra ordenado.");
		System.out.println("5. Consultar producto de carrito.");
		System.out.println("6. Eliminar producto.");
		System.out.println("7. Pasar por caja.");
		System.out.println("8. Salir.");
		System.out.println("--------------------------------------");
	}
	
	public static void invocarSwitchC (int num) {
		do {
			
			mostrarMenuC();
			num = sc.nextInt();
			
			while (num<1||num>8) {
				System.out.println("No le he entendido, escriba un número entre el 1 y el 8.");
				num = sc.nextInt();
			}
			
			switch (num) {

			case 1:
				supermercado.porSecciones();
				// SE PREGUNTA SI SE DESEA MOSTRAR DE NUEVO EL MENÚ O FINALIZAR EL PROGRAMA
				opcionesMenu();
				break;

			case 2:
				System.out.println("Indicar sección (FRUTERÍA, CARNICERÍA, PESCADERÍA, HOGAR, BEBIDAS, LÁCTEOS, OTROS) respetando tildes:");
				sc.nextLine();
				String seccion = sc.nextLine();
				supermercado.porSeccion(seccion);
				// SE PREGUNTA SI SE DESEA MOSTRAR DE NUEVO EL MENÚ O FINALIZAR EL PROGRAMA
				opcionesMenu();
				break;

			case 3:
				System.out.println("Indica los productos que quieres añadir al carrito separados por espacios y respetando tildes:");
				sc.nextLine();
				String producto = sc.nextLine();
				String productos [] = producto.split(" ");
				for (int i=0; i<productos.length; i++) {
					carrito.añadirProducto(productos[i], supermercado);
				}
				// SE PREGUNTA SI SE DESEA MOSTRAR DE NUEVO EL MENÚ O FINALIZAR EL PROGRAMA
				opcionesMenu();
				break;

			case 4:
				System.out.println(carrito.toString());
				// SE PREGUNTA SI SE DESEA MOSTRAR DE NUEVO EL MENÚ O FINALIZAR EL PROGRAMA
				opcionesMenu();
				break;
				
			case 5:
				System.out.println("Indica el producto del carrito que quieres comprobar:");
				sc.nextLine();
				String comprobar = sc.nextLine();
				carrito.comprobarProducto(comprobar);
				// SE PREGUNTA SI SE DESEA MOSTRAR DE NUEVO EL MENÚ O FINALIZAR EL PROGRAMA
				opcionesMenu();
				break;
				
			case 6:
				System.out.println("Indica el producto que quieres eliminar del carrito:");
				sc.nextLine();
				producto = sc.nextLine();
				carrito.eliminarProducto(producto);
				// SE PREGUNTA SI SE DESEA MOSTRAR DE NUEVO EL MENÚ O FINALIZAR EL PROGRAMA
				opcionesMenu();
				break;
				
			case 7:
				System.out.println(carrito.toString());
				System.out.println(carrito.total());
				// SE PREGUNTA SI SE DESEA MOSTRAR DE NUEVO EL MENÚ O FINALIZAR EL PROGRAMA
				opcionesMenu();
				break;

			case 8:
				respuesta = "";
				break;
			}
		}
		
		while (respuesta.equals("si"));
		
		System.out.println("¡Hasta pronto!");
		
		System.exit(0);
	}
	


}
