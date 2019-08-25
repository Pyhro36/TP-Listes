package ListesChainees;

/**
 * Classe de l'element personnage d'une liste chainee film, defini par le nom du personnage, l'acteur qui le joue et l'annee de naissance de celui-ci
 * @author Pierre-Louis
 * @version 1.2
 */

public class LElement {
	
	private String character;
	private String actor;
	private int birthyear;
	
	public LElement next;
	
	/**
	 * Constructeur par defaut de l'element personnage : character et actor vides, birthyear nulle
	 */
	
	public LElement (){
		
		this.character = "";
		this.actor = "";
		this.birthyear = 0;
		
		this.next = null;
	}
	
	/**
	 * Constructeur de l'element personnage a partir des caracteristiques donnees en parametres
	 * @param character le personnage du film
	 * @param actor l'acteur qui joue le personnage
	 * @param birthyear l'annee de naissance de l'acteur
	 */
	
	public LElement (String character, String actor, int birthyear){
		
		this.character = character;
		this.actor = actor;
		this.birthyear = birthyear;
		
		this.next = null;
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
