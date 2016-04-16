package View.StateViews;

import models.Graphics.GraphicAssets;

import java.awt.*;

/**
 * Created by Michael on 4/16/16.
 */
public class InventoryStateView extends StateView{

    public InventoryStateView(){

    }

    @Override
    protected  void init(){

    }

    @Override
    public void render(Graphics g){
        g.drawImage(GraphicAssets.h1,10,10,null);
    }
}
