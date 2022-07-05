package ar.edu.link.TP.trabajoIntegrador.app.DTO;



public class Vendedor {

	private String alias;
	private String mail;
	private int telefono;
	private Carrito productosEnVenta;
	
	
	

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}


	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public Carrito getProductosEnVenta() {
		return productosEnVenta;
	}

	public void setProductosEnVenta(Carrito productosEnVenta) {
		this.productosEnVenta = productosEnVenta;
	}
	public void agregarProductoEnVenta(productoDTO producto) {
		this.productosEnVenta.agregarProducto(producto);
	}
	public Vendedor(String alias, String mail, int telefono,
			Carrito productosEnVenta) {
		super();
		this.alias = alias;
		this.mail = mail;
		this.telefono = telefono;
		this.productosEnVenta = productosEnVenta;
	}

	
	
	
}
