// Kelvin Kellner
// Mrs. Cooper
// 28 February 2019
// Unit 2 Assignment - File Input/Output

import java.io.*;

public class UniqueYear
{
	// Main Method
	public static void main(String[] args) throws IOException
	{
		try
		{
			// Initialize i/o components
			FileReader fileIn = new FileReader("yearinput.txt");
			FileWriter fileOut = new FileWriter("yearoutput.txt");
			BufferedReader read = new BufferedReader(fileIn);
			PrintWriter write = new PrintWriter(fileOut);
			
			// Store the # of lines and create a blank String array for our years
			int years = Integer.parseInt(read.readLine());
			String[] year = new String[years];
		
			// Store all of the years into the array
			for(int i=0;i<years;i++)
				year[i] = read.readLine();
    
			write.println(years); // Print out the number of years in the array
    
			// Print out the next year with unique digits for each year in the array
			for(int i=0;i<year.length;i++)
				write.println(nextUnique(year[i]));
    
			// Close our i/o components
			read.close();
			write.close();
			
			System.out.println("Calculations completed."); // Inform the user that our program has fulfilled its purpose
		}
		catch(Exception e)
		{
			// Print out an error message and store the error to a text file, if the input could not be found
			FileWriter fileOut = new FileWriter("yearoutput.txt");
			PrintWriter write = new PrintWriter(fileOut);
			write.println(e.getMessage());
			write.close();
			System.out.println("Error.\nThe program was unable to run.\nCheck that the input file is correctly titled \"yearinput.txt\" and is stored in the appropriate folder.\nThe error message has been printed to \"yearoutput.txt\"");
		}
	} // End Main Method
  
	// Next Unique Method:
	// Returns the next year with unique digits after the given year (both as Strings)
	public static String nextUnique(String year)
  	{
		boolean unique = false;
		while(!unique) // Keep adding one to our year until we find a unique year
		{
			year = (Integer.parseInt(year) + 1) + ""; // Parse as an integer, add one, then convert back to a String (I would rather do this in one line than create a bunch of unused variables)
			if(isUnique(year))
				unique=true; // Break the loop if this year is unique
		}
		return year; // Return the first unique year
  	} // End Next Unique Method
  
	// Is Unique Method:
	// Returns a true or false boolean as to whether our not the given year (as a String) is comprised of unique characters
	public static boolean isUnique(String year)
	{
		for(int i=0;i<year.length()-1;i++) // For each character
		{
			for(int j=i+1;j<year.length();j++) // For each character ahead of our current character
			{
				if(year.charAt(i)==year.charAt(j)) // If the two characters are the same...
					return false; // Then this string is not comprised of unique digits...
			}
		}
		return true; // Otherwise, the String is comprised of unique digits
	} // End Is Unique Method
} // End Main Class