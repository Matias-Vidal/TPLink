package ar.edu.link.tpIntegrador;

import java.util.List;

public class Cliente extends Usuario{
	
	private String nombreYApellido;
	private String mail;
	private String tipoDeDocumento;
	private int nroDeDocumento;
	private int telefono;
	private List<Tarjeta> tarjetasGuardadas;
	private List<OrdenDeCompra> comprasRealizadas;
	private List<Producto> carritoDeCompras;
	
	
	public String getNombreYApellido() {
		return nombreYApellido;
	}
	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
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
	public void agregarProductoACarrito(Producto unProducto) {
		carritoDeCompras.add(unProducto);
	}
	public Cliente(String nombreYApellido, String mail, String tipoDeDocumento, int nroDeDocumento, int telefono,
			List<Tarjeta> tarjetasGuardadas, List<OrdenDeCompra> comprasRealizadas, List<Producto> carritoDeCompras) {
		super();
		this.nombreYApellido = nombreYApellido;
		this.mail = mail;
		this.tipoDeDocumento = tipoDeDocumento;
		this.nroDeDocumento = nroDeDocumento;
		this.telefono = telefono;
		this.tarjetasGuardadas = tarjetasGuardadas;
		this.comprasRealizadas = comprasRealizadas;
		this.carritoDeCompras = carritoDeCompras;
	}
	
	
	
	
	
}
