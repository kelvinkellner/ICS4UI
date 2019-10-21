import java.util.*;

public class Q3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		String line = scan.nextLine();
		String[] split1=line.split(" ");
		
		line = scan.nextLine();
		String[] split2=line.split(" ");
		
		line = scan.nextLine();
		String[] split3=line.split(" ");
		
		int[][] grid = new int[3][split1.length];
		
		for(int i=0;i<split1.length;i++)
			grid[0][i]=Integer.parseInt(split1[i]);
		
		for(int i=0;i<split2.length;i++)
			grid[1][i]=Integer.parseInt(split2[i]);
		
		for(int i=0;i<split2.length;i++)
			grid[2][i]=Integer.parseInt(split2[i]);
		
		
		
		
		scan.close();
	}

}
