/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Guillaume
 *
 */
public abstract class AbstractPersonnage implements Personnage {
	
	/* ATTRIBUTS */
	
	/**
	 * Nom du <code>Personnage</code>
	 */
	private String nom;
	
	/**
	 * Vie du <code>Personnage</code>
	 */
	private int vie;
	
	/**
	 * Les objets du <code>Personnage</code>
	 */
	private List<Objet> objets = new ArrayList<Objet>();
	
	
	
	/* SETTERS */
	
	/**
	 * @param nom the nom to set
	 */
	private void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * @param vie the vie to set
	 */
	private void setVie(int vie) {
		this.vie = vie;
	}
	
	/**
	 * @param objets the objets to set
	 */
	private void setObjets(List<Objet> objets) {
		this.objets = objets;
	}
	
	/* GETTERS */ 
	
	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public int getVie() {
		return vie;
	}

	@Override
	public List<Objet> getObjets() {
		return objets;
	}

}
