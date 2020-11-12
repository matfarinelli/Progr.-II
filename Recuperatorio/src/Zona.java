import java.util.ArrayList;

public class Zona extends SistemaOMS {

	private ArrayList<SistemaOMS> zonas;

	/*
	 * Constructor
	 */

	public Zona() {
		this.zonas = new ArrayList<>();
	}

	/*
	 * Metodos
	 */

	// solucion inciso 1.
	@Override
	public int getVoluntarios() {
		int contadorVoluntarios = 0;

		for (SistemaOMS zona : this.zonas) {
			contadorVoluntarios += zona.getVoluntarios();
		}

		return contadorVoluntarios;
	}

	// solucion inciso 2.
	@Override
	public int getVoluntariosPlacebo() {
		int contadorPlacebosTotales = 0;

		for (SistemaOMS zona : this.zonas) {
			contadorPlacebosTotales += zona.getVoluntariosPlacebo();
		}

		return contadorPlacebosTotales;

	}

	// inciso 3
	@Override
	public int getVoluntariosVacuna() {
		int contadorVacunasTotales = 0;

		for (SistemaOMS zona : this.zonas) {
			contadorVacunasTotales += zona.getVoluntariosVacuna();
		}

		return contadorVacunasTotales;
	}
	
	public int getVoluntariosEnfermos() {
		int contadorEnfermosTotales = 0;

		for (SistemaOMS zona : this.zonas) {
			contadorEnfermosTotales += zona.getVoluntariosEnfermos();
		}

		return contadorEnfermosTotales;
	}
	
	// para inciso 8
	@Override
	public int buscar(Criterio c1) {
		int contadorVoluntariosSegunFiltro = 0;

		for (SistemaOMS zona : this.zonas) {
			contadorVoluntariosSegunFiltro += zona.buscar(c1);
		}

		return contadorVoluntariosSegunFiltro;
	}
	
	//suposicion de resolucion en clase "banco" por el uso del criterio
	
	@Override
	public ArrayList<Voluntario> getVoluntariosAptos(Criterio c1){
		ArrayList<Voluntario> resultados = new ArrayList<>();
		
		for (SistemaOMS zona : this.zonas) {
			resultados.addAll(zona.getVoluntariosAptos(c1));
		}

		return resultados;
	}

}
