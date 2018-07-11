import model.*;


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
				{new Mur(),new Mur(),new Mur(),new Mur(),new Mur(),new Mur(),new Mur(),new Mur(),new Mur()}	
					};	
				
		     	Labyrinthe labyrinthe = new Labyrinthe(9,9,tabCases,tabCases[1][1],tabCases[5][7]);
				Hero joueur = new Hero(100,0);
		     	Niveau[] niveau = {new Niveau(0)};

		     	jeu = new Jeu(niveau);		 
		     	jeu.start();

		     	for(Case caselab[] : labyrinthe.getCasesLaby()){
		     		for(Case caserow : caselab){
		     			System.out.println(caserow);
		     		}
		     	}

		     	System.out.println("Joueur crée avec "+joueur.getVie()+"pts de vie et "+joueur.getArmure()+"pts d'armure");

		     	if(IsKeyPressed.isWPressed()) {)
		     	jeu.keyPressed();


		}
		
	}
	
	

}
