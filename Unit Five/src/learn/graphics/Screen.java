package learn.graphics;

import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Screen extends Canvas {
	private static int width=896;
	private static int height=896;
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Main");
		Canvas canvas = new Screen();
		canvas.setSize(width,height);
		frame.add(canvas);
		frame.pack();
		frame.setVisible(true);
	}
	
	 public void paint(Graphics g) {
	        g.fillOval(100, 100, 200, 200);
	    }
}
