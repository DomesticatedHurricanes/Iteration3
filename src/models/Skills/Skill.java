package models.Skills;

import com.sun.org.apache.xpath.internal.operations.Or;
import models.entities.Avatar;
import models.entities.Entity;

/**
 * Created by Breanna on 4/13/16.
 */
public abstract class Skill{
    protected int skillLv;//TODO:Factor this in the projectile damage
    protected Entity.Orientation orientation;
    protected int MANACOST;
    public Entity.Orientation getOrientation(){
        return orientation;
    }
    public void payManaCost(Avatar avatar, int manaCost){
        avatar.getStats().modifyMana(-manaCost);
    }
    public boolean checkManaCost(Avatar avatar, int manaCost){
        int avatarMana = avatar.getStats().getMana();
        //If avatar has more mana return true because you can use the skill
        if(avatarMana>=manaCost){
            return true;
        }
        return false;
    }
}
/*
    After mana cost is tested put this chunk of code everywhere
    @Override
    public void useSkill(Avatar avatar) {

        if(checkManaCost(avatar,MANACOST)){
            payManaCost(avatar,MANACOST);
            useBane(avatar);
        }

    }
 */


//TODO: The following is a readme specficially for skills
/*
Skills have different classificatoins
Regular Skills - just skills without searchable or projectable(normally skills for yourself
Searchable Skills - skills that need to find a target but not for combat but for special things like pick pocket
Projectable Skill - skills that are involved in combat

The Heirarchy goes roughly

Skills
-
Buff, Skill B, SearchableSkills{abstract}, Skill C, ...
-
Pick Pocket , Skill B, ProjectableSkills{abstract}
-

In terms of calling skills we can interface it using active and passive skill.
Each skill should implement a either an ActiveSkill or PassiveSkill

Concerns.

How will the avatar be passed? or should it be entity that should be passed in some cases?
Search includes the origin.  For some cases so the caster does not injure themselves
take out the point or conditional logic.  Leaning towards taking out the origin point
 */