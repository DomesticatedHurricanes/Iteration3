package models.Map;

import models.entities.Avatar;
import models.entities.Monster;
import models.entities.Pet;

/**
 * Created by david on 4/13/16.
 */
public interface TileVisitor {
    boolean visit(Avatar avatar);
    boolean visit(Monster monster);
    boolean visit(Pet pet);
}
