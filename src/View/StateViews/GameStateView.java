package View.StateViews;

import models.AreaEffect.AreaEffect;
import models.Graphics.GraphicAssets;
import models.Map.Map;
import models.entities.AINpc;
import models.entities.Avatar;
import models.Map.Map3D;
import models.entities.Entity;
import utilities.Point3D;

import java.awt.*;
import java.util.ArrayList;

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
    private Point3D currentPoint;
    private boolean movingView = false;

    private ArrayList<Entity> entities;
    private ArrayList<AINpc> aiNpcs;
    private Avatar avatar;
    private Map3D map;

    private ArrayList<AreaEffect> areaEffects;

    public GameStateView(Map3D map, Avatar avatar, ArrayList<Entity> entities,ArrayList<AreaEffect> areaEffects){

        this.map = map;
        this.avatar = avatar;
        this.entities = entities;
        this.areaEffects = areaEffects;
        init();

        // Start the map in the top left corner.
        mapStartX = 0;
        mapStartY = 0;

        //Map3D world3D = new Map3D(10);

        // The end of what we expect to render of the map should either be limited by the size of the map or the size of the viewport (i.e. the window)
        mapEndX = Math.min(map.getWidth() -1, (int)Math.ceil(GraphicAssets.VIEW_WIDTH/ GraphicAssets.TILE_PX_WIDTH));
        mapEndY = Math.min(map.getHeight() -1, (int)Math.ceil(GraphicAssets.VIEW_HEIGHT/ GraphicAssets.TILE_PX_HEIGHT));

        mapCameraCenter = new Point((mapStartX + mapEndX)/2, (mapStartY + mapEndY)/2);
        pxCameraCenter = new Point(GraphicAssets.VIEW_WIDTH/2, GraphicAssets.VIEW_HEIGHT/2);
    }

    @Override
    protected void init(){
        //System.out.println("In game view");
    }

    @Override
    public void render(Graphics g){
        update();
        renderMap(g);
        renderPlayer(g);
        renderStats(g);
        //renderAreaEffect(g);
    }

    public void update(){
        // Update the camera center
        if (!movingView){
            mapCameraCenter = new Point(avatar.getLocation().getX(),avatar.getLocation().getY());
        }
        currentPoint = new Point3D(mapCameraCenter.x,mapCameraCenter.y,0);

        // update the map start and end
        mapStartX = (int)Math.max(0, (mapCameraCenter.x - (pxCameraCenter.x/(0.75*GraphicAssets.TILE_PX_WIDTH))) - 2);
        mapStartY = Math.max(0, (mapCameraCenter.y - (pxCameraCenter.y/GraphicAssets.TILE_PX_HEIGHT)) - 2);
        mapEndX = (int)Math.min(map.getWidth() -1, (mapCameraCenter.x + (pxCameraCenter.x/(0.75*GraphicAssets.TILE_PX_WIDTH))) + 2);
        mapEndY = Math.min(map.getHeight() -1, (mapCameraCenter.y + (pxCameraCenter.y/GraphicAssets.TILE_PX_HEIGHT)) + 2);

    }

    private void renderMap(Graphics g){
        utilities.Renderer.mapRenderer.render(g,map,mapCameraCenter,mapStartX,mapEndX,mapStartY,mapEndY);
    }

    private void renderTile(Graphics g){
    }

    private void renderPlayer(Graphics g){
        for (Entity entity: entities){
            utilities.Renderer.entityRenderer.render(g, entity, mapCameraCenter);
        }
//        for(Entity inViewEntity : inViewEntities) {
//            // Get the offset amount
//            Point pxRenderOffset = inViewEntityPxOffset.get(inViewEntity);
//
//            int x = inViewEntity.getLocation().x;
//            int y = inViewEntity.getLocation().y;
//            // Render it
    }

    private void renderStats(Graphics g){
        utilities.Renderer.statsRenderer.render(g,avatar,avatar.getStats());
    }

    public void moveViewNorth(){
        movingView();
        Point3D nextPoint = currentPoint.getTranslateNorth();
        mapCameraCenter = new Point(nextPoint.getX(),nextPoint.getY());
    }

    public void moveViewNorthEast(){
        movingView();
        Point3D nextPoint = currentPoint.getTranslateNorthEast();
        mapCameraCenter = new Point(nextPoint.getX(),nextPoint.getY());
    }

    public void moveViewNorthWest(){
        movingView();
        Point3D nextPoint = currentPoint.getTranslateNorthWest();
        mapCameraCenter = new Point(nextPoint.getX(),nextPoint.getY());
    }

    public void moveViewSouth(){
        movingView();
        Point3D nextPoint = currentPoint.getTranslateSouth();
        mapCameraCenter = new Point(nextPoint.getX(),nextPoint.getY());
    }

    public void moveViewSouthEast(){
        movingView();
        Point3D nextPoint = currentPoint.getTranslateSouthEast();
        mapCameraCenter = new Point(nextPoint.getX(),nextPoint.getY());
    }

    public void moveViewSouthWest(){
        movingView();
        Point3D nextPoint = currentPoint.getTranslateSouthWest();
        mapCameraCenter = new Point(nextPoint.getX(),nextPoint.getY());
    }

    private void movingView(){
        movingView = true;
    }

    public void stopViewMove(){
        movingView = false;
    }
//=======
//        utilities.Renderer.mapRenderer.render(g, world3D, mapCameraCenter, mapStartX, mapEndX, mapStartY, mapEndY);
//        //utilities.Renderer.mapRenderer.render(g,world3D,mapCameraCenter,mapEndX,mapEndY);
//        //Renderer.mapRenderer.render2(g,world,mapCameraCenter,mapStartX,mapEndX,mapStartY,mapEndY);
//        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//
//        // End drawing
////        g.dispose();
//        //utilities.Renderer.mapRenderer.render(g,world,mapCameraCenter,mapStartX,mapEndX,mapStartY,mapEndY);
//
//>>>>>>> master

}


