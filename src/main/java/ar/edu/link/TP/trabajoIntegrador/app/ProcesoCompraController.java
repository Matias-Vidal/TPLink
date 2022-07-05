package ar.edu.link.TP.trabajoIntegrador.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import ar.edu.link.TP.trabajoIntegrador.app.DTO.Carrito;
import ar.edu.link.TP.trabajoIntegrador.app.DTO.OrdenDeCompra;
import ar.edu.link.TP.trabajoIntegrador.app.repo.repoPromocion;
import ar.edu.link.TP.trabajoIntegrador.app.repo.repoUsuario;

@Controller
@RequestMapping("usuarios/{usuario}/carrito/compra")
public class ProcesoCompraController {
	
	@Autowired
	public repoUsuario repoUser;
	@Autowired
	public repoPromocion repoPromo;
	
	@GetMapping("")
	public String get2(@PathVariable("usuario") String userName, Model model) {
		model.addAttribute(repoUser.findByName(userName).getCarritoDeCompras());
		model.addAttribute(repoPromo.all());
		return "compra";
	}
	@PostMapping("/ejecutar")
	public RedirectView post(@PathVariable("usuario") String userName) {
		repoUser.findByName(userName).addCompra(new OrdenDeCompra(repoUser.findByName(userName).getCarritoDeCompras().getProductosEnCarrito(),
				repoUser.findByName(userName).getCarritoDeCompras().getSubTotal(),
				repoUser.findByName(userName).getCarritoDeCompras().getProductosEnCarrito().size(),
				"Tarjeta de Credito"
				));
		repoUser.findByName(userName).getCarritoDeCompras().clear();
		return new RedirectView("/usuarios");
	}
	
	
}
