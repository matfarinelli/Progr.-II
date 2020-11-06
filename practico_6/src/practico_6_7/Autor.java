package practico_6_7;

public class Autor {

	private String nombre;
	private String apellido;

	public Autor(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public boolean equals(Object objeto) {
		try {
			Autor autor = (Autor) objeto;
			if ((this.getNombre().equals(autor.getNombre())) && (this.getApellido().equals(autor.getApellido())));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
