package models.Map;


import models.Graphics.GraphicAssets;
import models.Interaction.MovementHandler;
import models.entities.Entity;
import utilities.Point3D;

/**
 * Created by Michael on 3/30/16.
 * Map is represents the 2D world.
 * It is responsible for initializing the tiles and adding objects to a tile.
 */
public class Map {
    private Tile[][] world;
    private int width;
    private int height;
    private int depth;

    public Map(int width, int height){

        this.height = height;
        this.width = width;
        this.depth = width;
        initializeMap(width,height);
        testTilesMap(width, height);
//        testHeightMap(width,height);
    }

    public void initializeMap(int width, int height){
        Tile[][] tiles = new Tile[width][height];
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                // Temporary: the height increases from left to right
                tiles[i][j] = new GrassTile(new Point3D(i,j, 0));
            }
        }

        this.world = tiles;
    }

    private void testHeightMap(int width, int height){
        int[][] tileMap = new int[][] {
                {9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
                {9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
                {9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
                {9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
                {9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
                {9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
                {9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
                {9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
                {9, 8, 7, 6, 5, 4, 3, 2, 1, 0},
        };

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
//                if (i == 0){
//                    world[i][j].setImage(GraphicAssets.h2);
//                }
                if (tileMap[i][j] == 0){
                    world[i][j].setImage(GraphicAssets.h2);
                }
                if (tileMap[i][j] == 1){
                    world[i][j].setImage(GraphicAssets.h3);
                }
                if (tileMap[i][j] == 2){
                    world[i][j].setImage(GraphicAssets.h4);
                }
                if (tileMap[i][j] == 3){
                    world[i][j].setImage(GraphicAssets.h5);
                }
                if (tileMap[i][j] == 4){
                    world[i][j].setImage(GraphicAssets.h6);
                }
                if (tileMap[i][j] == 5){
                    world[i][j].setImage(GraphicAssets.h7);
                }
                if (tileMap[i][j] == 6){
                    world[i][j].setImage(GraphicAssets.h8);
                }
                if (tileMap[i][j] == 7){
                    world[i][j].setImage(GraphicAssets.h9);
                }
                if (tileMap[i][j] == 8){
                    world[i][j].setImage(GraphicAssets.h10);
                }
            }
        }
    }

    private void testTilesMap(int width, int height){
        Tile[][] tiles = new Tile[width][height];
        int[][] tileMap = new int[][] {
                {0, 1, 1, 2, 0, 0, 2, 3, 4, 4},
                {0, 1, 1, 2, 2, 0, 1, 5, 3, 3},
                {0, 1, 1, 2, 0, 0, 1, 3, 3, 4},
                {0, 1, 1, 2, 0, 2, 3, 3, 3, 4},

                {0, 1, 1, 2, 0, 1, 2, 3, 3, 4},
                {0, 0, 1, 0, 0, 2, 3, 3, 4, 4},
                {0, 0, 0, 1, 2, 2, 3, 5, 4, 4},
                {0, 0, 1, 2, 2, 2, 3, 2, 4, 4},

                {0, 1, 1, 1, 0, 1, 3, 2, 4, 4},
                {0, 1, 1, 0, 0, 0, 3, 3, 4, 4}
        };
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                // Water
                if (tileMap[i][j] == 0){
                    world[i][j] = new RunningWaterTile(new Point3D(i,j,i), 1, Entity.Orientation.NORTH);
                }
                // Grass
                if (tileMap[i][j] == 1){
                    world[i][j] = new GrassTile(new Point3D(i,j,i));
                    world[i][j].setImage(GraphicAssets.GroundGrassTile);
                }
                // Trees
                if (tileMap[i][j] == 2){
                    world[i][j] = new GrassTile(new Point3D(i,j,0));
                }
                // Path
                if (tileMap[i][j] == 3){
                    world[i][j] = new MountainTile(new Point3D(i,j,0));
                    world[i][j].setImage(GraphicAssets.GroundMountainTile);
                }
                // Mountain
                if (tileMap[i][j] == 4){
                    world[i][j] = new MountainTile(new Point3D(i,j,0));
                }
                // Rock
                if (tileMap[i][j] == 3){
                    world[i][j] = new MountainTile(new Point3D(i,j,0));
                    world[i][j].setImage(GraphicAssets.RockTile);
                }
            }
        }
    }

    public Tile getTile(int x, int y){
        return world[x][y];
    }

    // TODO add the necessary check to see if the tile is blocked/too high
    public boolean isBlocked(int x, int y){
        return false;
    }

    public boolean isValid(int sz, int z){
        return false;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }
}
