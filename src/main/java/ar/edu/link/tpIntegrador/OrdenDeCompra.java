package ar.edu.link.tpIntegrador;

import java.util.List;

public class OrdenDeCompra {
	
	private List<Producto> productosComprados;
	private double totalEnPesos;
	private double totalEnDolares;
	private int cantidadDeProductos;
	private String medioDePago;
	
	
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
	public double getTotalEnDolares() {
		return totalEnDolares;
	}
	public void setTotalEnDolares(double totalEnDolares) {
		this.totalEnDolares = totalEnDolares;
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
