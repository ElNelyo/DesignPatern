package model;

import java.util.ArrayList;
import java.util.List;

public class Hero implements Personnage {
	private int vie;
	private int armure;
	private final List<HeroObserver> observateurs = new ArrayList<>();
	private Case caseHero;
	
	 
	
	
	public void addObservateur(HeroObserver observateur){
		this.observateurs.add(observateur);
	}
	
	public void removeObservateur(HeroObserver observateur){
		this.observateurs.remove(observateur);
	}
	
	public int getVie() {
		return vie;
	}

	public int getArmure() {
		return armure;
	}

	public Hero(int _vie, int _armure, Case _caseHero) {
		this.vie = _vie;
		this.armure = _armure;
		this.caseHero = _caseHero;

	}

	public void setVie(int vie) {
		this.vie = vie;
	}

	public void setArmure(int armure) {
		this.armure = armure;
	}


	/* (non-Javadoc)
	 * @see Personnage#deplacer()
	 */
	@Override
	public void deplacer() {
		// TODO Auto-generated method stub
		
		for (HeroObserver heroObserver : observateurs) {
			heroObserver.le_hero_a_ete_deplace();
		}
	}

	/* (non-Javadoc)
	 * @see Personnage#mourir()
	 */
	@Override
	public void mourir() {
		// TODO Auto-generated method stub
		
	}
	
	public Case getCaseHero() {
		return caseHero;
	}

	public void setCaseHero(Case caseHero) {
		this.caseHero = caseHero;
	}

	public static interface HeroObserver{
		public void le_hero_a_ete_deplace();
	}; 
	

	

}
