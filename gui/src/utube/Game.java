package utube;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable{
	//Game stuff
	Thread thread= new Thread(this);
	boolean running=false;
	
	//window stuff
	JFrame fr;
	public static int width=640;
	public static int height=width/16*9;
	public static Dimension gameDim= new Dimension(width,height);
	//Rendering stuff
	Canvas canvas;
	BufferStrategy bs;
	Graphics2D g;
	BufferedImage img = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB); 
	//Player
	Player player;
	 public void run() {
		while(running){
			update();
			render();
			try {
				thread.sleep(1000/40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public synchronized void start(){
		running =true;
		thread.start();
	}
	public synchronized void stop(){
		try{
		thread.join();
		System.exit(0);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public Game(){
	init();
	}
	private void init(){
		//FRAME
		fr= new JFrame("Game");
		fr.setVisible(true);
		fr.setLocationRelativeTo(null);
		fr.setSize(width,height);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//CANVAS
		canvas=new Canvas();
		canvas.setSize(width,height);
		canvas.setPreferredSize(gameDim);
		canvas.setMaximumSize(gameDim);
		canvas.setMaximumSize(gameDim);
		fr.add(canvas,BorderLayout.SOUTH);
		//Rendering
		bs=canvas.getBufferStrategy();
		player= new Player(this);
		g=(Graphics2D)bs.getDrawGraphics();
	}
	public void render(){
		
		if(bs==null){
			canvas.createBufferStrategy(3);
			return;
		}
		
		g.drawImage(img, 0,0,null);
		player.render(g);
		bs.show();
		g.dispose();
	}
	
	public void update(){
	}

}
