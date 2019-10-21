import java.util.Arrays;
import java.util.Random;

public class GoogleProblem {
	
	public static void main(String[] args)
	{
		int[] nums = {1,5,3,4,5,4,5,3,2,14};
		
		System.out.println(isSum(nums,2));
		System.out.println(isSumUnsorted(nums,2));
		System.out.println(isSum(nums,9));
		System.out.println(isSumUnsorted(nums,9));
	}
	
	public static boolean isSum(int[] a, int sum)
	{
		Arrays.sort(a);
		
		int l=0;
		int r=a.length-1;
		
		while(true)
		{
			//System.out.println(a[l] + " " + a[r]);
			if(l==r)
				return false;
			else if(a[l]+a[r]==sum)
				return true;
			else if(a[l]+a[r]>sum)
				r--;
			else if(a[l]+a[r]<sum)
				l++;
		}
	}
	
	public static boolean isSumUnsorted(int[] a, int sum)
	{
		// { 1,0,3,2 }
		int l=0;
		int r=a.length-1;
		
		while(true)
		{
			System.out.println(a[l] + " " + a[r]);
			if(l>=a.length||r<0)
				return false;
			else if(l==r)
			{
				int temp = r;
				r=l;
				l=temp;
			}
			else if(a[l]+a[r]==sum)
				return true;
			else if(a[l]+a[r]>sum)
				r--;
			else if(a[l]+a[r]<sum)
				l++;
		}
	}
	
	public static boolean isSum2(int[] a, int sum)
	{
		int loops = 0;
		Random random = new Random();
		while(loops<Math.pow(a.length, 5))
		{
			int num1 = random.nextInt(a.length-1);
			int num2 = random.nextInt(a.length-1);
			
			System.out.println(a[num1] + " " + a[num2]);
			
			if(a[num1] + a[num2] == sum)
				return true;
		}
		return false;
	}
	
}
