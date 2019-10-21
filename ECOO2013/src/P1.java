import java.io.*;

public class P1 {
	public static void main(String[] args) throws IOException
	{
		FileReader file = new FileReader("DATA11.txt");
		BufferedReader read = new BufferedReader(file);
		
		int n = Integer.parseInt(read.readLine());
		int inTake = 0;
		int line = 0;
		
		boolean done = false;
		while(!done)
		{
			String in = read.readLine();
			if(in.contains("EOF"))
				done=true;
			else
			{
				if(in.contains("CLOSE"))
				{
					System.out.println(inTake + " " + line + " " + n);
					inTake=0;
					line=0;
				}
				else if(in.contains("TAKE"))
				{
					inTake++;
					line++;
					n=next(n);
				}
				else if(in.contains("SERVE"))
					line--;
			}
		}
		
		read.close();
	}
	
	public static int next(int n)
	{
		n++;
		if(n>999)
			n=1;
		return n;
	}
}
