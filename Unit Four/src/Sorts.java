// Algorithm Design
// ICS 4UI
//
// - Linear Search: check from left to right
// - Binary Search: keep splitting a sorted array in half and checking the midpoint, moving up and down as you go
//
// Non-Recursive Sorts
// 1. Bubble Sort: swap with neighbour moving right, restart at the 2nd number and repeat all over again
// 2. Selection Sort: keep moving the smallest values to the start and moving the start to the right until the array is sorted
// 3. Insertion Sort: move through the array, grabbing smaller cards and inserting them earlier in the array, sliding the rest over
// 4. Shell Sort: like bubble sort, swap across a gap, called a "shell" rather than just swapping neighbours
// 5. Counting Sort: keep a tally of the number of instances of each number within a range and create a new array in order
//
// Recursive Sorts
// 6. Merge Sort: split array into smaller arrays of size 1, merging sub-arrays up the ladder until all arrays are merged and sorted
// 7. Quick Sort: work on two halves of an array called "partitions" separating by smaller than and less than a pivot and recursively repeating

public class Sorts {

	// Main Method
	public static void main(String[] args)
	{
		System.out.println("Unsorted:");
		int[] nums = {1,4,2,6,9,-2,6,7,3,3,6,3,7,5,8,4,7,3,0,-5,7,-7};
		print(nums);
		
		//System.out.println(linearSearch(nums, 5));
		//System.out.println(binarySearch(nums, -3));
		
		//nums = bubbleSort(nums);
		//nums = selectionSort(nums);
		//nums = insertionSort(nums);
		//nums = shellSort(nums);
		//nums = countingSort(nums);
		
		//nums = mergeSort(nums);
		nums = quickSort(nums);
		
		// Printing
		System.out.println("\nSorted:");
		print(nums);
	} // End Main Method
	
	// Linear Search
	public static boolean linearSearch(int[] a, int check)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==check)
				return true;
		}
		return false;
	} // End Linear Search
	
	// Binary Search
	public static boolean binarySearch(int[] a, int check)
	{
		return binarySearch(a, check, 0, a.length-1);
	}
	
	public static boolean binarySearch(int[] a, int check, int low, int high)
	{
		int mid = (high+low)/2;
		
		if(low>high)
			return false;
		else if(a[mid]==check)
			return true;
		else if(a[mid]<check)
			return binarySearch(a,check,low,mid-1);
		else if(a[mid]>check)
			return binarySearch(a,check,mid+1,high);
		else
			return false;
	} // End Binary Search
	
	// Bubble Sort
	public static int[] bubbleSort(int[] a)
	{
		for(int i=a.length-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(a[j]>a[j+1])
					a=swap(a,j,j+1);
			}
		}
		return a;
	} // End Bubble Sort
	
	// Selection Sort
	public static int[] selectionSort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int low = i;
			for(int j=i;j<a.length;j++)
			{
				if(a[j]<a[low])
					low=j;
			}
			swap(a,i,low);
		}
		return a;
	} // End Selection Sort
	
	// Insertion Sort
	public static int[] insertionSort(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int temp = a[i];
			for(int j=i-1;j>=0;j--)
			{
				if(temp<a[j])
				{
					a[j+1]=a[j];
					a[j]=temp;
				}
				else
					j=-1;
			}
		}
		return a;
	} // End Insertion Sort
	
	// Shell Sort
	public static int[] shellSort(int[] a)
	{
		int shell = shellSize(a.length);
		while(shell>0)
		{
			boolean swapped = false;
			for(int i=0;i<a.length-shell;i++)
			{
				if(a[i]>a[i+shell])
				{
					swap(a,i,i+shell);
					swapped = true;
				}
			}
			if(!swapped)
				shell/=2;
		}
		return a;
	} // End Shell Sort
	
	// Shell Size Method
	public static int shellSize(int size)
	{
		int pow = 0;
		while(Math.pow(2,pow)<size)
			pow++;
		return (int)Math.pow(2,pow-2);
	} // End Shell Size Method
	
	// Counting Sort
	public static int[] countingSort(int[] a)
	{
		int max = findMax(a);
		int min = findMin(a);
		int range = max-min+1;
		
		int[] tally = new int[range];
		
		for(int i=0;i<a.length;i++)
			tally[a[i]-min]++;
		
		int i=0;
		for(int t=0;t<tally.length;t++)
		{
			for(int c=0;c<tally[t];c++)
			{
				a[i]=t+min;
				i++;
			}
		}
		return a;
	} // End Counting Sort
	
	public static int findMax(int[] a)
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		return max;
	} // End Find Max
	
	public static int findMin(int[] a)
	{
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		return min;
	} // End Find Min
	
	public static int[] mergeSort(int[] in)
	{
		int[] a = new int[in.length/2];
		int[] b = new int[in.length-a.length];
		
		for(int i=0;i<a.length;i++)
			a[i]=in[i];
		for(int i=a.length;i<in.length;i++)
			b[i-a.length]=in[i];
		
		if(a.length>1)
			a = mergeSort(a);
		if(b.length>1)
			b = mergeSort(b);
		
		int[] merged = new int[a.length + b.length];
		
		int i=0;
		int j=0;
		
		for(int m=0;m<merged.length;m++)
		{
			if(i<a.length)
			{
				if(j<b.length)
				{
					if(a[i]<b[j])
					{
						merged[m]=a[i];
						i++;
					}
					else
					{
						merged[m]=b[j];
						j++;
					}
				}
				else
				{
					merged[m]=a[i];
					i++;
				}
			}
			else
			{
				merged[m]=b[j];
				j++;
			}
		}
		return merged;
	} // End Merge Sort
	
	// Quick Sort
	public static int[] quickSort(int[] a)
	{
		return quickSort(a, 0, a.length-1);
	}
	
	public static int[] quickSort(int[] a, int x, int y)
	{
		if(y-x<=0)
		{
			return a;
		}
		else
		{
			int p = y;
			int s = x-1;
			 
			 for(int i=x;i<y;i++)
			 {
				 if(a[i]<a[p])
				 {
					 a = swap(a, i, s+1);
					 s++;
				 }
			 }
			 
			 a = swap(a, s+1, y);
			 
			 a = quickSort(a, x, s);
			 a = quickSort(a, s+2, y);
			 
			 return a;
		}
	} // End Quick Sort
	
	
	// Swap Method
	public static int[] swap(int[] a, int i, int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		return a;
	} // End Swap Method
	
	// Print Array Method
	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(i<=0)
				System.out.print(a[i]);
			else
				System.out.print(" " + a[i]);
		}
	} // End Print Array Method
	
} // End Class
