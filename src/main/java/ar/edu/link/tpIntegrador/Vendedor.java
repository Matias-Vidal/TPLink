package ar.edu.link.tpIntegrador;

import java.util.List;

public class Vendedor extends Cliente {
	
	private List<Producto> productosEnVenta;
	private int cuil;
	
	public List<Producto> getProductosEnVenta() {
		return productosEnVenta;
	}

	public void setProductosEnVenta(List<Producto> productosEnVenta) {
		this.productosEnVenta = productosEnVenta;
	}

	public int getCuil() {
		return cuil;
	}

	public void setCuil(int cuil) {
		this.cuil = cuil;
	}

	public Vendedor(String nombreYApellido, String mail, String tipoDeDocumento, int nroDeDocumento, int telefono,
			List<Tarjeta> tarjetasGuardadas, List<OrdenDeCompra> comprasRealizadas, List<Producto> carritoDeCompras) {
		super(nombreYApellido, mail, tipoDeDocumento, nroDeDocumento, telefono, tarjetasGuardadas, comprasRealizadas,
				carritoDeCompras);
		// TODO Auto-generated constructor stub
	}
	
	
}
