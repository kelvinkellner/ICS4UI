import java.io.*;

public class SqrtIO {

	public static void main(String[] args) {
		try
		{
			FileReader fileIn = new FileReader("SqrtIn.txt");
			BufferedReader read = new BufferedReader(fileIn);
			FileWriter fileOut = new FileWriter("SqrtOut.txt");
			PrintWriter print = new PrintWriter(fileOut);
			
			int size = fileLength("SqrtIn.txt");
			int perfects = 0;
			
			if(size>0)
			{
				int[] before = new int[size];
				double[] after = new double[size];
				boolean perfect = false;
				
				for(int i=0; i<before.length; i++)
				{
					try
					{
						perfect = false;
						String line = read.readLine();
						before[i] = Integer.parseInt(line);
						after[i] = Math.sqrt((double)(before[i]));
						
						if(after[i]-(after[i]%1)==after[i])
							perfect=true;
						
						if(perfect)
						{
							perfects++;
							//System.out.println("The sqrt of " + before[i] + " is exactly " + (int)(after[i]));
							print.println((int)(after[i]));
						}
						else
						{
							//System.out.println("The sqrt of " + before[i] + " is " + (Math.round(after[i] * 1000.0) / 1000.0) + " ...");
							print.println(after[i]);
						}
					}
					catch (Exception e)
					{
						System.out.println("\nError.\nLine " + (i+1) + " could not be parsed as an integer.\n");
					}
				} // Close for each number
				
				//System.out.println("\nPerfect squares: " + perfects);
				print.println("\nPerfect squares: " + perfects);
				System.out.println("Done.");
			}
			else
				System.out.println("\nError.\nInput file is empty.\n");
			
			read.close();
			print.close();
		}
		catch (IOException e)
		{
			System.out.println("\nError.\nInput file could no be located.\n");
		}
	} // Close Main Method
	
	public static int fileLength(String fileName)
	{
		int length = 0;
		
		try
		{
			FileReader file = new FileReader(fileName);
			BufferedReader read = new BufferedReader(file);
			boolean hasNextLine = true;
		
			while(hasNextLine)
			{
				String line = null; // Initialize
			
				try {
					line = read.readLine();
				} catch (Exception e) {
					hasNextLine=false; }
			
				if(line==null)
					hasNextLine=false;
				else
					length++;
			}
			
			read.close();
			
		} catch (Exception e) {
			System.out.println("\nError.\nFile length could not be calculated.\n");
		}
		
		return length;
	} // Close File Length Method
} // Close Main Class
