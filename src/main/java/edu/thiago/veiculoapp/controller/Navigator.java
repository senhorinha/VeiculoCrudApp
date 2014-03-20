package edu.thiago.veiculoapp.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "navigator")
@SessionScoped
public class Navigator {
	private final String pageToNavigate = "";

	public String navigateTo() {
		if ("ToSecure".equalsIgnoreCase(pageToNavigate)) {
			return "Secured";
		} else if ("ToUnSecure".equalsIgnoreCase(pageToNavigate)) {
			return "UnSecured";
		} else {
			// This will never happen but we will use this to extend this
			// application
			return "none";
		}
	}

	public String navegarParaPaginaAdmin() {
		return "indexAdmin";
	}

	public String navegarParaPaginaNormal() {
		return "indexAll";
	}

}