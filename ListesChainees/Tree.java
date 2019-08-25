package ListesChainees;

/**
 * Classe de la liste - arbre film composee des personnages de film, places a leur ajout dans l'arbre par ordre alphabetique  
 * @author Pierre-Louis
 * @version 1.0
 */

public class Tree {
	
	private int length;
	private String name;
	private TElement root;
	
	/**
	 * Constructeur par defaut de l'arbre, nom vide et pas d'element
	 */

	public Tree() {

		this.length = 0;
		this.root = null;
		this.name = "";
		
	}
	
	/**
	 * Constructeur parametre de l'arbre, vide d'abord
	 * @param name le nom de l'arbre (celui du film)
	 */
	
	public Tree(String name) {
		
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
	 * Methode d'insertion d'un personnage en bout d'arbre, place par ordre alpghabetique depuis la racine
	 * @param character le nom du personnage
	 * @param actor le nom de l'acteur qui joue le personnage
	 * @param birthyear l'annee de naissance du personnage
	 */
	
	public void insert (String character, String actor, int birthyear){
		
		TElement next = new TElement(character, actor, birthyear);
		
		if(this.root == null){
			
			this.root = next;
	
		} else {
		
			TElement cur = this.root, prev=this.root;
			this.length++;
		
			while(cur != null){
			
				prev = cur;
		
				if(cur.getActor() == actor){				 
					
					return;
			
				} else if (cur.getActor().compareTo(actor)<0){ 

					cur = prev.right;
				
				} else {
				
					cur = prev.left;
				}
			}
			
			if (prev.getActor().compareTo(actor)<0){
			
				prev.right = next;
		
			} else {
			
				prev.left = next;
			}	
		}
	}
	
	/**
	 * Methode de recherche d'un acteur dans l'arbre (ayant joue dans le film)
	 * @param actor le nom de l'acteur 
	 * @return le nombre d'iterations necessaire pour trouver l'acteur ou -1 s'il n'est pas dans l'arbre (s'il n'a pas joue dans le film)
	 */
	
	public int find(String actor){
		
		int count = 1;
		TElement cur= this.root;
		
		while(cur != null){
			
			if(cur.getActor() == actor){
				
				return count;
			
			} else if(cur.getActor().compareTo(actor)<0) {
				
				cur = cur.right;
				
			} else {
				
				cur = cur.left;
			}
			count++;	
		}
		return -1;
	}
	
	/**
	 * Methode de test ajoutant 3 elements a l'arbre : ("Tyrion Lannister", "Peter Dinklage", 1969), ("Cersei Lannister", "Lena Headey",1973), ("Sansa Stark", "Sophie Turner",1966),  ("Daenerys Targaryen", "Emila Clarke",1997)
	 */
	
	public void someTestValues () {
		 
		 root = new TElement ("Tyrion Lannister", "Peter Dinklage", 1969);
		 root.left = new TElement ("Cersei Lannister", "Lena Headey",1973);
		 root.right = new TElement ("Sansa Stark", "Sophie Turner",1966); 
		 root.left.left = new TElement ("Daenerys Targaryen", "Emila Clarke",1997);
		} 

}
