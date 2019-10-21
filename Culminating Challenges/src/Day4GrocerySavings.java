import java.io.BufferedReader;
import java.io.FileReader;

// Kelvin Kellner
// Mrs. Cooper
// June 6th, 2019
// ICS 4UI Culminating Coding Challenges
// Day 4 - Grocery Savings

// Main Class
public class Day4GrocerySavings
{
	// Main Method
	public static void main(String[] args)
	{
		double[] store1 = loadStore("store1.txt");
		double[] store2 = loadStore("store2.txt");
		
		double minimum = 0.00;
		
		for(int i=0; i<store1.length; i++)
		{
			if(store1[i] < store2[i])
				minimum += store1[i];
			else
				minimum += store2[i];
		}
		
		System.out.println("\nThe lowest total price is:\n$" + minimum + hangingZero(minimum));
	} // Close Main Method
	
	// Load Store Method - loads the items for a store as a double array from a given text file
	public static double[] loadStore(String fileName)
	{
		try
		{
			// Load the items from the file into an array of doubles, which is then returned
			FileReader file = new FileReader(fileName);
			BufferedReader read = new BufferedReader(file);
			
			double[] items = new double[Integer.parseInt(read.readLine())];
			
			for(int i=0; i<items.length; i++)
				items[i] = Double.parseDouble(read.readLine());
			
			read.close();
			
			return items;
		}
		catch(Exception e)
		{
			// Print out an error message
			System.out.println("\nError.\nThe store data could not be loaded for \"" + fileName + "\".\nPlease check that the file exists and is named and stored appropriately.\n");
			e.printStackTrace();
			return new double[0];
		}
	} // Close Load Store Method
	
	// Hanging Zero Method - Adds an additional zero if there is only one digit in the decimals place (e.g. $2.5 would become $2.50)
	public static String hangingZero(double value)
	{
		if((value*10.0)%1.0 == 0)
			return "0";
		else
			return "";
	} // Close Hanging Zero Method
} // Close Class
