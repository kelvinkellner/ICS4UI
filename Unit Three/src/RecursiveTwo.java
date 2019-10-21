public class RecursiveTwo {

	public static void main(String[] args) {
		int[] array = new int[12];
		fillFib(array);
		printArray(array);
		
		System.out.println();
		System.out.println(fib(5));
	}

	public static void printArray(int[] array)
	{
		for(int i=0; i<array.length; i++)
		{
			if(i!=0)
				System.out.print(" " + array[i]);
			else
				System.out.print(array[i]);
		}
	}
	
	public static int fib(int a)
	{
		if(a==1 || a==2)
			return 1;
		else
			return(fib(a-1) + fib(a-2));
	}
	
	public static int[] fillFib(int[] array)
	{
		for(int i=0;i<array.length;i++)
			array[i]=fib(i+1);
		return array;
	}
}
