package View.StateViews;

import models.Graphics.GraphicAssets;
import utilities.Settings;

import java.awt.*;

/**
 * Created by mazumderm 4/16/2016.
 */
public class PauseMenuStateView extends StateView {
    private int height, width;
    private String[] Options = {"Resume", "Settings", "Save Game", "Load Game", "Exit to Main Menu", "Exit Game"};

    public PauseMenuStateView() {
        width = Settings.GAMEWIDTH;
        height = Settings.GAMEHEIGHT;
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
        int totalWidth = (fm.stringWidth("Pause Menu"));
        g.drawString("Pause Menu", (width - totalWidth) / 2, height / 6);


        for (int i = 0; i < 6; i++) {
            g.setFont(new Font("HelveticaNeueLT Pro 55 Roman", Font.PLAIN, 40));
            fm = g.getFontMetrics();
            totalWidth = (fm.stringWidth(Options[i]));
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
            g.drawString(Options[i], x, y);

        }


    }

}