package model.impl;

import model.AbstractObjet;

public class Cle extends AbstractObjet{

	public Cle() {
		super("Cl�");
	}

	@Override
	public boolean estConsommable() {
		return false;
	}

	public boolean casePorte(Case caseActuelle) {
		boolean cle = false;
		
		if(caseActuelle instanceof Case_Porte) {
			cle = true;
			System.out.println("La cl� va d�v�rouiller la porte");
		}
		else {
			cle = false;
			System.out.println("D�placement vers la case");
		}
		
		return cle;
	}

}
