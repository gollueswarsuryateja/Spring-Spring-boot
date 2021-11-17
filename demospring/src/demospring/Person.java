package demospring;

public class Person {
	
	private int personId;
	private String personname;
		
	
	
	public Person() {
		super();
	}
	public Person(int personId, String personname) {
		super();
		this.personId = personId;
		this.personname = personname;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonname() {
		return personname;
	}
	public void setPersonname(String personname) {
		this.personname = personname;
	}
		
	public void displayDetails() {
		System.out.println("personId :"+this.personId);
		System.out.println("personname :"+this.personname);
	}
	
	
	

}
