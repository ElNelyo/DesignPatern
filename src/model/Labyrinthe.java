package model;

import java.util.ArrayList;

public class Labyrinthe {

	private int hauteur;
	private int largeur;
	private Case[][] casesLaby;
	private Case case_depart;
	private Case case_fin;

	public Labyrinthe(int _hauteur, int _largeur, Case[][] _caselaby, Case _case_depart, Case _case_fin) {
		this.hauteur = _hauteur;
		this.largeur = _largeur;
		this.casesLaby = _caselaby;
		this.case_depart = _case_depart;
		this.case_fin = _case_fin;
	}
	
	public Case deplacementHaut(){
		return case_depart;
		
	}
	
	public Case deplacementBas(){
		return case_depart;
		
	}
	
	public Case deplacementDroite(){
		return case_depart;
		
	}
	
	public Case deplacementGauche(){
		return case_depart;
		
	}

	public Case getCase_depart() {
		return case_depart;
	}

	public void setCase_depart(Case case_depart) {
		this.case_depart = case_depart;
	}

	public Case getCase_fin() {
		return case_fin;
	}

	public void setCase_fin(Case case_fin) {
		this.case_fin = case_fin;
	}

	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public Case[][] getCasesLaby() {
		return casesLaby;
	}

	public void setCasesLaby(Case[][] casesLaby) {
		this.casesLaby = casesLaby;
	}

}