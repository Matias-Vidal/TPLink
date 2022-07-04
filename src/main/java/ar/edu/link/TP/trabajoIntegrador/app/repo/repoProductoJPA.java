package ar.edu.link.TP.trabajoIntegrador.app.repo;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ar.edu.link.TP.trabajoIntegrador.app.DTO.productoDTO;
import ar.edu.link.tpIntegrador.Producto;

@Repository
@Qualifier("JPA")
public class repoProductoJPA implements repoProductoI {

	@Autowired
	public EntityManager em;
	
	@Override
	public Collection<Producto> all() {
		return null;
	}

	@Override
	public Producto findByName(String nombreDeProducto) {
		return null;
	}

	@Override
	public Collection<Producto> findByCategory(String categoriaDeProducto) {
		return null;
	}

	@Override
	public void save(Producto producto) {
		em.persist(producto);
	}

	@Override
	public void delete(Producto producto) {

	}

	@Override
	public void save2(productoDTO producto) {
		// TODO Auto-generated method stub
		
	}

}
