package practico_3_3;

public class Punto_Geometrico {

	private int punto_x;
	private int punto_y;

	public Punto_Geometrico() {
		this.punto_x = 0;
		this.punto_y = 0;
	}

	public Punto_Geometrico(int punto_x, int punto_y) {
		this.punto_x = punto_x;
		this.punto_y = punto_y;
	}

	public void setPunto_x(int punto_x) {
		this.punto_x = punto_x;
	}

	public int getPunto_x() {
		return punto_x;
	}

	public void setPunto_y(int punto_y) {
		this.punto_y = punto_y;
	}

	public int getPunto_y() {
		return punto_y;
	}

	public void desplazar(int desplazo_x, int desplazo_y) {
		this.punto_x += desplazo_x;
		this.punto_y += desplazo_y;
	}

	public double distancia_euclidea(Punto_Geometrico punto_geometrico_2) {
		double difX =  Math.pow((this.getPunto_x() - punto_geometrico_2.getPunto_x()), 2);
		double difY =  Math.pow((this.getPunto_y() - punto_geometrico_2.getPunto_y()), 2);
		double distancia_euclidea = (double) Math.sqrt(difX-difY);
		return distancia_euclidea;
	}

}
