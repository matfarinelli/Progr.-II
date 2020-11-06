package practico_6_7;

import java.util.ArrayList;

public class Historiador {

	private String nombre;
	private ArrayList<Documento> documentos;

	public Historiador(String nombre) {
		this.nombre = nombre;
		this.documentos = new ArrayList<>();
	}

	public ArrayList<Documento> getDocumentos() {
		return new ArrayList<>(this.documentos);
	}

	public void setDocumentos(ArrayList<Documento> documentos) {
		this.documentos = documentos;
	}

	public String getNombre() {
		return nombre;
	}

	public void addDocumentos(Documento documento) {
		this.documentos.add(documento);
	}

	/*
	 * buscador
	 * 
	 */

	public ArrayList<Documento> buscar(Criterio criterio) {
		ArrayList<Documento> resultados = new ArrayList<>();
		for (int i = 0; i < documentos.size(); i++) {
			Documento doc = documentos.get(i);
			if (criterio.cumple(doc)) {
				resultados.add(doc);
			}
		}
		return resultados;
	}
}
