package Core;

import java.awt.*;
import java.awt.image.*;

import javax.swing.JFrame;

public class Game implements Runnable {

	// Game stuff
	Thread thread = new Thread(this);
	boolean running;
	
	//Window stuff
	JFrame fr;
	private static int width=1000;
	private static int height=width/16*9;
	
	//canvas
	private static Dimension gameDia=new Dimension(width,height);
	Canvas canvas;
	BufferStrategy bs;
	Graphics g;
	BufferedImage img= new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
	
	public void run() {
		try {
			while(running){
			render();
			update();
			thread.sleep(1000 / 40);
			}
		} catch (Exception e)
		{
			System.out.println("Error " + e);
		}
	}
	
	public synchronized void start() {
		thread.start();
		running=true;
	}

	public synchronized void stop() {

		try {
			running=false;
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Game()
	{
		init();
	}

	private void init()
	{
		fr= new JFrame();
		fr.setVisible(true);
		fr.setSize(width,height);
		fr.setResizable(false);
		fr.setLocationRelativeTo(null);
			
		//Render init
		canvas= new Canvas();
		canvas.setSize(gameDia);
		fr.add(canvas,BorderLayout.SOUTH);
		
		//canvas
		canvas.createBufferStrategy(3);
		bs=canvas.getBufferStrategy();
		
	}
	private void render() {
		if(bs==null){
			canvas.createBufferStrategy(3);
			return;
		}
		g=bs.getDrawGraphics();
		g.drawImage(img,0,0,null);
		bs.show();
		g.dispose();
	}

	private void update() {
		
	}

}
