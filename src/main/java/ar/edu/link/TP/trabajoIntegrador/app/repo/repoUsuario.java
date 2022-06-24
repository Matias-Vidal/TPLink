package ar.edu.link.TP.trabajoIntegrador.app.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

import ar.edu.link.tpIntegrador.Carrito;
import ar.edu.link.tpIntegrador.OrdenDeCompra;
import ar.edu.link.tpIntegrador.Producto;
import ar.edu.link.tpIntegrador.Tarjeta;
import ar.edu.link.tpIntegrador.Usuario;

@Repository
public class repoUsuario {
	
	private Collection<Usuario> usuariosRegistrados;

	public repoUsuario() {
		super();
		List<Usuario> of = Arrays.asList(new Usuario("Matias","asdf",2,"Matias Vidal","a@gmail.com","DNI", 41738132),
										 new Usuario("Jose","asdf",0,"Jose jos","s@gmail.com","DNI",40234532));
		usuariosRegistrados = new ArrayList<Usuario>(of); 
	}
	
	public Collection<Usuario> all(){
		return usuariosRegistrados;
	}
	public Usuario findByName(String username) {
		return usuariosRegistrados.stream().filter(x -> x.getUserName().equals(username)).findFirst().get();
	}
	public Usuario findPassword(String password) {
		return usuariosRegistrados.stream().filter(x -> x.password().equals(password)).findFirst().get();
	}
	
}
