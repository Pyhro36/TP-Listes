package ListesChainees;

/**
 * Classe de la liste chainee film composee des personnages du film
 * @author Pierre-Louis
 * @version 1.1
 */

public class List {
	
	private int length;
	private String name;
	private LElement root;
	
	/**
	 * Constructeur par defaut de la liste : liste vide sans nom
	 */

	public List() {
		
		this.length = 0;
		this.root = null;
		this.name = "";
		
	}
	
	/**
	 * Constructeur de la liste parametree, vide d'abord
	 * @param name le nom de la liste (celui du film)
	 */
	
	public List(String name) {
		
		this.length = 0;
		this.root = null;
		this.name = name;
		
	}
	
	public int getLength(){
		
		return this.length;
	}
	
	public String getName(){
		
		return this.name;
	}
	
	public void setName(String name){
		
		this.name = name;
	}
	
	public String toString(){
		
		return name;
	}
	
	/**
	 * methode d'insertion d'un element personnage au debut de la liste
	 * @param character nom du personnage a inserer
	 * @param actor nom de l'acteur qui joue le personnage a inserer
	 * @param year annee de naissance de l'acteur
	 */
	
	public void insert (String character, String actor, int year){
		
		LElement cur = new LElement(character, actor, year);
		cur.next = this.root;
		this.root = cur;
		this.length++;
		
	}
	
	/**
	 * methode d'affichage de la liste complete
	 */
	
	public void display(){
		
		System.out.println("== "+this.name+" :");
			
		LElement cur = this.root;
		
		while(cur != null){
				
			System.out.println(cur);
			cur = cur.next;
		}
	}
	
	/**
	 * methode de comptage du nombre de personnage joues par le meme acteur dans la liste
	 * @param actor le nom de l'acteur dont on cherche les personnages
	 * @return le nombre de personnages de la liste joues par ce personnage
	 */
	
	public int count(String actor){
		
		int count = 0;
		LElement cur = this.root;
		
		while(cur != null){
			
			if(cur.getActor() == actor){
				
				count++;
			}
			
			cur = cur.next;
		}
		
		return count;
	}
	
	/**
	 * Methode de recherche d'un acteur dans la liste  
	 * @param actor le nom de l'acteur recherche
	 * @return le nombre d'iterations necessaire avant de trouver l'acteur ou -1 si l'acteur n'est pas present dans la liste
	 */
	
	public int find(String actor){
		
		int count = 1;
		LElement cur = this.root;
		
		while(cur != null){
			
			if(cur.getActor() == actor){
				
				return count;
			}
			
			count++;
			cur = cur.next;
		}
		
		return -1;
	}
	
	/**
	 * methode d'affichage de tous les acteurs en communs entre la liste et une autre
	 * @param otherList l'autre liste
	 */
	
	public void commonActors(List otherList){
		
		System.out.println(" === "+this.name +" v.s. "+ otherList.getName());
		
		LElement cur = this.root;
		
		boolean actorsInCommon = false;
		
		while(cur != null){
			
			LElement otherCur = otherList.root;
			
			while(otherCur != null){
				
				if(cur.getActor().equals(otherCur.getActor())){
					
					System.out.println("Actor "+cur.getActor()+" plays "+cur.getCharacter()+" and "+otherCur.getCharacter());
					actorsInCommon = true;
					
				}
				
				otherCur = otherCur.next;
			}
			
			cur = cur.next;
		}
		
		if(!actorsInCommon)
			System.out.println("No actor in common");
	}
}
