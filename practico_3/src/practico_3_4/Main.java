package practico_3_4;

public class Main {

	public static void main(String[] args) {

		Serie s1 = new Serie("Lost", "Se pudre todo en la isla", "JJ ABRAHAMS", "Thriller");
		Episodio e1 = new Episodio("Piloto");
		System.out.println(e1.getCalificacion());
		e1.setCalificacion(6);
		System.out.println(e1.getCalificacion());
		e1.setCalificacion(4);
		e1.setDescripcion("Se cae el avion en la isla!");
		System.out.println("Descripcion: " + e1.getDescripcion() + " Calificacion: " + e1.getCalificacion());
		e1.setFlag(true);

		Episodio e2 = new Episodio("CapII");
		Episodio e3 = new Episodio("CapIII");
		Episodio e4 = new Episodio("CapIV");
		Episodio e5 = new Episodio("CapV");
		Episodio e6 = new Episodio("CapVI");
		Episodio e7 = new Episodio("CapVII");
		Episodio e8 = new Episodio("CapVIII");
		Episodio e9 = new Episodio("CapIX");
		Episodio e10 = new Episodio("CapX");

		e2.setFlag(true);
		e3.setFlag(true);
		e4.setFlag(true);
		e5.setFlag(true);
		e6.setFlag(true);
		e7.setFlag(true);

		e2.setCalificacion(4);
		e3.setCalificacion(2);
		e4.setCalificacion(2);
		e5.setCalificacion(1);

		Temporada t1 = new Temporada("Temporada I");
		Temporada t2 = new Temporada("Temporada II");
		Temporada t3 = new Temporada("Temporada III");

		s1.agregarTemporada(t1);
		s1.agregarTemporada(t2);
		s1.agregarTemporada(t3);

		t1.agregarEpisodio(e1);
		t1.agregarEpisodio(e2);
		t1.agregarEpisodio(e3);
		t2.agregarEpisodio(e4);
		t2.agregarEpisodio(e5);
		t2.agregarEpisodio(e6);
		t2.agregarEpisodio(e7);
	
		/*
		t3.agregarEpisodio(e8);
		t3.agregarEpisodio(e9);
		t3.agregarEpisodio(e10);
		 */

		System.out.println("Episodios vistos de la temporada I: " + t1.get_episodios_vistos());
		System.out.println("Episodios vistos de la temporada II: " + t2.get_episodios_vistos());

		System.out.println("Episodios vistos de la Serie: " + s1.get_episodios_vistos());
		System.out.println("La " + t3.getNombre() + " fue terminada " + "  " + t3.completada());
		System.out
				.println("Calificación promedio de la temporada: " + t1.getNombre() + " " + t1.promedio_calificacion());
		System.out
				.println("Calificación promedio de la temporada: " + t2.getNombre() + " " + t2.promedio_calificacion());
		System.out.println("Calificacion promedio de la serie : " + s1.get_promedio());
		System.out.println("Termino la serie: " + s1.completada());
		
		System.out.println(e1.getTitulo());
		System.out.println(e2.getTitulo());
		System.out.println(e3.getTitulo());
		
		
		/* esto lo probe para entender static 
		System.out.println(e1.getTitulo());
		System.out.println(e2.getTitulo());
		System.out.println(e3.getTitulo());
		*/
	}

}
