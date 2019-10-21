public class Recursion2 {

	public static void main(String[] args) {
		System.out.println(sequence(4,3,2));
	}

	public static int sequence(int add, int start, int cycles)
	{
		if(cycles==1)
			return start;
		return(add+sequence(add,start,cycles-1));
	}
}
