package edu.thiago.veiculoapp.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "navegador")
@SessionScoped
public class Navegador {

	public String navegarParaPaginaAdmin() {
		return "indexAdmin";
	}

	public String navegarParaPaginaNormal() {
		return "indexAll";
	}

}