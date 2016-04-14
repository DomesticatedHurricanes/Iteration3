package models.entities;

import models.stats.CharacterStats;

import models.entities.occupation.*;

import models.Map.Tile;

/**
 * Created by Breanna on 4/13/16.
 * This class represents the player controlled Entity in the game
 * Subclass of Entity
 */

public class Avatar extends Entity implements Movement, Attack, EntityVisitable {
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



    //called when an Avatar uses a skill
    public void useSkill() { }

    @Override
    public boolean accept(Tile tile) {
        return tile.visit(this);
    }

    //called when an Avatar does an attack
    @Override
    public void attack() {

    }

    @Override
    public boolean canSwim() {
        return false;
    }

    @Override
    public boolean canTraverse() {
        return false;
    }

    @Override
    public boolean canWalk() {
        return true;

    }
}
