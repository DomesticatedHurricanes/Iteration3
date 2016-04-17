package models.Skills;

import models.entities.Avatar;
import models.stats.CharacterStats;
import models.stats.Stats;

/**
 * Created by Breanna on 4/13/16.
 */
public class BoonSkill extends Skill implements ActiveSkill{

    private CharacterStats characterStats;

    private final int BUFF = 5;

    @Override
    public void useSkill(Avatar avatar) {
        //Need to put in avatar?  But depends on how we are activating skills
        useBoon(avatar);
    }

    public BoonSkill(){
        //characterStats = avatar.getStats();
    }

    public void useBoon(Avatar avatar){
        useBuff();
        //TODO: Need a timer here
        cancelBuff();
    }

    public void useBuff(){
        characterStats.modifyCurrentHp(BUFF);
        characterStats.modifyStrength(BUFF);
        characterStats.modifyHardiness(BUFF);
    }

    public void cancelBuff(){
        characterStats.modifyStrength(-BUFF);
        characterStats.modifyHardiness(-BUFF);
    }

    @Override
    public void setManaCost() {
        MANACOST = 0;
    }
}
