package model;

public abstract class Arme extends AbstractObjet {

	private int pointsDegats;
	
	public int getPointsDegats() {
		return pointsDegats;
	}

	public Arme(String name, int pointsDegats) {
		super(name);
		this.pointsDegats = pointsDegats;
	}
	
	public String attaqueArme() {
		return "Attaque Arme : ";
	}
}
