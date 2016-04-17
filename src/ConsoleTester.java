
import models.Interaction.MovementHandler;
import models.Item.Takeable.Consumable;
import models.Item.Takeable.Equippable.ChestPlate;
import models.Item.Takeable.Equippable.Helmet;
import models.Item.Takeable.Takeable;
import models.effects.AngularEffect;

import models.Map.Map3D;

import models.effects.HemiConicalEffect;
import models.effects.LinearEffect;
import models.entities.Avatar;
import models.entities.Entity;
import models.entities.occupation.Smasher;
import models.stats.StatModifier;
import models.stats.StatModifiers;
import utilities.Point3D;

import java.util.ArrayList;

/**
 * Created by ben on 4/14/16.
 */
public class ConsoleTester {
    public static void main(String args[]){
        Map3D map3D = new Map3D(10);
        Avatar avatar = new Avatar(new Smasher());
        avatar.setLocation(new Point3D(1,1,1));
        MovementHandler movementHandler = new MovementHandler(map3D);
        map3D.insertEnitity(avatar, 1, 1);
        movementHandler.moveNorthWest(avatar);
    }
}
