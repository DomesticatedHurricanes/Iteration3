package models.Skills;

import models.entities.Avatar;

/**
 * Created by Breanna on 4/13/16.
 */
public class BargainSkill extends Skill implements PassiveSkill{
    private final int DISCOUNT_CONST = 4;

    @Override
    public void activateSkill(Avatar avatar) {

    }
    @Override
    public void onUpdate(Avatar avatar) {
        getDiscountedPrice();
    }

    public int getDiscountedPrice() {return skillLv*DISCOUNT_CONST;}
}
