package ar.edu.link.tpIntegrador;

import java.time.LocalDate;
import java.util.List;



public class Vendedor {

	private String nombreYApellido;
	private LocalDate fechaDeNacimiento;
	private String mail;
	private String tipoDeDocumento;
	private int nroDeDocumento;
	private int telefono;
	private List<Tarjeta> tarjetasGuardadas;
	private List<OrdenDeCompra> comprasRealizadas;
	private List<Producto> carritoDeCompras;
	private Carrito productosEnVenta;
	private int cuil;
	
	
	

	public String getNombreYApellido() {
		return nombreYApellido;
	}

	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTipoDeDocumento() {
		return tipoDeDocumento;
	}

	public void setTipoDeDocumento(String tipoDeDocumento) {
		this.tipoDeDocumento = tipoDeDocumento;
	}

	public int getNroDeDocumento() {
		return nroDeDocumento;
	}

	public void setNroDeDocumento(int nroDeDocumento) {
		this.nroDeDocumento = nroDeDocumento;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public List<Tarjeta> getTarjetasGuardadas() {
		return tarjetasGuardadas;
	}

	public void setTarjetasGuardadas(List<Tarjeta> tarjetasGuardadas) {
		this.tarjetasGuardadas = tarjetasGuardadas;
	}

	public List<OrdenDeCompra> getComprasRealizadas() {
		return comprasRealizadas;
	}

	public void setComprasRealizadas(List<OrdenDeCompra> comprasRealizadas) {
		this.comprasRealizadas = comprasRealizadas;
	}

	public List<Producto> getCarritoDeCompras() {
		return carritoDeCompras;
	}

	public void setCarritoDeCompras(List<Producto> carritoDeCompras) {
		this.carritoDeCompras = carritoDeCompras;
	}

	
	


	public int getCuil() {
		return cuil;
	}

	public void setCuil(int cuil) {
		this.cuil = cuil;
	}

	public Carrito getProductosEnVenta() {
		return productosEnVenta;
	}

	public void setProductosEnVenta(Carrito productosEnVenta) {
		this.productosEnVenta = productosEnVenta;
	}

	public Vendedor(String nombreYApellido, LocalDate fechaDeNacimiento, String mail, String tipoDeDocumento,
			int nroDeDocumento, int telefono, List<Tarjeta> tarjetasGuardadas, List<OrdenDeCompra> comprasRealizadas,
			List<Producto> carritoDeCompras, Carrito productosEnVenta, int cuil) {
		super();
		this.productosEnVenta = productosEnVenta;
		this.cuil = cuil;
	}
	
	
}
