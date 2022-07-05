package ar.edu.link.TP.trabajoIntegrador.app.repo;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import ar.edu.link.TP.trabajoIntegrador.app.DTO.productoDTO;

public interface repoProductoI {

	
	public Collection<productoDTO> all();
	public productoDTO findByName(String nombreDeProducto) ;
	public List<productoDTO> findByCategory(String categoriaDeProducto);
	public void save(productoDTO producto) ;
	public void delete(productoDTO producto) ;
	Page<productoDTO> findByCategory(String categoriaDeProducto, Pageable page);
}
