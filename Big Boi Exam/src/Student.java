
public class Student extends Person implements Comparable<Student> {
	
	// Variables
	public int studentNumber;
	public int grade;
	
	// Constructor
	Student(String firstName, String lastName, int phoneNumber, int studentNumber, int grade)
	{
		super(firstName, lastName, phoneNumber);
		this.studentNumber = studentNumber;
		this.grade = grade;
	}
	
	// Print Info
	public void printInfo()
	{
		super.printInfo();
		System.out.println("Student ID: #" + studentNumber);
		System.out.println("Grade: " + grade);
	}
	
	// Student Comparison Method (non-static)
	public boolean compareWith(Student that)
	{
		if(this.studentNumber == that.studentNumber)
			return true;
		return false;
	}
	
	// Comparable For Sorting (sorts by last name > first name > grade > student number > phone number)
	@Override
	public int compareTo(Student that) {
		int comp = this.lastName.compareTo(that.lastName);
		if(comp == 0)
		{
			comp = this.firstName.compareTo(that.firstName);
			if(comp == 0)
			{
				comp = Integer.compare(this.grade, that.grade);
				if(comp == 0)
				{
					comp = Integer.compare(this.studentNumber, that.studentNumber);
					if(comp == 0)
						comp = Integer.compare(this.phoneNumber, that.phoneNumber);
				}
			}
		}
		return comp;
	}

}
