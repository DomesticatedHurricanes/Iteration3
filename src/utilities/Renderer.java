package utilities;

import View.View;
import models.AreaEffect.AreaEffect;
import models.Graphics.GraphicAssets;
import models.Map.Map;
import models.Map.Map3D;
import models.Map.Tile;
import models.entities.Entity;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;

/**
 * Created by Michael on 3/30/16.
 */
public class Renderer {

    protected static View view;

    public Renderer(View view) {
        this.view = view;
    }

    public static class mapRenderer {

        public static void render(Graphics g, Map map, Point mapCenterPoint, int mapStartX, int mapEndX, int mapStartY, int mapEndY) {
            for (int y = mapStartY; y < mapEndY; y++) {
                for (int x = mapEndX; x >= mapStartX; x--) {
                    Point pxCenterPoint;
                    int offset;

                    // calculate the offset to render images of different size
                    if (map.getTile(x, y).getImage().getHeight() != GraphicAssets.TILE_PX_HEIGHT) {
                        offset = map.getTile(x, y).getImage().getHeight() - GraphicAssets.TILE_PX_HEIGHT;
                    } else {
                        offset = 0;
                    }

                    //System.out.println("offset: " + offset);

                    if (x % 2 != 0) {
                        int pxX = (int) ((x - mapCenterPoint.x) * (0.75 * GraphicAssets.TILE_PX_WIDTH)) + view.getWidth() / 2;
                        int pxY = ((mapCenterPoint.x % 2 == 0) ? GraphicAssets.TILE_PX_HEIGHT / 2 : 0) + ((y - mapCenterPoint.y) * GraphicAssets.TILE_PX_HEIGHT) + view.getHeight() / 2 - offset / 2;
                        pxCenterPoint = new Point(pxX, pxY);
//                        System.out.println("odd: " + pxCenterPoint);
                    } else {
                        int pxX = (int) ((x - mapCenterPoint.x) * (0.75 * GraphicAssets.TILE_PX_WIDTH)) + view.getWidth() / 2;
                        int pxY = ((mapCenterPoint.x % 2 != 0) ? -1 * GraphicAssets.TILE_PX_HEIGHT / 2 : 0) + ((y - mapCenterPoint.y) * GraphicAssets.TILE_PX_HEIGHT) + view.getHeight() / 2 - offset / 2;
                        pxCenterPoint = new Point(pxX, pxY);
//                        System.out.println("even: " + pxCenterPoint);
                    }
                    tileRenderer.render(g, map.getTile(y, x), pxCenterPoint);
                }
            }
        }

//        public static void render2(Graphics g, Map map, Point mapCenterPoint, int mapStartX, int mapEndX, int mapStartY, int mapEndY) {
//            for (int i = 0; i < mapEndX; i++) {
//                for (int j = 0; j < mapEndY; j++) {
//                    Point pxCenterPoint;
//
//                    int pxX = (j * GraphicAssets.TILE_PX_WIDTH / 2) + (i * GraphicAssets.TILE_PX_WIDTH / 2);
//                    int pxY = (i * GraphicAssets.TILE_PX_HEIGHT / 2) - (j * GraphicAssets.TILE_PX_HEIGHT / 2);
//                    pxCenterPoint = new Point(pxX, pxY);
//                    tileRenderer.render(g, map.getTile(i, j), pxCenterPoint);
//                }
//            }
//        }
//=======
//        public static void render2(Graphics g, Map map, Point mapCenterPoint, int mapStartX, int mapEndX, int mapStartY, int mapEndY){
//            for(int i = 0; i < mapEndX; i++){
//                for(int j = 0; j < mapEndY; j++ ){
//                    Point pxCenterPoint;
//
//                    int pxX = (j * GraphicAssets.TILE_PX_WIDTH / 2) + (i * GraphicAssets.TILE_PX_WIDTH /2);
//                    int pxY = (i * GraphicAssets.TILE_PX_HEIGHT / 2) - (j * GraphicAssets.TILE_PX_HEIGHT / 2);
//                    pxCenterPoint = new Point(pxX, pxY);
//                    tileRenderer.render(g, map.getTile(i,j),pxCenterPoint);
//                }
//            }
//        }
//
        public static void render(Graphics g, Map3D map, Point mapCenterPoint, int mapStartX, int mapEndX, int mapStartY, int mapEndY) {
            for(int y = mapStartY; y < mapEndY; y++){
                for(int x = mapStartX; x  <mapEndX; x++){
                    Point pxCenterPoint;
                    int offset;

                    // calculate the offset to render images of different size
                    if (map.getRelevantTile(y,x).getImageHeight() != GraphicAssets.TILE_PX_HEIGHT){
                        offset = map.getRelevantTile(y,x).getImageHeight() - GraphicAssets.TILE_PX_HEIGHT;
                    } else{
                        offset = 0;
                    }

                    //System.out.println("offset: " + offset);

                    if(x % 2 != 0) {
                        int pxX = (int)((x - mapCenterPoint.x)*(0.75* GraphicAssets.TILE_PX_WIDTH)) + view.getWidth()/2;
                        int pxY = ((mapCenterPoint.x % 2 == 0)? GraphicAssets.TILE_PX_HEIGHT/2 : 0) + ((y - mapCenterPoint.y)* GraphicAssets.TILE_PX_HEIGHT) + view.getHeight()/2 - offset/2;
                        pxCenterPoint = new Point(pxX, pxY);
////                        System.out.println("odd: " + pxCenterPoint);
                    } else {
                        int pxX = (int)((x - mapCenterPoint.x)*(0.75* GraphicAssets.TILE_PX_WIDTH)) + view.getWidth()/2;
                        int pxY = ((mapCenterPoint.x % 2 != 0)? -1 * GraphicAssets.TILE_PX_HEIGHT/2 : 0) + ((y - mapCenterPoint.y)* GraphicAssets.TILE_PX_HEIGHT) + view.getHeight()/2 - offset/2;
                        pxCenterPoint = new Point(pxX, pxY);
//                        System.out.println("even: " + pxCenterPoint);
                    }
//<<<<<<< HEAD
                    tileRenderer.render(g, map.getRelevantTile(y, x), pxCenterPoint);
//                    if (map.getRelevantTile(y,x).hasAreaEffect()){
//                        areaEffectRenderer.render(g,map.getRelevantTile(y,x).getAreaEffect(),pxCenterPoint);
//                    }
//=======
//                     tileRenderer.render(g, map.getRelevantTile(y, x), pxCenterPoint);
//                    //if(x==mapEndX-1)x=mapStartX+1;
//>>>>>>> 95c34ff7cea9afa5e38b2ae4e504302ce42f26fb
                }
            }
        }
//>>>>>>> master
    }

    public static class tileRenderer {
        public static void render(Graphics g, Tile tile, Point pxCenterPoint) {
            render(g, tile, pxCenterPoint, 1);
        }

        public static void render(Graphics g, Tile tile, Point pxCenterPoint, float value) {

            // Calculate location that the tile needs to be rendered using the pxCenterPoint
//            Point topLeft = new Point(pxCenterPoint.x - (GraphicAssets.TILE_PX_WIDTH / 2), pxCenterPoint.y - (GraphicAssets.TILE_PX_HEIGHT / 2));

            // Calculate the location of the tile that needs to be rendered
            Point topLeft = new Point(pxCenterPoint.x - (tile.getImage().getWidth() / 2), pxCenterPoint.y - (tile.getImage().getHeight() / 2));
            if (value >= 0) {
//                g.drawImage(tile.getImage(), topLeft.x, topLeft.y, GraphicAssets.TILE_PX_WIDTH, GraphicAssets.TILE_PX_HEIGHT, null);
                // Draw the image given the height and width of the image
//<<<<<<< HEAD
//                g.drawImage(tile.getImage(), topLeft.x, topLeft.y, tile.getImage().getWidth(), tile.getImage().getHeight(), null);
//
//
//                if (tile.hasAreaEffect()) {
//                    // Render HealDamage AreaEffect
//                    System.out.println("Has areaeffect");
//                    areaEffectRenderer.render(g, tile.getAreaEffect(), topLeft);
//                }
//=======
                if(tile.getType()=="Mountain"){

                    g.drawImage(GraphicAssets.col,topLeft.x, topLeft.y+19+21,60,tile.getImageHeight()/2,null);
                    g.drawImage(GraphicAssets.base,topLeft.x, topLeft.y+19+19+tile.getImageHeight()/2,60,19,null);
                    g.drawImage(tile.getImage(), topLeft.x, topLeft.y, tile.getImage().getWidth(), tile.getImage().getHeight(), null);

                }

                else if(tile.getType()=="Water"){
                    //
                    //System.out.println(topLeft.y);
                    g.drawImage(GraphicAssets.col,topLeft.x, topLeft.y+10+19,60,tile.getImageHeight()/2,null);
                    g.drawImage(GraphicAssets.base,topLeft.x, topLeft.y+10+19+tile.getImageHeight()/2,60,19,null);
                    g.drawImage(tile.getImage(), topLeft.x, topLeft.y+10, tile.getImage().getWidth(), tile.getImage().getHeight(), null);
                }

                else if(tile.getType()=="Grass"){

                    g.drawImage(GraphicAssets.col,topLeft.x, topLeft.y+19+21,60,tile.getImageHeight()/2,null);
                    g.drawImage(GraphicAssets.base,topLeft.x, topLeft.y+19+19+tile.getImageHeight()/2,60,19,null);
                    g.drawImage(tile.getImage(), topLeft.x, topLeft.y, tile.getImage().getWidth(), tile.getImage().getHeight(), null);

                }


                //
                // System.out.println(topLeft.y);
                //g.drawImage(tile.getImage(), topLeft.x, topLeft.y, tile.getImage().getWidth(), tile.getImage().getHeight(), null);
                // Integer point = tile.getPoint3D().getZ();
                // g.drawString(point.toString(),topLeft.x,topLeft.y);
//=======
//            Point topLeft = new Point(pxCenterPoint.x - (tile.getImageHeight().getWidth()/2 ), pxCenterPoint.y - (tile.getImageHeight().getWidth()/2));
//            if(value >= 0) {
//                System.out.println("Did it");
////                g.drawImage(tile.getImage(), topLeft.x, topLeft.y, GraphicAssets.TILE_PX_WIDTH, GraphicAssets.TILE_PX_HEIGHT, null);
//                // Draw the image given the height and width of the image
//                g.drawImage(tile.getImageHeight(), topLeft.x, topLeft.y, tile.getImageHeight().getWidth(), tile.getImageHeight().getHeight(), null);
//                if(tile.getEntity() != null){
//                   // g.drawImage(tile.getEntity().getEntityImage(), 5, 5, tile.getEntity().getEntityImage().getWidth(), tile.getEntity().getEntityImage().getHeight(), null);
//                }
//               // Integer point = tile.getPoint3D().getZ();
//               // g.drawString(point.toString(),topLeft.x,topLeft.y);
////>>>>>>> master
//>>>>>>> 95c34ff7cea9afa5e38b2ae4e504302ce42f26fb
            }
        }
    }

    public static class areaEffectRenderer{
        public static void render(Graphics g, AreaEffect areaEffect, Point pxTopLeftPoint){
            System.out.println(areaEffect.getAreaEffectImage());
            g.drawImage(areaEffect.getAreaEffectImage(),pxTopLeftPoint.x,pxTopLeftPoint.y,null);
        }
    }

    public static class entityRenderer {
        public static void render(Graphics g, Entity entity, Point mapCenterPoint) {
            Point pxCenterPoint;
            if (entity.getLocation().getX() % 2 != 0) {
                int pxX = (int) ((entity.getLocation().getX() - mapCenterPoint.x) * (0.75 * GraphicAssets.TILE_PX_WIDTH)) + view.getWidth() / 2;
                int pxY = ((mapCenterPoint.x % 2 == 0) ? GraphicAssets.TILE_PX_HEIGHT / 2 : 0) + ((entity.getLocation().getY() - mapCenterPoint.y) * GraphicAssets.TILE_PX_HEIGHT) + view.getHeight() / 2;
                pxCenterPoint = new Point(pxX, pxY);
            } else {
                int pxX = (int) ((entity.getLocation().getX() - mapCenterPoint.x) * (0.75 * GraphicAssets.TILE_PX_WIDTH)) + view.getWidth() / 2;
                int pxY = ((mapCenterPoint.x % 2 != 0) ? -1 * GraphicAssets.TILE_PX_HEIGHT / 2 : 0) + ((entity.getLocation().getY() - mapCenterPoint.y) * GraphicAssets.TILE_PX_HEIGHT) + view.getHeight() / 2;
                pxCenterPoint = new Point(pxX, pxY);
            }

            // Calculate location that the tile needs to be rendered using the pxCenterPoint
            Point topLeft = new Point(pxCenterPoint.x - (GraphicAssets.TILE_PX_WIDTH / 2), pxCenterPoint.y - (GraphicAssets.TILE_PX_HEIGHT / 2));
            g.drawImage(entity.getEntityImage(), topLeft.x, topLeft.y, GraphicAssets.TILE_PX_WIDTH, GraphicAssets.TILE_PX_HEIGHT, null);

        }
    }
//
//    public static class areaEffectRenderer{
//        public static void render(Graphics g, AreaEffect areaEffect, Point pxTopLeftPoint){
//            render(g,areaEffect,pxTopLeftPoint,1f);
//        }
//        public static void render(Graphics g, AreaEffect areaEffect, Point pxTopLeftPoint,float value){
//            g.drawImage(img,pxTopLeftPoint.x,pxTopLeftPoint.y,null);
//        }
//    }
}

