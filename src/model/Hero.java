package model;

public class Hero implements Personnage {
	private int vie;
	private int armure;

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
		
	}

	/* (non-Javadoc)
	 * @see Personnage#mourir()
	 */
	@Override
	public void mourir() {
		// TODO Auto-generated method stub
		
	}
	
	

}
