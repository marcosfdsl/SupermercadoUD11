package unidad11;

public class Cantante {
	
	private String nombre;
	private String apellidos;
	private int edad;
	private String nombreArtistico;
	private Estilo estilo;
	private int numeroDiscos;
	
	Cantante(String nombre, String apellidos, int edad, String nombreArtistico, Estilo estilo, int numeroDiscos) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
		this.nombreArtistico=nombreArtistico;
		this.estilo=estilo;
		this.numeroDiscos=numeroDiscos;
	}
	
	Cantante(String nombreArtistico, Estilo estilo) {
		this.nombreArtistico=nombreArtistico;
		this.estilo=estilo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombreArtistico() {
		return nombreArtistico;
	}

	public void setNombreArtistico(String nombreArtistico) {
		this.nombreArtistico = nombreArtistico;
	}

	public Estilo getEstilo() {
		return estilo;
	}

	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}

	public int getNumeroDiscos() {
		return numeroDiscos;
	}

	public void setNumeroDiscos(int numeroDiscos) {
		this.numeroDiscos = numeroDiscos;
	}
	
	@Override
	public String toString() {
		return "Cantante [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", nombreArtistico="
				+ nombreArtistico + ", estilo=" + estilo + ", numeroDiscos=" + numeroDiscos + "]";
	}

}
