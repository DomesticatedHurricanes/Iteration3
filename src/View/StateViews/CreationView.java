package View.StateViews;

import models.Graphics.GraphicAssets;
import utilities.Settings;

import java.awt.*;

/**
 * Created by Dartyx on 4/16/2016.
 */
public class CreationView extends StateView{
    private int height,width;
    private String[] options = {"Smasher", "Sneak", "Summoner"};
    public CreationView(){
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
        g.drawImage(GraphicAssets.creationBackground,0,0,width,height,null);
        g.drawImage(GraphicAssets.leftArrow,width/4-50,height/2,50,100,null);
        g.drawImage(GraphicAssets.rightArrow,width*3/4,height/2,50,100,null);

        for(int i=0;i<3;i++){
            if (i == cursor) {
            g.setFont(new Font("Arial", Font.PLAIN, 40));
            FontMetrics fm = g.getFontMetrics();
            int totalWidth = (fm.stringWidth(options[i]));
            int x = (width - totalWidth) / 2;
            int y = 50 + (height / 2) - 100+120;


                g.setColor(new Color(197, 239, 247, 175));
                g.fillRect(x, y - fm.getHeight() + (fm.getHeight() / 4), totalWidth, fm.getHeight());
                g.setColor(new Color(39, 49, 63));
                g.drawString(options[i], x, y);
                if(i==0){ g.drawImage(GraphicAssets.smashPic,width/2-50,height*3/12,100,100,null);}
                else if(i==1){g.drawImage(GraphicAssets.sneakPic,width/2-100,height*3/12,200,100,null);}
                else if(i==2){g.drawImage(GraphicAssets.summonerPic,width/2-50,height*3/12,100,100,null);}
            }


        }


    }

}
