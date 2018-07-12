package model.impl;

import model.AbstractObjet;
import model.Arme;
import model.Objet;

public class Epee extends Arme {

	public Epee(String name, int pointsDegats) {
		super("Epée", pointsDegats);
	}

	@Override
	public String attaqueArme() {
		// TODO Auto-generated method stub
		return super.attaqueArme() + " Epee - " + getPointsDegats();
	}

	@Override
	public String getName() {
		return "Epée";
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