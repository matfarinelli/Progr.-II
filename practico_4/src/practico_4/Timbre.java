package practico_4;

public class Timbre {

	private String sonido;
	
	public Timbre() {
		this.sonido = "PEEEEEEE PEEEEEEEEE PEEEEEEEEEE PEEEEEEEEEE";
	}
	
	public Timbre(String sonidoPersonalizado) {
		this.sonido = sonidoPersonalizado;
	}
	
	public String hacerSonar() {
		System.out.println(this.sonido); //solo para exteriorizar por consola (esta mal)
		return this.sonido;
	}
	
}
