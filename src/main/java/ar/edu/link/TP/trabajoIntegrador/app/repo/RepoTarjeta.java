package ar.edu.link.TP.trabajoIntegrador.app.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ar.edu.link.TP.trabajoIntegrador.app.DTO.Tarjeta;

public class RepoTarjeta {

	@Autowired
	public RepoTarjetaCrud repoTar;
	
	public Page<Tarjeta> list(Pageable page){
		return repoTar.findAll(page);
	}
	
	public Tarjeta findByNumero(int numero) {
		return repoTar.findByNumeroDeTarjeta(numero);
	}
}
