package unidad10;

public class HumanoMain {

	public static void main(String[] args) {
		
		Humano marcos = new Humano("Marcos");
		
		System.out.println(marcos.getNombre() + ", " + marcos.getEdad() + ", " + Humano.getPoblacion());
		
		Humano alejandro = new Humano("Alejandro");
		
		System.out.println(alejandro.getNombre() + ", " + alejandro.getEdad() + ", " + Humano.getPoblacion());
		
		marcos.crecer();
		
		System.out.println(marcos.getNombre() + ", " + marcos.getEdad() + ", " + Humano.getPoblacion());

	}

}
