package practico_6_3;

import java.util.ArrayList;

public class Cliente {

	private String nombre;
	private ArrayList<Producto> productosAlquilados;

	public Cliente(String nombre) {
		this.nombre = nombre;
		this.productosAlquilados = new ArrayList<Producto>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addProducto(Producto producto) {
		productosAlquilados.add(producto);
	}
	
	public ArrayList<Producto> getProductosAlquilados() {
		return new ArrayList<>(this.productosAlquilados);
	}

}
