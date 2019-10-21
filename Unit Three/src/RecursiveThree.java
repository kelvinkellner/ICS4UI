public class RecursiveThree {

	public static void main(String[] args) {
		System.out.println(gcd(1600, 1000));
	}

	public static int gcd(int num1, int num2)
	{
		if(num1==num2)
			return num1;
		else if(num1>num2)
			return gcd(num2, num1-num2);
		else
			return gcd(num1, num2-num1);
	}
}
