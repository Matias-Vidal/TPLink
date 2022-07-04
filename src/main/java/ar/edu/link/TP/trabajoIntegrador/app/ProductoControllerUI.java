package ar.edu.link.TP.trabajoIntegrador.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import ar.edu.link.TP.trabajoIntegrador.app.repo.repoProducto;
import ar.edu.link.TP.trabajoIntegrador.app.repo.repoProductoI;
import ar.edu.link.tpIntegrador.Producto;

@Controller
@RequestMapping("UI/producto")
public class ProductoControllerUI {
	
	@Autowired
	private repoProducto repo;
	
	@GetMapping("")
	public String list(Model model , Pageable page) {
		
		List<Producto> all = new ArrayList<>(repo.all());
		model.addAttribute("ListadoDeProductos", all);
		return "ListadoDeProductos";
	}
	
	
	@GetMapping("/{nombre}")
	public String get(@PathVariable("nombre") String nombreProducto, Model model) {
		
		model.addAttribute("producto", repo.findByName(nombreProducto));
		return "producto";
	}
	@GetMapping("/category={categoria}")
	public Collection<Producto> list(@PathVariable("categoria") String categoriaDeProducto){
		return repo.findByCategory(categoriaDeProducto);
	}
	
	@Transactional
	@PostMapping("/agregar")
	public RedirectView post(Producto producto) {
		repo.save(producto);
		return new RedirectView("/UI/producto");
	}
	@DeleteMapping("")
	public void delete(@RequestBody Producto producto) {
		repo.delete(producto);
	}
	
	
}
