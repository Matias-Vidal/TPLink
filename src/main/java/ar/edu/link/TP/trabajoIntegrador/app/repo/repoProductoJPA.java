package ar.edu.link.TP.trabajoIntegrador.app.repo;

import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

import ar.edu.link.TP.trabajoIntegrador.app.DTO.productoDTO;
@Repository
@Qualifier("JPA")
public class repoProductoJPA implements repoProductoI {

	@Autowired
	public RepoProductoCrud repo;
	
	public Page<productoDTO> all(Pageable page) {
		return repo.findAll(page);
	}

	@Override
	public productoDTO findByName(String nombreDeProducto) {
		return repo.findByNombreDeProducto(nombreDeProducto);
	}

	@Override
	public Page<productoDTO> findByCategory(String categoriaDeProducto, Pageable page) {
		return repo.findByCategoriaDeProducto(categoriaDeProducto, page);
	}

	@Override
	public void save(productoDTO producto) {
		repo.save(producto);
	}

	@Override
	public void delete(productoDTO producto) {
			repo.delete(producto);
	}


	@Override
	public Collection<productoDTO> all() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<productoDTO> findByCategory(String categoriaDeProducto) {
		// TODO Auto-generated method stub
		return null;
	}

}
