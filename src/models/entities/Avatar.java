package models.entities;
import models.Graphics.GraphicAssets;
import models.Item.Takeable.Takeable;
import models.entities.occupation.Occupation;
import models.stats.CharacterStats;
import models.Inventory.Inventory;
import models.Item.Item;
import models.Item.Takeable.Equippable.*;
import models.Item.Takeable.TakeableItemVisitor;
import models.Map.Tile;
import utilities.Point3D;


import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Breanna on 4/13/16.
 * This class represents the player controlled Entity in the game
 * Subclass of Entity
 */


public class Avatar extends Entity implements Movement, Attack, TileVisitable, TakeableItemVisitable{

    public Occupation getOccupation() {
        return occupation;
    }

    private Occupation occupation;
    private CharacterStats stats;
    private boolean isTeleported;
    private boolean isRiding;
    //private Inventory inventory;

    public Avatar(Occupation occupation){
        this.isTeleported = false;
        this.inventory = new Inventory(16);
        this.occupation = occupation;
        stats = new CharacterStats();
        occupation.initStats(stats);
        this.occupation.initStats(stats);
        this.entityImage = occupation.initImage();
        this.entityImages = occupation.initImages();
        this.initImages();
    }


    //called when an Avatar uses a skill
    public void useSkill() { }

    //Visitable methods
    @Override
    public boolean accept(Tile tile) {
        return tile.visit(this);
    }

    //called when an Avatar does an attack

    //Attacking method
    @Override
    public void attack() {

    }



    public void use(Takeable item) {
        item.onUse(this);
    }

    @Override
    public void unequip(TakeableItemVisitable takeableItemVisitable) {
        takeableItemVisitable.unequip(this);
    }



    //Equipping functions
    public void equipHelmet(Helmet helmet){
        inventory.equipHelmet(helmet);
    }

    public void equipChestPlate(ChestPlate chestPlate) {
        inventory.equipChestPlate(chestPlate);
    }

    public void equipWeapon(Weapon weapon){inventory.equipWeapon(weapon);   }

    public void equipSlacks(Slacks slacks){
        inventory.equipSlacks(slacks);
    }

    public void equipBoots(Boots boots){
        inventory.equipBoots(boots);
    }

    public void equipGloves(Gloves gloves){ inventory.equipGloves(gloves); }

    //Unequipping functions
    public void unequipHelmet(){
        inventory.unequipHelmet();
    }

    public void unequipChestPlate() {
        inventory.unequipChestPlate();
    }

    public void unequipWeapon(){ inventory.unequipWeapon();}

    public void unequipSlacks(){
        inventory.unequipSlacks();
    }

    public void unequipBoots(){
        inventory.unequipBoots();
    }

    public void unequipGloves(){inventory.unequipGloves();}

    //Pack functions
    public void addItem(Item item){inventory.addItem(item);}

    public void removeItem(Item item){inventory.removeItem(item);}

    public void move(Tile origin, Tile destination){
        origin.removeEntity();
        destination.insertEntity(this);
        this.setLocation(destination.getPoint3D());
        destination.applyItems(this);
        destination.applyAreaEffect(this);
    }

    //Movement booleans
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
    @Override
    public boolean canFly() {
        return false;
    }



    public void rideMount(Vehicle vehicle){
        vehicle.isMounted(this);
        isRiding = true;
        this.entityImage = GraphicAssets.mountS;
        this.entityImages = GraphicAssets.laprasAll;
        this.initImages();

    }

    public void dismount(Vehicle vehicle) {
        vehicle.unmounted(this);
        isRiding = false;
        this.entityImage = occupation.initImage();
        this.entityImages = occupation.initImages();
        this.initImages();
    }


    //Getters
    @Override
    public CharacterStats getStats(){
        return stats;
    }

    public boolean getIsRiding() { return isRiding; }

    public Inventory getInventory(){return inventory;}


    public boolean getIsTeleported(){ return isTeleported; }

    public void setTeleported(){ isTeleported = !isTeleported; }

    public void setLocation(Point3D point3D){
        this.location = point3D;
    }


}
