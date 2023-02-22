package unidad9;

import java.util.*;

public class Numero2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Numero> arr = new ArrayList<>();
		
		System.out.println("Escribe 3 números:");
		
		for (int i=0; i<3; i++) {
			int entrada = sc.nextInt();
			Numero num = new Numero(entrada);
			arr.add(num);
		}
		
		System.out.println("Escribe un exponente:");
		int exponente = sc.nextInt();
			
		for (int i=0; i<arr.size(); i++) {
	        System.out.println();
	        System.out.println(arr.get(i).esCapicua());
	        System.out.println(arr.get(i).esPrimo());
	        System.out.println(arr.get(i).potencia(exponente));
	        System.out.println(arr.get(i).digitos());
		}
        
        sc.close();
        		
	}

}