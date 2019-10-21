import java.util.*;

public class SumGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int days = scan.nextInt();
		scan.nextLine();
		
		String line = scan.nextLine();
		String[] split = line.split(" ");
		
		line=scan.nextLine();
		String[] split2=line.split(" ");
		
		int[] t1=new int[split.length];
		int[] t2=new int[split2.length];
		
		for(int i=0;i<split.length;i++)
		{
			t1[i]=Integer.parseInt(split[i]);
			t2[i]=Integer.parseInt(split2[i]);
		}
		
		int highTied = 0;
		int tot1=0;
		int tot2=0;
		
		for(int now=1;now<=days;now++)
		{
			tot1+=t1[now-1];
			tot2+=t2[now-1];
			
			if(tot1==tot2)
				highTied=now;
		}
		
		System.out.println(highTied);
		scan.close();
	}

}
