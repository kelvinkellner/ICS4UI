package shootergraphicsattempt;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Board extends JPanel {
	private final int B_WIDTH = 960;
	private final int B_HEIGHT = 640;
	
	protected Board board;
	
	Board()
	{
		initBoard();
	}
	
	public void initBoard()
	{
		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
		setBackground(Color.BLACK);
		setName("PLATFORMER!");
		setFocusable(true);
		setVisible(true);
	}
	
	public void drawGraphics(Graphics g)
	{
		g.drawString("Hello world!", 0, 0);
	}
}
