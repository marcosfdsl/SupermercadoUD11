package unidad11;

public class PrincipalCantantes {

	public static void main(String[] args) {

		Cantante c1 = new Cantante ("Marcos", "Fernández de Salamanca López", 21, "Sofos", Estilo.RAP, 2);
		Cantante c2 = new Cantante ("Col3trane", Estilo.POP);
		
		Disco d1 = new Disco ("Big Fish", 2022, 10.0, 12, c1);
		Disco d2 = new Disco ("Heroine", 2019, 6.99, 7, c2);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(d1.toString());
		System.out.println(d2.toString());

	}

}
