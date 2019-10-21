import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); // 2 to 2 million
		int[] rad = new int[n];
		
		for(int i=0;i<n;i++)
			rad[i]=scan.nextInt();
		
		Arrays.sort(rad);
		
		int[] first = new int[0];
		int[] second = new int[0];
		int f1 = 0;
		int f2 = 0;
		
		int count = 0;
		//System.out.println("l: " + rad.length);
		
		for(int i=0;i<rad.length;i++)
		{
			count=0;
			for(int j=i;j<rad.length;j++)
			{
				if(rad[i]==rad[j])
					count++;
				else
					j=rad.length;
			}
			
			//System.out.println("# of " + rad[i] + "'s: " + count);
			
			if(count>f1)
			{
				second = first.clone();
				first = new int[1];
				first[0] = rad[i];
				f1=count;
			}
			else if(count==f1)
			{
				first = addTo(first, rad[i]);
			}
			else if(count>f2)
			{
				second = new int[1];
				second[0] = rad[i];
				f2=count;
			}
			else if(count==f2)
			{
				second = addTo(second, rad[i]);
			}
			i+=count-1;
		}
		
		if(first.length==1 && second.length==1)
			System.out.println(Math.abs(first[0]-second[0]));
		else
		{
			if(second.length<1)
				second=first.clone();
			
			int bigF = first[0];
			int smallF = first[0];
			int bigS = second[0];
			int smallS = second[0];
			
			for(int i=0;i<first.length;i++)
			{
				if(first[i]>bigF)
					bigF=first[i];
				else if(first[i]<smallF)
					smallF=first[i];
			}
			
			for(int i=0;i<second.length;i++)
			{
				if(second[i]>bigS)
					bigS=second[i];
				else if(second[i]<smallS)
					smallS=second[i];
			}
			
			int dif1 = Math.abs(bigF-smallS);
			int dif2 = Math.abs(bigS-smallF);
			int largerDif = 0;
			
			if(dif1>dif2)
				largerDif=dif1;
			else
				largerDif=dif2;
			
			System.out.println(largerDif);
		}
		/*
		else
		{
			int big = 0;
			int small = (int) Math.pow(10, 10);
			
			if(first.length>1)
			{
				for(int i=1; i<first.length; i++)
				{
					if (first[i]>big)
						big=first[i];
				}
					
			}
			
			if(second.length>1)
			{
				for(int i=1; i<second.length; i++)
				{
					if (second[i]<small)
						small=second[i];
				}
					
			}
			
			int dif1 = Math.abs(big-small);
			
			small = first[0];
			big = (int) Math.pow(10, 10);
			
			if(first.length>1)
			{
				for(int i=1; i<first.length; i++)
				{
					if (first[i]<small)
						small=first[i];
				}
					
			}
			
			if(second.length>1)
			{
				for(int i=1; i<second.length; i++)
				{
					if (second[i]>big)
						big=second[i];
				}
					
			}
			
			int dif2 = Math.abs(big-small);
			
			int gDif = 0;
			
			if(dif1>dif2)
				gDif=dif1;
			else
				gDif=dif2;
			
			System.out.println(gDif + "gang");
			
			*/
			
			scan.close();
	}
	
	public static int[] addTo(int[] array, int val)
	{
		int[] big = new int[array.length+1];
		
		for(int i=0;i<array.length;i++)
			big[i]=array[i];
		
		big[big.length-1]=val;
		
		//System.out.println("add");
		
		return big;
	}

}
