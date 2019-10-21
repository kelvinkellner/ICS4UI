import java.util.*;

public class WhatIsNDaddy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		System.out.println(factoral(1));
		System.out.println(factoral(2));
		System.out.println(factoral(3));
		System.out.println(factoral(4));
		System.out.println(factoral(5));
		System.out.println(factoral(6));
		System.out.println(factoral(7));
		System.out.println(factoral(8));
		System.out.println(factoral(9));
		System.out.println(factoral(10));
		
		scan.close();
	}
	
	public static int factoral(int n)
	{
		int[] combo = new int[5];
		int total = 0;
		
		for(int i=0;i<combo.length;i++)
			combo[i]=0;
		
		for(int i=0;i<combo.length;i++)
		{
			for(int j=0;j<combo.length;j++)
			{
				if(i+j+2==n && combo[i]==0 && combo[j]==0)
				{
					total++;
					combo[i]=1;
					combo[j]=1;
				}
			}
		}
		
		return total;
	}

}
