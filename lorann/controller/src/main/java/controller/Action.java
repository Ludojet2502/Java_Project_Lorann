package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public abstract class Action implements KeyListener{
	
	public boolean UP = false;
	public boolean RIGHT = false;
	public boolean LEFT = false;
	public boolean DOWN = false;
	public boolean SPACE  = false;
	
    public void isKeyPressed( KeyEvent e) {
        int keyCode = e.getKeyCode();
        if(e.getKeyCode() == KeyEvent.VK_RIGHT)  { 
			RIGHT = true;
			
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			LEFT = true;
		
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			DOWN = true;
			
		}else if(e.getKeyCode() == KeyEvent.VK_UP) {
			UP = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			SPACE = true;
			// code pour lancer la boule
			
		}
    }

    public void KeyTyped(KeyEvent e) {

    }

    public void KeyReleased(KeyEvent e) {
    	int keyCode = e.getKeyCode();
        if(e.getKeyCode() == KeyEvent.VK_RIGHT)  { 
			RIGHT = false;
			
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			LEFT = false;
		
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			DOWN = false;
			
		}else if(e.getKeyCode() == KeyEvent.VK_UP) {
			UP = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			SPACE = false;
			// code pour lancer la boule
			
		}
    }

}
