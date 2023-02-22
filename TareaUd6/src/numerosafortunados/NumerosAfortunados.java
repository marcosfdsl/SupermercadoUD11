package numerosafortunados;

import java.util.*;

public class NumerosAfortunados {

	public static void main(String[] args) {
		
		// Pedimos un número N por escáner.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número entre el 2 y el 100.000 (tamaño de la lista):");

		int N = sc.nextInt();
		
		// Mientras N no esté entre 2 y 100.000, seguir pidiéndolo por escáner.
		
		while (N<2||N>100000) {
			
			System.err.println("Introduce un número correcto:");

			N = sc.nextInt();
			
		}
		
		// Mediante un bucle WHILE añadimos elementos del 1 al N dentro de un LinkedList.
		
		LinkedList<Integer> linkedLista = new LinkedList<>();

		for (int i = 1; i <= N; i++) {

			linkedLista.add(i);
			
		}
		
		// Invoco funcion1, que elimina un elemento cada M posiciones empezando por el elemento 0.
		
		funcion1(linkedLista);
		
		// Muestro el resultado por consola imprimiendo un ArrayList que me devuelve funcion2.

		System.out.println(N + ": " + funcion2(linkedLista));
		
		sc.close();

	}
	
	public static LinkedList<Integer> funcion1(LinkedList<Integer> linkedLista) {
		
		/* Declaro la variable que indica cada cuántos números se elimina un elemento
		(se incrementa en 1 cada vez que sale del bucle for). */
		
		int M = 1;
		
		/* IMPORTANTE: empieza en 1 y no en 2 porque, cada vuelta que dé el bucle FOR, el elemento 0 se habrá eliminado.
		
		Es decir, si en la primera vuelta del FOR se elimina el elemento 0,
		en la segunda vuelta deberá eliminarse el elemento 1, que antes era el elemento 2, y así sucesivamente.
		
		Por ello el bucle WHILE acaba cuando el size es IGUAL a M, y no MENOR,
		porque M en realidad representa (cada cuántos elementos eliminar)-1. */

		while (!(linkedLista.size() <= M)) {

			for (int i = 0; i < linkedLista.size(); i += M) {

				linkedLista.remove(i);
				
			}

			M++;

		}
		
		return(linkedLista);
		
	}
	
	public static ArrayList<Integer> funcion2(LinkedList<Integer> linkedLista) {
		
		// Añadimos los elementos del LinkedList en un ArrayList en orden inverso (decreciente).
		
		ArrayList<Integer> arrayLista = new ArrayList<>();
		
		while (!(linkedLista.size()<1)) {
		
		arrayLista.add(linkedLista.pollLast());
		
		}
		
		return(arrayLista);
		
	}
	
}