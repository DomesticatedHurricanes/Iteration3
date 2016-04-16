package controllers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Michael on 4/14/16.
 */
public class Listener implements KeyListener {
    boolean keyPressed;
    int key;
    ListenerAction action;
    public Listener(int key, ListenerAction action) {
        this.key=key;
        this.action=action;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==key && !keyPressed){
            keyPressed = true;
            action.execute();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()==key && keyPressed){
            keyPressed = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}