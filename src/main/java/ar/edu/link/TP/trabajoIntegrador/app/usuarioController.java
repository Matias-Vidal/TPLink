package ar.edu.link.TP.trabajoIntegrador.app;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.link.TP.trabajoIntegrador.app.repo.repoUsuario;
import ar.edu.link.tpIntegrador.Carrito;
import ar.edu.link.tpIntegrador.Producto;
import ar.edu.link.tpIntegrador.Usuario;

@RestController
@RequestMapping("/usuarios")
public class usuarioController {

	@Autowired
	public repoUsuario repoUser;
	
	@GetMapping("")
	public Collection<Usuario> list(){
		return repoUser.all();
	}
	
	@GetMapping("/{usuario}")
	public Usuario get(@PathVariable("usuario") String userName) {
		return repoUser.findByName(userName);
	}
	
	@GetMapping("/{usuario}/carrito")
	public Carrito get2(@PathVariable("usuario") String userName) {
		return repoUser.findByName(userName).getCarritoDeCompras();
	}
	@PostMapping("/{usuario}/carrito")
	public void post(@PathVariable("usuario") String userName,@RequestBody Producto producto) {
		repoUser.findByName(userName).agregarProductoACarrito(producto);
	}
	
}
