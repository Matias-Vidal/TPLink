package ar.edu.link.tpIntegrador;

import java.util.List;

public class OrdenDeCompra {
	
	private List<Producto> productosComprados;
	private double totalEnPesos;
	private int cantidadDeProductos;
	private String medioDePago;
	
	
	
	public OrdenDeCompra(List<Producto> productosComprados, double totalEnPesos, int cantidadDeProductos,
			String medioDePago) {
		super();
		this.productosComprados = productosComprados;
		this.totalEnPesos = totalEnPesos;
		this.cantidadDeProductos = cantidadDeProductos;
		this.medioDePago = medioDePago;
	}
	public List<Producto> getProductosComprados() {
		return productosComprados;
	}
	public void setProductosComprados(List<Producto> productosComprados) {
		this.productosComprados = productosComprados;
	}
	public double getTotalEnPesos() {
		return totalEnPesos;
	}
	public void setTotalEnPesos(double totalEnPesos) {
		this.totalEnPesos = totalEnPesos;
	}
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}
	public String getMedioDePago() {
		return medioDePago;
	}
	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}
	
	
	
	
}
