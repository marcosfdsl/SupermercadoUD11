package unidad9_1;

public class Password {

	private int longitud;
	private String contraseña;
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarPassword();
	}
	
	public boolean esFuerte() {
		
		boolean esFuerteOno = false;
		int digitos = 0;
		int minus = 0;

		char [] chars = contraseña.toCharArray();
		
		for (int i = 0; i < chars.length; i++){
			if (Character.isDigit(chars[i])) {
				digitos+=1;
			}
			else if (Character.isLowerCase(chars[i])) {
				minus+=1;
			}
		}
		
		if (digitos>5 && minus>1) {
			esFuerteOno = true;
		}

		return esFuerteOno;
	}

	public String generarPassword() {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<longitud; i++) {
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
		
		contraseña = str;
		
		return contraseña;
		
	}
	
	public int getLongitud() {
		return longitud;
	}
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	public String getContraseña() {
		return contraseña;
	}
}
