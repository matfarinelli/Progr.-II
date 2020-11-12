package practico_8_2;

import java.time.LocalDateTime;

public class Voto {

	private Candidato votado;
	private LocalDateTime hora;
	
	public Voto(Candidato votado) {
		this.votado = votado;
		this.hora = LocalDateTime.now();
	}

	public Candidato getVotado() {
		return votado;
	}

	public LocalDateTime getHora() {
		return hora;
	}
	
	public boolean isBlanco() {
		return (votado==null); 
	}
	
}
