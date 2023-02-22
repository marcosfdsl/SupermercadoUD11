package unidad9;

import java.util.*;

public class CuentaMain {

	public static void main(String[] args) {

		Cuenta c = new Cuenta("123890023", "Miguel Pérez", 1800.4f, 0.25f);
		Cuenta d = new Cuenta("23900839", "Antonio Gómez", 200f, 0.25f);
		Cuenta e = new Cuenta("151590020", "Javier Sánchez", 1200.2f, 1.25f);
		
		System.out.println("HACEMOS INGRESOS EN CUENTA");
		
		c.ingreso(100);
		d.ingreso(200);
		e.ingreso(100);
		
		System.out.println("Saldo de la cuenta " + c.getNumero() + ": " + c.leerSaldo());
		System.out.println("Saldo de la cuenta " + d.getNumero() + ": " + d.leerSaldo());
		System.out.println("Saldo de la cuenta " + e.getNumero() + ": " + e.leerSaldo());
		
		System.out.println("HACEMOS REINTEGROS EN CUENTA");
		
		c.reintegro(50);
		d.reintegro(500);
		e.reintegro(100);
		
		System.out.println("Saldo de la cuenta " + c.getNumero() + ": " + c.leerSaldo());
		System.out.println("Saldo de la cuenta " + d.getNumero() + ": " + d.leerSaldo());
		System.out.println("Saldo de la cuenta " + e.getNumero() + ": " + e.leerSaldo());

		System.out.println("COMPROBAMOS NÚMEROS ROJOS");
		
		System.out.println("Números rojos en " + c.getNumero() + ": " + c.enRojos());
		System.out.println("Números rojos en " + d.getNumero() + ": " + d.enRojos());
		System.out.println("Números rojos en " + e.getNumero() + ": " + e.enRojos());
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Cuenta> cuentas = new ArrayList<>();
		
		cuentas.add(c);
		cuentas.add(d);
		cuentas.add(e);
		
		Persona Alejandro = new Persona("Marcos", "Salamanca", c);
		Persona Pablo = new Persona("Alejandro", "Sastre", c);
		
		ArrayList<Persona> personas = new ArrayList<>();
		personas.add(Alejandro);
		personas.add(Pablo);
		
		for(int i=0;i<personas.size();i++) {
			System.out.println("Hola " + personas.get(i).getNombre() + " " + personas.get(i).getApellido() + "!");
			System.out.println("Tienes " + personas.get(i).getCuenta().leerSaldo() + " euros en la cuenta.");
			System.out.print("Cuanto quieres añadir: ");
			float numero = sc.nextFloat();
			personas.get(i).getCuenta().ingreso(numero);
			System.out.println("Tienes " + personas.get(i).getCuenta().leerSaldo() + " euros en la cuenta.");
			System.out.println("Cuanto quieres retirar: ");
			float numero2 = sc.nextFloat();
			personas.get(i).getCuenta().reintegro(numero2);
			System.out.println("Tienes " + personas.get(i).getCuenta().leerSaldo() + " euros en la cuenta.");
		}
		
		sc.close();
		
	}

}
