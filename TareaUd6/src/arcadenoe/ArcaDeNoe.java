package arcadenoe;

import java.util.*;

public class ArcaDeNoe {

	public static void main(String[] args) {
		
		// Pedimos los animales por escáner.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce los animales que han subido al arca (separados por espacios y sin comas):");

		String entrada = sc.nextLine();
		
		// Imprimimos el contador (incrementado en 1 cada vez que se completa una pareja) devuelto por nuestra función.

		System.out.println(contador(entrada));

		sc.close();

	}

	public static int contador(String entrada) {
		
		// Declaramos e inicializamos el contador.
		
		int contador = 0;
		
		// Guardamos cada animal por separado en un array (introducidos mediante escáner en main y guardados en "entrada").

		String arr[] = entrada.split(" ");
		
		// Guardamos cada elemento de nuestro array en un LinkedList.

		LinkedList<String> linkedLista = new LinkedList<String>();

		for (int i = 0; i < arr.length; i++) {

			linkedLista.add(arr[i]);

		}
		
		// Bucle FOR que recorre nuestro LinkedList.

		for (int i = 0; i < linkedLista.size(); i++) {
			
			// Variable String "comprobante" que guarda todas las letras del elemento i menos la última.

			String comprobante = arr[i].substring(0, arr[i].length() - 1);
			
			// Si el elemento i acaba por la letra "o", entra en otro bucle FOR.

			if (linkedLista.get(i).toLowerCase().matches(comprobante.toLowerCase() + "o")) {
				
				// Bucle FOR que recorre nuestro LinkedList buscando "comprobante" + "a".

				for (int f = 0; f < linkedLista.size(); f++) {
					
					/* Si el elemento f = ("comprobante" + "a"), entonces se borran los valores de los elementos i y f
					SIN ELIMINAR los elementos, ya que eso provocaría un error en nuestro bucle FOR. */

					if (linkedLista.get(f).toLowerCase().matches(comprobante.toLowerCase() + "a")) {

						linkedLista.set(f, "");
						linkedLista.set(i, "");

						/* Si se ha dado que el elemento f coincide con el elemento i, salvo por la última letra,
						que coincide con "a" y "o" respectivamente, entonces se incrementa el contador en 1. */
						
						contador++;

					}

				}

			}

		}
		
		// La función devolverá el valor del contador, que representará el número de parejas de animales completas.

		return (contador);

	}

}