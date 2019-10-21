
public class Main {
	public static void main(String[] args)
	{
		Element e1 = new Element(0,7,7);
		Element[] allE = new Element[1];
		allE[0]=e1;
		Map home = new Map(15,15, allE);
		home.draw();
	}
}
