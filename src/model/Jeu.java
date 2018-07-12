package model;

import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Jeu {
	private Niveau[] niveaux;

	public Jeu(Niveau[] niveaux) {
		this.niveaux = niveaux;
	}

	public void start() {

		// List de niveau ,
		// Matrice du labyrinthe : case d'entrée de sortie
		// Case recoit le niveau

	}

	public void stop() {

	}

	public void endLevel() {

	}

	public void listNiveaux() {

	}

	public void deplacer(Hero joueur) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		switch (str) {
		case "z":
			System.out.println("Deplacement vers le haut");
			joueur.deplacer();
			
			
			break;
		case "q":
			System.out.println("Deplacement vers la gauche");
			break;
		case "d":
			System.out.println("Deplacement vers le droite");
			break;
		case "s":
			System.out.println("Deplacement vers le bas");
			break;

		default:
			System.out.println("Mauvaise touche (Z,Q,S,D)");
			break;
		}

	}
	public void placer_joueur(Labyrinthe labyrinthe, Personnage perso){
		labyrinthe.getCase_depart();
		
		
	}
	public void generer_labyrinthe(Case[][] tabCases, Labyrinthe labyrinthe) {

		int count = 1;
		for (Case caselab[] : labyrinthe.getCasesLaby()) {
			for (Case caserow : caselab) {
				if (count < 9) {

					if (caserow instanceof Case_Vide) {
						if(caserow == labyrinthe.getCase_depart()) {
							System.out.print("[O]");
							count++;
						} else {
							System.out.print("[ ]");
							count++;
						}
					}
					
					else {
						System.out.print("[X]");
						count++;
					}

				} else {
					System.out.println("[X]");
					count = 1;

				}

			}

		}
	}
}