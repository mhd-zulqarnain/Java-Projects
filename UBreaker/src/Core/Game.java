package Core;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import Entity.Ball;
import Entity.Player;
import Inputs.KeyboardHandler;
public class Game implements Runnable {

	Thread thread = new Thread(this);
	boolean running=false;
	
	//window stuff
	public JFrame frame;
	public static int width=1000;
	public static int height=width/16*9;
	public static Dimension gameDim=new Dimension(width,height);
	//Rendering stuff
	public Canvas canvas;
	BufferStrategy bs;
	BufferedImage img=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
	
	
	//Player
	public Player player;
	Ball ball;
	//input
	public KeyboardHandler keys;
	
	public void run() {
		while (running)
		{
			render();
			update();			
			try {
				thread.sleep(1000/50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void start() {
		thread.start();
		running=true;
	}
	
	public synchronized void stop() {
		try {
			
			thread.join();
			System.exit(0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public Game(){
		init();
	}
	
	private void init(){
		//Frame
		frame= new JFrame("The BrickBraker Game");
		frame.setSize(width,height);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//init Render
		canvas= new Canvas();
		canvas.setSize(gameDim);
		canvas.setPreferredSize(gameDim);
		canvas.setMaximumSize(gameDim);
		canvas.setMaximumSize(gameDim);
		frame.add(canvas,BorderLayout.SOUTH);
		
		canvas.createBufferStrategy(3);
		bs=canvas.getBufferStrategy();
		
		//Player
		 player=new Player(this);
		ball= new Ball(this);
		
		//input
		 keys=new KeyboardHandler(canvas);
		 canvas.requestFocus();
	}

	private void render() {
		
		if(bs==null){
			canvas.createBufferStrategy(3);
			return;
		}
		Graphics g=bs.getDrawGraphics();
		g.drawImage(img, 0,0,null);
		player.render(g);
		ball.render(g);
		bs.show();
		g.dispose();
	}

	private void update() {
		player.update();
		ball.update();
		
	}


	

}
