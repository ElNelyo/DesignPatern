import model.Case;
import model.Case_Vide;
import model.Jeu;
import model.Labyrinthe;
import model.Mur;

public class main {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jeu jeu = null;
		
		if(jeu==null){
			
			Case[][] tabCases = new Case[][] {
				{new Mur(),new Mur(),new Mur(),new Mur(),new Mur(),new Mur(),new Mur(),new Mur(),new Mur()},
				{new Mur(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Mur()},
				{new Mur(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Mur()},
				{new Mur(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Mur()},
				{new Mur(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Mur()},
				{new Mur(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Mur()},
				{new Mur(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Mur()},
				{new Mur(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Case_Vide(),new Mur()},
				{new Mur(),new Mur(),new Mur(),new Mur(),new Mur(),new Mur(),new Mur(),new Mur(),new Mur()}	};		
		     	Labyrinthe labyrinthe = new Labyrinthe(9,9,tabCases);
			
		     	jeu = new Jeu();		 
		     	jeu.start();
			
		     	System.out.println(labyrinthe.getCasesLaby());
			
		}
		
	}
	
	

}
