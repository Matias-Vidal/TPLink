package ar.edu.link.TP.trabajoIntegrador.app.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

import ar.edu.link.tpIntegrador.Carrito;
import ar.edu.link.tpIntegrador.Vendedor;

@Repository
public class repoVendedor {
	
private Collection<Vendedor> vendedores;
	
	public repoVendedor() {
		super();
		List<Vendedor> of = Arrays.asList(new Vendedor("Jorge", "ventas@nike.com", 1152368000, new Carrito()));
		vendedores = new ArrayList<>(of);
	}
	public Collection<Vendedor> all(){
		return vendedores;
	}
	public Vendedor findByName(String alias) {
		return vendedores.stream().filter(x -> x.getAlias().toLowerCase()
				.equals(alias.toLowerCase())).findFirst().get();
	}
	
}
