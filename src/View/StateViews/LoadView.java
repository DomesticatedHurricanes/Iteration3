package View.StateViews;

import models.Graphics.GraphicAssets;
import utilities.Settings;

import java.awt.*;

/**
 * Created by Dartyx on 4/16/2016.
 */
public class LoadView extends StateView{
    private int height,width;

    private String[] options = {"Load Slot 1", "Load Slot 2", "Load Slot 2","Back"};

    public LoadView(){
        width = Settings.GAMEWIDTH;
        height = Settings.GAMEHEIGHT;
    }

    @Override
    protected  void init(){

    }

    @Override
    public void render(Graphics g){
        g.setColor(new Color(0, 0, 0, 125));
        g.fillRect(0, 0, 500, 700);

        for(int i = 0; i < options.length; ++i){
            g.setColor(new Color(51, 0, 102));
            g.setFont(new Font("Arial", Font.PLAIN, 30));
            g.drawString(options[i], 20, 20);
        }
    }
    public void render(Graphics g, int cursor){
        g.setColor(new Color(0, 0, 0, 125));
        g.fillRect(0, 0, width, height);
        g.setColor(new Color(0, 0, 0, 200));
        g.fillRect(width/12, height/12, width*5/6, height*5/6);
        g.setColor(Color.WHITE);

        g.setFont(new Font("HelveticaNeueLT Pro 55 Roman", Font.PLAIN, 40));
        FontMetrics fm = g.getFontMetrics();
        int totalWidth = (fm.stringWidth("Select a Slot To Save Game"));
        g.drawString("Select a Slot To Save Game",(width - totalWidth) / 2,height/6);


        for(int i=0;i<4;i++){
            g.setFont(new Font("HelveticaNeueLT Pro 55 Roman", Font.PLAIN, 40));
            fm = g.getFontMetrics();
            totalWidth = (fm.stringWidth(options[i]));
            int x = width/6;
            int y =height*2/6-height/12 + height/8 * i+10;

            if (i == cursor) {
                g.setColor(new Color(197, 239, 247, 175));
                g.fillRect(x, y, width*2/3, height/8);
                g.setColor(new Color(39, 49, 63));

            } else {
                g.setColor(new Color(39, 49, 63, 175));
                g.fillRect(x, y, width*2/3, height/8);
                g.setColor(new Color(197, 239, 247));
            }
            g.drawString(options[i], x+width*2/6-fm.stringWidth(options[i])/2, y+height/8-fm.getHeight()/2);

        }






    }
}
