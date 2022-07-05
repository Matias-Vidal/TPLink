package ar.edu.link.TP.trabajoIntegrador.app.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

import ar.edu.link.TP.trabajoIntegrador.app.DTO.productoDTO;


@Repository
@Qualifier("Mem")
public class repoProducto implements repoProductoI{
	
	
	@Autowired
	public EntityManager em;
	
	private Collection<productoDTO> productos;
	
	public repoProducto() {
		super();
		List<productoDTO> of = Arrays.asList(new productoDTO("auto",1000,"Dolares","Vehiculo"),
							 	  new productoDTO("Martillo",15,"Pesos","Herramienta"),
							 	  new productoDTO("Moto",500,"Dolares","Vehiculo"),
							 	  new productoDTO("Asado",900,"Pesos","Alimento"));
		productos = new ArrayList<productoDTO>(of);
	}
	public Collection<productoDTO> all(){
		return productos;
	}
	public productoDTO findByName(String nombreDeProducto) {
		return productos.stream().filter(x -> x.getNombreDeProducto().toLowerCase()
				.equals(nombreDeProducto.toLowerCase())).findFirst().get();
	}
	public List<productoDTO> findByCategory(String categoriaDeProducto){
		return productos.stream().filter(x -> x.getCategoriaDeProducto().toLowerCase()
				.equals(categoriaDeProducto.toLowerCase())).collect(Collectors.toList());
	}
	public void save(productoDTO producto) {
		//this.productos.add(producto);
		em.persist(producto);
	}
	public void save2(productoDTO producto) {
		//this.productos.add(producto);
		em.persist(producto);
	}
	public void deleteByName(String nombreDeProducto) {
		productos.remove(this.findByName(nombreDeProducto));
	}
	@Override
	public void delete(productoDTO producto) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Page<productoDTO> findByCategory(String categoriaDeProducto, Pageable page) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
		
}
