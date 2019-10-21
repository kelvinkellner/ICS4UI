import java.util.*;

public class NailedItATTEMPT3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		scan.nextLine();
		String line = scan.nextLine();
		String[] split = line.split(" ");
		int[][] wood = new int[2][split.length];
		
		for(int i=0;i<split.length;i++)
		{
			wood[0][i]=0;
			wood[1][i]=Integer.parseInt(split[i]);
		}
		
		Arrays.sort(wood[1]);
		
		int length=0;
		int maxLength=0;
		int maxWays=0;
		
		for(int i=2;i<4000;i++)
		{
			length=0;
			for(int x=0;x<wood[0].length;x++)
			{
				if(wood[0][x]==1)
					wood[0][x]=0;
			}
			
			for(int j=0;j<wood[1].length;j++)
			{
				if(wood[1][j]<i)
				{
					for(int k=j+1;k<wood[1].length;k++)
					{
						if(wood[0][j]==0 && wood[0][k]==0)
						{
							if(wood[1][j]+wood[1][k]==i)
							{
								//System.out.println(i + "," + wood[1][j] + "," + wood[1][k]);
								length++;
								wood[0][j]=1;
								wood[0][k]=1;
							}
						}
					}
				}
			}
			if(length>maxLength)
			{
				maxLength=length;
				maxWays=1;
			}
			else if(length==maxLength)
				maxWays++;
		}
		
		System.out.println(maxLength + " " + maxWays);
		
		scan.close();
	}

}
