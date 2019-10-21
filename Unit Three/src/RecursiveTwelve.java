
public class RecursiveTwelve {

	public static void main(String[] args) {
		int[] nums = {1,54,4124,214,4,676,241,543,12,64,3,888,62,12,143,14,12};
		
		System.out.println(inArray(nums, 12));
	}
	
	public static int inArray(int[] nums, int val)
	{
		return inArray(nums, val, 0);
	}
	
	public static int inArray(int[] nums, int val, int i)
	{
		if(i>=nums.length)
			return 0;
		else if(nums[i]==val)
			return 1 + inArray(nums,val,i+1);
		else
			return inArray(nums, val, i+1);
	}
}
