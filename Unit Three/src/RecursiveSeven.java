
public class RecursiveSeven {

	public static void main(String[] args) {
		int[] nums = {1,12,5,500,640,2001,2019,420,69,3214,1234,2234};
		
		System.out.println(sumArray(nums, 0));
	}
	
	public static int sumArray(int[] nums, int counter)
	{
		if(counter<nums.length)
			return nums[counter] + sumArray(nums, counter+1);
		return 0;
	}
}
