import java.util.*;

public class RoboThieves {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String line = scan.nextLine();
		String[] split = line.split(" ");
		
		int h = Integer.parseInt(split[0]);
		int w = Integer.parseInt(split[1]);
		
		String[][] grid = new String[w][h];
		
		int[] s = new int[2];
		int empties = 0;
		
		for(int i=0;i<h;i++)
		{
			line = scan.nextLine();
			grid[i]=line.split("");
			
			for(int j=0;j<w;j++)
			{
				if(grid[i][j]=="S")
				{
					s[0] = j;
					s[1] = i;
				}
				if(grid[i][j]==".")
					empties++;
			}
		}
		
		int[] r = {s[0], s[1]};
		
		int[][] empty = new int[empties][2];
		int count = 0;
		
		for(int y=0; y<h; y++)
		{
			for(int x=0; x<w; x++)
			{
				if(grid[x][y]==".")
				{
					empty[count][0] = x;
					empty[count][1] = y;
					count++;
				}
			}
		}
		
		for(int i=0; i<empties; i++)
		{
			if(trapped(grid, empty[i]))
			r[0] = s[0];
			r[1] = s[1];
			while(r[0] != empty[i][0] && r[1] != empty[i][1])
			{
				
			}
		}
	}
	
	public static boolean trapped(int[][] grid, int[] pos)
	{
		L = side(grid, pos, "L");
		R = side(grid, pos, "R");
U side(grid, pos, "U") && side(grid, pos, "D"))
			
	}
}
