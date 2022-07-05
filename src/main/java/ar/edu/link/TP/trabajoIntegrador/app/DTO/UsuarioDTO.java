package ar.edu.link.TP.trabajoIntegrador.app.DTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.thymeleaf.expression.Arrays;




@Entity
public class UsuarioDTO {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ID;
	
	private String userName; 
	private String password;
	private int rol;
	private String nombreYApellido;
	private String mail;
	private String tipoDeDocumento;
	private int nroDeDocumento;
	
	@OneToMany
	private List<Tarjeta> tarjetasGuardadas;
	
	@Transient
	private List<OrdenDeCompra> comprasRealizadas;
	@OneToOne
	private Carrito carritoDeCompras;
	
	public UsuarioDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UsuarioDTO(String userName, String password, int rol, String nombreYApellido, String mail,
			String tipoDeDocumento, int nroDeDocumento) {
		super();
		this.userName = userName;
		this.password = password;
		this.rol = rol;
		this.nombreYApellido = nombreYApellido;
		this.mail = mail;
		this.tipoDeDocumento = tipoDeDocumento;
		this.nroDeDocumento = nroDeDocumento;
		this.tarjetasGuardadas = new ArrayList<Tarjeta>();
		this.comprasRealizadas = new ArrayList<OrdenDeCompra>();
		this.carritoDeCompras = new Carrito();
	}
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
	public Carrito getCarritoDeCompras() {
		return carritoDeCompras;
	}
	public void agregarProductoACarrito(productoDTO optional) {
		carritoDeCompras.agregarProducto(optional);
	}
	public void setCarritoDeCompras(Carrito carritoDeCompras) {
		this.carritoDeCompras = carritoDeCompras;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String password() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRol() {
		switch (rol) {
		case 1:
			return "Admin";
		default:
			return "cliente";
		}
	}
	public void setRol(int rol) {
		this.rol = rol;
	}
	public void addCompra(OrdenDeCompra compra) {
		comprasRealizadas.add(compra);
		
	}
	
	
	
}
