package ar.edu.link.TP.trabajoIntegrador.app.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ar.edu.link.TP.trabajoIntegrador.app.DTO.UsuarioDTO;

public interface RepoUsuarioCrud extends CrudRepository<UsuarioDTO, Integer> {
	
	List<UsuarioDTO> findAll();
	
	UsuarioDTO findByUserName(String username);
	
	
}
