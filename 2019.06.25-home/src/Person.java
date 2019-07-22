
public class Person {
	private String name;
	private int age;
	private int id;
	
	public Person(String name, 
			int age, 
			int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public boolean equals(Person p) {
		if(p == null) {
			return false;
		}
		if(id != p.id) {
			return false;
		}
		return true;
	}
	
	public String toString() {
		return id + " " + name + " " + age; 
	}
	
	
}
