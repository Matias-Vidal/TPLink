package ar.edu.link.TP.trabajoIntegrador.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import ar.edu.link.TP.trabajoIntegrador.app.repo.repoUsuario;


@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	public repoUsuario repoUser;
	
	@GetMapping("")
	public String get() {
		return "login";
	}
	
	@PostMapping("")
	public RedirectView post(String username, String password, int rol) {
		if(repoUser.findByName(username).getUserName().equals(username)){
			return new RedirectView("/UI/producto");
		}
			else{
				return new RedirectView("");
			}
		}
	}

