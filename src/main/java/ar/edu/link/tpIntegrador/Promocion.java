package ar.edu.link.tpIntegrador;

public class Promocion {
	
	private String nombreDePromo;
	private int codigoPromo;
	private String tipoDePromo;
	private String productosIncluidos;
	
	public int getCodigoPromo() {
		return codigoPromo;
	}
	public void setCodigoPromo(int codigoPromo) {
		this.codigoPromo = codigoPromo;
	}
	public String getProductosIncluidos() {
		return productosIncluidos;
	}
	public void setProductosIncluidos(String productosIncluidos) {
		this.productosIncluidos = productosIncluidos;
	}
	public String getNombreDePromo() {
		return nombreDePromo;
	}
	public void setNombreDePromo(String nombreDePromo) {
		this.nombreDePromo = nombreDePromo;
	}
	public String getTipoDePromo() {
		return tipoDePromo;
	}
	public void setTipoDePromo(String tipoDePromo) {
		this.tipoDePromo = tipoDePromo;
	}
	public Promocion(String nombreDePromo, int codigoPromo, String tipoDePromo, String productosIncluidos) {
		super();
		this.nombreDePromo = nombreDePromo;
		this.codigoPromo = codigoPromo;
		this.tipoDePromo = tipoDePromo;
		this.productosIncluidos = productosIncluidos;
	}
	
	
}
