package View.StateViews;

import models.Graphics.GraphicAssets;
import models.Map.Map;
import models.entities.Avatar;
import models.entities.Entity;

import java.awt.*;

/**
 * Created by Michael on 4/14/16.
 */
public class GameStateView  extends  StateView{
    private Graphics g;

    private int mapStartX;
    private int mapStartY;
    private int mapEndX;
    private int mapEndY;
    private Point mapCameraCenter;
    private Point pxCameraCenter;

    private Avatar avatar;
    private Map map;

    public GameStateView(Map map, Avatar avatar){
        this.map = map;
        this.avatar = avatar;
        init();
    }

    @Override
    protected void init(){

        //System.out.println("In game view");
    }

    @Override
    public void render(Graphics g){
        //System.out.println("Printing gameview");

        // Start the map in the top left corner.
        mapStartX = 0;
        mapStartY = 0;

        // The end of what we expect to render of the map should either be limited by the size of the map or the size of the viewport (i.e. the window)
        mapEndX = Math.min(9, (int)Math.ceil(400/ GraphicAssets.TILE_PX_WIDTH));
        mapEndY = Math.min(9, (int)Math.ceil(600/ GraphicAssets.TILE_PX_HEIGHT));

        mapCameraCenter = new Point((mapStartX + mapEndX)/2, (mapStartY + mapEndY)/2);
        pxCameraCenter = new Point(400/2, 600/2);

        renderMap(g);
        renderPlayer(g);
    }

    private void renderMap(Graphics g){
        utilities.Renderer.mapRenderer.render(g,map,mapCameraCenter,mapStartX,mapEndX,mapStartY,mapEndY);

    }

    private void renderTile(Graphics g){

    }

    private void renderPlayer(Graphics g){
//        for(Entity inViewEntity : inViewEntities) {
//            // Get the offset amount
//            Point pxRenderOffset = inViewEntityPxOffset.get(inViewEntity);
//
//            int x = inViewEntity.getLocation().x;
//            int y = inViewEntity.getLocation().y;
//            // Render it
//            utilities.Renderer.entityRenderer.render(g, inViewEntity, mapCameraCenter, pxRenderOffset,playState.getPlayer().areaBeenSeen(x,y));
//        }
    }

}
