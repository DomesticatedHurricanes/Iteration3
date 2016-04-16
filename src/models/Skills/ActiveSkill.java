package models.Skills;

import models.entities.Avatar;
import models.entities.Entity;

/**
 * Created by ben on 4/16/16.
 */
public interface ActiveSkill {
    void useSkill(Avatar avatar);
    //Overloaded just in case it is needed
}
