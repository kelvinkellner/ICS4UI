
public class LearnHeapsAlgorithm {

	public static void main(String[] args) {
		String word = "ABC";
		perms(word,0,word.length()-1); // Do the swapping stuff for every index that has another index after it.
	}
	
	public static void perms(String word, int start, int end)
	{
		for(int i=start;i<=end;i++)
		{
			if (start == end)
				System.out.println(word);
			else
			{
				word = swap(word,start,i);
				perms(word,start+1,end);
			}
		}
	}
	
	public static String swap(String word, int i1, int i2)
	{
		if(i1==i2)
			return word;
		else
			return word.substring(0,i1) + word.charAt(i2) + word.substring(i1+1,i2) + word.charAt(i1) + word.substring(i2+1, word.length());
	}
}
