package project.rpg;

class Map {
	int w;
	int h;
	
	Element player;
	
	Tile[][] grid;
	
	// Settings
	int viewW = 9; // Width of the map display
	int viewH = 9; // Height of the map display
	
	public Map(int w, int h, Element[] e)
	{
		this.w = w;
		this.h = h;
		
		this.grid = new Tile[this.w][this.h];
		
		// ADD SPECIAL ELEMENTS TO MAP
		for(int i=0;i<e.length;i++)
		{
			this.grid[e[i].x][e[i].y] = new Tile(e[i].type);
			if(e[i].type==0)
				player = e[i];
		}
		
		// FILL THE REST
		for(int i=0;i<this.h;i++)
		{
			for(int j=0;j<this.w;j++)
			{
				if(this.grid[i][j]==null)
				{
					if(i==0 || i == this.h-1 || j==0 || j == this.w-1)
						this.grid[i][j]=new Tile(2);
					else
						this.grid[i][j]=new Tile(1);
				}
			}
		}
	}
	
	public void draw(int x, int y, int w, int h)
	{
		for(int i=y;i<y+h;i++)
		{
			String line = "";
			for(int j=x;j<x+w;j++)
			{
				line+=this.grid[i][j].view + " ";
			}
			System.out.println(line);
		}
	}
	
	public void draw(int x, int y)
	{
		// Draw a 9 by 9 grid by default
		draw(x,y,this.viewW,this.viewH);
	}
	
	public void draw()
	{
		// Draw a 9 by 9 grid around the player
		int x = this.player.x-(viewW/2);
		int y = this.player.y-(viewH/2);
		
		if(x<0)
			x=0;
		if(y<0)
			y=0;
		
		draw(x,y);
	}
}
