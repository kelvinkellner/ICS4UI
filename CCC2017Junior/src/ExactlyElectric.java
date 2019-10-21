import java.util.*;

public class ExactlyElectric {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] road = new int[2][2];
		
		String line = scan.nextLine();
		String[] store = line.split(" ");
		
		road[0][0] = Integer.parseInt(store[0]);
		road[0][1] = Integer.parseInt(store[1]);
		
		line = scan.nextLine();
		store = line.split(" ");
		
		road[1][0] = Integer.parseInt(store[0]);
		road[1][1] = Integer.parseInt(store[1]);
		
		int fuel = scan.nextInt();
		
		while(fuel!=0)
		{
			if(road[0][0]==road[1][0] && road[0][1]==road[1][1])
			{
				if(fuel%2!=0)
				{
					road[0][0]=road[1][0]+11;
					road[0][1]=road[1][1]+11;
				}
				fuel=0;
			}
			else
			{
				moveCloser(road);
				fuel--;
			}
		}
		
		if(road[0][0]==road[1][0] && road[0][1]==road[1][1])
			System.out.println("Y");
		else
			System.out.println("N");

		scan.close();
	}
	
	public static void moveCloser(int[][] road)
	{
		if(road[0][0]>road[1][0])
			road[0][0]--;
		else if(road[0][0]<road[1][0])
			road[0][0]++;
		else if(road[0][1]>road[1][1])
			road[0][1]--;
		else
			road[0][1]++;
	}

}
