import java.util.*;

public class FavouriteTimes {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		int[] time = {1, 2, 0, 0};
		
		int d = scan.nextInt();
		int count = 0;
		
		int toAdd = d;
		int preSum = 0;
		
		if(toAdd > 720)
		{
			toAdd = d%720;
			preSum = 31 * ((d-toAdd)/720);
		}
		
		for(int i=0; i<toAdd; i++)
		{
			addMin(time);
			if(time[0]!=0)
			{
				if(time[0]-time[1]==time[1]-time[2] && time[1]-time[2]==time[2]-time[3] )
				{
					count++;
					//System.out.println(time[0] + "" + time[1] + ":" + time[2] + "" + time[3]);
				}
			}
			else
			{
				if(time[1]-time[2]==time[2]-time[3])	
				{
					count++;
				}
			}
		}
		
		count += preSum;
		
		scan.close();
		System.out.println(count);
	}
	
	public static void addMin(int[] time)
	{
		if(time[3] == 9)
		{
			if(time[2] == 5)
			{
				if(time[1]==2 && time[0] == 1)
				{
					time[0]=0;
					time[1]=1;
				}
				else if (time[1] != 9)
				{
					time[1]++;
				}
				else
				{
					time[0]=1;
					time[1]=0;
				}
				time[2]=0;
			}
			else
			{
				time[2]++;
			}
			time[3]=0;
		}
		else
			time[3]++;
	}
	
}
