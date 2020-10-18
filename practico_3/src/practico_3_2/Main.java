package practico_3_2;

public class Main {

	public static void main(String[] args) {

		Electrodomestico e1 = new Electrodomestico("Plancha");
		System.out.println(e1.getNombre());
		Electrodomestico e2 = new Electrodomestico("Lavarropas", "Blanco", 19650);
		e2.setPeso(90);
		e2.setConsumo(425);
		System.out.println(e2.getColor() + " " + e2.getPrecio() + " " + e2.getPeso());
		System.out.println("Es bajo consumo: " + e2.isBajoConsumo() + " y su balance es: " + e2.isBalance());
		System.out.println("Alta gama: " + e2.isAltaGama());

	}

}
