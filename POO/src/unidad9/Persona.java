package unidad9;

	public class Persona {
		private String nombre;
		private String apellido;
		private Cuenta cuenta;
		
		public Persona(String nombre,String apellido,Cuenta cuenta) {
			this.nombre=nombre;
			this.apellido=apellido;
			this.cuenta=cuenta;
			
		}
	
		public String getNombre() {
			return nombre;
		}
	
		public String getApellido() {
			return apellido;
		}
	
		public Cuenta getCuenta() {
			return cuenta;
		}
	
		public void setCuenta(Cuenta cuenta) {
			this.cuenta = cuenta;
		}

}