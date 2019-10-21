
public class KelvinKellnerRecursionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(digitSum(518));
		System.out.println(dup("AAABBAABCCDCAA", 0));
		perm("MARCO", 0, 5);
	}
	
	// Kelvin Kellner
	// DIGIT SUM: Return the sum of the digits of any given integer
	public static int digitSum(int num)
	{
		if(num==0)
			return 0;
		return num%10 + digitSum(num/10); // Return the value of the last digit + the result of the method after shifting the number over one digits place to the right (since the number is an integer, dividing by ten will automatically remove the remainder, since an integer can not be followed by any decimals).
	}
	
	// Kelvin Kellner
	// DUP: Removes any consecutive duplicate characters within a given String and returns the result
	public static String dup(String word, int start)
	// Start: the character index of the word to start searching for duplicates (use 0 for the whole word)
	{
		if(start>=word.length()-1) // If we have reached the final character of the word...
			return word; // Return our new clean String
		else if(word.charAt(start)==word.charAt(start+1)) // If the next character is a duplicate of the current character...
			return dup(word.substring(0, start+1) + word.substring(start+2,word.length()), start); // Run the method again at its current position, for the whole word after the one duplicate character is deleted
		else // Otherwise the next character is not a duplicate, so...
			return dup(word, start+1); // Run the method again from the next character in the word.
	}
	
	public static void perm(String word, int start, int end)
	{
		if(start==end)
			System.out.println(word);
		for(int i=start; i<end; i++)
		{
			word = swap(word, start, i);
			perm(word, start+1, end);
		}
	}
	
	public static String swap(String word, int i1, int i2)
	{
		char[] broke = word.toCharArray();
		char temp = broke[i1];
		broke[i1] = broke[i2];
		broke[i2] = temp;
		return String.valueOf(broke);
	}
}
