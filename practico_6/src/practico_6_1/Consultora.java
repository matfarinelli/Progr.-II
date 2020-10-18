package practico_6_1;

import java.util.ArrayList;

public class Consultora {

	private String nombre;
	private ArrayList<Candidato> candidatos;

	// necesita conocer, dado un contrato nuevo si sus candidatos pueden o no
	// aceptarlo.

	/*
	 * CONSTRUCTOR
	 */

	public Consultora(String nombre) {
		this.setNombre(nombre);
		candidatos = new ArrayList<>();
	}

	/*
	 * GETTER Y SETTER
	 */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*
	 * METODOS
	 */

	public void addCandidato(Candidato candidato) {
		candidatos.add(candidato);
	}

	public ArrayList<Candidato> getCandidatos() {
		return new ArrayList<>(this.candidatos);
	}

	public ArrayList<String> candidatosAcontrato(Contrato contrato) {
		ArrayList<String> aux = new ArrayList<>();
		for (int i = 0; i < candidatos.size(); i++) {
			Candidato candidato = candidatos.get(i);
			if (candidato.evaluarContrato(contrato)) {
				aux.add(candidato.getNombre());
			}
		}
		return aux;
	}

	/*
	 * MAIN
	 */

	public static void main(String[] args) {

		Consultora c1 = new Consultora("CONSULTORES A&F");
		Candidato j1 = new Candidato("Laura", "Estudio F.", 15000);
		Candidato j2 = new Candidato("Pedro", "AMD", 10000);
		Candidato j3 = new Candidato("Luciana", "Intel", 125000);
		Candidato j4 = new Candidato("Luis", "Abogado independiente.", 5000);
		Candidato j5 = new Candidato("Carlos", "CocaCool", 1000);
		Candidato j6 = new Candidato("Tino", "Manaos", 2500);

		// creo que funciona.. pero lo normal debería ser que en vez de pasar por
		// parametro. Tomara el sueldo o las horas que ya tiene el candidato en su
		// contrato actual
		CriterioHoras ch1 = new CriterioHoras(10);
		CriterioExclusivo ce1 = new CriterioExclusivo();
		CriterioSueldo cs1 = new CriterioSueldo(9500);
		CriterioHoras ch2 = new CriterioHoras(6);
		CriterioSueldo cs2 = new CriterioSueldo(10000);
		CriterioSueldo cs3 = new CriterioSueldo(2000);
		
		CriterioAnd cand = new CriterioAnd(ch1,cs2);

		/*
		 * j1.addCriterio(ch1); // consultar : cuantos criterios puedo guardar de esta
		 * forma? esta bien? j1.addCriterio(ce1);
		 */

		j1.setCriterio(ch1);
		j2.setCriterio(ce1);
		// j2.setCriterio(ch2);
		j3.setCriterio(cs1);
		j4.setCriterio(cand);
		j5.setCriterio(cs3);
		j6.setCriterio(ch2);

		c1.addCandidato(j1);
		c1.addCandidato(j2);
		c1.addCandidato(j3);
		c1.addCandidato(j4);
		c1.addCandidato(j5);
		c1.addCandidato(j6);

		Contrato contrato1 = new Contrato("Noblex", 12, 18000);
		Contrato contrato2 = new Contrato("Samsung", 8, 10000);
		Contrato contrato3 = new Contrato("IBM", 10, 100000);

		System.out.println(c1.getCandidatos());

		System.out.println("***********");

		System.out
				.println("Candidatos al contrato: " + contrato1.getEmpresa() + " " + c1.candidatosAcontrato(contrato1));
		System.out
				.println("Candidatos al contrato: " + contrato2.getEmpresa() + " " + c1.candidatosAcontrato(contrato2));
		System.out
				.println("Candidatos al contrato: " + contrato3.getEmpresa() + " " + c1.candidatosAcontrato(contrato3));
	}

}
