package model.impl;

import model.AbstractObjet;

public class Cle extends AbstractObjet{

	public Cle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		return "Clé";
	}

	@Override
	public boolean estConsommable() {
		return false;
	}


}
