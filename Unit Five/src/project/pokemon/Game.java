package project.pokemon;

public class Game {

	// Global constants
	private static String saveFile = "pokeSave.txt";
	private static int charPause = 100;
	private static int linePause = 500;
	
	public static void main(String[] args)
	{
		// CHECK FOR & LOAD PREVIOUSLY SAVED GAMES
		File file = new File(saveFile);
		
		bufferPrint("Welcome to...");
		bufferPrint(5,5,logo());
		
		bufferPrint("Hello there,\nWelcome to the world of Pokémon!\nMy name is professor oak!");
		
		String[] pW = {"Ground"};
		//Pokemon pikachu = new Pokemon(025, "Pikachu", "Electric", pW, 2, 35, 55, 40, 50, 50, 90);
		String[] cW = {"Ground","Water","Rock"};
		//Pokemon charmander = new Pokemon(004, "Charmander", "Fire", cW, 3, 39, 52, 43, 60, 50, 65);
	}
	
	public static void bufferPrint(int perChar, int perLine, String text)
	{
		try
		{
			String[] speech = text.split("\n");
			for(int i=0;i<speech.length;i++)
			{
				for(int j=0;j<speech[i].length();j++)
				{
					System.out.print(speech[i].charAt(j));
					Thread.sleep(perChar);
				}
				System.out.println();
				Thread.sleep(perLine);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("ERROR: Text display animation failed to operate.\n");
			System.out.println(text);
		}
	}
	
	public static void bufferPrint(String text)
	{
		bufferPrint(charPause, linePause, text);
	}
	
	public static String logo()
	{
		return "                                  ,'\n    _.----.        ____         ,'  _\\   ___    ___     ____\n_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.\n\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |\n \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |\n   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |\n    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |\n     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |\n      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |\n       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |\n        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |\n                                `'                            '-._|\n";
	}
}