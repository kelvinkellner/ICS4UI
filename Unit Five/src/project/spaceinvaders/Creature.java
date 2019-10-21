package project.spaceinvaders;

public class Creature extends Element {
	int bulletType;
	
	Creature(int x, int y, int w, int h, String f, int b)
	{
		super(x,y,w,h,f);
		this.bulletType=b;
	}
	
	public void shoot()
	{
		if(bulletType==0)
			new Bullet(super.getxPos(),super.getyPos(),4,4,"BULLET0.jpeg",1,"blue",-1,0,true);
	}
}
