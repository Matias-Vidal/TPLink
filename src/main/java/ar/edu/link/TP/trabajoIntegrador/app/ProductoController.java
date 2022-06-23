package ar.edu.link.TP.trabajoIntegrador.app;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.link.TP.trabajoIntegrador.app.repo.repoProducto;
import ar.edu.link.tpIntegrador.Producto;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	private repoProducto repo;
	
	@GetMapping("")
	public Collection<Producto> list() {
		return repo.all();
	}
	
	
	@GetMapping("/{nombre}")
	public Producto get(@PathVariable("nombre") String nombreProducto) {
		return repo.findByName(nombreProducto);
	}
	@GetMapping("/category={categoria}")
	public Collection<Producto> list(@PathVariable("categoria") String categoriaDeProducto){
		return repo.findByCategory(categoriaDeProducto);
	}
	
	@PostMapping("")
	public void post(@RequestBody Producto producto) {
		repo.save(producto);
	}
	@DeleteMapping("")
	public void delete(@RequestBody Producto producto) {
		repo.delete(producto);
	}
	
	
	
}
