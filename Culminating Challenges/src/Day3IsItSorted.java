// Kelvin Kellner
// Mrs. Cooper
// June 5th, 2019
// ICS 4UI Culminating Coding Challenges
// Day 3 - Is It Sorted?

// Main Class
public class Day3IsItSorted
{
	public static void main(String[] args)
	{
		// CHANGE THESE VALUES
		int[] a1 = {};
		int[] a2 = {};
		int[] a3 = {};
		int[] a4 = {};
		int[] a5 = {};
		
		// Output the results
		System.out.println("Array 1: This is " + numToSorted(isSorted(a1)));
		System.out.println("Array 2: This is " + numToSorted(isSorted(a2)));
		System.out.println("Array 3: This is " + numToSorted(isSorted(a3)));
		System.out.println("Array 4: This is " + numToSorted(isSorted(a4)));
		System.out.println("Array 5: This is " + numToSorted(isSorted(a5)));
	}
	
	// Returns: 1 if array is sorted, -1 if array is reverse sorted, 0 if array is not sorted
	public static int isSorted(int[] array)
	{
		if(array.length < 2) // Arrays of length 1 or 0 will default to "sorted"
			return 1;
		
		int sortResult = 1; // Default to sorted, unless...
		for(int i=0; i<array.length-1; i++)
		{
			if(array[i]>array[i+1])
				sortResult = 0; // Any two values are in the wrong ascending order
		}
		
		if(sortResult == 0) // If the array is not forward sorted...
		{
			sortResult = -1; // Default to reverse sorted, unless...
			for(int i=0; i<array.length-1; i++)
			{
				if(array[i]<array[i+1])
					sortResult = 0; // Any two values are in the wrong descending order
			}
		}
		
		return sortResult; // Return the result of our checks
	}
	
	// Simply converts the integer result of "isSorted()" to the words "sorted", "reverse sorted", or "unsorted" accordingly
	// This could be also be done by returning a String value in "isSorted()", but this method is a little bit more versatile
	// (especially if you want to do more than just output the result, and actually run different processes for each outcome)
	public static String numToSorted(int result)
	{
		if(result==1)
			return "sorted";
		if(result==0)
			return "not sorted";
		if(result==-1)
			return "reverse sorted";
		// else all
		return "error";
	}
}
