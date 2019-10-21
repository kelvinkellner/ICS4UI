import java.util.*;

public class VoronoiVillages {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int v = scan.nextInt();
		
		int[] vils = new int[v];
		
		for(int i=0;i<v;i++)
		{
			vils[i]=scan.nextInt();
		}
		scan.nextLine();
		
		Arrays.sort(vils);
		
		double smallestSize = Math.pow(vils[v-1],2);
		
		for(int i=1;i<v-1;i++)
		{
			double size = getSize(vils, i);
			//System.out.println(size);
			//System.out.println(Math.round(size*10.0)/10.0);
			//System.out.println(Math.round((double)size*10.000) + " " + ((double)size*10.000) + " " + (Math.round((double)size*10.000) == (double)size*10.000));
			//System.out.println(size%0.1 + " " + size);
			if(size-(size*10.0%1.0/10.0)==size)
			{
				if(size<smallestSize)
					smallestSize=size;
			}
		}
		
		System.out.println(smallestSize);
		
		scan.close();
	}
	
	public static double getSize(int[] vils, int in)
	{
		double size = ((double)vils[in]-(double)vils[in-1])/2.000+((double)vils[in+1]-(double)vils[in])/2.000;
		return size;
	}

}
