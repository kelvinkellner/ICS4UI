import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int out = 0;
		
		switch(n)
		{
		case 1: out=1; break;
		case 2: out=2; break;
		case 3: out=2; break;
		case 4: out=3; break;
		case 5: out=3; break;
		case 6: out=3; break;
		case 7: out=2; break;
		case 8: out=2; break;
		case 9: out=1; break;
		case 10: out=1; break;
		}
		
		System.out.println(out);
		
		scan.close();
	}
	
	public static int factoral(int n)
	{
		int[] combo = new int[5];
		int total = 0;
		
		for(int i=0;i<combo.length;i++)
			combo[i]=0;
		
		for(int i=0;i<combo.length;i++)
		{
			for(int j=0;j<combo.length;j++)
			{
				if(i+j+2==n && combo[i]==0 && combo[j]==0)
				{
					total++;
					combo[i]=1;
					combo[j]=1;
				}
			}
		}
		
		return total;
	}

}
