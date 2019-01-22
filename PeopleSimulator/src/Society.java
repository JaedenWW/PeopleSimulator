import java.util.*;

class Society{
	//this declares a new instance variable... an ArrayList for people
	List<Person> people = new ArrayList<Person>();
    List<Law> laws = new ArrayList<Law>();
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
			people.add(new Person((int)(Math.random()*100),fullName, "null"));
		}
	}


for(int i = 0; i < specNames.size(); i++){
String crimeName = specNames[i] + " " + genNames[i];
int punish;
double percent;
crimes.add(Crime("standard homicide",10,0.03));
crimes.add(Crime("multi homicide", 666,0.003));
crimes.add(Crime("grand homicide",-1,0.001));
crimes.add(Crime("justified homicide",0,0.001));
crimes.add(Crime("standard theft",1,0.05));
crimes.add(Crime("grand theft",2,0.005 ));
crimes.add(Crime("standard assualt",1,0.05));
crimes.add(Crime("multi assault",1,0.005));
crimes.add(Crime("justified assualt",0,0.005));
crimes.add(Crime("standard illegal substances",1,0.04));
crime.add(Crime("standard arson",10,0.007));

else if (crimeName.equals("grand arson")){
    punish = 666;
    percent = 0.0007;
}
else{
    punish = 777;
    percent = 0.70;
}
laws.add(new Law(crimeName,punish,percent));
if(laws.get(i).getSentence() == 0){
    laws.remove(i);
}

}



}

