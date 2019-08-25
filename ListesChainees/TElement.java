package ListesChainees;

/**
 * Classe de l'element personnage d'une liste - arbre film, defini par le nom du personnage, l'acteur qui le joue et l'annee de naissance de celui-ci
 * @author Pierre-Louis
 * @version 1.1
 */

public class TElement { 
	
	 private String character; // Les valeurs a stocker
	 private String actor;
	 private int birthyear;
	 public TElement left, right; 
	 
	 /**
	  * Constructeur par defaut de l'element, nom de personnage et d'acteur vide, annee de naissance de l'acteur egale a zero
	  */
	 
	public TElement() {
		
		this.character = "";
		this.actor = "";
		this.birthyear = 0;
		this.left = null;
		this.right = null;
	}
	
	/**
	 * constructeur parametre de l'element
	 * @param c le nom du personnage
	 * @param a le nom de l'acteur
	 * @param y l'annee de naissance de l'acteur
	 */
	
	public TElement(String c, String a, int y)  {
		
		this.character = c;
		this.actor = a;
		this.birthyear = y;
		this.left = null;
		this.right = null;
	}
	
	public String toString(){
		
		return this.character +" is played by "+this.actor+ " born in "+String.valueOf(this.birthyear);
	}
	
	public String getCharacter(){
		
		return this.character;
	}
	
	public String getActor(){
		
		return this.actor;
	}
	
	public int getBirthyear(){
		
		return this.birthyear;
	}
}
