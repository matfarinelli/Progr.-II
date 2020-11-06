package practico_6_3;

import java.util.ArrayList;

public class Videoclub {

	private String nombre;
	private ArrayList<Cliente> clientes;
	private ArrayList<Producto> productos;
	private ArrayList<Alquiler> alquileres;

	// esta bien que tenga esto? productos, alquileres y clientes

	public Videoclub(String nombre) {
		this.nombre = nombre;
		this.clientes = new ArrayList<>();
		this.productos = new ArrayList<>();
		this.alquileres = new ArrayList<>();
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

	public void addAlquiler(Alquiler alquiler) {
		this.alquileres.add(alquiler);
	}

	public ArrayList<Cliente> getClientes() {
		return new ArrayList<>(this.clientes);
	}

	public ArrayList<Producto> getProductos() {
		return new ArrayList<>(this.productos);
	}

	public ArrayList<Alquiler> getAlquileres() {
		return new ArrayList<>(this.alquileres);
	}

	/*
	 * metodo ejercicio
	 * 
	 */

	public ArrayList<String> clientesConAlquileresVencidos() {
		ArrayList<String> clientesVencidos = new ArrayList<String>();
		int lenght = clientes.size();
		for (int i = 0; i < lenght; i++) {
			Cliente cliente = clientes.get(i);
			if (cliente.alquilerVencido()) {
				clientesVencidos.add(cliente.getNombre());
			}
		}
		return clientesVencidos;
	}

}
