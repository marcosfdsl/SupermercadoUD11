package unidad9_1;

import unidad9_1.Humano;

public class Mundo {

	public static void main(String[] args) {
		
		Humano mario = new Humano("Mario", 21, 65.0f, 1.80f);
		Humano maria = new Humano("Maria", 20, 55.0f, 1.70f);
		
		System.out.println(mario.getAnos());
		
		mario.cumplirAnos();
		
		System.out.println(mario.getAnos());
		
	}
	
}
