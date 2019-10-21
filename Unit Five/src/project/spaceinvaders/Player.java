package project.spaceinvaders;

public class Player extends Creature {
	private int lives;
	
	Player(int x, int y, int w, int h, String f, int b, int l)
	{
		super(x,y,w,h,f,b);
		this.lives=l;
	}
	
	Player(int x, int y, int w, int h, String f, int b)
	{
		super(x,y,w,h,f,b);
		this.lives=3;
	}
	
	public void takeDamage(int amount)
	{
		this.lives-=amount;
		if(this.lives<=0)
			killPlayer();
	}
	
	private void killPlayer()
	{
		super.destroy(this);
	}
}
