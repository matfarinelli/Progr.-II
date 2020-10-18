package practico_6_3;

import java.util.ArrayList;

public class Videoclub {

	private String nombre;
	private ArrayList<Cliente> clientes;
	private ArrayList<Producto> productos;

	public Videoclub(String nombre) {
		this.nombre = nombre;
		this.clientes = new ArrayList<>();
		this.productos = new ArrayList<>();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void addCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public void addProducto(Producto producto) {
		this.productos.add(producto);
	}

	public ArrayList<Cliente> getClientes() {
		return new ArrayList<>(this.clientes);
	}

	public ArrayList<Producto> getProductos() {
		return new ArrayList<>(this.productos);
	}

}
