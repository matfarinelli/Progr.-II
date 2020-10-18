package practico_4_2;

public class AlarmaLuminica extends AlarmaSensorial {

	Luz luz;

	public AlarmaLuminica(Timbre t1, Luz l1) {
		super(t1);
		this.luz = l1;
	}

	@Override
	public void chequearSensores() {
		super.chequearSensores(); // ejecuto el metodo del padre

		if (super.timbre.isEstado() == true) { // si el timbre de la alarma esta true , encender luz
			luz.encender();
			System.out.println("Luz encendida");
		} else {
			luz.apagar();
			System.out.println("Luz apagada");
		}
	}

	@Override
	public void resetear() {
		super.resetear();
		luz.apagar();
	}

}
