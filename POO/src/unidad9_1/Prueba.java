package unidad9_1;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<10; i++) {
			int random1 = (int) (Math.random() * 3)+1;
			int random2 = 0;
			
			if (random1==1) {
				random2 = (int) (Math.random() * (57 - 48)) + 48;
			}
			
			if (random1==2) {
				random2 = (int) (Math.random() * (90 - 65)) + 65;
			}

			if (random1==3) {
				random2 = (int) (Math.random() * (122 - 97)) + 97;
			}
			
			char letra = (char) random2;
			sb.append(letra);
		}
		
		String str = sb.toString();
		
		System.out.println(str);
		
	}

}
