package project.rectangles;

public class Rectangle {
	
	private double length, width;
	private String colour;
	private double area, perimeter;
	
	Rectangle(double l, double w, String c)
	{
		this.set(l, w, c);
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public String getcolour()
	{
		return colour;
	}
	
	public void set(double l, double w, String c)
	{
		this.length = l;
		this.width = w;
		this.colour = c;
		
		this.area = l*w;
		this.perimeter = (2*l) + (2*w);
	}
	
	public boolean isEqual(Rectangle that)
	{
		if(this.length==that.length && this.width==that.width)
			return true;
		return false;
	}
	
	public boolean isSquare()
	{
		if(this.length==this.width)
			return true;
		return false;
	}
	
	public void scaleBy(int scale) // Integer
	{
		this.length*=scale;
		this.width*=scale;
	}
	
	public void scaleBy(double scale) // Double
	{
		this.length*=scale;
		this.width*=scale;
	}
	
	public void copy(Rectangle source)
	{
		this.set(source.getLength(), source.getWidth(), source.getcolour());
	}
	
	public void printDetails()
	{
		System.out.println("Rectangle Details:\nW: " + width + " L: " + length + "\nColour: " + colour + "\n\nArea: " + area + "\nPerimeter: " + perimeter + "\nSquare: " + this.isSquare());
	}
}
