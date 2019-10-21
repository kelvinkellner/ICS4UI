package spaceshootout;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Sprite {
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected boolean visible;
	protected Image image;
	
	Sprite(int x, int y)
	{
		this.x=x;
		this.y=y;
		useImageDimensions();
	}
	
	protected void useImageDimensions()
	{
		this.width=image.getWidth(null);
		this.height=image.getHeight(null);
	}
	
	protected void loadImage(String imageName)
	{
		ImageIcon icon = new ImageIcon(imageName);
		image = icon.getImage();
	}
	
	public Image getImage()
	{
		return image;
	}
	
	public Rectangle getBounds()
	{
		return new Rectangle(x, y, width, height);
	}
	
	public boolean getVisible()
	{
		return visible;
	}
	
	public void setVisible(boolean value)
	{
		this.visible = value;
	}
}
