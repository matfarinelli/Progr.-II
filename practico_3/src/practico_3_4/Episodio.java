package practico_3_4;

public class Episodio {

	//private static String titulo; // probado para entender static
	private String titulo;
	private String descripcion;
	private boolean flag;
	private int calificacion;

	public Episodio(String titulo) {
		// Episodio.titulo = titulo; // probado para entender static
		this.titulo = titulo;
		calificacion = -1;
		flag = false;
	}

	public Episodio(String titulo, String descripcion) {
		this(titulo);
		this.descripcion = descripcion;
	}

	public Episodio(String titulo, String descripcion, boolean flag) {
		this(titulo, descripcion);
		this.flag = flag;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		if (calificacion <= 5 && calificacion >= 1) {
			this.calificacion = calificacion;
		} else {
			// se podria llamar a un metodo error() para no usar el syso.
			String error_calificacion = " La calificacion no es valida";
			System.out.println(error_calificacion);
			this.calificacion = -1; 
		}
	}

}

/*
 * 
 * METODOS
 * 
 * 
 */
