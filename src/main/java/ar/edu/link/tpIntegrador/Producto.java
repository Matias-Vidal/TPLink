package ar.edu.link.tpIntegrador;

public class Producto {
	
	private String nombreDeProducto;
	private double precioUnitario;//Ya sea de cantidad o de peso
	private String divisa;//Si esta en dolares(U$D) o en pesos($)
	private String categoriaDeProducto;
	private Vendedor vendedor;
	
	
	
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public double getPrecioDolarEnPesos() {
		double precioDolar = 120.50;
		if(this.divisa.toLowerCase().equals("dolares")) {
			return precioUnitario * precioDolar;
		}else {
			return precioUnitario;
		}
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public String getDivisa() {
		return divisa;
	}
	public void setMonedaDeCambio(String divisa) {
		this.divisa = divisa;
	}
	public String getNombreDeProducto() {
		return nombreDeProducto;
	}
	public void setNombreDeProducto(String nombreDeProducto) {
		this.nombreDeProducto = nombreDeProducto;
	}
	
	public String getCategoriaDeProducto() {
		return categoriaDeProducto;
	}
	public void setCategoriaDeProducto(String categoriaDeProducto) {
		this.categoriaDeProducto = categoriaDeProducto;
	}
	public Producto(String nombreDeProducto, double precioUnitario, String divisa,
			String categoriaDeProducto) {
		super();
		this.nombreDeProducto = nombreDeProducto;
		this.precioUnitario = precioUnitario;
		this.divisa = divisa;
		this.categoriaDeProducto = categoriaDeProducto;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
}


