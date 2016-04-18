package utilities;

import View.View;
import models.AreaEffect.AreaEffect;
import models.Graphics.GraphicAssets;
import models.Item.Item;
import models.Map.Map;
import models.Map.Map3D;
import models.Map.Tile;
import models.effects.Effect;
import models.effects.RadialEffect;
import models.entities.Avatar;
import models.entities.Entity;
import models.stats.CharacterStats;
import models.stats.Stats;
import utilities.Point3D;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.util.*;

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
                    //if (map.getTile(x, y).getImage().getHeight() != GraphicAssets.TILE_PX_HEIGHT) {
                    //  offset = map.getTile(x, y).getImage().getHeight() - GraphicAssets.TILE_PX_HEIGHT;
                    //} else {
                    offset = 0;
                    //}

                    //System.out.println("offset: " + offset);

                    if (x % 2 != 0) {
                        int pxX = (int) ((x - mapCenterPoint.x) * (0.75 * GraphicAssets.TILE_PX_WIDTH)) + view.getWidth() / 2;
                        int pxY = ((mapCenterPoint.x % 2 == 0) ? GraphicAssets.TILE_PX_HEIGHT / 2 : 0) + ((y - mapCenterPoint.y) * GraphicAssets.TILE_PX_HEIGHT) + view.getHeight() / 2 - offset / 2;
                        pxCenterPoint = new Point(pxX, pxY);
                    } else {
                        int pxX = (int) ((x - mapCenterPoint.x) * (0.75 * GraphicAssets.TILE_PX_WIDTH)) + view.getWidth() / 2;
                        int pxY = ((mapCenterPoint.x % 2 != 0) ? -1 * GraphicAssets.TILE_PX_HEIGHT / 2 : 0) + ((y - mapCenterPoint.y) * GraphicAssets.TILE_PX_HEIGHT) + view.getHeight() / 2 - offset / 2;
                        pxCenterPoint = new Point(pxX, pxY);
                    }
                    tileRenderer.render(g, map.getTile(y, x), pxCenterPoint);
                }
            }
        }

        public static void render(Graphics g, Map3D map, Point mapCenterPoint, int mapStartX, int mapEndX, int mapStartY, int mapEndY) {
            for (int y = mapStartY; y < mapEndY; y++) {
                for (int x = mapStartX; x < mapEndX; x++) {
                    Point pxCenterPoint;
                    int offset;

                    // calculate the offset to render images of different size
                    if (map.getRelevantTile(y, x).getImageHeight() != GraphicAssets.TILE_PX_HEIGHT) {
                        offset = map.getRelevantTile(y, x).getImageHeight() - GraphicAssets.TILE_PX_HEIGHT;
                    } else {
                        offset = 0;
                    }

                    if (x % 2 != 0) {
                        int pxX = (int) ((x - mapCenterPoint.x) * (0.75 * GraphicAssets.TILE_PX_WIDTH)) + view.getWidth() / 2;
                        int pxY = ((mapCenterPoint.x % 2 == 0) ? GraphicAssets.TILE_PX_HEIGHT / 2 : 0) + ((y - mapCenterPoint.y) * GraphicAssets.TILE_PX_HEIGHT) + view.getHeight() / 2 - offset / 2;
                        pxCenterPoint = new Point(pxX, pxY);
                    } else {
                        int pxX = (int) ((x - mapCenterPoint.x) * (0.75 * GraphicAssets.TILE_PX_WIDTH)) + view.getWidth() / 2;
                        int pxY = ((mapCenterPoint.x % 2 != 0) ? -1 * GraphicAssets.TILE_PX_HEIGHT / 2 : 0) + ((y - mapCenterPoint.y) * GraphicAssets.TILE_PX_HEIGHT) + view.getHeight() / 2 - offset / 2;
                        pxCenterPoint = new Point(pxX, pxY);
                    }

                    tileRenderer.render(g, map.getRelevantTile(y, x), pxCenterPoint);
                }
            }
        }
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


                if (tile.getType() == "Mountain") {

                    g.drawImage(GraphicAssets.col, topLeft.x, topLeft.y + 19 + 21, 60, tile.getImageHeight() / 2, null);
                    g.drawImage(GraphicAssets.base, topLeft.x, topLeft.y + 19 + 19 + tile.getImageHeight() / 2, 60, 19, null);
                    g.drawImage(tile.getImage(), topLeft.x, topLeft.y, tile.getImage().getWidth(), tile.getImage().getHeight(), null);

                } else if (tile.getType() == "Water" || tile.getType() == "Grass" || tile.getType() == "Running") {
                    //
                    //System.out.println(topLeft.y);
                    g.drawImage(GraphicAssets.col, topLeft.x, topLeft.y + 10 + 19, 60, tile.getImageHeight() / 2, null);
                    g.drawImage(GraphicAssets.base, topLeft.x, topLeft.y + 10 + 19 + tile.getImageHeight() / 2, 60, 19, null);
                    g.drawImage(tile.getImage(), topLeft.x, topLeft.y + 10, tile.getImage().getWidth(), tile.getImage().getHeight(), null);
                } else {
                    g.drawImage(GraphicAssets.col, topLeft.x, topLeft.y + 10 + 19, 60, tile.getImageHeight() / 2, null);
                    g.drawImage(GraphicAssets.base, topLeft.x, topLeft.y + 10 + 19 + tile.getImageHeight() / 2, 60, 19, null);
                    g.drawImage(tile.getImage(), topLeft.x, topLeft.y + 10, tile.getImage().getWidth(), tile.getImage().getHeight(), null);
                }
                if (tile.hasAreaEffect()) {
                    areaEffectRenderer.render(g, tile.getAreaEffect(), topLeft);
                }

                if (tile.hasItem()) {
                    for (Item item : tile.getItems()) {
                        itemRenderer.render(g, item, topLeft);
                    }
                }
            }
        }
    }

    public static class areaEffectRenderer {
        public static void render(Graphics g, AreaEffect areaEffect, Point pxTopLeftPoint) {

            g.drawImage(areaEffect.getAreaEffectImage(), pxTopLeftPoint.x + 10, pxTopLeftPoint.y + 10, null);

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
            g.drawImage(entity.getEntityImage(), topLeft.x, topLeft.y + 10, GraphicAssets.TILE_PX_WIDTH, GraphicAssets.TILE_PX_HEIGHT, null);

        }
    }

    public static class itemRenderer {
        public static void render(Graphics g, Item item, Point pxTopLeft) {
            g.drawImage(item.getImage(), pxTopLeft.x + 5, pxTopLeft.y, GraphicAssets.TILE_PX_WIDTH - 20, GraphicAssets.TILE_PX_HEIGHT - 10, null);
        }

    }

    public static class statsRenderer {
        public static void render(Graphics g, Avatar avatar, CharacterStats stats) {

            int max = stats.getMaxHp();
            int now = stats.getCurrentHp();

            int perc = (int) (100 * now / max);

            int x = 20;
            int y = 10;
            int width = 200;
            int height = 20;

            g.setColor(Color.RED);
            g.fillRect(x, y, (int) (width * perc / 100), height);
            g.setColor(Color.black);
            g.fillRect(x + (int) (width * perc / 100), y, (int) (width * (100 - perc) / 100), height);


        }
    }
}




