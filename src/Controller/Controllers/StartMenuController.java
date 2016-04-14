package Controller.Controllers;

import Controller.Controller;
import Utilities.Settings;

import javax.swing.*;

/**
 * Created by Dartyx on 4/11/2016.
 */
public class StartMenuController extends Controller{

    public StartMenuController(JFrame jFrame) {
        super(jFrame);
        getKeyMapping().put(Settings.UP,()->System.out.println("up"));
        getKeyMapping().put(Settings.UP,()->System.out.println("left"));
        getKeyMapping().put(Settings.UP,()->System.out.println("right"));
        getKeyMapping().put(Settings.UP,()->System.out.println("down"));

        getBindings().add(new Listener(Settings.UP, getKeyMapping().get(Settings.UP)));
        getBindings().add(new Listener(Settings.DOWN, getKeyMapping().get(Settings.DOWN)));
        getBindings().add(new Listener(Settings.LEFT, getKeyMapping().get(Settings.LEFT)));
        getBindings().add(new Listener(Settings.RIGHT, getKeyMapping().get(Settings.RIGHT)));

    }

}
