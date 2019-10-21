package spaceshootout;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Board extends JPanel implements ActionListener {
	
	private final int ICRAFT_X = 40;
	private final int ICRAFT_Y = 60;
	private final int B_WIDTH = 400;
	private final int B_HEIGHT = 600;
	private final int FPS = 60;
	private final int DELAY = 15;
	
	private int score;
	private Timer timer;
	private SpaceShip spaceship;
	private ArrayList<Alien> aliens;
	private boolean playing;
	
	Board()
	{
		initBoard();
	}
	
	private void initBoard()
	{
		addKeyListener(new TAdapter());
		setFocusable(true);
		setBackground(Color.BLACK);
		playing = true;
		
		setPreferredSize(B_WIDTH, B_HEIGHT);
		
		spaceship = new SpaceShip(ICRAFT_X, ICRAFT_Y);
		
		initAliens();
		
		timer = new Timer(DELAY, this);
		timer.start();
		
		score = 0;
	}
	
	private void initAliens()
	{
		aliens = new ArrayList<Alien>();
	}
	
	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (playing) {

            drawObjects(g);

        } else {

            drawGameOver(g);
        }

        Toolkit.getDefaultToolkit().sync();
	}
	
    private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            spaceship.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            spaceship.keyPressed(e);
        }
    }
}
