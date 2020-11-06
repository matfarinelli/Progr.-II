package practico_7_4;

public class Main {

	public static void main(String[] args) {

		Vivero v1 = new Vivero("Vivero IV");
		Planta p1 = new Planta("jazmin", "Magnoliophyta", "Fabaceae", "Magnoliopsida", false, 6, 6);
		Planta p2 = new Planta("rosa", "Liliaceae", "Liliopsida", "Tulipeae", false, 9, 7);
		Planta p3 = new Planta("clavel", "Magnoliophyta", "Fabaceae", "Magnoliopsida", true, 1, 8);
		Planta p4 = new Planta("magnolia", "Magnoliophyta", "Fabaceae", "Magnoliopsida", true, 8, 4);
		Planta p5 = new Planta("margarita", "auereum", "Fabaceae", "Magnoliopsida", true, 3, 2);
		Planta p6 = new Planta("helecho", "Magnoliophyta", "Fabaceae", "Magnoliopsida", true, 1, 6);
		Planta p7 = new Planta("girasol", "Magnoliophyta", "Fabaceae", "Magnoliopsida", false, 10, 8);
		Planta p8 = new Planta("trebol", "Magnoliophyta", "Fabaceae", "Magnoliopsida", false, 7, 9);
		Planta p9 = new Planta("margarita", "Magnoliophyta", "Fabaceae", "Magnoliopsida", true, 3, 2);
		
		v1.addPlanta(p1);
		v1.addPlanta(p2);
		v1.addPlanta(p3);
		v1.addPlanta(p4);
		v1.addPlanta(p5);
		v1.addPlanta(p6);
		v1.addPlanta(p7);
		v1.addPlanta(p8);
		v1.addPlanta(p9);
		
		CriterioNombreCientifico c1 = new CriterioNombreCientifico("margarita");
		OrdenadorRiego or1 = new OrdenadorRiego();
		
		
		System.out.println("1*********");
		System.out.println(v1.getPlantas());
		System.out.println("2*********");
		System.out.println(v1.getPlantas(c1));
		System.out.println("3*********");
		System.out.println(v1.getPlantasOrdenadas(c1, or1));
		

	}
}
