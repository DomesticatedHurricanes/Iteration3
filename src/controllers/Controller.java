package controllers;

import State.StateManager;
import javax.swing.*;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dartyx on 4/7/2016.
 */
public abstract class Controller {
    private Map<Integer, ListenerAction> keyMapping;
    private ArrayList<KeyListener> bindings;
    protected StateManager manager;
    protected JFrame jFrame;


    public Controller(){
        keyMapping = new HashMap<>();
        bindings = new ArrayList<>();
    }
    public Controller(JFrame jFrame) {
        this.jFrame=jFrame;
        keyMapping=new HashMap<>();
        bindings=new ArrayList<>();
    }

    public abstract void addJFrame(JFrame jFrame);
    public abstract void update();

    public void addToJframe(){
        for(KeyListener bind: bindings){
            jFrame.addKeyListener(bind);
        }
        //System.out.println("making keybinds");
    }
    public void removeFromJframe(){
        for(KeyListener bind: bindings){
            jFrame.removeKeyListener(bind);
        }
        //System.out.println("purging keybinds");
    }
    public Map<Integer, ListenerAction> getKeyMapping() {
        return keyMapping;
    }

    public void setKeyMapping(Map<Integer, ListenerAction> keyMapping) {
        this.keyMapping = keyMapping;
    }

    public ArrayList<KeyListener> getBindings() {
        return bindings;
    }

    public void setBindings(ArrayList<KeyListener> bindings) {
        this.bindings = bindings;
    }

    public JFrame getjFrame() {
        return jFrame;
    }

    public void setjFrame(JFrame jFrame) {
        this.jFrame = jFrame;
    }

}
