package practico_4_2;

public class Luz {

	private boolean estado;
	
	//constructor
	public Luz() {
		this.estado=false;
	}
	
	//metodos
	public void encender(){
		this.estado = true;
	}
	
	public void apagar() {
		this.estado = false;
	}

	//devuelve estado de la luz, si esta prendida o apagada
	public boolean isEstado() {
		return estado;
	}


}
