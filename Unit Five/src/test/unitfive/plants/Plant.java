package test.unitfive.plants;

//Kelvin Kellner
//Mrs. Cooper
//May 3rd, 2019
//Unit Five Objects Coding Test

class Plant {
	private String type;
	private int height;
	private String colour;
	private boolean edible;
	private boolean perennial;
	
	// CONSTRUCTOR METHODS
	
	Plant(String t, int h, String c, boolean e, boolean p)
	{
		this.type=t;
		this.height=h;
		this.colour=c;
		this.edible=e;
		this.perennial=p;
	}
	
	Plant(String t, String c)
	{
		this.type=t;
		this.height=0;
		this.colour=c;
		this.edible=false;
		this.perennial=true;
	}
	
	Plant(String t, boolean e, boolean p)
	{
		this.type=t;
		this.height=0;
		this.colour="green";
		this.edible=e;
		this.perennial=p;
	}
	
	// INSTANCE METHODS
	public void grow(int mod)
	{
		this.height+=mod;
	}
	
	public void printInfo()
	{
		System.out.println("The " + this.type + " plant is a " + this.height + "cm tall, " + colour + " plant.\nEdible: " + edible + " Perennial: " + perennial);
	}
	
	public void eat()
	{
		if(this.edible)
			System.out.println("Eat " + this.type);
		else
			System.out.println("Don't eat " + this.type);
	}
	
	// CLASS METHODS
	public static Plant taller(Plant a, Plant b)
	{
		if(a.height>b.height)
			return a;
		else if(a.height<b.height)
			return b;
		else
		{
			System.out.println("Error: The two plants are the same height.\nThe first plant was returned by default.");
			return a;
		}
	}
	
	public static boolean colourMatch(Plant a, Plant b)
	{
		if(a.colour.equalsIgnoreCase(b.colour))
			return true;
		else
			return false;
	}

	// ACCESSOR METHODS
	public String getType()
	{
		return type;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public String getColour()
	{
		return colour;
	}
	
	public boolean isEdible()
	{
		return edible;
	}
	
	public boolean isPerennial()
	{
		return perennial;
	}
	
	// MUTATOR METHODS
	public void setType(String type)
	{
		this.type = type;
	}
	
	public void setHeight(int height)
	{
		this.height = height;
	}
	
	public void setColour(String colour)
	{
		this.colour = colour;
	}
	
	public void setEdible(boolean edible)
	{
		this.edible = edible;
	}
	
	public void setPerennial(boolean perennial)
	{
		this.perennial = perennial;
	}
	
}
