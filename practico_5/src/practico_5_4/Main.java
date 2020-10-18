package practico_5_4;

public class Main {

	public static void main(String[] args) {

		Contribuyente_simple cs1 = new Contribuyente_simple("Matias" , 34296907, 600);
		cs1.getImpuesto();

		Contribuyente_comerciante cc1 = new Contribuyente_comerciante("Maite", 34150850 , 600 , 10000, 0.035, 0.5 );
		cc1.getImpuesto();

		Contribuyente_comerciante cc2 = new Contribuyente_comerciante("Lucas", 33788989 , 600 , 10000, 0.02, 0.2 );
		cc2.getImpuesto();
		
		
		System.out.println("Impuestos comparativos: " + cs1.getNombre() + " " + cs1.getImpuesto() + "\n"
				+ cc1.getNombre() + " " + cc1.getImpuesto() + "\n" + cc1.getNombre() + " " + cc2.getImpuesto());
	}

}
