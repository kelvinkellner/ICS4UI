import java.util.*;

public class NailedItATTEMPT2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		scan.nextLine();
		String line = scan.nextLine();
		String[] split = line.split(" ");
		int[] wood = new int[split.length];
		
		for(int i=0;i<split.length;i++)
			wood[i]=Integer.parseInt(split[i]);
		
		Arrays.sort(wood);
		
		int length = 0;
		int ways = 0;
		int maxLength = 0;
		int maxWays = 0;
		boolean jUsed = false;
		
		for(int i=2;i<4000;i++)
		{
			length=0;
			ways=0;
			for(int j=0;j<wood.length;j++)
			{
				jUsed = false;
				for(int k=j+1;k<wood.length;k++)
				{
					if(wood[j]+wood[k]==i && wood[j]!=0 && wood[k]!=0)
					{
						//System.out.println(wood[j] + "+" + wood[k] + "=" + i);
						if(!jUsed)
						{
							length++;
							wood[j]=0;
							wood[k]=0;
						}
						else
						{
							ways++;
						}
					}
				}
			}
			if(length==maxLength)
				maxWays+=1+ways;
			else if(length>maxLength)
			{
				maxLength=length;
				maxWays=1;
			}
		} // for each wood

		System.out.println(maxLength + " " + maxWays);
		
		scan.close();
	} // end main

}
