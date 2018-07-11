package model;
import java.awt.event.KeyEvent;
import java.util.Scanner;


public class Jeu { 
 private Niveau[] niveaux;
 
 
public Jeu(Niveau[] niveaux){
	this.niveaux = niveaux;
}
public void start(){ 
	
	// List de niveau , 
	// Matrice du labyrinthe : case d'entrée de sortie
	// Case recoit le niveau
	
} 
 
public void stop(){ 
   
} 
 
public void endLevel(){ 
   
} 
 
public void listNiveaux(){ 
   
}

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            System.out.println("Gauche");
        }

        if (key == KeyEvent.VK_RIGHT) {
            System.out.println("Droite");
        }

        if (key == KeyEvent.VK_UP) {
            System.out.println("Haut");
        }

        if (key == KeyEvent.VK_DOWN) {
            System.out.println("Bas");
        }
    }


   
} 