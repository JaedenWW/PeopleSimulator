import java.util.*;

class Society{
	//this declares a new instance variable... an ArrayList for people
	List<Person> people = new ArrayList<Person>();
    List<Law> laws = new ArrayList<Law>();
	public int population;
	//these names came from https://nameberry.com/unisex-names
	private String[] firstNames = {"Avery","Riley","Jordan","Angel","Parker","Sawyer","Peyton","Quinn","Blake","Hayden","Taylor","Dakota","Reese","Zion","Remmington","Amari","Phoenix","Kendall","Harley","Rylan","Marley","Dallas"};
	private String[] lastNames = {"Hill","Carson","Ware","McMahon","Murray","Smith","Jones","Robinson","Morris","Brown","Meyers","Reed","Schmidt","Estrada","Huang","Patel","Gupta","Gomez","Ramirez","Thomas","Jordan","Samson","Samuels","Evans","Butts","Wright","Black","White"};
    private String[] genNames = {"homicide","theft","assault","illegal substances","arson"};
    private String[] specNames = {"grand","Standard","multi", "justified"};


	Society(int numPeople){
		population = numPeople;
		String fullName;
		for(int i = 0; i < numPeople; i++){
			fullName = firstNames[(int)(Math.random()*firstNames.length)] + " " + lastNames[(int)(Math.random()*lastNames.length)];
			people.add(new Person((int)(Math.random()*100),fullName));
		}
	}


for(int i = 0; i < specNames.size(); i++){
String crimeName = specNames[i] + " " + genNames[0];
people.add(new)
}



}

