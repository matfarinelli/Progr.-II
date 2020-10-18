package practico_3_3;

public class Rectangulo {

	private String nombre;
	Punto_Geometrico punto1;
	Punto_Geometrico punto2;
	private double lado_x;
	private double lado_y;
	
	

	public Rectangulo() {
		this.nombre = "Punto";
		this.punto1 = new Punto_Geometrico();
		this.punto2 = new Punto_Geometrico();
	}

	public Rectangulo(String nombre) {
		this.nombre = nombre;
	}

	public Rectangulo(String nombre, int x1, int y1, int x2, int y2) {
		this(nombre);
		this.punto1 = new Punto_Geometrico(x1, y1);
		this.punto2 = new Punto_Geometrico(x2, y2);
	}

	public String getNombre() {
		return nombre;
	}

	public void trasladar(int x, int y) {
		this.punto1.desplazar(x, y);
		this.punto2.desplazar(x, y);
	}

	public double calcularArea() {
		double area = this.getLado_x() * this.getLado_y();
		return area;
	}

	public int isMayor(Rectangulo otro_rectangulo) {
		if (this.calcularArea() > otro_rectangulo.calcularArea()) {
			return 1;
		} else if (this.calcularArea() == otro_rectangulo.calcularArea()) {
			return 0;
		} else {
			return -1;
		}
	}

	public double getLado_x() {
		this.lado_x = Math.abs(this.punto1.getPunto_x() - this.punto2.getPunto_x());
		return lado_x;
	}

	public double getLado_y() {
		this.lado_y = Math.abs(this.punto1.getPunto_y() - this.punto2.getPunto_y());
		return lado_y;
	}

	public boolean isCuadrado() {
		if (this.getLado_x() == this.getLado_y()) {
			return true;
		}
		return false;
	}

	public double largoLadoSuperior() {
		if (this.getLado_x() > this.getLado_y()) {
			return this.getLado_x();
		} else if (this.getLado_x() < this.getLado_y()) {
			return this.getLado_y();
		} else {
			return this.getLado_y(); // o el x, da igual.
		}
	}
	
	public String posicionRectangulo() {
		if ((this.getLado_x()>this.getLado_y())) {
			return "Esta acostado";
		} else if ((this.getLado_x()<this.getLado_y())) {
			return "Esta parado";
		} else {
			return "No se sabe como está, por que es cuadrado";
		}
	}
	

}
