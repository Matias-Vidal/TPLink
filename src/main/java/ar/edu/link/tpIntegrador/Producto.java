package ar.edu.link.tpIntegrador;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="Productos")
public class Producto {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Integer id;
	
	@NotBlank
	@Column(name="nombreProducto")
	private String nombreDeProducto;
	@NotBlank
	@Column(name="precioUnitario")
	private double precioUnitario;//Ya sea de cantidad o de peso
	@NotBlank
	@Column(name="divisa")
	private String divisa;//Si esta en dolares(U$D) o en pesos($)
	@NotBlank
	@Column(name="categoria")
	private String categoriaDeProducto;
	@Transient
	private Vendedor vendedor;
	
	
	
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public double CostoEnPesos() {
		double precioDolar = 130.50;
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


