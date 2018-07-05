package model;
import java.util.ArrayList;

public class Labyrinthe {

	
	private int hauteur;
	private int largeur;
	private ArrayList<Case> casesLaby;
	
	public Labyrinthe(int _hauteur, int _largeur)
	{
		this.hauteur = _hauteur;
		this.largeur = _largeur;
		this.setCasesLaby(new ArrayList<>(_hauteur*_largeur));
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


	public ArrayList<Case> getCasesLaby() {
		return casesLaby;
	}


	public void setCasesLaby(ArrayList<Case> casesLaby) {
		this.casesLaby = casesLaby;
	}
	
	
	
}
