import java.util.*;

public class ShiftySum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int shifts = scan.nextInt();
		
		int total = num;
		
		for(int i=0; i<shifts; i++)
		{
			total += num * (int)Math.pow(10,i+1);
		}
		
		System.out.println(total);
		scan.close();
	}

}
