package ar.edu.link.TP.trabajoIntegrador.app;

import java.text.Normalizer.Form;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Compra")
public class ProcesoCompraController {
	
	
	public Form compra;
}
