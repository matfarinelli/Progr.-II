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

import VisorMazo.VisorMazo;

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
		
		//agrego atributos al mazo
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
		System.out.println(m1.getCartas());
		
		System.out.println("******************");

		// creacion jugadores
		Jugador j1 = new Jugador("Juan");
		Jugador j2 = new Jugador("Matias");
		
		Juego juego = new Juego("Cartas",j1, j2, m1,10);
		
		juego.repartirCartas();
		System.out.println(j1.getSize());
		System.out.println(j2.getSize());
		
		
		System.out.println("********");
		juego.jugarMano();
	
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

				//System.out.println(nombreCarta + "\t\t\t" + atributosStr);
				mazo.addCartasAptas(cartaNueva);
			}

			reader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
