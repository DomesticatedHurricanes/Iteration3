package models.Skills;

import models.Map.Tile;
import models.entities.Avatar;
import models.entities.Entity;
import models.stats.StatusEffect;
import utilities.Point3D;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Breanna on 4/13/16.
 */
public abstract class ProjectableSkill extends SearchableSkill{
    protected Projectile projectile;
    protected int damage;
    //protected ArrayList<Entity> affectedentityArrayList;
    public void victimize(ArrayList<Entity> victims, Projectile projectile){
        int damage = projectile.getDamage();
        StatusEffect.statusEffect status = projectile.getStatus();//currently not used
        for(Entity vicitim:victims){
            //get stats from victim and them modify it!
            //modify based on projectile!

            vicitim.getStats().modifyCurrentHp(damage);//
            System.out.println("Found a victim! You dealt 12 damage");
            System.out.println("Victim's health is "+vicitim.getStats().getCurrentHp());
            vicitim.setStatusEffect(StatusEffect.statusEffect.NONE);
            //given from projectile


        }

    }

    public abstract int calculateDamage(Avatar avatar);
}
