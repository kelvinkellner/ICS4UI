import java.util.*;

public class Ragaman {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String l1 = scan.nextLine();
		String l2 = scan.nextLine();
		
		if(l1.length()!=l2.length())
			System.out.println("N");
		else
		{
			boolean broke = false;
			
			for(int a=0; a<l2.length(); a++)
			{
				//System.out.println(l1 + ", " + l2);
				if(count(l1, l2.charAt(a) + "") > 0)
					l1 = l1.replaceFirst(l2.charAt(a) + "", "");
				else if(l2.charAt(a)!='*')
				{
					System.out.println("N");
					a=l2.length();
					broke = true;
				}
			}
			
			if(!broke)
				System.out.println("A");
		}
		
		scan.close();
	}

	public static int count(String in, String search)
	{
		return in.length() - in.replace(search, "").length();
	}
}
