package unidad9;

import java.util.*;

public class Numero {

	private int num;
	
	public Numero(int num) {
	
		this.num = num;
		
	}

	public String esCapicua() {
		
		String numS = Integer.toString(num);
        String inv = "";
        String siEs = "El " + numS + " es capicúa";
        String noEs = "El " + numS + " NO es capicúa";
        
        for (int i = numS.length() - 1; i >= 0; i--) {
            inv = inv + numS.charAt(i);
        }
        
		if (numS.equals(inv)) {
			return siEs;
		}
		
		else {
			return noEs;
		}
	}
	
	public String esPrimo() {

		boolean SioNo = true;
        String siEs = "El " + num + " es primo";
        String noEs = "El " + num + " NO es primo";
        
        for (int i=2; i<num; i++) {
        	if (num%i==0) {
        		SioNo = false;
        		break;
        	}
        }
        
		if (SioNo==true) {
			return siEs;
		}
		
		else {
			return noEs;
		}
	}
	
	public String potencia(int exponente) {
		
		double potenciaD = Math.pow(num, exponente);
		int potencia = (int) potenciaD;
		
        String potenciaFrase = "La potencia de " + num + " es " + potencia;

		return potenciaFrase;
		
	}
	
	public String digitos() {
		
		String numS = Integer.toString(num);
		LinkedList<Character> lista = new LinkedList<>();
		int dig = 0;
		
		for (int i = 0; i < numS.length(); i++){
		    lista.add(numS.charAt(i));
		}
		
		while (!lista.isEmpty()) {
		    lista.removeFirst();
		    dig+=1;
		}
		
        String digitosFrase = "El número " + num + " tiene " + dig + " dígitos";

		return digitosFrase;
		
	}
	
}
