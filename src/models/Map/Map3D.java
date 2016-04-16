package models.Map;

import models.Graphics.GraphicAssets;
import utilities.Point3D;

/**
 * Created by david on 4/15/16.
 */
public class Map3D {

    /**
     * Created by Michael on 3/30/16.
     * Map is represents the 2D world.
     * It is responsible for initializing the tiles and adding objects to a tile.
     */

    private Tile[][][] world;
    private Tile[][] topologicalMap;
    private int width;
    private int height;
    private int depth;

    public Map3D(int depth){
        initTopologicalMap();
        this.height = topologicalMap[0].length;
        this.width = topologicalMap.length;
        this.depth = depth;
        initializeMap(topologicalMap, depth);
    }

    public void initializeMap(Tile [][] topologicalMap, int depth){
        world = new Tile[width][height][depth];

        //Make AirTiles
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                for(int z = topologicalMap[i][j].getDepth() + 1; z < depth; z++){
                    world[i][j][z] = new AirTile(new Point3D(i,j,z));
                }
            }
        }

        //Make Ground Tiles
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                for(int z = topologicalMap[i][j].getDepth(); z >= 0; z--){
                    world[i][j][z] = new GrassTile(new Point3D(i,j,z));
                }
            }
        }

        //Put in the topological tiles
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                world[i][j][topologicalMap[i][j].getDepth()] = topologicalMap[i][j];
            }
        }



    }

    public void initTopologicalMap(){
        int[][] baseMap = {
                {0, 1, 2},
                {0, 1, 2},
                {0, 1, 2}
        };

        int[][] terrainMap = {
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}
        };

        topologicalMap = new Tile[3][3];

        for(int i = 0; i < baseMap.length; i++){
            for(int j = 0; j < baseMap[0].length; j++){
                if(terrainMap[i][j] == 1)
                    topologicalMap[i][j] = new GrassTile(new Point3D(i, j, baseMap[i][j]));
                else if(terrainMap[i][j] == 2)
                    topologicalMap[i][j] = new StillWaterTile(new Point3D(i, j, baseMap[i][j]));
                else if(terrainMap[i][j] == 3)
                    topologicalMap[i][j] = new MountainTile(new Point3D(i, j, baseMap[i][j]));
            }
        }

    }

    public void testMap(){
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                for(int z = 0; z < depth; z++){
                    Tile testTile = world[i][j][z];
                    System.out.println(testTile.getType() + "Tile: x = " + i + ", y = " + j + ", z = " + testTile.getDepth());
                }
            }
        }
    }

    public Tile getTile(Point3D point3D){
        return world[point3D.getX()][point3D.getY()][point3D.getZ()];
    }

    public Tile getTile(int x, int y, int z){
        return world[x][y][z];
    }

    //Gets the highest non-AirTile
    public Tile getRelevantTile(int x, int y) {
        return topologicalMap[x][y];
    }

    // TODO add the necessary check to see if the tile is blocked/too high
    public boolean isBlocked(int x, int y, int z){
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

    public int getDepth() { return depth; }
}


