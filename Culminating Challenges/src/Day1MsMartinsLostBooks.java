// Kelvin Kellner
// Mrs. Cooper
// June 3rd, 2019
// ICS 4UI Culminating Coding Challenges
// Day 1 - Ms. Martin's Lost Books

import java.util.Scanner;

public class Day1MsMartinsLostBooks {

	public static void main(String[] args) {
		
		// User Prompt
		Scanner scan = new Scanner(System.in);
		System.out.println("How many lockers does Ms. Martin have the time to check today?");
		int search = scan.nextInt();
		scan.close();
		
		// Process the Stuffs
		if(search<0)
			System.out.println("Wooooahhh there buckaroo, that's a negative number.\nMs. Martin's degree has not prepared her to count negative lockers.");
		else
		{
			int booksFound = lockerCheck(search);
			System.out.println("Ms. Martin found " + booksFound + " books in the first " + search + " lockers.");
		}
	}
	
	public static int lockerCheck(int call)
	{
		// BASE CASE: currently checking a locker that does not exist (i.e. locker 0: lockers go from 1 to "call")
		if(call<=0)
			return 0;
		
		// RECURSIVE CASE: if the locker still exists, calculate and return the amount of books in the locker, plus the total of all the remaining lockers
		else
		{
			int books = 0; // Create a counter for the number of books

			// If the number is even
			if(call%2 == 0)
				books = 1;
			// Else the number is odd
			else
				books = 2;
			
			// If the number is divisible by 5
			if(call%5 == 0)
				books += 3;
			
			return books + lockerCheck(call-1);
		}
	}

}
