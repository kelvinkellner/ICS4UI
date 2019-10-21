import java.util.*;

public class CircleOfLife {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String line = scan.nextLine();
		String[] split = line.split(" ");
		
		int toPass = Integer.parseInt(split[1]);
		
		String data = scan.nextLine();
		split = data.split("");
		
		int[] cell = new int[split.length];
		int[] newCell = new int[split.length];
		
		for(int i=0;i<split.length;i++)
			cell[i] = Integer.parseInt(split[i]);
		
		for(int day=0;day<toPass;day++)
		{
			for(int i=0;i<cell.length;i++)
			{
				if(aliveBeside(cell,i)==1)
					newCell[i]=1;
				else
					newCell[i]=0;
			}
			cell=newCell.clone();
		}
		
		String output = "";
		
		for(int i=0;i<cell.length;i++)
			output+=cell[i] + "";
		
		System.out.println(output);
		
		scan.close();
	}
	
	public static int aliveBeside(int[] cell, int index)
	{
		int left = index-1;
		int right = index+1;
		
		if(left<0)
			left = cell.length-1;
		if(right>cell.length-1)
			right = 0;
		
		int count = 0;
		
		if(cell[left]==1)
			count++;
		if(cell[right]==1)
			count++;
		
		return count;
	}

}
