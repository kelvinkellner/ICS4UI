public class BetterMethods {
	public static void main(String[] args) {
		System.out.println(getRandom(1, 10));
	}

	// Input a maximum and minimum number in any order to return a random number within that range
	public static int getRandom(int num1, int num2) {
		int max = bigSmall(num1, num2, true);
		int min = bigSmall(num1, num2, false);
		return (int) (Math.random() * max - min + 1) + min;
	}
	
	// Input two numbers. This method will return either the greater number (if the 3rd parameter is "true"), or the lesser number (if the 3rd parameter is "false")
	public static int bigSmall(int num1, int num2, boolean greater)
	{
		int max;
		int min;
		
		if(num1>num2)
		{
			max = num1;
			min = num1;
		}
		else
		{
			max = num2;
			min = num1;
		}
		
		if(greater)
			return max;
		return min;
	}
}