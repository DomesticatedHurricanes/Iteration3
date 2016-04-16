package utilities;

import View.View;
import models.Graphics.GraphicAssets;
import models.Map.Map;
import models.Map.Map3D;
import models.Map.Tile;

import java.awt.*;

/**
 * Created by Michael on 3/30/16.
 */
public class Renderer {

    protected static View view;

    public Renderer(View view){
        this.view = view;
    }

    public static class mapRenderer {

        public static void render(Graphics g, Map map, Point mapCenterPoint, int mapStartX, int mapEndX, int mapStartY, int mapEndY) {
            for(int y = mapStartY; y < mapEndY; y++){
                for(int x = mapEndX; x >= mapStartX; x--){
                    Point pxCenterPoint;
                    int offset;

                    // calculate the offset to render images of different size
                    if (map.getTile(x,y).getImage().getHeight() != GraphicAssets.TILE_PX_HEIGHT){
                        offset = map.getTile(x,y).getImage().getHeight() - GraphicAssets.TILE_PX_HEIGHT;
                    } else{
                        offset = 0;
                    }

                    //System.out.println("offset: " + offset);

                    if(x % 2 != 0) {
                        int pxX = (int)((x - mapCenterPoint.x)*(0.75* GraphicAssets.TILE_PX_WIDTH)) + view.getWidth()/2;
                        int pxY = ((mapCenterPoint.x % 2 == 0)? GraphicAssets.TILE_PX_HEIGHT/2 : 0) + ((y - mapCenterPoint.y)* GraphicAssets.TILE_PX_HEIGHT) + view.getHeight()/2 - offset/2;
                        pxCenterPoint = new Point(pxX, pxY);
//                        System.out.println("odd: " + pxCenterPoint);
                    } else {
                        int pxX = (int)((x - mapCenterPoint.x)*(0.75* GraphicAssets.TILE_PX_WIDTH)) + view.getWidth()/2;
                        int pxY = ((mapCenterPoint.x % 2 != 0)? -1 * GraphicAssets.TILE_PX_HEIGHT/2 : 0) + ((y - mapCenterPoint.y)* GraphicAssets.TILE_PX_HEIGHT) + view.getHeight()/2 - offset/2;
                        pxCenterPoint = new Point(pxX, pxY);
//                        System.out.println("even: " + pxCenterPoint);
                    }
                    tileRenderer.render(g, map.getTile(x,y), pxCenterPoint);
                }
            }
        }

        public static void render2(Graphics g, Map map, Point mapCenterPoint, int mapStartX, int mapEndX, int mapStartY, int mapEndY){
            for(int i = 0; i < mapEndX; i++){
                for(int j = 0; j < mapEndY; j++ ){
                    Point pxCenterPoint;

                    int pxX = (j * GraphicAssets.TILE_PX_WIDTH / 2) + (i * GraphicAssets.TILE_PX_WIDTH /2);
                    int pxY = (i * GraphicAssets.TILE_PX_HEIGHT / 2) - (j * GraphicAssets.TILE_PX_HEIGHT / 2);
                    pxCenterPoint = new Point(pxX, pxY);
                    tileRenderer.render(g, map.getTile(i,j),pxCenterPoint);
                }
            }
        }

        public static void render(Graphics g, Map3D map, Point mapCenterPoint, int mapStartX, int mapEndX, int mapStartY, int mapEndY) {
            for(int y = mapStartY; y < mapEndY; y++){
                for(int x = mapEndX - 1; x  >= mapStartX; x--){
                    Point pxCenterPoint;
                    int offset;

                    // calculate the offset to render images of different size
                    if (map.getRelevantTile(x,y).getImageHeight().getHeight() != GraphicAssets.TILE_PX_HEIGHT){
                        offset = map.getRelevantTile(x,y).getImageHeight().getHeight() - GraphicAssets.TILE_PX_HEIGHT;
                    } else{
                        offset = 0;
                    }

                    //System.out.println("offset: " + offset);

                    if(x % 2 != 0) {
                        int pxX = (int)((x - mapCenterPoint.x)*(0.75* GraphicAssets.TILE_PX_WIDTH)) + view.getWidth()/2;
                        int pxY = ((mapCenterPoint.x % 2 == 0)? GraphicAssets.TILE_PX_HEIGHT/2 : 0) + ((y - mapCenterPoint.y)* GraphicAssets.TILE_PX_HEIGHT) + view.getHeight()/2 - offset/2;
                        pxCenterPoint = new Point(pxX, pxY);
//                        System.out.println("odd: " + pxCenterPoint);
                    } else {
                        int pxX = (int)((x - mapCenterPoint.x)*(0.75* GraphicAssets.TILE_PX_WIDTH)) + view.getWidth()/2;
                        int pxY = ((mapCenterPoint.x % 2 != 0)? -1 * GraphicAssets.TILE_PX_HEIGHT/2 : 0) + ((y - mapCenterPoint.y)* GraphicAssets.TILE_PX_HEIGHT) + view.getHeight()/2 - offset/2;
                        pxCenterPoint = new Point(pxX, pxY);
//                        System.out.println("even: " + pxCenterPoint);
                    }
                    tileRenderer.render(g, map.getRelevantTile(x, y), pxCenterPoint);
                }
            }
        }
    }

    public static class tileRenderer {
        public static void render(Graphics g, Tile tile, Point pxCenterPoint){
            render( g, tile, pxCenterPoint,1);
        }

        public static void render(Graphics g,Tile tile,Point pxCenterPoint,float value) {

            // Calculate location that the tile needs to be rendered using the pxCenterPoint
//            Point topLeft = new Point(pxCenterPoint.x - (GraphicAssets.TILE_PX_WIDTH / 2), pxCenterPoint.y - (GraphicAssets.TILE_PX_HEIGHT / 2));

            // Calculate the location of the tile that needs to be rendered
            Point topLeft = new Point(pxCenterPoint.x - (tile.getImageHeight().getWidth()/2 ), pxCenterPoint.y - (tile.getImageHeight().getWidth()/2));
            if(value >= 0) {
                System.out.println("Did it");
//                g.drawImage(tile.getImage(), topLeft.x, topLeft.y, GraphicAssets.TILE_PX_WIDTH, GraphicAssets.TILE_PX_HEIGHT, null);
                // Draw the image given the height and width of the image
                g.drawImage(tile.getImageHeight(), topLeft.x, topLeft.y, tile.getImageHeight().getWidth(), tile.getImageHeight().getHeight(), null);
                if(tile.getEntity() != null){
                   // g.drawImage(tile.getEntity().getEntityImage(), 5, 5, tile.getEntity().getEntityImage().getWidth(), tile.getEntity().getEntityImage().getHeight(), null);
                }
               // Integer point = tile.getPoint3D().getZ();
               // g.drawString(point.toString(),topLeft.x,topLeft.y);
            }
        }
    }


}
