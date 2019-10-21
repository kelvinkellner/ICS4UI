// Kelvin Kellner
// Mrs. Cooper
// March 4th 2019
// Unit 2 Coding Quiz - File I/O

import java.io.*;

class Animal // Animal class. Just to make life easier :)
{
	String name;
	String sound;
	int amount;
	// We could always make more variables here, for example, a colour or age variable.
	
	Animal(String n, String s, int a)
	{
		name=n;
		sound=s;
		amount=a;
	}

	void Add()
	{
		amount++;
	}
	
	// The rest are unnecessary for my needs, but are good for reusability!
	
	void Sub()
	{
		amount--;
	}
	
	void Add(int change)
	{
		amount+=change;
	}
	
	void Sub(int change)
	{
		amount-=change;
	}
}

public class Unit2IOQuiz {
	
	public static void main(String[] args) {
		
		// Change these if needed :)
		String fileInName = "animal3.txt";
		String fileOutName = "sounds3.txt";
		
		// Add more animals! Keep their sounds and names in order :)
		String[] names = {"cow","horse","sheep","duck","pig","cat"};
		String[] sounds = {"moo","neigh","baa","quack","oink","meow"};
		
		
		// And now for the code ;)
		
		Animal[] animals = new Animal[names.length];
		
		for(int i=0;i<animals.length;i++) // New Animal object for each type
			animals[i]=new Animal(names[i],sounds[i],0);
		
		try
		{
			FileReader fileIn = new FileReader(fileInName);
			BufferedReader read = new BufferedReader(fileIn);
			FileWriter fileOut = new FileWriter(fileOutName);
			PrintWriter print = new PrintWriter(fileOut);
			
			int length = fileLength(fileInName);
			
			// Print sounds
			for(int i=0;i<length;i++)
			{
				String name = read.readLine();
				boolean found = false;
				
				for(int j=0;j<animals.length;j++)
				{
					if(name.equalsIgnoreCase(animals[j].name))
					{
						animals[j].Add(); // add 1 to the amount of that animal
						print.println(animals[j].sound);
						found=true;
					}
				}
				
				if(!found)
					System.out.println("\nError.\nThe animal \"" + name + "\" was not found in our system.\nPlease add the animal and its sound to the program code.\n");
			}
			
			// Print amounts of each animal
			print.println();
			print.println("\nOld MacDonald has:");
			
			for(int i=0;i<animals.length;i++)
				print.println(animals[i].amount + " " + animals[i].name + isPlural(animals[i].amount, "s"));
			
			System.out.println("Done!");
			
			read.close();
			print.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("\nError.\nThe input file could not be found.\n");
		}
		catch (IOException e)
		{
			System.out.println("\nError.\nThere was a problem reading from the file.\n");
		}
		
	}
	
	public static int fileLength(String fileName)
	{
		int lines = 0;
		
		try
		{
			FileReader file = new FileReader(fileName);
			BufferedReader read = new BufferedReader(file);
			
			boolean reachedEnd = false;
			
			while(!reachedEnd)
			{
				if(read.readLine()==null)
					reachedEnd=true;
				else
					lines++;
			}
			
			read.close();
		}
		catch (Exception e)
		{
			System.out.println("\nError.\nWe could not successfully determine the length of the input file.\n");
		}
		
		return lines;
	}
	
	public static String isPlural(int quantity, String adder)
	{
		// returns an "s" if there is more than one of the animal.
		if(quantity>1)
			return adder;
		else
			return "";
	}

}
