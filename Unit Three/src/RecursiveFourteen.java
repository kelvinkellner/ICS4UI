
public class RecursiveFourteen {
	public static void main(String[] args)
	{
		int num = 1234;
		
		System.out.println(rev(num));
	}
	
	public static int rev(int num)
	{
		if(length(num)>0)
			return rev(num/10-(num/10%1)) + num%10*(int)Math.pow(10, length(num)-1);
		else
			return 0;
	}
	
	public static int length(int num)
	{
		int i=0;
		while(num>=Math.pow(10,i))
			i++;
		return i;
	}
}
