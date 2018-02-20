package Inputs;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class KeyboardHandler implements KeyListener{

	public boolean left,right;
	
	public KeyboardHandler(Canvas canvas) {
		canvas.addKeyListener(this);
	}
	public void keyTyped(KeyEvent e) {
		
	}
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==e.VK_LEFT||e.getKeyCode()==e.VK_A){
			left=true;
		}
		if(e.getKeyCode()==e.VK_RIGHT||e.getKeyCode()==e.VK_D){
			right=true;
		}
	}

	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==e.VK_LEFT||e.getKeyCode()==e.VK_A){
			left=false;
		}
		if(e.getKeyCode()==e.VK_RIGHT||e.getKeyCode()==e.VK_D){
			right=false;
		}
	}

}
