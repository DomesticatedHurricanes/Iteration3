package models.entities;

import models.entities.occupation.*;
import models.stats.CharacterStats;
/**
 * Created by Breanna on 4/13/16.
 * This class represents the player controlled Entity in the game
 * Subclass of Entity
 */

public class Avatar extends Entity implements Movement {
    //private Inventory inventory;
    private Occupation occupation;
    private CharacterStats avatarStats;
    //private List<Skill> skillsList;

    public Avatar(Occupation occupation) {
        this.occupation = occupation;
        this.avatarStats = new CharacterStats();
        occupation.initSkills(this);
        occupation.initStats(this.avatarStats);
        //this.inventory = new Inventory();
    }

    //called when an Avatar does an attack
    public void attack() { }

    //called when an Avatar uses a skill
    public void useSkill() { }


    @Override
    public void walk() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void traverse() {


    }
}
