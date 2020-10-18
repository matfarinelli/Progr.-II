package practico_3_3;

public class Main {

	public static void main(String[] args) {

		Punto_Geometrico pg1 = new Punto_Geometrico();
		pg1.desplazar(9, 13);
		System.out.println("X :" + pg1.getPunto_x() + " Y : " + pg1.getPunto_y());

		Punto_Geometrico pg2 = new Punto_Geometrico(8, 3);
		pg2.desplazar(17, 5);
		System.out.println("X: " + pg2.getPunto_x() + " Y: " + pg2.getPunto_y());

		System.out.println("Distancia euclidea: " + pg1.distancia_euclidea(pg2));

		// parte de rectangulos//
		Rectangulo r1 = new Rectangulo("Yectangulo", 1 , 3 , 5 ,9);
		r1.punto1.setPunto_x(11); //cambio los puntos
		r1.punto2.setPunto_y(29);
		
		System.out.println(r1.getNombre()); 
		System.out.println("Vertice 1 : " + r1.punto1.getPunto_x() + ", " +r1.punto1.getPunto_y());
		System.out.println("Vertice 2 : " + r1.punto2.getPunto_x() + ", " +r1.punto2.getPunto_y());
		r1.trasladar(5, 10);
		System.out.println("Nuevos puntos rectangulo:");
		System.out.println("Vertice 1 : " + r1.punto1.getPunto_x() + ", " +r1.punto1.getPunto_y());
		System.out.println("Vertice 2 : " + r1.punto2.getPunto_x() + ", " +r1.punto2.getPunto_y());
		r1.calcularArea();
		System.out.println("El area del " + r1.getNombre() + " " + r1.calcularArea());
		
		Rectangulo r2 = new Rectangulo("Cuadradito", 3 , 20 , 18 ,10);
		System.out.println("El area del " + r2.getNombre() + " " + r2.calcularArea());
		
		System.out.println(r1.isMayor(r2)); //funca perfecto
		System.out.println(r2.isCuadrado());
		System.out.println("Largo lado superior: " + r2.largoLadoSuperior());
		
		Rectangulo r3 = new Rectangulo("Cualquiera",1,35,19,17);
		
		System.out.println("¿En que posición está?: " + r1.posicionRectangulo());
		System.out.println("¿En que posición está?: " + r2.posicionRectangulo());
		System.out.println("¿En que posición está?: " + r3.posicionRectangulo());
		
	}
}
