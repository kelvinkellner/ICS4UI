import java.util.*;

public class GCD {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		System.out.println(gcd(num1,num2));
		scan.close();
	}
	
	public static int gcd(int num1, int num2)
	{
		if(num1==num2)
			return num1;
		
		int greater=0;
		int lesser=0;
		
		if(num1>num2)
		{
			greater=num1;
			lesser=num2;
		}
		else
		{
			greater=num2;
			lesser=num1;
		}
		return gcd(lesser, greater-lesser);
	}

}
