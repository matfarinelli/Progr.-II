package practico_4_bis;

public class Alarma {

	private boolean vidrioRoto;
	private boolean puertaVentanaAbierta;
	private boolean movimiento;
	private Timbre timbre;

	public Alarma(Timbre timbre) {
		this.vidrioRoto = false;
		this.puertaVentanaAbierta = false;
		this.movimiento = false;
		this.timbre = timbre;
	}

	public void setVidrioRoto(boolean vidrioRoto) {
		this.vidrioRoto = vidrioRoto;
	}

	public boolean isPuertaVentanaAbierta() {
		return puertaVentanaAbierta;
	}

	public void setPuertaVentanaAbierta(boolean puertaVentanaAbierta) {
		this.puertaVentanaAbierta = puertaVentanaAbierta;
	}

	public boolean isMovimiento() {
		return movimiento;
	}

	public void setMovimiento(boolean movimiento) {
		this.movimiento = movimiento;
	}

	public boolean isVidrioRoto() {
		return vidrioRoto;
	}

	public void comprobar() {
		if (vidrioRoto == true || movimiento == true || puertaVentanaAbierta == true) {
			this.disparar(this.timbre);
		} else {
			System.out.println("todo esá en orden");
		}
	}

	public void disparar(Timbre timbre) {
		timbre.hacerSonar();
	}

	/*
	 * public void disparar(Timbre timbre) { if (this.comprobar() == true) {
	 * timbre.hacerSonar(); } }
	 */

}
