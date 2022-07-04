package ar.edu.link.TP.trabajoIntegrador.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.link.TP.trabajoIntegrador.app.DTO.productoDTO;
import ar.edu.link.TP.trabajoIntegrador.app.repo.repoProducto;
import ar.edu.link.TP.trabajoIntegrador.app.repo.repoProductoI;
import ar.edu.link.tpIntegrador.Producto;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	@Qualifier("Mem")
	private repoProductoI repo;
	
	@GetMapping("")
	public Page<Producto> list(Pageable page) {
		
		List<Producto> all = new ArrayList<>(repo.all());
		
		int fromIndex = page.getPageNumber() * page.getPageSize();
		
		if(fromIndex + page.getPageSize()<all.size()) {
		return new PageImpl<Producto>(all.subList(fromIndex, fromIndex + page.getPageSize()), page, 2);
		}else {
		return new PageImpl<Producto>(all.subList(fromIndex, all.size()), page, 2);
		}
	}
	
	
	@GetMapping("/{nombre}")
	public Producto get(@PathVariable("nombre") String nombreProducto) {
		return repo.findByName(nombreProducto);
	}
	@GetMapping("/category={categoria}")
	public Collection<Producto> list(@PathVariable("categoria") String categoriaDeProducto){
		return repo.findByCategory(categoriaDeProducto);
	}
	
	@Transactional
	@PostMapping("")
	public void post(@RequestBody productoDTO producto) {
		repo.save2(producto);
	}
	@DeleteMapping("")
	public void delete(@RequestBody Producto producto,Pageable page) {
		List<Producto> all = new ArrayList<>(repo.all());
		
		all.clear();
		
	}
	
	
	
	
}
