package model;

import interfaces.IUsuario;

public class Usuario implements IUsuario {
	private String name;
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name=name;
	}

}
