package practico_5_3;

import java.util.ArrayList;

public class Cooperativa {

	private ArrayList<Lote> lotes;
	private ArrayList<Cereal> cereales;
	private ArrayList<String> mineralesDeInteres;

	public Cooperativa() {
		lotes = new ArrayList<Lote>();
		cereales = new ArrayList<Cereal>();
		mineralesDeInteres = new ArrayList<>();
	}

	/*
	 * Getter y Setter
	 */

	public ArrayList<String> getMineralesDeInteres() {
		return mineralesDeInteres;
	}

	/*
	 * Method
	 */

	public void addLote(Lote lote) {
		lotes.add(lote);
	}

	public void addCereal(Cereal cereal) {
		cereales.add(cereal);
	}

	public void addMineralEspecial(String mineral) {
		mineralesDeInteres.add(mineral);
	}

	public boolean loteEspecial(Lote lote) {
		int length = mineralesDeInteres.size();
		for (int i = 0; i < length; i++) {
			String mineral = mineralesDeInteres.get(i);
			if (!lote.tieneMineral(mineral)) {
				return false;
			}
		}
		return true;
	}
	/*
	 * // con containsAll public boolean loteEspecial_c(Lote lote) { if
	 * (lote.getMinerales().containsAll(this.getMineralesDeInteres())) { return
	 * true; } else return false; }
	 */
	// public ArrayList<Lote> lotesAptosCereal(Cereal cereal) {
	// ArrayList<Lote> loteAptoCereal = new ArrayList<>();

	public ArrayList<String> lotesAptosCereal(Cereal cereal) {
		ArrayList<String> loteAptoCereal = new ArrayList<>();

		for (int i = 0; i < lotes.size(); i++) {
			Lote lote = lotes.get(i); // recorro para individualizar lotes y buscar los minerales
			if (lote.cerealApto(cereal)) {
				loteAptoCereal.add(lote.getNumero());
			}
		}
		return loteAptoCereal;
	}

	// consulto que cereales se pueden sembrar en determinados lotes
	public ArrayList<String> cerealesAptosLote(Lote lote) {
		ArrayList<String> cerealesAptosLote = new ArrayList<>();

		for (int i = 0; i < cereales.size(); i++) {
			Cereal cereal = cereales.get(i);
			if (lote.cerealApto(cereal)) {
				cerealesAptosLote.add(cereal.getNombre());
			}
		}
		return cerealesAptosLote;
	}

}
