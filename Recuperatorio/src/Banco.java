import java.util.ArrayList;

public class Banco extends SistemaOMS {

	private ArrayList<Voluntario> voluntarios;

	/*
	 * Constructor
	 */

	public Banco() {
		this.voluntarios = new ArrayList<>();
	}

	/*
	 * Metodos
	 */

	public void addVoluntario(Voluntario voluntario) {
		this.voluntarios.add(voluntario);
	}

	/*
	 * metodos soluciones recuperatorio
	 */

	// 1er inciso.
	// supongo que todos los que figuran en "mi base de datos" son voluntarios,
	// independientemente si recibieron la vacuna o el placebo. (consultar si queda
	// tiempo, podria ser null y no recibieron ni uno ni otro y no los deberia
	// contar)

	@Override
	public int getVoluntarios() {
		return this.voluntarios.size();
	}

	// 2do inciso

	public int getVoluntariosPlacebo() {
		int contadorPlacebos = 0;

		for (Voluntario voluntario : this.voluntarios) {
			// si recibio vacuna true , false si recibio placebo
			if (!voluntario.isRecibioVacuna()) {
				contadorPlacebos++;
			}
		}

		return contadorPlacebos;
	}

	// inciso 3
	@Override
	public int getVoluntariosVacuna() {
		int contadorVacunas = 0;

		for (Voluntario voluntario : this.voluntarios) {
			// si recibio vacuna true , false si recibio placebo
			if (voluntario.isRecibioVacuna()) {
				contadorVacunas++;
			}
		}

		return contadorVacunas;
	}

	// para inciso 7
	public int getVoluntariosEnfermos() {
		int contadorEnfermos = 0;

		for (Voluntario voluntario : this.voluntarios) {
			if (voluntario.isContrajoEnfermedad()) {
				contadorEnfermos++;
			}
		}

		return contadorEnfermos;
	}

	// buscador por criterio específico

	@Override
	public int buscar(Criterio c1) {
		int contadorVoluntariosSegunFiltro = 0;

		for (Voluntario voluntario : this.voluntarios) {
			if (c1.cumple(voluntario)) {
				contadorVoluntariosSegunFiltro++;
			}
		}
		return contadorVoluntariosSegunFiltro;
	}

	// arrayList para ultimos incisos

	// suposición para mi resolución:
	/*
	 * Mediante la creacion de un criterioAND , uniría los 2 requisitos buscados y
	 * sería el que se recibe como parámetro en el método implementado a continuación
	 * 
	 */
	@Override
	public ArrayList<Voluntario> getVoluntariosAptos(Criterio c1) {
		ArrayList<Voluntario> resultados = new ArrayList<>();

		for (Voluntario voluntario : this.voluntarios) {
			if (c1.cumple(voluntario)) {
				resultados.add(voluntario);
			}
		}

		return resultados;
	}
	
	
}
