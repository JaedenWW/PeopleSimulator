import java.util.*;

class Society{
	//this declares a new instance variable... an ArrayList for people
	List<Person> people = new ArrayList<Person>();
    List<Crime> crimes = new ArrayList<Crime>();
	public int population;
	//these names came from https://nameberry.com/unisex-names
	private String[] firstNames = {"Avery","Riley","Jordan","Angel","Parker","Sawyer","Peyton","Quinn","Blake","Hayden","Taylor","Dakota","Reese","Zion","Remmington","Amari","Phoenix","Kendall","Harley","Rylan","Marley","Dallas"};
	private String[] lastNames = {"Hill","Carson","Ware","McMahon","Murray","Smith","Jones","Robinson","Morris","Brown","Meyers","Reed","Schmidt","Estrada","Huang","Patel","Gupta","Gomez","Ramirez","Thomas","Jordan","Samson","Samuels","Evans","Butts","Wright","Black","White"};
    private String[] genNames = {"homicide","theft","assault","illegal substances","arson"};
    private String[] specNames = {"grand","standard","multi", "justified"};


	Society(int numPeople){
		population = numPeople;
		String fullName;
		for(int i = 0; i < numPeople; i++){
			fullName = firstNames[(int)(Math.random()*firstNames.length)] + " " + lastNames[(int)(Math.random()*lastNames.length)];
			people.add(new Person((int)(Math.random()*100),fullName, null,"alive" ));
		}
	}

void judicialSystem(double crimeRate){

crimes.add(new Crime("standard homicide",10,0.03));
crimes.add(new Crime("multi homicide", 666,0.003));
crimes.add(new Crime("grand homicide",-1,0.001));
crimes.add(new Crime("justified homicide",0,0.001));
crimes.add(new Crime("standard theft",1,0.05));
crimes.add(new Crime("grand theft",2,0.005 ));
crimes.add(new Crime("standard assualt",1,0.05));
crimes.add(new Crime("multi assault",1,0.005));
crimes.add(new Crime("justified assualt",0,0.005));
crimes.add(new Crime("standard illegal substances",1,0.04));
crimes.add(new Crime("standard arson",10,0.007));
crimes.add(new Crime("grand arson",666,0.0007));

for(int i = 0; i < crimes.size(); i++){
    crimeRate = crimes.get(i).likelyhood() * population;
    people.get((int)((Math.random()*population)*100)).cRecords();

}



}
}





