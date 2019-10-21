public class RecursiveOne {

	public static void main(String[] args) {
		System.out.println(pow(2,5));
	}

	public static int pow(int base, int exp)
	{
		if(exp==0)
			return 1;
		else
			return(base * (pow(base, exp-1)));
	}
}
