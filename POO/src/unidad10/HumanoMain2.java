package unidad10;

import java.util.*;

public class HumanoMain2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String entrada = "";

		ArrayList<Humano> lista = new ArrayList<Humano>();

		while (!entrada.equals("fin")) {

			System.out.println("Escribe un nombre (o 'fin' para finalizar):");

			entrada = sc.nextLine();

			if (!entrada.equals("fin")) {

				Humano humano = new Humano(entrada);

				lista.add(humano);

				for (int i = 0; i < lista.size(); i++) {
					lista.get(i).crecer();
					System.out.println(lista.get(i).getNombre() + ", " + lista.get(i).getEdad());
				}

			}

		}

		System.out.println("Población: " + Humano.getPoblacion());

		sc.close();
	}

}
