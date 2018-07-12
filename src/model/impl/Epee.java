package model.impl;

import model.AbstractObjet;
import model.Arme;
import model.Objet;

public class Epee extends Arme {

	public Epee(String name, int pointsDegats) {
		super("Ep�e", pointsDegats);
	}

	@Override
	public String attaqueArme() {
		// TODO Auto-generated method stub
		return super.attaqueArme() + " Epee - " + getPointsDegats();
	}

	@Override
	public String getName() {
		return "Ep�e";
	}

	@Override
	public int getPointsDegats() {
		return super.getPointsDegats();
	}

	@Override
	public boolean estConsommable() {
		return false;
	}
}