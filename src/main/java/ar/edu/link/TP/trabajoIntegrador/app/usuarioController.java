package ar.edu.link.TP.trabajoIntegrador.app;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import ar.edu.link.TP.trabajoIntegrador.app.DTO.Carrito;
import ar.edu.link.TP.trabajoIntegrador.app.DTO.Tarjeta;
import ar.edu.link.TP.trabajoIntegrador.app.DTO.UsuarioDTO;
import ar.edu.link.TP.trabajoIntegrador.app.DTO.productoDTO;
import ar.edu.link.TP.trabajoIntegrador.app.repo.RepoTarjetaCrud;
import ar.edu.link.TP.trabajoIntegrador.app.repo.RepoUsuarioCrud;
import ar.edu.link.TP.trabajoIntegrador.app.repo.repoUsuario;

@RestController
@RequestMapping("/usuarios")
public class usuarioController {

	@Autowired
	public RepoUsuarioCrud repoUser;
	@Autowired
	public RepoTarjetaCrud repoTar;
	
	@GetMapping("")
	public Collection<UsuarioDTO> list(){
		return repoUser.findAll();
	}
	
	@GetMapping("/{usuario}")
	public UsuarioDTO get(@PathVariable("usuario") String userName) {
		return repoUser.findByUserName(userName);
	}
	
	@GetMapping("/{usuario}/carrito")
	public Carrito get2(@PathVariable("usuario") String userName) {
		return repoUser.findByUserName(userName).getCarritoDeCompras();
	}
	@PostMapping("/{usuario}/carrito")
	public void post(@PathVariable("usuario") String userName,@RequestBody productoDTO producto) {
		repoUser.findByUserName(userName).agregarProductoACarrito(producto);
	}
//	@PostMapping("/{usuario}/carrito/tarjeta")
//	public RedirectView post(@PathVariable("usuario") String username) {
//		repoUser.findByUserName(username).getCarritoDeCompras().setTotal(20);
//		return new RedirectView("./{usuario}/carrito");
//		
//	}
	
}
