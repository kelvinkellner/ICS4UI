
public class RecursiveFive {

	public static void main(String[] args) {
		System.out.println(reverse("Hello Cameron"));
	}
	
	public static String reverse(String in)
	{
		return reverse(in, "", in.length());
	}
	
	public static String reverse(String in, String rev, int count)
	{
		count--;
		if(count>=0)
		{
			rev+=in.charAt(in.length()-1);
			in=in.substring(0,in.length()-1);
			return reverse(in, rev, count);
		}
		return rev;
	}
}
