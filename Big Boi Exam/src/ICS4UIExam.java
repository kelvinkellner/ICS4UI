import java.util.Arrays;

// Kelvin Kellner
// Mrs. Cooper
// June 20th, 2019
// ICS 4UI Final Coding Exam

public class ICS4UIExam {

	public static void main(String[] args)
	{
		// Object Data
		String[] studentFirstNames = {};
		String[] studentLastNames = {};
		int[] studentPhoneNumbers = {};
		int[] studentNumbers = {};
		int[] studentGrades = {};
		
		String[] staffFirstNames = {};
		String[] staffLastNames = {};
		int[] staffPhoneNumbers = {};
		int[] staffNumbers = {};
		double[] staffSalary = {};
		
		// Object Initialization
		Student[] students = new Student[studentFirstNames.length];
		for(int i=0; i<students.length; i++)
		{
			students[i] = new Student(studentFirstNames[i], studentLastNames[i], studentPhoneNumbers[i], studentNumbers[i], studentGrades[i]);
		}
		
		Staff[] staffs = new Staff[staffFirstNames.length];
		for(int i=0; i<staffs.length; i++)
		{
			staffs[i] = new Staff(staffFirstNames[i], staffLastNames[i], staffPhoneNumbers[i], staffNumbers[i], staffSalary[i]);
		}
		
		// Object Sorting
		Arrays.sort(students);
		Arrays.sort(staffs);
		
		// Print Information
		System.out.println("\nPrinting information...");
		System.out.println("\n-----\n\nSTUDENTS: " + students.length);
		for(int i=0; i<students.length; i++)
		{
			System.out.println();
			students[i].printInfo();
		}
		
		System.out.println("\n-----\n\nSTAFF: " + staffs.length);
		for(int i=0; i<staffs.length; i++)
		{
			System.out.println();
			staffs[i].printInfo();
		}
		
		// Compare Students
		System.out.println("\n------\n\nStudent comparison...\n");
		int duplicates = 0;
		for(int i=0; i<students.length-1; i++)
		{
			for(int j=i+1; j<students.length; j++)
			{
				if(students[i].compareWith(students[j]))
				{
					System.out.println(students[i].firstName + " " + students[i].lastName + " (#" + (i+1) + ") and " + students[j].firstName + " " + students[j].lastName + " (#" + (j+1) + ") are duplicates.");
					duplicates++;
				}
			}
		}
		System.out.println("\nDuplicate pairs: " + duplicates);
	}
	
}
