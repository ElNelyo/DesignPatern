package model;
import java.util.ArrayList;

public class Labyrinthe {

	
	private int hauteur;
	private int largeur;
	private Case[][] casesLaby;
	
	public Labyrinthe(int _hauteur, int _largeur, Case[][] _caselaby)
	{
		this.hauteur = _hauteur;
		this.largeur = _largeur;
		this.casesLaby = _caselaby;
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