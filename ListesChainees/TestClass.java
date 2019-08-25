package ListesChainees;

/**
 * Classe de test contenant le main pour tester les classes List et Tree, compare la recherche d'acteurs dans une longue et dans son arbre equivalent
 * @author Pierre-Louis
 * @version 1.0
 */

public class TestClass {
	 
	public static void main (String [] args) {
		
		 List list_gameofthrones = new List("Games of Thrones"); 
	     Tree tree_gameofthrones = new Tree("Games of Thrones");
	                
	     tree_gameofthrones.insert ("Ned Stark", "Sean Bean",1959);
	     tree_gameofthrones.insert ("Tyrion Lannister", "Peter Dinklage", 1969);
	     tree_gameofthrones.insert ("Margaery Tyrell", "Natalie Dormer",1982);
	     list_gameofthrones.insert ("Cersei Lannister", "Lena Headey",1973);
	     list_gameofthrones.insert ("Arya Stark", "Maisie Williams",1997);
	     list_gameofthrones.insert ("Daenerys Targaryen", "Emilia Clarke",1987);
	     list_gameofthrones.insert ("Catelyn Starck", "Michelle Fairley",1964);
	     list_gameofthrones.insert ("Jon Snow", "Kit Harington",1986);
	     list_gameofthrones.insert ("Sansa Starck", "Sophie Turner",1996);
	     list_gameofthrones.insert ("Theon Greyjoy", "Alfie Allen",1986);
	     list_gameofthrones.insert ("Joffrey Baratheon", "Jack Gleeson",1992);
	     list_gameofthrones.insert ("Robb Starck", "Richard Madden",1986);
	     list_gameofthrones.insert ("Bran Starck", "Isaac Hempstead Wright",1999);
	     list_gameofthrones.insert ("Sandor Clegane", "Rory McCann",1969);
	     list_gameofthrones.insert ("Jaime Lannister", "Nikolaj Coster-Waldau",1970);
	     list_gameofthrones.insert ("Petyr Baelish", "Aidan Gillen",1968);
	     list_gameofthrones.insert ("Tywin Lannister", "Charles Dance",1946);
	     list_gameofthrones.insert ("Samwell Tarly", "John Bradley",1988);
	     list_gameofthrones.insert ("Lord Varys", "Conleth Hill",1964);
	     list_gameofthrones.insert ("Bronn", "Jerome Flynn",1963);
	     list_gameofthrones.insert ("Shae", "Sibel Kekilli",1980);
	     list_gameofthrones.insert ("Maester Luwin", "Donald Sumpter",1943);
	     list_gameofthrones.insert ("Barristan Semly", "Ian McElhinney",1948);
	     list_gameofthrones.insert ("Brienne of Tarth", "Gwendoline Christie",1978);
	     list_gameofthrones.insert ("Osha", "Natalia Tena",1984);
	     list_gameofthrones.insert ("Rodrik Cassel", "Ron Donachie",1956);
	     list_gameofthrones.insert ("Stannis Baratheon", "Stephen Dillane",1956);
	     list_gameofthrones.insert ("Jeor Mormont", "James Cosmo",1948);
	     list_gameofthrones.insert ("Ygritte", "Rose Leslie",1987);
	     list_gameofthrones.insert ("Loras Tyrell", "Finn Jones",1988);
	     list_gameofthrones.insert ("Davos Seaworth", "Liam Cunningham",1961);
	     list_gameofthrones.insert ("Melisandre", "Carice van Houten",1976);
	     list_gameofthrones.insert ("Khal Drogo", "Jason Momoa",1979);
	     list_gameofthrones.insert ("Podrick Payne", "Daniel Portman",1992);
	     list_gameofthrones.insert ("Robert Baratheon", "Mark Addy",1964);
	     list_gameofthrones.insert ("Thoros of Myr", "Paul Kaye",1983);
	     list_gameofthrones.insert ("Ramsay Snow", "Iwan Rheon",1985);
	     list_gameofthrones.insert ("Gregor Clegane", "Ian Whyte",1971);
	     list_gameofthrones.insert ("Viserys Targaryen", "Harry Lloyd",1983);
	     list_gameofthrones.insert ("Edmure Tully", "Tobias Menzies",1974);
	     list_gameofthrones.insert ("Meera Reed", "Ellie Kendrick",1990);
	     list_gameofthrones.insert ("Walder Frey", "David Bradley",1942);
	     list_gameofthrones.insert ("Balon Greyjoy", "Patrick Malahide",1945);
	     list_gameofthrones.insert ("Daario Naharis", "Ed Skrein",1983);
	     
	     tree_gameofthrones.insert ("Ned Stark", "Sean Bean",1959);
	     tree_gameofthrones.insert ("Tyrion Lannister", "Peter Dinklage", 1969);
	     tree_gameofthrones.insert ("Margaery Tyrell", "Natalie Dormer",1982);
	     tree_gameofthrones.insert ("Cersei Lannister", "Lena Headey",1973);
	     tree_gameofthrones.insert ("Arya Stark", "Maisie Williams",1997);
	     tree_gameofthrones.insert ("Daenerys Targaryen", "Emilia Clarke",1987);
	     tree_gameofthrones.insert ("Catelyn Starck", "Michelle Fairley",1964);
	     tree_gameofthrones.insert ("Jon Snow", "Kit Harington",1986);
	     tree_gameofthrones.insert ("Sansa Starck", "Sophie Turner",1996);
	     tree_gameofthrones.insert ("Theon Greyjoy", "Alfie Allen",1986);
	     tree_gameofthrones.insert ("Joffrey Baratheon", "Jack Gleeson",1992);
	     tree_gameofthrones.insert ("Robb Starck", "Richard Madden",1986);
	     tree_gameofthrones.insert ("Bran Starck", "Isaac Hempstead Wright",1999);
	     tree_gameofthrones.insert ("Sandor Clegane", "Rory McCann",1969);
	     tree_gameofthrones.insert ("Jaime Lannister", "Nikolaj Coster-Waldau",1970);
	     tree_gameofthrones.insert ("Petyr Baelish", "Aidan Gillen",1968);
	     tree_gameofthrones.insert ("Tywin Lannister", "Charles Dance",1946);
	     tree_gameofthrones.insert ("Samwell Tarly", "John Bradley",1988);
	     tree_gameofthrones.insert ("Lord Varys", "Conleth Hill",1964);
	     tree_gameofthrones.insert ("Bronn", "Jerome Flynn",1963);
	     tree_gameofthrones.insert ("Shae", "Sibel Kekilli",1980);
	     tree_gameofthrones.insert ("Maester Luwin", "Donald Sumpter",1943);
	     tree_gameofthrones.insert ("Barristan Semly", "Ian McElhinney",1948);
	     tree_gameofthrones.insert ("Brienne of Tarth", "Gwendoline Christie",1978);
	     tree_gameofthrones.insert ("Osha", "Natalia Tena",1984);
	     tree_gameofthrones.insert ("Rodrik Cassel", "Ron Donachie",1956);
	     tree_gameofthrones.insert ("Stannis Baratheon", "Stephen Dillane",1956);
	     tree_gameofthrones.insert ("Jeor Mormont", "James Cosmo",1948);
	     tree_gameofthrones.insert ("Ygritte", "Rose Leslie",1987);
	     tree_gameofthrones.insert ("Loras Tyrell", "Finn Jones",1988);
	     tree_gameofthrones.insert ("Davos Seaworth", "Liam Cunningham",1961);
	     tree_gameofthrones.insert ("Melisandre", "Carice van Houten",1976);
	     tree_gameofthrones.insert ("Khal Drogo", "Jason Momoa",1979);
	     tree_gameofthrones.insert ("Podrick Payne", "Daniel Portman",1992);
	     tree_gameofthrones.insert ("Robert Baratheon", "Mark Addy",1964);
	     tree_gameofthrones.insert ("Thoros of Myr", "Paul Kaye",1983);
	     tree_gameofthrones.insert ("Ramsay Snow", "Iwan Rheon",1985);
	     tree_gameofthrones.insert ("Gregor Clegane", "Ian Whyte",1971);
	     tree_gameofthrones.insert ("Viserys Targaryen", "Harry Lloyd",1983);
	     tree_gameofthrones.insert ("Edmure Tully", "Tobias Menzies",1974);
	     tree_gameofthrones.insert ("Meera Reed", "Ellie Kendrick",1990);
	     tree_gameofthrones.insert ("Walder Frey", "David Bradley",1942);
	     tree_gameofthrones.insert ("Balon Greyjoy", "Patrick Malahide",1945);
	     tree_gameofthrones.insert ("Daario Naharis", "Ed Skrein",1983);
	     
	     String [] ss = { "Alfie Allen", "Charles Dance", "Ellie Kendrick", "Jerome Flynn", "Sean Bean", "Peter Dinklage", "Natalie Dormer"};
	     int countlist=0, counttree=0;
	     
	     for (int i=0; i<ss.length; ++i) {
	    	 
	    	 int count;
	    	 System.out.println ("Searching for "+ss[i]);
	    	 count=list_gameofthrones.find(ss[i]);
	    	 
	    	 if (count>=0) {
	    	
	    		 System.out.println ("List: found after "+count+" iterations.");
	    		 countlist+=count;
	            }
	    	 
	    	 count=tree_gameofthrones.find(ss[i]);
	         
	    	 if (count>=0) {
	         
	    		 System.out.println ("Tree: found after "+count+" iterations.");
	    		 counttree+=count;	 
	    	 }			 
	     }
	        
	     System.out.println ("Average number of iterations for list: "+((float)countlist/(float)ss.length));
	     System.out.println ("Average number of iterations for tree: "+((float)counttree/(float)ss.length));      
	}
	
} 