class Person {
	public int age;
	private String name;
    public String cRecord;

	public Person(int age, String name,String cRecord) {
		this.name = name;
		this.age = age;
        this.cRecord = cRecord;
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
    public String getRecord(){
        return cRecord;
    }

}