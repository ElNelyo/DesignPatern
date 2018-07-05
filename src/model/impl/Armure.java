package model.impl;

import model.AbstractObjet;

public class Armure extends AbstractObjet{

	public Armure(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		return "Armure";
	}

	@Override
	public boolean estConsommable() {
		return false;
	}

}
