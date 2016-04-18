package View.StateViews;

import models.Graphics.GraphicAssets;
import utilities.Settings;

import java.awt.*;

/**
 * Created by Dartyx on 4/16/2016.
 */
public class SkillTreeView extends StateView{
    private int height, width;

    private String[] Options1={"Level Up Bane", "Level Up Boon", "Level Up Enchantment", "Level Up Observation", "Level Up Bargain", "Level Up Bind Wounds"};
    private String[] Options2={"Level Up Detect Trap", "Level Up Creep", "Level Up Observation", "Level Up Baragin", "Level Up Ranged", "Level Up Remove Trap"};
    private String[] Options3={"Level Up 1-Handed", "Level Up 2-Handed", "Level Up Brawl", "Level Up Bargain", "Level Up Observation", "Level Up Bind Wounds"};
    private int ayy;
    public SkillTreeView(int ayy) {
        width = Settings.GAMEWIDTH;
        height = Settings.GAMEHEIGHT;
        this.ayy=ayy;
    }

    @Override
    protected void init() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(GraphicAssets.h1, 10, 10, null);


    }

    public void render(Graphics g, int cursor) {
        g.setColor(new Color(0, 0, 0, 125));
        g.fillRect(0, 0, width, height);
        g.setColor(new Color(0, 0, 0, 200));
        g.fillRect(width/6, height/6, width*4/6, height*4/6);
        g.setColor(Color.WHITE);
        //g.drawImage(GraphicAssets.startBackground, 0, 0, width, height, null);
        g.setFont(new Font("HelveticaNeueLT Pro 55 Roman", Font.PLAIN, 65));
        FontMetrics fm = g.getFontMetrics();
        int totalWidth = (fm.stringWidth("Skill Menu"));
        g.drawString("Skill Menu", (width - totalWidth) / 2, height / 6);


        for (int i = 0; i < 6; i++) {
            g.setFont(new Font("HelveticaNeueLT Pro 55 Roman", Font.PLAIN, 40));
            fm = g.getFontMetrics();
            if(ayy==0){totalWidth = (fm.stringWidth(Options1[i]));}
            if(ayy==1){totalWidth = (fm.stringWidth(Options2[i]));}
            if(ayy==2){totalWidth = (fm.stringWidth(Options3[i]));}
            int x = (width - totalWidth) / 2;
            int y = 50-height/6 + (height / 2) - 100 + 120 * i/2;

            if (i == cursor) {
                g.setColor(new Color(197, 239, 247, 175));
                g.fillRect(x, y - fm.getHeight() + (fm.getHeight() / 4), totalWidth, fm.getHeight());
                g.setColor(new Color(39, 49, 63));

            } else {
                g.setColor(new Color(39, 49, 63, 175));
                g.fillRect(x, y - fm.getHeight() + (fm.getHeight() / 4), totalWidth, fm.getHeight());
                g.setColor(new Color(197, 239, 247));
            }
            if(ayy==0){g.drawString(Options1[i], x, y);}

            if(ayy==1){g.drawString(Options2[i], x, y);}

            if(ayy==2){g.drawString(Options3[i], x, y);}

        }


    }
}
