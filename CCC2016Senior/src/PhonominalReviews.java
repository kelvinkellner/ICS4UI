import java.util.*;

public class PhonominalReviews {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String line = scan.nextLine();
		String[] split = line.split(" ");
		
		int tot = Integer.parseInt(split[0]);
		int pho = Integer.parseInt(split[1]);
		
		line = scan.nextLine();
		split = line.split(" ");
		
		int[][] need = new int[2][split.length];
		
		for(int i=0; i<need.length; i++)
		{
			need[0][i]=Integer.parseInt(split[i]);
			need[1][i]=0;
		}
		
		int[][] path = new int[2][tot-1];
		
		for(int i=0; i<tot-1; i++)
		{
			line=scan.nextLine();
			split=line.split(" ");
			path[0][i] = Integer.parseInt(split[0]);
			path[1][i] = Integer.parseInt(split[1]);
		}

		
	}

}
