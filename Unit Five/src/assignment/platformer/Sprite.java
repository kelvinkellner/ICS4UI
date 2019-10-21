package assignment.platformer;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Sprite {
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected Image image;
	
	Sprite(int x, int y)
	{
		setDimensions(x, y);
	}
	
	public void loadImage(String imageName)
	{
		ImageIcon icon = new ImageIcon(imageName);
		image = icon.getImage();
	}
	
	public void setDimensions(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	public void setDimensionsByImage()
	{
		setDimensions(image.getWidth(null), image.getHeight(null));
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return y;
	}
}
