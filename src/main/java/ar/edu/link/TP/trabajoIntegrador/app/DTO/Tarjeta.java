package ar.edu.link.TP.trabajoIntegrador.app.DTO;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Repository;

@Entity
public class Tarjeta {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ID;
	@NotBlank
	private String nombreDeTitular; //Como aparece en la tarjeta
	@NotBlank
	private int numeroDeTarjeta; // 16 Digitos
	private String tipoDeTarjeta; // Credito o Debito
	private String bancoEmisor; 
	private int codigoDeSeguridad;// Los 3 digitos del dorso
	private String companiaFinanciera;//visa o mastercard
	
	
	public Tarjeta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNombreDeTitular() {
		return nombreDeTitular;
	}
	public void setNombreDeTitular(String nombreDeTitular) {
		this.nombreDeTitular = nombreDeTitular;
	}
	public int getNumeroDeTarjeta() {
		return numeroDeTarjeta;
	}
	public void setNumeroDeTarjeta(int numeroDeTarjeta) {
		this.numeroDeTarjeta = numeroDeTarjeta;
	}
	public String getTipoDeTarjeta() {
		return tipoDeTarjeta;
	}
	public void setTipoDeTarjeta(String tipoDeTarjeta) {
		this.tipoDeTarjeta = tipoDeTarjeta;
	}
	public String getBancoEmisor() {
		return bancoEmisor;
	}
	public void setBancoEmisor(String bancoEmisor) {
		this.bancoEmisor = bancoEmisor;
	}
	public int getCodigoDeSeguridad() {
		return codigoDeSeguridad;
	}
	public void setCodigoDeSeguridad(int codigoDeSeguridad) {
		this.codigoDeSeguridad = codigoDeSeguridad;
	}
	public String getCompaniaFinanciera() {
		return companiaFinanciera;
	}
	public void setCompaniaFinanciera(String companiaFinanciera) {
		this.companiaFinanciera = companiaFinanciera;
	}
	public Tarjeta(String nombreDeTitular, int numeroDeTarjeta, String tipoDeTarjeta, String bancoEmisor,
			int codigoDeSeguridad, String companiaFinanciera) {
		super();
		this.nombreDeTitular = nombreDeTitular;
		this.numeroDeTarjeta = numeroDeTarjeta;
		this.tipoDeTarjeta = tipoDeTarjeta;
		this.bancoEmisor = bancoEmisor;
		this.codigoDeSeguridad = codigoDeSeguridad;
		this.companiaFinanciera = companiaFinanciera;
	}
	
	
	
}
