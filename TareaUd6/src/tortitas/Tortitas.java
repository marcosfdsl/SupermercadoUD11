package tortitas;

import java.util.*;

public class Tortitas {

	/* El ejercicio está muy mal explicado, pero se refiere a que la espátula se mete debajo de un número N
	introducido por escáner y se voltea la pila desde la tortita 1 hasta la tortita N.
	
	Ejemplo: si introducimos 5, la pila pasará de 1,2,3,4,5,6,7,8,9,10 a 5,4,3,2,1,6,7,8,9,10.
	
	Si introducimos otro número M después del 5, separado por un espacio, significará otro volteo
	desde la tortita 1 (que antes era la 5) hasta la tortita M.
	
	Ejemplo: si introducimos 3 8 2, la pila pasará de 1,2,3,4,5,6,7,8,9,10 a 3,2,1,4,5,6,7,8,9,10,
	luego a 8,7,6,5,4,1,2,3,9,10, y por último a 7,8,6,5,4,1,2,3,9,10.
	Ahora la tortita número 1, es decir la de arriba, será la que originalmente era la tortita número 7. */

	public static void main(String[] args) {

		// Pedimos por escáner uno o varios números del 0 al 10 separados por espacios.

		Scanner sc = new Scanner(System.in);

		System.out.println("En una pila de 10 tortitas, "
				+ "teniendo en cuenta que cada número es la tortita bajo la que se mete la espátula para voltear,");
		System.out.println("y la cantidad de números introducidos son las veces que se voltea, "
				+ "introduce uno o más números del 0 al 10 separados por espacios:");

		String entrada = sc.nextLine();
		
		// Guardamos lo introducido en un String array, cuyos valores metemos posteriormente en un int Array.

		String arr[] = entrada.split(" ");

		int vueltas[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			vueltas[i] = Integer.parseInt(arr[i]);

		}
		
		// Invocamos el procedimiento que nos imprime qué tortita quedará más arriba de la pila.

		tortita(vueltas);

		sc.close();

	}

	public static void tortita(int[] vueltas) {
		
		// Creamos dos pilas, una para las tortitas (elementos del 1 al 10) y otra de reserva para los volteos (vacía).

		ArrayDeque<Integer> pila = new ArrayDeque<Integer>();

		ArrayDeque<Integer> pila2 = new ArrayDeque<Integer>();

		for (int i = 1; i <= 10; i++) {

			pila.add(i);

		}
		
		/* Mediante un bucle anidado, sacamos de la pila desde la tortita 1 hasta la tortita indicada mediante escáner.
		Guardamos los elementos sacados en la pila2 y los volvemos a introducir en la pila 1, esta vez volteados.
		El bucle se repetirá hasta que el número de vueltas coincida con la cantidad de números introducidos mediante escáner */

		for (int i = 0; i < vueltas.length; i++) {

			for (int f = 0; f < vueltas[i]; f++) {

				pila2.add(pila.pop());

			}

			while (!pila2.isEmpty()) {

				pila.push(pila2.pop());

			}

		}

		// Imprimimos el resultado del cálculo, es decir, la tortita que ha quedado más arriba en la pila.
		
		System.out.println("La tortita que ha quedado más arriba en la pila es la número " + pila.getFirst());

	}

}
