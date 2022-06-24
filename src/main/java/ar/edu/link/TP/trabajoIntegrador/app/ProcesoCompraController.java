package ar.edu.link.TP.trabajoIntegrador.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.link.TP.trabajoIntegrador.app.repo.repoPromocion;
import ar.edu.link.TP.trabajoIntegrador.app.repo.repoUsuario;
import ar.edu.link.tpIntegrador.Carrito;

@RestController
@RequestMapping("usuarios/{usuario}/carrito/Compra")
public class ProcesoCompraController {
	
	@Autowired
	public repoUsuario repoUser;
	@Autowired
	public repoPromocion repoPromo;
	
	@GetMapping("")
	public Carrito get2(@PathVariable("usuario") String userName) {
		return repoUser.findByName(userName).getCarritoDeCompras();
	}
}
