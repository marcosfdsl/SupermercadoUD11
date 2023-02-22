package unidad9_1;

import java.util.*;

import unidad9.Numero;

public class PasswordMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Escribe cuántas contraseñas quieres generar:");
		int tamano = sc.nextInt();
		
		for (int i=0; i<tamano; i++) {
			System.out.println("Escribe un tamaño para la contraseña " + (i+1) + ":");
			int longitud = sc.nextInt();
			Password p = new Password(longitud);
			System.out.println(p.getContraseña());
			System.out.println(p.esFuerte());
			System.out.println();
		}
        
        sc.close();
		
		
	}
	
}
