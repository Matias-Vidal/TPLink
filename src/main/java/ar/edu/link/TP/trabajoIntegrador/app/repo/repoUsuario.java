package ar.edu.link.TP.trabajoIntegrador.app.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

import ar.edu.link.TP.trabajoIntegrador.app.DTO.Carrito;
import ar.edu.link.TP.trabajoIntegrador.app.DTO.OrdenDeCompra;
import ar.edu.link.TP.trabajoIntegrador.app.DTO.Tarjeta;
import ar.edu.link.TP.trabajoIntegrador.app.DTO.UsuarioDTO;


@Repository
public class repoUsuario {
	
	private Collection<UsuarioDTO> usuariosRegistrados;

	public repoUsuario() {
		super();
		List<UsuarioDTO> of = Arrays.asList(new UsuarioDTO("Matias","asdf",2,"Matias Vidal","a@gmail.com","DNI", 41738132),
										 new UsuarioDTO("Jose","asdf",0,"Jose jos","s@gmail.com","DNI",40234532));
		usuariosRegistrados = new ArrayList<UsuarioDTO>(of); 
	}
	
	public Collection<UsuarioDTO> all(){
		return usuariosRegistrados;
	}
	public UsuarioDTO findByName(String username) {
		return usuariosRegistrados.stream().filter(x -> x.getUserName().equals(username)).findFirst().get();
	}
	public UsuarioDTO findPassword(String password) {
		return usuariosRegistrados.stream().filter(x -> x.password().equals(password)).findFirst().get();
	}
	
}
