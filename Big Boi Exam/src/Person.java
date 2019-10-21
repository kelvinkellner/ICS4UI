
public class Person {
	
	// Variables
	public String firstName;
	public String lastName;
	public int phoneNumber;
	
	// Constructor
	Person(String firstName, String lastName, int phoneNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}
	
	// Print Info
	public void printInfo()
	{
		System.out.println(lastName + ", " + firstName);
		System.out.println("Extension: " + phoneNumber);
	}
	
}
