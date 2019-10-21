package project.spaceinvaders;

public class Element {
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	protected String imageFileName;
	
	Element(int x, int y, int w, int h, String f)
	{
		this.xPos=x;
		this.yPos=y;
		this.width=w;
		this.height=h;
		this.imageFileName=f;
	}
	
	protected void destroy(Element e)
	{
		// Add code in here to delete the object from the game
	}

	// Getters and Setters
	public int getxPos()
	{
		return xPos;
	}

	public void setxPos(int xPos)
	{
		this.xPos = xPos;
	}

	public int getyPos()
	{
		return yPos;
	}

	public void setyPos(int yPos)
	{
		this.yPos = yPos;
	}
	
	public void setPos(int xPos, int yPos)
	{
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
} // End Class
