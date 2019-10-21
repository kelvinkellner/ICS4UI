package assignment.platformer;

import java.awt.Rectangle;

public class Collidable extends Sprite {
	private Rectangle bounds;
	private boolean collisionsActive;
	
	Collidable(int x, int y)
	{
		super(x,y);
		updateBounds();
	}
	
	public void updateBounds()
	{
		this.bounds = new Rectangle(x, y, width, height);
	}
	
	public Rectangle getBounds()
	{
		return bounds;
	}
	
	public void setCollisionsActive(boolean state)
	{
		collisionsActive = state;
	}
	
	public boolean getCollisionsActive()
	{
		return collisionsActive;
	}
}
