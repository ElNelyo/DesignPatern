package model;
import java.util.ArrayList;

public class Labyrinthe {

	
	private int hauteur;
	private int largeur;
	private Case[][] casesLaby;
	private Case case_depart;
	private Case case_fin;
	public Labyrinthe(int _hauteur, int _largeur, Case[][] _caselaby, Case _case_depart,Case _case_fin)
	{
		this.hauteur = _hauteur;
		this.largeur = _largeur;
		this.casesLaby = _caselaby;
		this.case_depart = _case_depart;
		this.case_fin = _case_fin;
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