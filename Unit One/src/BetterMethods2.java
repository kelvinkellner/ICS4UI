import java.util.*;

public class BetterMethods2 {
	public static void main(String[] args) {
		int[] randomArray = randomNums(50, 50, 1); // Get 50 random numbers between 1 and 50

		boolean in = inArray(randomArray, 20); // return true if the number 20 is in the array

		// print out the result
		if(in)
			System.out.println("the number 20 is found in the array");
		else
			System.out.println("the number 20 is not found in the array");
	}// end main
	
	// randomNums Method
	//   Gives 'a' random numbers between a range of values 'b' to 'c' in either order.
	//   PARAMETERS:
	//     a - length, the # of random numbers to generate
	//     b (range1) and c(range2) - the minimum and maximum range of random numbers (in any order)
	//   RETURNS:
	//     nums - the final array of 'a' random numbers
	public static int[] randomNums(int length, int range1, int range2)
	{
		int min; int max;
		
		if (range1 > range2)
		{
			max = range1;
			min = range2;
		}
		else
		{
			max = range2;
			min = range1;
		}
		
		Random random = new Random();
		
		int[] nums = new int[length];
		
		for(int i=0;i<length;i++)
			nums[i]=random.nextInt(max - min +1) + min;
		return nums;
	} // end randomNums Method
	
	// inArrayMethod
	//   returns 'true' or 'false' based on whether or not a particular number is present in an integer array
	//   PARAMETERS:
	//     array - the integer array to search through
	//     num - the value we are searching for in the array
	//   RETURNS:
	//     true/false - is the number in the array? yes/no = true/false
	public static boolean inArray(int[] array, int num)
	{
		for(int i=0; i<array.length; i++)
		{
			if(array[i]==num)
				return true;
		}
		return false;
	} // end inArray Method
}// end class