package View.StateViews;

import models.Graphics.GraphicAssets;
import models.Inventory.Inventory;
import utilities.Settings;

import java.awt.*;

/**
 * Created by Dartyx on 4/16/2016.
 */
public class EquipmentView extends StateView{
    private int height,width;
    Inventory inventory;
    public EquipmentView(Inventory inventory){
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

    public void render(Graphics g, int cursor){
        g.setColor(new Color(0, 0, 0, 125));
        g.fillRect(0, 0, width, height);
        g.setColor(new Color(0, 0, 0, 200));
        g.fillRect(width/12, height/12, width*5/6, height*5/6);
        g.setColor(Color.WHITE);
        //g.drawImage(GraphicAssets.startBackground, 0, 0, width, height, null);
        g.setFont(new Font("HelveticaNeueLT Pro 55 Roman", Font.PLAIN, 65));
        FontMetrics fm = g.getFontMetrics();
        int totalWidth = (fm.stringWidth("Inventory"));
        g.drawString("Inventory", (width - totalWidth) / 2, height / 6);
    }
}
