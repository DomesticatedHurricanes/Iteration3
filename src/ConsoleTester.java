
import models.AreaEffect.AreaEffect;
import models.AreaEffect.Teleport;
import models.AreaEffect.Trap;
import models.Interaction.MovementHandler;
import models.Item.Takeable.Consumable;
import models.Item.Takeable.Equippable.ChestPlate;
import models.Item.Takeable.Equippable.Helmet;
import models.Item.Takeable.Takeable;
import models.Item.Takeable.TakeableItemsFactory.BootsFactory;
import models.Skills.Skill;
import models.effects.AngularEffect;

import models.Map.Map3D;

import models.effects.HemiConicalEffect;
import models.effects.LinearEffect;
import models.entities.*;
import models.entities.occupation.Smasher;
import models.entities.occupation.Sneak;
import models.entities.occupation.Summoner;
import models.stats.*;
import utilities.Point3D;

import java.awt.geom.Area;
import java.util.ArrayList;

/**
 * Created by ben on 4/14/16.
 */
public class ConsoleTester {
    public static void main(String args[]){
        //BootsFactory bootsFactory = new BootsFactory();
        Avatar avatar = new Avatar(new Summoner());
        ArrayList<Skill> skillList = avatar.getSkillList();
        System.out.println("Hello World");
        for(Skill skill:skillList){
            System.out.println(skill);
            System.out.println("Can you see this?");
        }
        avatar.useSkillNumber(1);
        avatar.useSkillNumber(2);
        avatar.useSkillNumber(3);
        avatar.useSkillNumber(4);

    }
}
