
package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public abstract class Action implements KeyListener{
	
	/** initiate UP to false */
	public boolean UP = false;
	
	/** initiate RIGHT to false */
	public boolean RIGHT = false;
	
	/** initiate LEFT to false */
	public boolean LEFT = false;
	
	/** initiate DOWN to false */
	public boolean DOWN = false;
	
	/** initiate SPACE to false */
	public boolean SPACE  = false;
	
	/**
	 * Initiate all of the KeyEvent for the press key.
	 * 
	 * @param e
	 */
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

    /**
     * Initiate all of the KeyEvent for the typed key.
     * 
     * @param e
     */
    public void KeyTyped(KeyEvent e) {

    }

    /**
     * Initiate all of the KeyEvent for the release key.
     * 
     * @param e
     */
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
