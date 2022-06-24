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
	public void aplicarDescuento(int descuento) {
		subTotal *= (descuento/100);
	}
	public void agregarProducto(Producto unProducto) {
		productosEnCarrito.add(unProducto);
		subTotal += unProducto.CostoEnPesos();
	}
	public void quitarProducto(Producto unProducto) {
		productosEnCarrito.remove(unProducto);
		subTotal -=unProducto.CostoEnPesos();
		
	}
	public Carrito() {
		super();
		List<Producto> p = new ArrayList();
		this.productosEnCarrito = p ;
		this.subTotal = 0;
	}
	
	
}
