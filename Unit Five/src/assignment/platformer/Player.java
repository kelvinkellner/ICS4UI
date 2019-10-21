package assignment.platformer;

import java.awt.event.KeyEvent;

public class Player extends Collidable {

	private final int LEFT = KeyEvent.VK_A;
	private final int RIGHT = KeyEvent.VK_D;
	private final int JUMP = KeyEvent.VK_SPACE;
	
	int vx;
	
	Player(int x, int y)
	{
		super(x, y);
	}
	
	public void move()
	{
		x += vx;
	}
	
    public void keyPressed(KeyEvent e)
    {
    	if(e.getKeyCode() == LEFT)
    		vx = -1;
    	else if(e.getKeyCode() == RIGHT)
    		vx = 1;
    }
    
    public void keyReleased(KeyEvent e)
    {
    	if(e.getKeyCode() == LEFT)
    		vx = 0;
    	else if(e.getKeyCode() == RIGHT)
    		vx = 0;
    }
}
