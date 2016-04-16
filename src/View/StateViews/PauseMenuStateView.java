package View.StateViews;

import models.Graphics.GraphicAssets;

import java.awt.*;

/**
 * Created by mazumderm 4/16/2016.
 */
public class PauseMenuStateView extends StateView {

    private String[] pauseMenuOptions = {"Save Game", "Load Another Game", "Settings"};

    public PauseMenuStateView(){

    }

    @Override
    protected  void init(){

    }

    @Override
    public void render(Graphics g){
        g.setColor(new Color(0, 255, 0));
        g.fillRect(0, 0, 500, 700);

        for(int i = 0; i < pauseMenuOptions.length; ++i){
            g.setColor(new Color(51, 0, 102));
            g.setFont(new Font("Arial", Font.PLAIN, 40));
            g.drawString(pauseMenuOptions[i], 20, 20);
        }
    }
}
