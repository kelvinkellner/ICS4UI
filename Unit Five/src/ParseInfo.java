import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ParseInfo {
	public static void main(String[] args) throws IOException
	{
		int moves = count("MOVES.txt");
		
		FileReader file = new FileReader("MOVES.txt");
		BufferedReader read = new BufferedReader(file);
		
		FileWriter out = new FileWriter("OUT.txt");
		PrintWriter print = new PrintWriter(out);
		
		print.println("@POKEMON DEFAULT DATA@");
		
		for(int i=0;i<moves;i++)
		{
			String line = read.readLine();
			line = line.substring(2,line.length());
			String[] split = line.split("	");
			for(int j=0;j<split.length;j++)
				split[j]=split[j].replaceAll("\\*","");
			//System.out.println(line);
			print.println(split[0]+"#"+split[1]+"#"+split[2]+"#"+split[3]+"#"+split[5]+"#"+split[6]+"#"+split[7]);
		}
		read.close();
		print.close();
		System.out.println("DONE!");
	}
	
	public static int count(String file) throws IOException
	{
		FileReader in = new FileReader(file);
		BufferedReader read = new BufferedReader(in);
		
		int count = 0;
		
		boolean end = false;
		while(!end)
		{
			String line = read.readLine();
			if(line==null)
				end=true;
			else
			{
				count++;
			}
		}
		
		return count;
	}
}
