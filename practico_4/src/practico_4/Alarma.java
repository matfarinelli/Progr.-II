package practico_4;

public class Alarma {

	private boolean vidrioRoto;
	private boolean puertaVentanaAbierta;
	private boolean movimiento;

	public Alarma() {
		this.vidrioRoto = false;
		this.puertaVentanaAbierta = false;
		this.movimiento = false;
	}

	public void setVidrioRoto(boolean vidrioRoto) {
		this.vidrioRoto = vidrioRoto;
	}

	public void setPuertaVentanaAbierta(boolean puertaVentanaAbierta) {
		this.puertaVentanaAbierta = puertaVentanaAbierta;

	}

	public void setMovimiento(boolean movimiento) {
		this.movimiento = movimiento;
	}

	public boolean isVidrioRoto() {
		return vidrioRoto;
	}

	public boolean isPuertaVentanaAbierta() {
		return puertaVentanaAbierta;
	}

	public boolean isMovimiento() {
		return movimiento;
	}

	// si es true - hay vidrio roto, puerta abierta o movimientos
	public boolean comprobar(Timbre timbre) {
		if (vidrioRoto == true || puertaVentanaAbierta == true || movimiento == true) {
			disparar(timbre); //de pedo
		}
		return false;
	}

	public void disparar(Timbre timbre) {
		timbre.hacerSonar();
	}

}
