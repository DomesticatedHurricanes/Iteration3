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
        int currX,currY;
        int x=currX=width/2;
        int y=currY=height/4-height/8;

        for(int i=0;i<16;i++){
            if(i%4==0){
                y+=height/8+10;
                currX=x;
            }
            //print square
            if(i==cursor){
                g.setColor(new Color(255, 255, 255));
                g.fillRect(currX-5, y-5, height / 8+10, height / 8+10);
            }

                g.setColor(new Color(0, 0, 0, 255));
                g.fillRect(currX, y, height / 8, height / 8);


            //print picture
            if(i<inventory.getPack().getPackContents().size()){
                g.drawImage(inventory.getPack().getPackContents().get(i).getImage(),currX,y,height/8,height/8,null);
            }
            currX+=height/8+10;

        }

    }


}
