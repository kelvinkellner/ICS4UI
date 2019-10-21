import java.util.*;

public class ComputerPurchase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		
		String[] names = new String[n];
		int[][] stats = new int[n][3];
		int[] comp = new int[n];
		
		for(int i=0;i<n;i++)
		{
			String line = scan.nextLine();
			String[] split = line.split(" ");
			
			names[i] = split[0];
			stats[i][0] = Integer.parseInt(split[1]);
			stats[i][1] = Integer.parseInt(split[2]);
			stats[i][2] = Integer.parseInt(split[3]);
			comp[i] = 2*stats[i][0] + 3*stats[i][1] + stats[i][2];
		}
		
		for(int i=0; i<n;i++)
		{
			for(int j=n;j>0;j--)
			{
				if(comp[0]>comp[j])
					swap(names, comp, 0, j);
				else if(comp[0]==comp[j])
				{
					if(names[0].charAt(0)<names[j].charAt(0))
						swap
				}
			}
		}
	}
	
	public static void swap(String[] names, int[] comp, int p1, int p2)
	{
		String nSave = names[p1];
		int cSave = comp[p1];
		
		names[p1]=names[p2];
		comp[p1]=comp[p2];
		
		names[p2]=nSave;
		comp[p2]cSave;
	}

}
