package ar.edu.link.tpIntegrador;

public class Producto {
	
	private String nombreDeProducto;
	private double precioUnitario;//Ya sea de cantidad o de peso
	private String monedaDeCambio;//Si esta en dolares(U$D) o en pesos($)
	private String descripcionDeProducto;
	
	
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public String getMonedaDeCambio() {
		return monedaDeCambio;
	}
	public void setMonedaDeCambio(String monedaDeCambio) {
		this.monedaDeCambio = monedaDeCambio;
	}
	public String getNombreDeProducto() {
		return nombreDeProducto;
	}
	public void setNombreDeProducto(String nombreDeProducto) {
		this.nombreDeProducto = nombreDeProducto;
	}
	public String getDescripcionDeProducto() {
		return descripcionDeProducto;
	}
	public void setDescripcionDeProducto(String descripcionDeProducto) {
		this.descripcionDeProducto = descripcionDeProducto;
	}
	public Producto(String nombreDeProducto, double precioUnitario, String monedaDeCambio,
			String descripcionDeProducto) {
		super();
		this.nombreDeProducto = nombreDeProducto;
		this.precioUnitario = precioUnitario;
		this.monedaDeCambio = monedaDeCambio;
		this.descripcionDeProducto = descripcionDeProducto;
	}
	
	public Producto auto = new Producto("Auto", 100000, "Dolares", "Vehiculo");
}


