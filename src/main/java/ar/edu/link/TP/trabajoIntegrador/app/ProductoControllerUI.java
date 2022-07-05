package ar.edu.link.TP.trabajoIntegrador.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

import ar.edu.link.TP.trabajoIntegrador.app.DTO.productoDTO;
import ar.edu.link.TP.trabajoIntegrador.app.repo.repoProducto;
import ar.edu.link.TP.trabajoIntegrador.app.repo.repoProductoI;

@Controller
@RequestMapping("UI/productos")
public class ProductoControllerUI {
	
	@Autowired
	@Qualifier("Mem")
	private repoProductoI repo;
	
	@GetMapping("")
	public String list(Model model , Pageable page) {
		
		List<productoDTO> all = new ArrayList<>(repo.all());
		model.addAttribute("ListadoDeProductos", all);
		return "ListadoDeProductos";
	}
	
	
	@GetMapping("/{nombre}")
	public String get(@PathVariable("nombre") String nombreProducto, Model model) {
		
		model.addAttribute("producto", repo.findByName(nombreProducto));
		return "producto";
	}
	@GetMapping("/category={categoria}")
	public List<productoDTO> list(@PathVariable("categoria") String categoriaDeProducto){
		return repo.findByCategory(categoriaDeProducto);
	}
	
	@Transactional
	@PostMapping("/agregar")
	public RedirectView post(productoDTO producto) {
		repo.save(producto);
		return new RedirectView("/UI/producto");
	}
	@DeleteMapping("")
	public void delete(@RequestBody productoDTO producto) {
		repo.delete(producto);
	}
	
	
}
