public class RecursiveThirteen {

	public static void main(String[] args)
	{
		String s = "racecar";
		
		System.out.println(isPal(s));
	}
	
	public static boolean isPal(String s)
	{
		if(s.length()<=1)
			return true;
		else if(s.charAt(0)==s.charAt(s.length()-1))
			return isPal(s.substring(1, s.length()-1));
		else
			return false;
	}
}
