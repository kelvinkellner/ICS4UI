
public class RecursiveEleven {

	public static void main(String[] args) {
		int[] nums = {1,54,4124,214,4,676,241,543,12,64,3,888,62};
		
		System.out.println(inArray(nums, 12));
	}
	
	public static boolean inArray(int[] nums, int val)
	{
		return inArray(nums, val, 0);
	}
	
	public static boolean inArray(int[] nums, int val, int i)
	{
		if(i>=nums.length)
			return false;
		else if(nums[i]==val)
			return true;
		else
			return inArray(nums, val, i+1);
	}
}
