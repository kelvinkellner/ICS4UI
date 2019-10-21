
public class Staff extends Person implements Comparable<Staff> {

	// Variables
	int staffNumber;
	double salary;
	
	// Constructor
	Staff(String firstName, String lastName, int phoneNumber, int staffNumber, double salary)
	{
		super(firstName, lastName, phoneNumber);
		this.staffNumber = staffNumber;
		this.salary = salary;
	}
	
	// Print Info
	public void printInfo()
	{
		super.printInfo();
		System.out.println("Staff Number: " + staffNumber);
		System.out.println("Salary: $" + salary + hangingZero(salary));
	}
	
	// Staff Comparison Method (static)
	public static boolean compare(Staff one, Staff two)
	{
		if(one.staffNumber == two.staffNumber)
			return true;
		return false;
	}
	
	// Hanging-Zero Formatting Check
	public static String hangingZero(double amount)
	{
		if((amount*10.0)%1.0==0)
			return "0";
		return "";
	}
	
	// Comparable For Sorting (sorts by last name > first name > staff number > phone number > salary)
	@Override
	public int compareTo(Staff that) {
		int comp = this.lastName.compareTo(that.lastName);
		if(comp == 0)
		{
			comp = this.firstName.compareTo(that.lastName);
			if(comp == 0)
			{
				comp = Integer.compare(this.staffNumber, that.staffNumber);
				if(comp == 0)
				{
					comp = Integer.compare(this.phoneNumber, that.phoneNumber);
					if(comp == 0)
						comp = Double.compare(this.salary, that.salary);
				}
			}
		}
		return comp;
	}
	
}
