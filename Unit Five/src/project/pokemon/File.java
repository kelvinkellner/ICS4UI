package project.pokemon;

import java.io.BufferedReader;
import java.io.FileReader;

public class File {
	
	private String defaultFile = "PokemonDefaults.txt";
	Pokemon[] pokemon;
	
	public File(String saveFile)
	{
		load(saveFile);
	}
	
	public void load(String saveFile)
	{
		try
		{
			FileReader file = new FileReader(defaultFile);
			BufferedReader readDefault = new BufferedReader(file);
			
			
			
			try
			{
				FileReader text = new FileReader(saveFile);
				BufferedReader read = new BufferedReader(text);
			}
			catch(Exception e)
			{
				System.out.println("\nERROR: No save file found to load.");
			}
		}
		catch(Exception e)
		{
			System.out.println("\nERROR: No default game file found to load.");
		}
	}
	
	public void save(File file)
	{
		try
		{
			
		}
		catch(Exception e)
		{
			System.out.println("\nERROR: Could not save game data to file.");
		}
	}
}
