public class RecursiveFour {

	public static void main(String[] args) {
		System.out.println(seq(5, 7, 3, -5));
	}

	public static int seq(int n, int init, int mult, int add)
	{
		if(n==1)
			return init;
		else
			return(mult*seq(n-1, init, mult, add)+ add);
	}
}
