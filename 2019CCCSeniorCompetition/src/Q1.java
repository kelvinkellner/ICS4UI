import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String line = scan.nextLine();
		
		long h = countInst(line, "H");
		long v = countInst(line, "V");
		
		int[][] num = new int[2][2];
		num[0][0] = 1;
		num[0][1] = 2;
		num[1][0] = 3;
		num[1][1] = 4;
		
		for(int i=0;i<h;i++)
		{
			int[] temp = num[0];
			num[0] = num[1];
			num[1] = temp;
		}
		
		for(int i=0;i<v;i++)
		{
			int temp1 = num[0][0];
			int temp2 = num[1][0];
			
			num[0][0] = num[0][1];
			num[1][0] = num[1][1];
			
			num[0][1] = temp1;
			num[1][1] = temp2;
		}
		
		/*
		if(h%2==0&&v%2==0)
			System.out.println("1 2\n3 4");
		else if(h%2==1&&v%2==0)
			System.out.println("2 1\n4 3");
		else if(h%2==0&&v%2==1)
			System.out.println("3 4\n1 2");
		else if(h%2==1&&v%2==1)
			System.out.println("4 3\n2 1");
			*/
		
		System.out.println(num[0][0] + " " + num[0][1]);
		System.out.println(num[1][0] + " " + num[1][1]);
		
		scan.close();
	}
	
	public static long countInst(String line, String check)
	{
		int before = line.length();
		int after = line.replaceAll(check, "").length();
		return before-after;
	}

}
