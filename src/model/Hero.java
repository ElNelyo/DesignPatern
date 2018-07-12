package model;

import java.util.ArrayList;
import java.util.List;

public class Hero implements Personnage {
	private int vie;
	private int armure;
	private final List<HeroObserver> observateurs = new ArrayList<>();
	
	 
	
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

	public Hero(int _vie, int _armure) {
		this.vie = _vie;
		this.armure = _armure;

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
	
	public static interface HeroObserver{
		public void le_hero_a_ete_deplace();
	}; 
	
	

}
