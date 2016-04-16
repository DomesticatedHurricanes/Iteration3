package controllers.StateControllers;

import controllers.Controller;

import javax.swing.*;

/**
 * Created by ben on 4/12/16.
 */
public class LoadController extends Controller {
    public LoadController(JFrame jFrame){
        super(jFrame);
    }


    public void init() { }

    @Override
    public void addJFrame(JFrame jFrame){
        this.jFrame = jFrame;
    }

    @Override
    public void update() {

    }

}
