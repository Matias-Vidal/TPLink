package ar.edu.link.tpIntegrador;

public class Promocion {
	
	private String nombreDePromo;
	private int codigoPromo;
	private int descuento;
	
	public int getCodigoPromo() {
		return codigoPromo;
	}
	public void setCodigoPromo(int codigoPromo) {
		this.codigoPromo = codigoPromo;
	}
	public String getNombreDePromo() {
		return nombreDePromo;
	}
	public void setNombreDePromo(String nombreDePromo) {
		this.nombreDePromo = nombreDePromo;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	public Promocion(String nombreDePromo, int codigoPromo, int descuento) {
		super();
		this.nombreDePromo = nombreDePromo;
		this.codigoPromo = codigoPromo;
		this.descuento = descuento;
	}
	
	
}
