package petri.life;

import petri.sprites.Sprite;

public class Cell extends Sprite {

	//private double size = 1.0; // Size multiplier

	// VARIABLES
	
	// Motion Variables
	private double v = 0.0; // Velocity vector magnitude
	private int vTheta = 0; // // Direction of velocity degrees (0 degrees is N, angle rotates CW)
	private double a = 0.0; // Acceleration vector magnitude
	private int aTheta = 0; // Direction of acceleration in degrees (0 degrees is N, angle rotates CW)
	
	// CONSTRUCTOR METHODS
	
	public Cell(int x, int y)
	{
		super(x, y);
	}
	
	public Cell(int x, int y, int vInit, int vThetaInit)
	{
		super(x, y);
		this.v = vInit;
		this.vTheta = vThetaInit;
	}
	
	// INSTANCE METHODS
	
	// TICK: Event message that is called 60x per second
	public void tick()
	{		
		// Before aApply, use an algorithm to change acceleration with some sort of "life-like" pattern of motion
		Cell.aApply(this);
	}
	
	// CLASS METHODS
	
	// aApply: // Method used to apply the factors of acceleration to a cell's velocity
	public static void aApply(Cell cell)
	{
		// Apply direction difference to rotation velocity vector if necessary
		// Apply magnitude to speed up/slow down
	}
	
}
