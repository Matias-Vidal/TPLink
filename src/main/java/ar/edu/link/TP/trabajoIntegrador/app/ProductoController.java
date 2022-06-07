package ar.edu.link.TP.trabajoIntegrador.app;

import java.util.List;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.link.tpIntegrador.Producto;



@RestController
@RequestMapping("/producto")
public class ProductoController {
	
//	@Autowired
//	private repoProducto repo;
	
	@GetMapping("/auto")
	public Producto vehiculo() {
		return new Producto("Auto",1000,"Dolares","Vehiculo");
	}
	
//	@GetMapping("/{nombre}")
//	public Producto get(@PathVariable("nombre") String nombre) {
//		new List.of(new Producto("Auto",1000,"Dolares","Vehiculo"));
//	}
	
	
	
}
