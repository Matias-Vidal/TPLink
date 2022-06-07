package ar.edu.link.TP.trabajoIntegrador.repo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Repository;

import ar.edu.link.tpIntegrador.Producto;

@Repository
public class repoProducto {
	
	private Collection<Producto> productos;
	
	public repoProducto() {
		productos = new ArrayList<>();
	}
	public Producto buscarXNombre(String nombreDeProducto) {
		return productos.stream().filter(x -> x.getNombreDeProducto().equals(nombreDeProducto)).findFirst().get();
	}
	public Producto auto = new Producto("Auto", 100000, "Dolares", "Vehiculo");
}
