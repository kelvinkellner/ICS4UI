package petri.core;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;

import petri.graphics.Animation;
import petri.life.Cell;
import petri.sprites.Sprite;

public class Game {
	
	// Display Components
	public Display display;
	private String title;
	private int width, height;
	
	private BufferStrategy bs;
	private Graphics g;
	
	private Thread thread;
	private boolean running = false;
	
	// Sprite Lists
	protected ArrayList<Cell> cells = new ArrayList<>();
	
	// Start Game
 	public Game(String title, int width, int height)
	{
		this.title = title;
		this.width = width;
		this.height = height;
		
		run(); // Activate FPS real time action
	}
	
	public synchronized void start()
	{
		if(!running)
			return;
		running = false;
		try {
			thread.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void init()
	{
		
		// Initialize Display
		this.display = new Display(title, width, height);
		
		/*// Initialize Stage
		try
		{
			this.stage = new Stage(stageFile);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}*/
		
		// Initialize Key Input
		//this.input = new Input(stage.player);
		//this.display.getFrame().addKeyListener(input);
		
		// Run Game
		this.running = true;
		
	}
	
	public void run() {
		
		init(); // Initialize gamespace
		
		int fps = 60;
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;
		
		while(running)
		{
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;
			
			if(delta >= 1)
			{
				// Perform these actions on every frame (60 times per second)
				tick(ticks);
				render();
				ticks++;
				delta--;
			}
			
			if(timer >= 1000000000)
			{
				//System.out.println("Ticks and Frames: " + ticks);
				ticks = 0;
				timer = 0;
			}
		}
		
		//stop(); // Optional, create a method for what to do when you pause the game (stop motion, time, save game etc.)
	}
	
	// Behind the scenes...
	public void tick(int ticks)
	{
		int rando = (int)(Math.random() * 600.0);
		cells.add(new Cell(rando*3/2,rando));
		// Call the "tick()" method for all applicable objects (cells, food?, etc.)
	}
	
	// RENDERING
	
	// And on their screens ;)))
	public void render()
	{
		// Initialize Graphics
		bs = display.getCanvas().getBufferStrategy();
		if(bs==null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		g.clearRect(0, 0, width, height);
		
		// CALL RENDERING METHODS HERE
		renderCells(g);
		renderGUI(g);
		
		// Reset Graphics
		bs.show();
		g.dispose();
	}
	
	// Render the animation of any sprite onto the screen
	public void renderSprite(Graphics g, Sprite s, Animation a)
	{
		g.drawImage(a.nextFrame(), s.getX(), s.getY(), null);
	}
	
	// RENDER FOOD, ETC, HERE
	
	public void renderCells(Graphics g)
	{
		for(int c=0; c<cells.size(); c++)
		{
			g.setColor(new Color(120,55,255));
			g.fillOval(cells.get(c).getX(), cells.get(c).getY(), cells.get(c).getWidth(), cells.get(c).getHeight());
			//renderSprite() // RENDER CELL
		}
	}
	
	// RENDER OTHER SPRITES HERE
	
	public void renderGUI(Graphics g)
	{
		
	}
	
	// MOTION
	
	
	
	// SPECIAL CELL FUNCTIONS
	
	

}
