public class PracticeTest {

	public static void main(String[] args)
	{
		int[] marks = {76,59,92,85};
		String[] students = {"Amy","Bill","Charlie","Dana"};
		
		//marks = sortBasedOn(marks, students);
		
		System.out.println("Students:\tMarks:");
		for(int i=0;i<marks.length;i++)
			System.out.println(students[i] + "\t\t" + marks[i]);
	}
	
	// Sort Based On Method
	// Sorts two arrays based on the numerical order of one array
	// 	int[] in - the array for the sorting order to be based on
	// 	String[] link - the array which will be sorted based on the order of array "a"
	public static int[] sortBasedOn(int[] in, String[] link)
	{
		// Initialize new split arrays
		int[] a = new int[in.length/2];
		int[] b = new int[in.length-a.length];
		
		String[] c = new String[link.length/2];
		String[] d = new String[link.length-c.length];
		
		for(int i=0;i<a.length;i++)
			a[i]=in[i];
		for(int i=0;i<b.length;i++)
			b[i]=in[i+a.length];
		
		for(int i=0;i<c.length;i++)
			c[i]=link[i];
		for(int i=0;i<d.length;i++)
			d[i]=link[i+c.length];
		
		if(a.length>1)
			a = sortBasedOn(a, c);
		if(b.length>1)
			b = sortBasedOn(b, d);
		
		int[] merged = new int[in.length];
		String[] linked = new String[link.length];
		
		int n=0;
		int m=0;
		
		for(int i=0;i<merged.length;i++)
		{
			if(n>=a.length)
			{
				merged[i]=b[m];
				linked[i]=d[m];
				m++;
			}
			else if(m>=b.length)
			{
				merged[i]=a[n];
				linked[i]=c[n];
				n++;
			}
			else
			{
				if(a[n]<b[m])
				{
					merged[i]=a[n];
					linked[i]=c[n];
					n++;
				}
				else
				{
					merged[i]=b[m];
					linked[i]=d[m];
					m++;
				}
			}
		}
		
		for(int i=0;i<linked.length;i++)
			System.out.println(linked[i]);
		return merged;
	}
}
