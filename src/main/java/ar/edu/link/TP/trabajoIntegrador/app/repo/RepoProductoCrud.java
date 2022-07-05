package ar.edu.link.TP.trabajoIntegrador.app.repo;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

import ar.edu.link.TP.trabajoIntegrador.app.DTO.productoDTO;

public interface RepoProductoCrud extends PagingAndSortingRepository<productoDTO,Integer> {

	Page<productoDTO> findAll(Pageable page);
	
	productoDTO findByNombreDeProducto(String nombreProducto);
	
	Page<productoDTO> findByCategoriaDeProducto(String categoria, Pageable page);
}
