import java.io.*;

public class P2 {
	public static void main(String[] args) throws IOException
	{
		FileReader file = new FileReader("DATA21.txt");
		BufferedReader read = new BufferedReader(file);
		
		for(int cases=0;cases<5;cases++)
		{
			
			String line = read.readLine();
			line = reverse(line);
			String[] split = line.split(" ");
			
			
		}
		
		read.close();
	}
	
	public static String reverse(String line)
	{
		if(line.isEmpty())
			return "";
		return line.substring(1,line.length()) + line.charAt(0);
	}
}
