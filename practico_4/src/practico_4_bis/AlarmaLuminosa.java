package practico_4_bis;

public class AlarmaLuminosa extends Alarma {

	private Luz luz;
	
	public AlarmaLuminosa(Timbre timbre, Luz luz) {
		super(timbre);
		this.luz=luz;
	}
	
	@Override
	public void disparar(Timbre timbre) {
		super.disparar(timbre);
		this.luz.encender();
	}
	
	
}
