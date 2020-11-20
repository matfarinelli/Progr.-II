package practico_especial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

import Pocimas.Pocima;
import Pocimas.PocimaCocktail;
import Pocimas.PocimaNumero;
import Pocimas.PocimaPorcentaje;
import Pocimas.PocimaSelectiva;
import VisorMazo.VisorMazo;
import estrategias.Ambicioso;
import estrategias.Estrategia;
import estrategias.Obstinado;
import estrategias.Timbero;

public class Main {

	public static void main(String[] args) {

		// creacion del mazo
		Mazo m1 = new Mazo();

		// agrego atributos
		Atributo a1 = new Atributo("altura");
		Atributo a2 = new Atributo("peso");
		Atributo a3 = new Atributo("fuerza");
		Atributo a4 = new Atributo("peleas ganadas");
		Atributo a5 = new Atributo("velocidad");

		// agrego atributos al mazo
		m1.addAtributo(a1);
		m1.addAtributo(a2);
		m1.addAtributo(a3);
		m1.addAtributo(a4);
		m1.addAtributo(a5);

		// cargo el mazo con el archivo json que pasaron los profes
		String mazoPath = "src/VisorMazo/superheroes.json";
		cargarMazo(mazoPath, m1); // mazo que luego voy a repartir entre los jugadores

		// imprimo el mazo y mezclo
		m1.mezclar();
		// System.out.println(m1.getCartas());
		// System.out.println("******************");

		// creacion jugadores

		Jugador j1 = new Jugador("Juan");
		Jugador j2 = new Jugador("Matias");
		Estrategia timbero = new Timbero();
		Estrategia ambicioso = new Ambicioso();
		Estrategia obstinado = new Obstinado("peso");
		j1.setEstrategia(obstinado);
		j2.setEstrategia(obstinado);

		// creacion pocimas
		Pocima fortalecedora = new PocimaPorcentaje("Fortalecedora", 0.20);
		Pocima fortalecedoraPlus = new PocimaPorcentaje("Fortalecedora Plus", 0.50);
		Pocima kriptonita = new PocimaPorcentaje("Kriptonita", -0.25);
		Pocima reductorDePlomo = new PocimaPorcentaje("Reductor De Plomo", -0.55);
		Pocima quieroValeCuatro = new PocimaNumero("Quiero Vale Cuatro", 4);
		Pocima numeroMagico = new PocimaNumero("Numero Magico", 23);
		Pocima selectiva = new PocimaSelectiva("Selectiva Fuerza", "fuerza", 0.35);
		Pocima selectiva2 = new PocimaSelectiva("Selectiva Peso", "peso", 0.43);
		PocimaCocktail cocktail = new PocimaCocktail("Cocktail");
		
		
		Mazo pocimas = new Mazo();
		
		
		//preguntar
		cocktail.addPocima(fortalecedora);
		cocktail.addPocima(fortalecedoraPlus);
		cocktail.addPocima(selectiva);
		
	
		System.out.println(cocktail.getNombresPocimas());

		Juego juego = new Juego("Cartas", j1, j2, m1, 55);

		juego.repartirCartas();

		// System.out.println("mazo "+j1.getNombre());
		System.out.println(j1.getMazoPropio());
		// System.out.println("mazo "+j2.getNombre());
		System.out.println(j2.getMazoPropio());

		juego.jugar();

		// System.out.println(j1.getMazoPropio());
		// System.out.println(j2.getMazoPropio());

		/*
		 * System.out.println("mazo " + j1.getNombre());
		 * System.out.println(j1.getMazoPropio());
		 * 
		 * System.out.println("mazo " + j2.getNombre());
		 * System.out.println(j2.getMazoPropio());
		 */

	}

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void cargarMazo(String jsonFile, Mazo mazo) {
		// URL url = getClass().getResource(jsonFile);
		File jsonInputFile = new File(jsonFile);
		InputStream is;
		try {
			is = new FileInputStream(jsonInputFile);
			// Creo el objeto JsonReader de Json.
			JsonReader reader = Json.createReader(is);
			// Obtenemos el JsonObject a partir del JsonReader.
			JsonArray cartas = (JsonArray) reader.readObject().getJsonArray("cartas");
			for (JsonObject carta : cartas.getValuesAs(JsonObject.class)) {
				String nombreCarta = carta.getString("nombre");

				Carta cartaNueva = new Carta(nombreCarta); // creación de carta

				JsonObject atributos = (JsonObject) carta.getJsonObject("atributos");
				String atributosStr = "";
				for (String nombreAtributo : atributos.keySet()) {

					Atributo atributoNuevo = new Atributo(nombreAtributo, atributos.getInt(nombreAtributo)); // creamos
																												// atributo

					cartaNueva.addAtributo(atributoNuevo); // lo agregamos a la carta

					atributosStr = atributosStr + nombreAtributo + ": " + atributos.getInt(nombreAtributo) + "; ";
				}

				// System.out.println(nombreCarta + "\t\t\t" + atributosStr);
				mazo.addCartasAptas(cartaNueva);
				
			}

			reader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
