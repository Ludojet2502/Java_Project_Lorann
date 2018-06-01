package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public abstract class Action implements KeyListener{
    public void isKeyPressed( KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch(keyCode) {
        case KeyEvent.VK_UP : System.out.println("Touche UP");
        case KeyEvent.VK_DOWN : System.out.println("Touche BAS");
        case KeyEvent.VK_LEFT : System.out.println("Touche GAUCHE");
        case KeyEvent.VK_RIGHT : System.out.println("Touche DROIT");
        }
    }

    public void KeyTyped(KeyEvent e) {

    }

    public void KeyReleased(KeyEvent e) {

    }

}
