package ar.edu.link.TP.trabajoIntegrador.app.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

import ar.edu.link.tpIntegrador.Promocion;

@Repository
public class repoPromocion {

	
	private Collection<Promocion> promociones;
	
	public repoPromocion(){
		super();
		List<Promocion> of = Arrays.asList(new Promocion("Descuento tarjeta de Credito", 12, 25));
		promociones = new ArrayList<>(of);
	}
	
	public Promocion findByName(String promocion) {
		return promociones.stream().filter(x -> x.getNombreDePromo().toLowerCase()
				.equals(promocion.toLowerCase())).findFirst().get();
	}

	public Collection<Promocion> all() {
		return promociones;
	}
}
