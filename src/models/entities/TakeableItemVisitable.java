package models.entities;

import models.Item.Takeable.TakeableItemVisitor;

/**
 * Created by david on 4/14/16.
 */
public interface TakeableItemVisitable {
    void unequip(TakeableItemVisitable takeableItemVisitable);
}
