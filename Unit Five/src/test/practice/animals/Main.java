package test.practice.animals;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException
	{
		// DEFAULTS
		String fileName = "animalinfo.txt";
		int numLegs = 4; // The number of legs we are checking how many animals have
		
		// INTIALIZATION
		FileReader file = new FileReader(fileName);
		BufferedReader read = new BufferedReader(file);
		
		int count = Integer.parseInt(read.readLine());
		
		Animal[] animal = new Animal[count];
		
		// Store animal data
		for(int i=0;i<count;i++)
		{
			String species = read.readLine().trim();
			int age = Integer.parseInt(read.readLine().trim());
			String sound = read.readLine().trim();
			int legs = Integer.parseInt(read.readLine().trim());
			
			animal[i] = new Animal(species, age, sound, legs);
		}
		
		// CALL METHODS
		everyoneTalks(animal);
		System.out.println("\nThere are " + howMany(animal, numLegs) + " animals with " + numLegs + " legs.");
		
		// Close BufferedReader
		read.close();
	}
	
	public static void everyoneTalks(Animal[] animal)
	{
		for(int i=0;i<animal.length;i++)
			animal[i].talk();
	}
	
	public static int howMany(Animal[] animal, int numLegs)
	{
		int amount = 0;
		for(int i=0;i<animal.length;i++)
		{
			if(animal[i].getLegs()==numLegs)
				amount++;
		}
		return amount;
	}
}
