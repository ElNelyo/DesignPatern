package model;
import java.util.Scanner;


public class Jeu { 
 
public void start(){ 
	Scanner reader = new Scanner(System.in);  // Reading from System.in
	System.out.println("Entrer votre nom");
	String name = reader.next(); // Scans the next token of the input as an int.
	reader.close();
	System.out.println("Nom choisi : "+name);
} 
 
public void stop(){ 
   
} 
 
public void endLevel(){ 
   
} 
 
public void listNiveaux(){ 
   
} 
   
} 