package spaceshootout;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class SpaceShip extends Sprite {
	
	private final String imgFile = "src/images/spaceship.png";
	private int keyFire = KeyEvent.VK_SPACE;
	private int keyUp = KeyEvent.VK_UP;
	private int keyDown = KeyEvent.VK_DOWN;
	private int keyLeft = KeyEvent.VK_LEFT;
	private int keyRight = KeyEvent.VK_RIGHT;
	
	protected int vx=0;
	protected int vy=0;
	protected ArrayList<Missle> missles;
	
	SpaceShip(int x, int y)
	{
		super(x, y);
		initCraft();
	}
	
	protected void initCraft()
	{
		this.missles = new ArrayList<Missle>();
		loadImage(imgFile);
		useImageDimensions();
	}
	
	public void move()
	{
		this.x += vx;
		this.y += vy;
		
		if(x<1)
			x=1;
		if(y<1)
			y=1;
	}
	
	public void fire()
	{
		missles.add(new Missle(x+(width/2), y));
	}
	
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		if(key == keyFire)
			fire();
		
		if(key == keyUp)
			vy = -1;
		
		if(key == keyDown)
			vy = 1;
		
		if(key == keyLeft)
			vx = -1;
		
		if(key == keyRight)
			vx = 1;
	}
	
	public void keyReleased(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		if(key == keyUp || key == keyDown)
			vy = 0;
		
		if(key == keyLeft || key == keyRight)
			vx = 0;
	}
	
}
