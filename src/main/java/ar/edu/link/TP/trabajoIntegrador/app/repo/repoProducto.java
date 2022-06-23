package ar.edu.link.TP.trabajoIntegrador.app.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import ar.edu.link.tpIntegrador.Producto;

@Repository
public class repoProducto {
	
	private Collection<Producto> productos;
	
	public repoProducto() {
		super();
		List<Producto> of = Arrays.asList(new Producto("auto",1000,"Dolares","Vehiculo"),
							 	  new Producto("Martillo",15,"Pesos","Herramienta"),
							 	  new Producto("Moto",500,"Dolares","Vehiculo"),
							 	  new Producto("Asado",900,"Pesos","Alimento"));
		productos = new ArrayList<Producto>(of);
	}
	public Collection<Producto> all(){
		return productos;
	}
	public Producto findByName(String nombreDeProducto) {
		return productos.stream().filter(x -> x.getNombreDeProducto().toLowerCase()
				.equals(nombreDeProducto.toLowerCase())).findFirst().get();
	}
	public Collection<Producto> findByCategory(String categoriaDeProducto){
		return productos.stream().filter(x -> x.getCategoriaDeProducto().toLowerCase()
				.equals(categoriaDeProducto.toLowerCase())).collect(Collectors.toList());
	}
	public void save(Producto producto) {
		this.productos.add(producto);
		
	}
	public void delete(Producto producto) {
		this.productos.remove(producto);
	}
	
	
	
		
}
