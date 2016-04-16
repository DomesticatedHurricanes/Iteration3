package View.StateViews;

import models.Graphics.GraphicAssets;

import java.awt.*;

/**
 * Created by mazumderm 4/16/2016.
 */
public class PauseMenuStateView extends StateView {

    public PauseMenuStateView(){

    }

    @Override
    protected  void init(){

    }

    @Override
    public void render(Graphics g){
        g.drawImage(GraphicAssets.h1,10,10,null);
    }
}
