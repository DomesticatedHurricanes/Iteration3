package models.Item.Takeable;

import models.Item.Takeable.Takeable;
import models.entities.Avatar;
import models.entities.Entity;

/**
 * Created by david on 4/14/16.
 */
public interface TakeableItemVisitor {
    void visit(Avatar avatar);
}
