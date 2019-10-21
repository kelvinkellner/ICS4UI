import java.util.*;

public class TandemBicycle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int type = scan.nextInt();
		int sets = scan.nextInt();
		scan.nextLine();
		
		String[] gs1 = scan.nextLine().split(" ");
		String[] gs2 = scan.nextLine().split(" ");
		
		int[] g1 = new int[gs1.length];
		int[] g2 = new int[gs2.length];
		
		for(int i=0; i<sets;i++)
		{
			g1[i]=Integer.parseInt(gs1[i]);
			g2[i]=Integer.parseInt(gs2[i]);
		}
		
		Arrays.sort(g1);
		Arrays.sort(g2);
		
		//int[] end = new int[sets];
		int total = 0;
		
		if(type==1)
		{
			for(int i=0; i<g1.length; i++)
			{
				if(g1[i]>=g2[i])
					total+=g1[i];
				else
					total+=g2[i];
			}
		}
		else
		{
			for(int i=g1.length-1; i>=0; i--)
			{
				if(g1[i]>=g2[g2.length-i-1])
					total+=g1[i];
				else
					total+=g2[g2.length-i-1];
			}
		}
		
		System.out.println(total);
		
		scan.close();
	}

}
