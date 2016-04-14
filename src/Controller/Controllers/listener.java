package Controller.Controllers;

import Controller.*;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Executable;

/**
 * Created by Dartyx on 4/11/2016.
 */
public class Listener implements KeyListener {
    int key;
    ListenerAction action;
    public Listener(int key, ListenerAction action) {
        this.key=key;
        this.action=action;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==key){
            action.execute();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
