package project.rpg;

public class Main {
	public static void main(String[] args) throws InterruptedException
	{
		Element e1 = new Player(7,7);
		Element[] allE = new Element[1];
		allE[0]=e1;
		Map home = new Map(15,15, allE);
		home.draw();
	}
}
