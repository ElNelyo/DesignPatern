package model;
import java.util.Scanner;


public class Jeu { 
 private Niveau[] niveaux;
 
 
public void Jeu(Niveau[] niveaux){
	this.niveaux = niveaux;
}
public void start(){ 
	Labyrinthe labyrinthe = new Labyrinthe(9,9);
	labyrinthe.niveau_test();
	System.out.println(labyrinthe.getCasesLaby());
	
	
	// List de niveau , 
	// Matrice du labyrinthe : case d'entr�e de sortie 
	// Case recoit le niveau
	
} 
 
public void stop(){ 
   
} 
 
public void endLevel(){ 
   
} 
 
public void listNiveaux(){ 
   
} 
   
} 