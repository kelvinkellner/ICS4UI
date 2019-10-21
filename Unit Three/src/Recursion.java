public class Recursion {

	public static void main(String[] args) {
		System.out.println(pow(2,62));
	}

	public static long pow(int times, long n)
	{
		if(n==0)
			return 1;
		return(times * pow(times, n-1));
	}
}
