package ar.edu.link.TP.trabajoIntegrador.app.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import ar.edu.link.TP.trabajoIntegrador.app.DTO.Tarjeta;

public interface RepoTarjetaCrud extends CrudRepository<Tarjeta, Integer> {

	Page<Tarjeta> findAll(Pageable page);
	
	Tarjeta findByID(Integer numero);
	
	Tarjeta findByNumeroDeTarjeta(Integer numero);
}
