package model;

public class Niveau {
	
	private int difficulte = 0;
	public Niveau(int _difficulte)
	{
		this.difficulte= _difficulte;

	}

	public int getDifficulte() {
		return difficulte;
	}
	
	public int setDifficulte(int diff) {
		difficulte = diff;
		return diff;
	}

}