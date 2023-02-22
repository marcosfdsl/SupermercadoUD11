package unidad9;

import java.util.Scanner;

public class Coche2 {

	public static void main(String[] args) {
		
		Coche ferrari = new Coche(false, 2, "rojo", 615);
		
		Scanner sc = new Scanner(System.in);
		
		String colorin = sc.nextLine();
		
		ferrari.setColor(colorin);
		
		System.out.println(ferrari.getRuedas());
		System.out.println(ferrari.getAutomatico());
		System.out.println(ferrari.getPuertas());
		System.out.println(ferrari.getColor());
		System.out.println(ferrari.getPotencia());
		
		sc.close();
		
	}

}
