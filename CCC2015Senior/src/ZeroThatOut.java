import java.util.*;

public class ZeroThatOut {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int q = scan.nextInt();
		
		int tot = 0;
		
		int[] nums = new int[q];
		
		for(int i=0;i<q;i++)
			nums[i] = scan.nextInt();
		
		int streak = 0;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=0)
				tot+=nums[i];
			else
			{
				for(int j=i-1;j>0;j--)
				{
					if(nums[j]!=0)
					{
						tot-=nums[j];
						nums[j]=0;
						j=0;
					}
				}
			}
		}
		
		System.out.println(tot);
		
		scan.close();
	}

}
