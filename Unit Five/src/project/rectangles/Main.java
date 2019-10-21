package project.rectangles;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many Rectangles?");
		Rectangle[] rect = new Rectangle[scan.nextInt()];
		
		for(int i=0;i<rect.length;i++)
		{
			System.out.println();
			
			System.out.println("What is the WIDTH of Rectangle " + (i+1) + "?");
			double width = scan.nextDouble();
			
			System.out.println("What is the LENGTH of Rectangle " + (i+1) + "?");
			double length = scan.nextDouble();
			
			System.out.println("What is the COLOUR of Rectangle " + (i+1) + "?");
			scan.nextLine();
			String colour = scan.nextLine();
			
			rect[i] = new Rectangle(width, length, colour);
		}
		
		System.out.println();
		
		rect[0].printDetails();
		
		scan.close();
	}
}
