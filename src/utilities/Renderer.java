package utilities;

import View.View;
import models.AreaEffect.AreaEffect;
import models.Graphics.GraphicAssets;
import models.Map.Map;
import models.Map.Map3D;
import models.Map.Tile;
import models.entities.Entity;

import java.awt.*;

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
                for(int x = mapEndX - 1; x  >= mapStartX; x--){
                    Point pxCenterPoint;
                    int offset;

                    // calculate the offset to render images of different size
                    if (map.getRelevantTile(y,x).getImageHeight().getHeight() != GraphicAssets.TILE_PX_HEIGHT){
                        offset = map.getRelevantTile(y,x).getImageHeight().getHeight() - GraphicAssets.TILE_PX_HEIGHT;
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
                    tileRenderer.render(g, map.getRelevantTile(y, x), pxCenterPoint);
//                    if (map.getRelevantTile(y,x).hasAreaEffect()){
//                        areaEffectRenderer.render(g,map.getRelevantTile(y,x).getAreaEffect(),pxCenterPoint);
//                    }
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
                g.drawImage(tile.getImage(), topLeft.x, topLeft.y, tile.getImage().getWidth(), tile.getImage().getHeight(), null);
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
//>>>>>>> master
                if (tile.hasAreaEffect()){
                    areaEffectRenderer.render(g,tile.getAreaEffect(),topLeft);
                }
            }
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


            // Calculate the top left corner from the center point
            //g.setColor(new Color(0, 0, 0));
            //g.fillOval(pxCenterPoint.x - 25, pxCenterPoint.y - 25, 45, 45);
            // render the correct image for the avatar's occupation.

            // Calculate location that the tile needs to be rendered using the pxCenterPoint
            Point topLeft = new Point(pxCenterPoint.x - (GraphicAssets.TILE_PX_WIDTH / 2), pxCenterPoint.y - (GraphicAssets.TILE_PX_HEIGHT / 2));
            g.drawImage(entity.getEntityImage(), topLeft.x, topLeft.y, GraphicAssets.TILE_PX_WIDTH, GraphicAssets.TILE_PX_HEIGHT, null);

        }
    }

    public static class areaEffectRenderer{
        public static void render(Graphics g, AreaEffect areaEffect, Point pxTopLeftPoint){
            g.drawImage(areaEffect.getAreaEffectImage(),pxTopLeftPoint.x,pxTopLeftPoint.y,null);
        }
    }
//    public static class areaEffectRenderer {
//        public static void render(Graphics g, AreaEffect areaEffect, Point mapCenterPoint) {
//            Point pxCenterPoint;
//            if (areaEffect.getLocation().getX() % 2 != 0) {
//                int pxX = (int) ((areaEffect.getLocation().getX() - mapCenterPoint.x) * (0.75 * GraphicAssets.TILE_PX_WIDTH)) + view.getWidth() / 2;
//                int pxY = ((mapCenterPoint.x % 2 == 0) ? GraphicAssets.TILE_PX_HEIGHT / 2 : 0) + ((areaEffect.getLocation().getY() - mapCenterPoint.y) * GraphicAssets.TILE_PX_HEIGHT) + view.getHeight() / 2;
//                pxCenterPoint = new Point(pxX, pxY);
//            } else {
//                int pxX = (int) ((areaEffect.getLocation().getX() - mapCenterPoint.x) * (0.75 * GraphicAssets.TILE_PX_WIDTH)) + view.getWidth() / 2;
//                int pxY = ((mapCenterPoint.x % 2 != 0) ? -1 * GraphicAssets.TILE_PX_HEIGHT / 2 : 0) + ((areaEffect.getLocation().getY() - mapCenterPoint.y) * GraphicAssets.TILE_PX_HEIGHT) + view.getHeight() / 2;
//                pxCenterPoint = new Point(pxX, pxY);
//            }
//
//
//            // Calculate the top left corner from the center point
//            //g.setColor(new Color(0, 0, 0));
//            //g.fillOval(pxCenterPoint.x - 25, pxCenterPoint.y - 25, 45, 45);
//            // render the correct image for the avatar's occupation.
//
//            // Calculate location that the tile needs to be rendered using the pxCenterPoint
//            Point topLeft = new Point(pxCenterPoint.x - (GraphicAssets.TILE_PX_WIDTH / 2), pxCenterPoint.y - (GraphicAssets.TILE_PX_HEIGHT / 2));
//            g.drawImage(areaEffect.getAreaEffectImage(), topLeft.x, topLeft.y, GraphicAssets.TILE_PX_WIDTH, GraphicAssets.TILE_PX_HEIGHT, null);
//
//        }
//    }
}

