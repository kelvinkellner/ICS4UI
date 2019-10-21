package project.pokemon;

import java.io.BufferedReader;
import java.io.FileReader;

public class File {
	
	public File(String saveFile)
	{
		load(saveFile);
	}
	
	public void load(String saveFile)
	{
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
