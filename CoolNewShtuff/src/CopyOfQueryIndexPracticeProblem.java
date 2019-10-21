// https://www.hackerrank.com/challenges/java-arraylist/problem

import java.util.*;
import java.io.*;

public class CopyOfQueryIndexPracticeProblem {

	public static void main(String[] args) throws NumberFormatException, IOException {
		FileReader fileIn = new FileReader("queryin.txt");
		BufferedReader read = new BufferedReader(fileIn);
		//FileWriter fileOut = new FileWriter("queryout.txt");
		//PrintWriter print = new PrintWriter(fileOut);
		
		ArrayList<int[]> list = new ArrayList<int[]>();
		
		int listCount = Integer.parseInt(read.readLine());
		
		for(int i=0;i<listCount;i++)
		{
			String[] split = read.readLine().split(" ");
			int[] newSet = new int[Integer.parseInt(split[0])];
			for(int j=0;j<newSet.length;j++)
				newSet[j]=Integer.parseInt(split[j+1]);
			list.add(newSet);
		}
		
		int test = Integer.parseInt(read.readLine());
		for(int i=0;i<test;i++){
			String line = read.readLine();
			String[] split = line.split(" ");
			try
			{
				System.out.println(list.get(Integer.parseInt(split[0])-1)[Integer.parseInt(split[1])-1]);
			}
			catch(Exception e)
			{
				System.out.println("ERROR!");
			}
		}
		
		//System.out.println("Done.");
		
		read.close();
		//print.close();
	}

}
