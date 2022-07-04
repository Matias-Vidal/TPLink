package ar.edu.link.TP.trabajoIntegrador.app.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;

import ar.edu.link.tpIntegrador.Vendedor;

@Entity
public class productoDTO {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@NotBlank
	private String nombreDeProducto;
	
	private double precioUnitario;//Ya sea de cantidad o de peso
	@NotBlank
	private String divisa;//Si esta en dolares(U$D) o en pesos($)
	@NotBlank
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
	public productoDTO(String nombreDeProducto, double precioUnitario, String divisa,
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


