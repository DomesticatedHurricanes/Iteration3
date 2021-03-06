package View.StateViews;

import models.Graphics.GraphicAssets;
import utilities.Settings;

import java.awt.*;

/**
 * Created by Dartyx on 4/16/2016.
 */
public class StartMenuView extends StateView {
    private int height,width;
    private String[] options = {"Create New Game", "Load Game", "Exit Game"};
    public StartMenuView(){
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
        g.setColor(Color.WHITE);
        g.drawImage(GraphicAssets.startBackground,0,0,width,height,null);
        g.setFont(new Font("HelveticaNeueLT Pro 55 Roman", Font.PLAIN, 65));
        FontMetrics fm = g.getFontMetrics();
        int totalWidth = (fm.stringWidth("Domesticated Hurricanes"));
        g.drawString("Domesticated Hurricanes",(width - totalWidth) / 2,height/6);


        for(int i=0;i<3;i++){
            g.setFont(new Font("HelveticaNeueLT Pro 55 Roman", Font.PLAIN, 40));
            fm = g.getFontMetrics();
             totalWidth = (fm.stringWidth(options[i]));
            int x = (width - totalWidth) / 2;
            int y = 50 + (height / 2) - 100 + 120 * i;

            if (i == cursor) {
                g.setColor(new Color(197, 239, 247, 175));
                g.fillRect(x, y - fm.getHeight() + (fm.getHeight() / 4), totalWidth, fm.getHeight());
                g.setColor(new Color(39, 49, 63));

            } else {
                g.setColor(new Color(39, 49, 63, 175));
                g.fillRect(x, y - fm.getHeight() + (fm.getHeight() / 4), totalWidth, fm.getHeight());
                g.setColor(new Color(197, 239, 247));
            }
            g.drawString(options[i], x, y);

        }


    }
}
