package models.entities.occupation;

import models.entities.Avatar;
import models.stats.Stats;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * Created by ben on 4/11/16.
 */
public interface Occupation {
    void initSkills(Avatar avatar);
    void initStats(Stats stats);
    BufferedImage initImage();
    ArrayList<BufferedImage> initImages();
}
