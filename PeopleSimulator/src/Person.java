import java.util.*;

class Person {
	public int age;
	private String name;
    List<Crime> cRecord = new ArrayList<Crime>();
    public String status;

	public Person(int age, String name,List<Crime> cRecord,String status) {
		this.name = name;
		this.age = age;
        this.cRecord = cRecord;
        this.status = status;
	}


	public boolean olderThan(int otherAge) {
		if (age > otherAge) {
			return true;
		} else {
			return false;
		}

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void hadBirthday() {
		age++;
	}
    public List<Crime> cRecords(){
        return cRecord;
    }
    public String hasDied(){
        return "deceased";
    }


}