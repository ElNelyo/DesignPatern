package model.impl;

import model.AbstractObjet;

public class Vie extends AbstractObjet{

	private int value;
	
	public Vie(String name) {
		super(name);
	}

	@Override
	public String getName() {
		return "Vie";
	}

	@Override
	public boolean estConsommable() {
		return true;
	}
	
	private int getValue() {
		return value;
	}
	
	private void setValue(int value) {
		this.value = value;
	}

	
	
}
