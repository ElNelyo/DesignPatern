package model;

public enum TypeCase {
	
	vide("Vide"),
	mur("Mur");
	
	private String type;
	TypeCase(String _type){
		
		this.setType(_type) ;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
