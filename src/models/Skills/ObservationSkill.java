package models.Skills;

import models.entities.Entity;
import models.stats.CharacterStats;

/**
 * Created by Breanna on 4/13/16.
 */
public class ObservationSkill extends Skill {
    private Entity target;

    public CharacterStats sendData() { return new CharacterStats(); }
}
