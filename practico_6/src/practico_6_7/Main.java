package practico_6_7;

public class Main {

	public static void main(String[] args) {

		// creacion de documentos
		Documento d1 = new Documento("El tesoro de los inocentes", "Del indio solari gente");
		Documento d2 = new Documento("El secreto", "La historia oculta de Pepe pompin");
		Documento d3 = new Documento("Godzilla",
				"Un mono que trepa edificios y se re calienta con la gente de New York");
		Documento d4 = new Documento("Viaje al mundo en 80 dias", "un disparate literario");
		Documento d5 = new Documento("El elemento", "Para encontrar tu pasion, o sentirte como la mierda si no");
		Documento d6 = new Documento("El diario de Ana Frank", "Gran historia");

		// agrego palabras clave
		d1.addTag("Misterio");
		d1.addTag("Musical");
		d2.addTag("Inspiracional");
		d2.addTag("Fantasia");
		d2.addTag("Recomendado");
		d3.addTag("Animal");
		d3.addTag("Fantasia");
		d4.addTag("Fantasia");
		d4.addTag("Clasico");
		d5.addTag("Inspiracional");
		d6.addTag("Veridico");
		d6.addTag("Recomendado");

		// agrego autores
		String au1 = new String("Ken Robinson");
		d5.addAutor(au1);
		String au2 = new String("Indio Solari");
		d1.addAutor(au2);

		// agrego al historiador
		Historiador h1 = new Historiador("Matias");
		h1.addDocumentos(d1);
		h1.addDocumentos(d2);
		h1.addDocumentos(d3);
		h1.addDocumentos(d4);
		h1.addDocumentos(d5);
		h1.addDocumentos(d6);

		// busqueda en si
		// criterio de busqueda por titulo
		Criterio porTitulo = new CriterioTitulo("mundo");
		Criterio porTitulo2 = new CriterioTitulo("viaje al MUNDo en 80 dias");
		System.out.println(h1.buscar(porTitulo));
		System.out.println(h1.buscar(porTitulo2));

		System.out.println("//* * * * *");

		Criterio porPalabra = new CriterioPalabra("el");
		Criterio porPalabra2 = new CriterioPalabra("Gente");
		System.out.println(h1.buscar(porPalabra));
		System.out.println(h1.buscar(porPalabra2));

		System.out.println("*****");
		Criterio porTag = new CriterioTag("clasiCO");
		Criterio porTag2 = new CriterioTag("veridico");
		Criterio porTag3 = new CriterioTag("recomendado");
		System.out.println(h1.buscar(porTag));
		System.out.println(h1.buscar(porTag2));
		System.out.println(h1.buscar(porTag3));

		System.out.println("* * * * *");
		// busco las NO "recomendadas"
		Criterio porTag4 = new CriterioTag("recomendado");
		Criterio porTag5 = new CriterioNot(porTag4);
		System.out.println(h1.buscar(porTag5));

		System.out.println("5*****");
		Criterio porAutor = new CriterioAutor("ken");
		System.out.println(h1.buscar(porAutor));

		System.out.println("´´´´*****");
		Criterio porCantPalabras = new CriterioCantidadPalabras(10);
		System.out.println(h1.buscar(porCantPalabras));
		
		
	}

}
