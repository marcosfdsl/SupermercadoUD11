package unidad9;

import java.util.Scanner;

public class Coche4 {

	public static void main(String[] args) {
		
		Coche3 ferrari = new Coche3(false, 2, "rojo", 615);
		Coche3 focus = new Coche3(true, 3, "azul", 120);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe el color de tu ferrari:");
		
		String colorin = sc.nextLine();
		
		ferrari.setColor(colorin);
		
		System.out.println(ferrari.getRuedas());
		System.out.println(ferrari.isAutomatico());
		System.out.println(ferrari.getPuertas());
		System.out.println(ferrari.getColor());
		System.out.println(ferrari.getPotencia());
		
		System.out.println(focus.getPotencia());
		
		sc.close();
		
	}

}
