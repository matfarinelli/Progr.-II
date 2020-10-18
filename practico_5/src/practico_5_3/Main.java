package practico_5_3;

public class Main {

	public static void main(String[] args) {

		Cooperativa coop = new Cooperativa();
		coop.addMineralEspecial("Magnesio");
		coop.addMineralEspecial("Oxigeno");

		Lote l1 = new Lote("1", 55);
		l1.addMineral("Hierro");
		l1.addMineral("Fosforo");
		l1.addMineral("Magnesio");
		l1.addMineral("Oxigeno");

		Lote l2 = new Lote("2", 20);
		l2.addMineral("Silicio");
		l2.addMineral("Magnesio");
		l2.addMineral("Calcio");
		l2.addMineral("Hierro");
		l2.addMineral("Oxigeno");
		l2.addMineral("Nitrogeno");

		Lote l3 = new Lote("32", 20);
		l3.addMineral("Fosforo");
		l3.addMineral("Hierro");
		l3.addMineral("Oxigeno");

		Lote l4 = new Lote("150", 60);
		l4.addMineral("Fosforo");
		l4.addMineral("Nitrogeno");
		l4.addMineral("Oxigeno");
		l4.addMineral("Silicio");

		Lote l5 = new Lote("100", 70);
		l5.addMineral("Calcio");
		l5.addMineral("Nitrogeno");
		l5.addMineral("Silicio");
		l5.addMineral("Oxigeno");
		l5.addMineral("Hierro");

		// agrego lote a la coop.
		coop.addLote(l1);
		coop.addLote(l2);
		coop.addLote(l3);
		coop.addLote(l4);
		coop.addLote(l5);

		System.out.println("L1 es especial? : " + coop.loteEspecial(l1));
		System.out.println("L2 es especial? : " + coop.loteEspecial(l2));
		System.out.println("L3 es especial? : " + coop.loteEspecial(l3));

		/*
		 * System.out.println("*******Con containsAll**********");
		 * 
		 * System.out.println("L1 es especial? : " + coop.loteEspecial_c(l1));
		 * System.out.println("L2 es especial? : " + coop.loteEspecial_c(l2));
		 * System.out.println("L3 es especial? : " + coop.loteEspecial_c(l3));
		 * 
		 */

		System.out.println("*****************");

		Cereal c1 = new Cereal("Cebada", "Fina");
		c1.addMineral("Oxigeno");
		c1.addMineral("Calcio");

		Cereal c2 = new Cereal("Maiz", "Gruesa");
		c2.addMineral("Fosforo");
		c2.addMineral("Hierro");
		c2.addMineral("Oxigeno");

		Cereal c3 = new Cereal("Soja", "Gruesa");
		c3.addMineral("Oxigeno");

		Cereal c4 = new Cereal("Avena", "Fina");
		c4.addMineral("Oxigeno");
		c4.addMineral("Nitrogeno");

		Cereal c5 = new Cereal("Sorgo", "Gruesa");
		c5.addMineral("Silicio");
		c5.addMineral("Nitrogeno");
		c5.addMineral("Hierro");

		// agrego cereales a la coop.
		coop.addCereal(c1);
		coop.addCereal(c2);
		coop.addCereal(c3);
		coop.addCereal(c4);
		coop.addCereal(c5);

		System.out.println("Se puede sembrar " + c1.getNombre() + " en lote1? " + l1.cerealApto(c1));
		System.out.println("Se puede sembrar " + c1.getNombre() + " en lote2? " + l2.cerealApto(c1));
		System.out.println("Se puede sembrar " + c1.getNombre() + " en lote3? " + l3.cerealApto(c1));

		System.out.println("****************");

		System.out.println("Lotes aptos para el cereal " + c1.getNombre() + " : " + coop.lotesAptosCereal(c1));
		System.out.println("Lotes aptos para el cereal " + c2.getNombre() + " : " + coop.lotesAptosCereal(c2));

		System.out.println("*****************");
		System.out.println("Cereales aptos en lote " + l1.getNumero() + " : " + coop.cerealesAptosLote(l1));
		System.out.println("Cereales aptos en lote " + l2.getNumero() + " : " + coop.cerealesAptosLote(l2));
		System.out.println("Cereales aptos en lote " + l3.getNumero() + " : " + coop.cerealesAptosLote(l3));
		System.out.println("Cereales aptos en lote " + l4.getNumero() + " : " + coop.cerealesAptosLote(l4));
		System.out.println("Cereales aptos en lote " + l5.getNumero() + " : " + coop.cerealesAptosLote(l5));

	}

}
