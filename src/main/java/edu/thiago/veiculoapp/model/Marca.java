package edu.thiago.veiculoapp.model;

public enum Marca {

	CHEVROLET("Chevrolet"), FORD("Ford"), FIAT("Fiat"), VOLKSWAGEN("Volkswagen");

	String marca;

	private Marca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return marca;
	}

}
