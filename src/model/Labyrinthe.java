package model;
import java.util.ArrayList;

public class Labyrinthe {

	
	private int hauteur;
	private int largeur;
	private Case[][] casesLaby;
	
	public Labyrinthe(int _hauteur, int _largeur)
	{
		this.hauteur = _hauteur;
		this.largeur = _largeur;
		this.casesLaby = new Case[hauteur][largeur];
	}

	
	
	public void niveau_test(){
		Case[][] tabCases = new Case[][] {
			{new Mur(),new Mur(),new Mur(),new Mur(),new Mur(),new Mur(),new Mur(),new Mur(),new Mur()},
			{new Mur(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Mur()},
			{new Mur(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Mur()},
			{new Mur(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Mur()},
			{new Mur(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Mur()},
			{new Mur(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Mur()},
			{new Mur(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Mur()},
			{new Mur(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Mur()},
			{new Mur(),new Mur(),new Mur(),new Mur(),new Mur(),new Mur(),new Mur(),new Mur(),new Mur()}	};
				 
			setCasesLaby(tabCases);
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