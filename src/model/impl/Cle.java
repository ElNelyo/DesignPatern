package model.impl;

import model.AbstractObjet;

public class Cle extends AbstractObjet{

	public Cle() {
		super("Clé");
	}

	@Override
	public boolean estConsommable() {
		return false;
	}

	public boolean casePorte(Case caseActuelle) {
		boolean cle = false;
		
		if(caseActuelle instanceof Case_Porte) {
			cle = true;
			System.out.println("La clé va dévérouiller la porte");
		}
		else {
			cle = false;
			System.out.println("Déplacement vers la case");
		}
		
		return cle;
	}

}
