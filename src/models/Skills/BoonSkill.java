package models.Skills;

import models.entities.Avatar;
import models.stats.CharacterStats;
import models.stats.Stats;

/**
 * Created by Breanna on 4/13/16.
 */
public class BoonSkill extends Skill implements ActiveSkill{

    private CharacterStats characterStats;

    @Override
    public void activateSkill(Avatar avatar) {
        useSkill(avatar);
    }

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
        useBuff(avatar);
        //TODO: Need a timer here
        cancelBuff(avatar);
    }

    public void useBuff(Avatar avatar){
        avatar.getStats().modifyCurrentHp(BUFF);
        avatar.getStats().modifyHardiness(BUFF);
        avatar.getStats().modifyStrength(BUFF);
    }

    public void cancelBuff(Avatar avatar){
        avatar.getStats().modifyHardiness(-BUFF);
        avatar.getStats().modifyStrength(-BUFF);

    }


}
