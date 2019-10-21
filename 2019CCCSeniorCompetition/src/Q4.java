import java.util.*;

class Row {
	int[] cells;
	
	Row(int size)
	{
		cells = new int[size];
	}
	
	void Add(int index, int value)
	{
		cells[index] = value;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n=scan.nextInt();
		int k=scan.nextInt();
		
		Row[] rows = new Row[n];
		
		for(int i=0;i<n;i++)
		{
			rows[i] = new Row(i+1);
			for(int j=0;j<i+1;j++)
			{
				rows[i].Add(j, scan.nextInt());
			}
		}
		
		//int count=countTot(n);
		int total=0;
		
		for(int i=0;i<rows.length;i++)
		{
			for(int j=0;j<rows[i].cells.length;j++)
			{
				if(posExists(rows, i, j, k))
					total+= triVal(rows, i, j, k);
			}
		}
		
		System.out.println(total);
		
		scan.close();
	}
	
	public static int countTot(int n)
	{
		int total=0;
		if(n>0)
			total = n + countTot(n-1);
		return total;
	}
	
	public static boolean posExists(Row[] rows, int row, int index, int size)
	{
		if(row>=size-1 && rows[row].cells.length>index+size-1)
		{
			return true;
		}
		return false;
	}

	public static int triVal(Row[] rows, int row, int index, int size)
	{
		int yS=row;
		int xS=index;
		int yE=row-size+1;
		int xE=index+size-1;
		
		//System.out.println("R:" + yS + "-" + yE + "\nC:" + xS + "-" + xE);
		
		int big=0;
		int rowBuf=0;
		
		for(int y=yS;y>=yE;y--)
		{
			for(int x=xS;x<=xE-rowBuf;x++)
			{
				if(rows[y].cells[x]>big)
					big=rows[y].cells[x];
			}
			rowBuf++;
		}
		
		return big;
	}
}
