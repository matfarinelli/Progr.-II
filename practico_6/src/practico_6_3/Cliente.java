package practico_6_3;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private ArrayList<Alquiler> productosAlquilados;

	public Cliente(String nombre) {
		this.nombre = nombre;
		this.productosAlquilados = new ArrayList<Alquiler>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// seria el metodo alquilar?
	public void addProducto(Alquiler producto) {
		productosAlquilados.add(producto);
	}

	// seria el metodo "devolver"
	public void removeProducto(Alquiler producto) {
		productosAlquilados.remove(producto);
	}

	public ArrayList<Alquiler> getProductosAlquilados() {
		return new ArrayList<>(this.productosAlquilados);
	}

	public ArrayList<Alquiler> arrayAlquileresVencidos() {
		ArrayList<Alquiler> alquileresVencidos = new ArrayList<>();
		int lenght = productosAlquilados.size();
		for (int i = 0; i < lenght; i++) {
			Alquiler alquiler = productosAlquilados.get(i);
			if (alquiler.estaAlquilerVencido_())
				alquileresVencidos.add(alquiler);
		}
		return alquileresVencidos;
	}

	public boolean alquilerVencido() {
		int lenght = productosAlquilados.size();
		for (int i = 0; i < lenght; i++) {
			if (productosAlquilados.get(i).estaAlquilerVencido_())
				return true;
		}
		return false;
	}

}
