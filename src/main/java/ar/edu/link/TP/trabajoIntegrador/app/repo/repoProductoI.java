package ar.edu.link.TP.trabajoIntegrador.app.repo;

import java.util.Collection;
import java.util.stream.Collectors;

import ar.edu.link.TP.trabajoIntegrador.app.DTO.productoDTO;
import ar.edu.link.tpIntegrador.Producto;

public interface repoProductoI {

	
	public Collection<Producto> all();
	public Producto findByName(String nombreDeProducto) ;
	public Collection<Producto> findByCategory(String categoriaDeProducto);
	public void save(Producto producto) ;
	public void delete(Producto producto) ;
	public void save2(productoDTO producto);
}
