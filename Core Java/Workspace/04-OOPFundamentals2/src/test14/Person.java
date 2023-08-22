package test14;

import java.util.Objects;

public class Person extends Object {
	private String firstName;
	private String lastName;
	private String city;
	public Person() {
		
	}
	public Person(String firstName, String lastName, String city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "First Name="+firstName+", Last Name="+lastName+", City="+city;
	}
	@Override
	public void finalize() {
		System.out.println("Object is about to delete.");
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, firstName, lastName);
	}	
	public boolean equals(Object p) {
		Person person =  (Person) p;
		if(this.firstName.equals(person.firstName) && 
				this.lastName.equals(person.lastName) &&
				this.city.equals(person.city)) 
		{
			return true;
		}
		return false;
	}


}









