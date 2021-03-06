package ar.edu.link.TP.trabajoIntegrador.app;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.link.TP.trabajoIntegrador.app.DTO.Carrito;
import ar.edu.link.TP.trabajoIntegrador.app.DTO.Vendedor;
import ar.edu.link.TP.trabajoIntegrador.app.DTO.productoDTO;
import ar.edu.link.TP.trabajoIntegrador.app.repo.repoVendedor;


@RestController
@RequestMapping("/vendedor")
public class VendedorController {

	@Autowired
	public repoVendedor repoVen;
	
	@GetMapping("")
	public Collection<Vendedor> list(){
		return repoVen.all();
	}
	
	@GetMapping("/{vendedor}")
	public Vendedor get(@PathVariable("vendedor") String alias) {
		return repoVen.findByName(alias);
	}
	
	@GetMapping("/{vendedor}/carrito")
	public Carrito get2(@PathVariable("vendedor") String alias) {
		return repoVen.findByName(alias).getProductosEnVenta();
	}
	@PostMapping("/{vendedor}/carrito")
	public void post(@PathVariable("vendedor") String userName,@RequestBody productoDTO producto) {
		repoVen.findByName(userName).agregarProductoEnVenta(producto);
	}
}
