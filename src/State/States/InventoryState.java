package State.States;

import State.State;
import State.StateManager;
import View.StateViews.InventoryStateView;
import controllers.StateControllers.InventoryController;
import models.Inventory.Inventory;
import models.Item.Takeable.Takeable;
import models.entities.Avatar;
import models.entities.occupation.Smasher;
import models.entities.occupation.Sneak;
import models.entities.occupation.Summoner;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Breanna on 4/15/16.
 */
public class InventoryState extends State {
    private InventoryStateView inventoryStateView;
    private InventoryController inventoryController;
    int select;
    private Avatar avatar;
    public InventoryState(StateManager stateManager, JFrame jFrame, GameState gameState){
        super(stateManager, jFrame);
        this.avatar=gameState.getAvatar();
        inventoryStateView = new InventoryStateView(gameState.getAvatar().getInventory());
        inventoryController = new InventoryController(this.stateManager, this, jFrame);
        select = 0;
    }
    public void setActive(){
        inventoryController.addToJframe();
    }

    public void setInactive(){
        inventoryController.removeFromJframe();
    }
    @Override
    public void init(){
        inventoryController.init();
    }

    @Override
    protected void addJFrame(JFrame frame) {
        inventoryController.addJFrame(frame);
    }

    @Override
    protected void update() {
        inventoryController.update();
    }

    @Override
    public void render(Graphics g){
        inventoryStateView.render(g);
    }
    public void interact(){
        avatar.use((Takeable) (avatar.getInventory().getPack().getItemAt(select)));
    }
    public void right(){
        System.out.println(select);
        select++;
        if(select%4==0)select = 0;
    }
    public void left(){
        select--;
        if(select%4==0)select = 3;
    }
    public void up(){
        select-=4;
        if(select<0)select+=16;
    }
    public void down(){
        select+=4;
        if(select>0)select-=16;
    }
    public void enter(){
        //System.out.println("enter");

        if(select==0){
            stateManager.makeGameState(new Smasher());
            stateManager.changeToGameState();
        }
        else if(select==1){
            stateManager.makeGameState(new Sneak());
            stateManager.changeToGameState();
        }
        else if(select==2){
            stateManager.makeGameState(new Summoner());
            stateManager.changeToGameState();
        }
    }
    public void escape(){
        //System.out.println("huh");
        stateManager.changeToPauseMenuState();
    }
}
