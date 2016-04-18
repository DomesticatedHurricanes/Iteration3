package View.StateViews;

import models.Graphics.GraphicAssets;
import models.Inventory.Inventory;
import utilities.Settings;

import java.awt.*;

/**
 * Created by Michael on 4/16/16.
 */
public class InventoryStateView extends StateView{
    private int height,width;
    Inventory inventory;
    public InventoryStateView(Inventory inventory){
        this.inventory=inventory;
        width = Settings.GAMEWIDTH;
        height = Settings.GAMEHEIGHT;
    }

    @Override
    protected  void init(){

    }

    @Override
    public void render(Graphics g){
        g.drawImage(GraphicAssets.h1,10,10,null);
    }
}
