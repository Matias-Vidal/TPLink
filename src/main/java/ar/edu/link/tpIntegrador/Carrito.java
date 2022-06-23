package ar.edu.link.tpIntegrador;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
	
	private List<Producto> productosEnCarrito;
	private double subTotal;
	
	public List<Producto> getProductosEnCarrito() {
		return productosEnCarrito;
	}
	public void setProductosEnCarrito(List<Producto> productosEnCarrito) {
		this.productosEnCarrito = productosEnCarrito;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public void agregarProducto(Producto unProducto) {
		productosEnCarrito.add(unProducto);
		subTotal += unProducto.getPrecioDolarEnPesos();
	}
	public void quitarProducto(Producto unProducto) {
		productosEnCarrito.remove(unProducto);
		subTotal -=unProducto.getPrecioDolarEnPesos();
		
	}
	public Carrito() {
		super();
		List<Producto> p = new ArrayList();
		this.productosEnCarrito = p ;
		this.subTotal = 0;
	}
	
	
	
}
