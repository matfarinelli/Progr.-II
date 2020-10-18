package practico_3_1;

import java.text.SimpleDateFormat;
import java.util.*;

public class fechas {

	public static void main(String[] args) {
		Date fechaActual = new Date(); // nos devuelve la fecha actual
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY"); // formateador

		int diaActual = fechaActual.getDate();
		int mesActual = (fechaActual.getMonth()) + 1;

		System.out.println(diaActual);
		System.out.println(mesActual);
		// System.out.println(sdf.format(fechaActual));
	}
}
