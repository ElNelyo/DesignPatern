package model;

public abstract class AbstractObjet implements Objet {

	private final String name;
	
	public AbstractObjet(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
	
}
