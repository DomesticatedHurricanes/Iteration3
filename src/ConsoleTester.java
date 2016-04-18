
import models.AreaEffect.AreaEffect;
import models.AreaEffect.HealDamage;
import models.AreaEffect.Teleport;
import models.AreaEffect.Trap;
import models.Interaction.MovementHandler;
import models.Item.Takeable.Consumable;
import models.Item.Takeable.Equippable.ChestPlate;
import models.Item.Takeable.Equippable.Helmet;
import models.Item.Takeable.Takeable;
import models.Item.Takeable.TakeableItemsFactory.BootsFactory;
import models.effects.AngularEffect;

import models.Map.Map3D;

import models.effects.HemiConicalEffect;
import models.effects.LinearEffect;
import models.entities.*;
import models.entities.occupation.Smasher;
import models.stats.*;
import utilities.Point3D;

import java.awt.geom.Area;
import java.util.ArrayList;

/**
 * Created by ben on 4/14/16.
 */
public class ConsoleTester {
    public static void main(String args[]){

        HealDamage healDamage = new HealDamage();
        Avatar avatar = new Avatar(new Smasher());
        System.out.println(avatar.getStats().getCurrentHp());
        healDamage.activate(avatar);
        System.out.println(avatar.getStats().getCurrentHp());

    }
}
