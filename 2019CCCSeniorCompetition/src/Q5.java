import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double n = (double) scan.nextInt();
		double k = (double) scan.nextInt();
		scan.nextLine();
		
		String line = scan.nextLine();
		String[] split = line.split(" ");
		
		int[] att = new int[split.length];
		
		for(int i=0;i<split.length;i++)
			att[i] = Integer.parseInt(split[i]);
		
		Arrays.sort(att);
		
		int total = 0;
		
		int days = 0;
		
		if((n/k)%1!=0)
			days+=(n-(n/k)%1)/k+1;
		else
			days+=n/k;
		
		for(int i=0;i<days;i++)
		{
			total+=att[att.length-1-i];
		}
		
		System.out.println(total);
		
		scan.close();
	}

}
