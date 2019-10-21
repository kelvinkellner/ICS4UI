package project.spaceinvaders;

public class Bullet extends Element {
	private int damage;
	private String colour;
	private int xVelocity;
	private int yVelocity;
	private boolean injuresPlayer;
	
	Bullet(int x, int y, int w, int h, String f, int d, String c, int xV, int yV, boolean p)
	{
		super(x,y,w,h,f);
		this.damage=d;
		this.colour=c;
		this.xVelocity=x;
		this.yVelocity=y;
		this.injuresPlayer=p;
	}

	public int getDamage()
	{
		return damage;
	}
	
	public boolean injuresPlayer()
	{
		return injuresPlayer;
	}
}
