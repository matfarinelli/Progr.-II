package practico_6_1;

public class Contrato {

	private double horasSemanales;
	private String empresa; // no pueden aceptar contratos con la misma empresa (podria ser un Objeto)
	private double sueldo;
	// private boolean exclusivo; // implica que puedan aceptar o no otro contrato.

	public Contrato(String empresa, int horas, double sueldo) {
		this.empresa = empresa;
		this.horasSemanales = horas;
		this.sueldo = sueldo;
	}

	/*
	 * public boolean isExclusivo() { return exclusivo; }
	 * 
	 * public void setExclusivo(boolean exclusivo) { this.exclusivo = exclusivo; }
	 */

	public double getHorasSemanales() {
		return horasSemanales;
	}

	public void setHorasSemanales(double horasSemanales) {
		this.horasSemanales = horasSemanales;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	
	
}
