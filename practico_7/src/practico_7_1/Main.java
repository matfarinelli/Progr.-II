package practico_7_1;

public class Main {

	public static void main(String[] args) {
		
		Diccionario D1 = new Diccionario();
		Palabra p1 = new Palabra("perro" , "verbo");
		Palabra p2 = new Palabra("casa" , "verbo");
		Palabra p3 = new Palabra("arbol" , "sustantivo");
		
		D1.agregarPalabra(p1);
		D1.agregarPalabra(p2);
		D1.agregarPalabra(p3);
		
		/* D1.modificarPalabra(p3, "gato");
		System.out.println(p3.getNombre());
		
		D1.eliminarPalabra(p3);
		System.out.println(D1.getPalabras());
		
		p1.agregarSinonimo("forro");
		p1.agregarSinonimo("malo");
		p1.agregarSinonimo("caluroso");
		
		p1.getSinonimosOrdenados();
		
		System.out.println(p1.getSinonimosOrdenados()); */
		
		System.out.println(D1.getPalabras());
		System.out.println(D1.getPalabrasOrdenadas());
	}

}
