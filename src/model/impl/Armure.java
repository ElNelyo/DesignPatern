package model.impl;

import model.AbstractObjet;

public class Armure extends AbstractObjet{

	public Armure() {
		super("Armure");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean estConsommable() {
		return false;
	}

}
