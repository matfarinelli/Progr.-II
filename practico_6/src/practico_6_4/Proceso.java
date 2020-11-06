package practico_6_4;

public class Proceso extends ElementoOrdenable {

	private int requerimientosDeMemoria;
	private String nombreArchivo;

	public Proceso(String nombreArchivo, int requerimientosDeMemoria) {
		this.nombreArchivo = nombreArchivo;
		this.requerimientosDeMemoria = requerimientosDeMemoria;
	}

	public int getRequerimientosDeMemoria() {
		return requerimientosDeMemoria;
	}

	public void setRequerimientosDeMemoria(int requerimientosDeMemoria) {
		this.requerimientosDeMemoria = requerimientosDeMemoria;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	@Override
	public boolean isMenor(Object o) {
		Proceso aux = (Proceso) o; // casteo el object a proceso
		return (this.getRequerimientosDeMemoria() < aux.getRequerimientosDeMemoria());
	}
	
	public String toString() {
		return this.nombreArchivo + "," + this.requerimientosDeMemoria;
	}
	
	

}
