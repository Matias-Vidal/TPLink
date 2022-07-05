package ar.edu.link.TP.trabajoIntegrador.app.DTO;

import java.util.List;

public class OrdenDeCompra {
	
	private List<productoDTO> productosComprados;
	private double totalEnPesos;
	private int cantidadDeProductos;
	private String medioDePago;
	
	
	
	public OrdenDeCompra(List<productoDTO> productosComprados, double totalEnPesos, int cantidadDeProductos,
			String medioDePago) {
		super();
		this.productosComprados = productosComprados;
		this.totalEnPesos = totalEnPesos;
		this.cantidadDeProductos = cantidadDeProductos;
		this.medioDePago = medioDePago;
	}
	public List<productoDTO> getProductosComprados() {
		return productosComprados;
	}
	public void setProductosComprados(List<productoDTO> productosComprados) {
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
