package ar.edu.link.TP.trabajoIntegrador.app.DTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import com.jayway.jsonpath.internal.function.numeric.Sum;

@Entity
public class Carrito {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@OneToMany
	private List<productoDTO> productosEnCarrito;
	@NotBlank
	private double subTotal;
	
	private double total;
	
	public List<productoDTO> getProductosEnCarrito() {
		return productosEnCarrito;
	}
	public void setProductosEnCarrito(List<productoDTO> productosEnCarrito) {
		this.productosEnCarrito = productosEnCarrito;
	}
	public double total() {
		return subTotal;
	}
	public double getSubTotal() {
		for(int i=0; i<productosEnCarrito.size();i++) {
			subTotal += productosEnCarrito.get(i).CostoEnPesos();
		}
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public double aplicarDescuento() {
		return subTotal*0.8 ;
	}
	public void agregarProducto(productoDTO unProducto) {
		productosEnCarrito.add(unProducto);
		subTotal += unProducto.CostoEnPesos();
	}
	public void quitarProducto(productoDTO unProducto) {
		productosEnCarrito.remove(unProducto);
		subTotal -=unProducto.CostoEnPesos();
		
	}
	public Carrito() {
		super();
		List<productoDTO> p = new ArrayList();
		this.productosEnCarrito = p ;
		this.subTotal = 0;
	}
	public void clear() {
		productosEnCarrito.clear();
		subTotal =0;
		
	}
	public void agregarProducto(Optional<productoDTO> optional) {
		// TODO Auto-generated method stub
		
	}
	public double getTotal() {
		return this.aplicarDescuento();
	}
	public void setTotal(double elTotal) {
		total = elTotal;
	}
	
	
}
