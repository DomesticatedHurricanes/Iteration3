package models.Skills;

import java.util.Queue;
import models.effects.Effect;
import utilities.Point3D;

/**
 * Created by Breanna on 4/13/16.
 */
public abstract class SearchableSkill extends Skill {
    protected Effect effect;

    public abstract Queue<Point3D> search();
}
