package ar.edu.link.TP.trabajoIntegrador.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import ar.edu.link.TP.trabajoIntegrador.app.DTO.productoDTO;
import ar.edu.link.TP.trabajoIntegrador.app.repo.RepoProductoCrud;
import ar.edu.link.TP.trabajoIntegrador.app.repo.repoProducto;
import ar.edu.link.TP.trabajoIntegrador.app.repo.repoProductoI;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	private RepoProductoCrud repo;
	
	@GetMapping("")
	public Page<productoDTO> list(Pageable page) {
		
		return repo.findAll(page);
	}
	
	
	@GetMapping("/{nombre}")
	public productoDTO get(@PathVariable("nombre") String nombreProducto) {
		return repo.findByNombreDeProducto(nombreProducto);
	}
	@GetMapping("/category={categoria}")
	public Page<productoDTO> list(@PathVariable("categoria") String categoriaDeProducto,Pageable page){
		return repo.findByCategoriaDeProducto(categoriaDeProducto,page);
	}
	
	@Transactional
	@PostMapping("")
	public RedirectView post(@RequestBody productoDTO producto) {
		repo.save(producto);
		return new RedirectView("/producto");
	}
	@Transactional
	@DeleteMapping("")
	public RedirectView delete(@RequestBody String nombreDeProducto,Pageable page) {
		repo.delete(repo.findByNombreDeProducto(nombreDeProducto));
		return new RedirectView("/producto");
		
	}
	
	
	
	
}
