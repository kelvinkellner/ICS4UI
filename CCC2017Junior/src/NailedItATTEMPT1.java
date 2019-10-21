import java.util.*;

public class NailedItATTEMPT1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//int n = scan.nextInt();
		scan.nextInt();
		scan.nextLine();
		
		String line = scan.nextLine();
		String[] split = line.split(" ");
		int[] planks = new int[split.length];
		
		for(int i=0;i<split.length;i++)
			planks[i]=Integer.parseInt(split[i]);
		
		Arrays.sort(planks);
		
		int length = 0;
		int ways = 0;
		int highestWays = 0;
		
		for(int i=2;i<4000;i++)
		{
			for(int j=0;j<planks.length;j++)
			{
				for(int k=j+1;k<planks.length;k++)
				{
					if(planks[j]+planks[k]==i)
					{
						if(length!=i)
						{
							length=i;
							ways=1;
						}
						else
						{
							ways++;
						}
						if(ways>=highestWays)
						{
							highestWays=ways;
						}
					}
				}
			}
		}
		
		int waysForSet=0;
		int count=0;
		
		for(int i=2;i<4000;i++)
		{
			waysForSet=0;
			for(int j=0;j<planks.length;j++)
			{
				for(int k=j+1;k<planks.length;k++)
				{
					if(planks[j]+planks[k]==i)
					{
						waysForSet++;
					}
				}
			}
			if(waysForSet==highestWays)
				count++;
		}
		
		System.out.println(highestWays + " " + count);
		
		
		scan.close();
	}

}
