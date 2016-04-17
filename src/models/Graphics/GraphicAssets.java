package models.Graphics;

import java.awt.image.BufferedImage;

/**
 * Created by Michael on 3/30/16.
 */
public class GraphicAssets {
    public static final int VIEW_WIDTH = 800;
    public static final int VIEW_HEIGHT = 600;
    public static final int TILE_PX_WIDTH = 60;
    public static final int TILE_PX_HEIGHT = 39;

    public static BufferedImage tile;
    public static BufferedImage test1;
    public static BufferedImage GroundGrassTile;
    public static BufferedImage GrassTile;
    public static BufferedImage GroundMountainTile;
    public static BufferedImage MountainTile;
    public static BufferedImage RunningWaterTile;
    public static BufferedImage StillWaterTile;
    public static BufferedImage RockTile;
    public static BufferedImage h1;
    public static BufferedImage h2;
    public static BufferedImage h3;
    public static BufferedImage h4;
    public static BufferedImage h5;
    public static BufferedImage h6;
    public static BufferedImage h7;
    public static BufferedImage h8;
    public static BufferedImage h9;
    public static BufferedImage h10;
    public static BufferedImage startBackground;
    public static BufferedImage startBackground2;
    public static BufferedImage creationBackground;


    public static BufferedImage smasher;
    public static BufferedImage sneak;
    public static BufferedImage summoner;

    public static BufferedImage smashPic;
    public static BufferedImage sneakPic;
    public static BufferedImage summonerPic;
    public static BufferedImage rightArrow;
    public static BufferedImage leftArrow;
    public static void init(){

        tile = ImageLoader.loadImage("/Resources/tile.png");
        test1 = ImageLoader.loadImage("/Resources/GroundGrassTile.png");
        GroundGrassTile = ImageLoader.loadImage("/Resources/GroundGrassTile.png");
        GrassTile = ImageLoader.loadImage("/Resources/GrassTile.png");
        GroundMountainTile = ImageLoader.loadImage("/Resources/GroundMountainTile.png");
        GroundMountainTile = ImageLoader.loadImage("/Resources/GroundMountainTile.png");
        MountainTile = ImageLoader.loadImage("/Resources/MountainTile.png");
        StillWaterTile = ImageLoader.loadImage("/Resources/StillWaterTile.png");
        RockTile = ImageLoader.loadImage("/Resources/RockTile.png");

        // Loading in different tile heights
        h1 = ImageLoader.loadImage("/Resources/1.png");
        h2 = ImageLoader.loadImage("/Resources/2.png");
        h3 = ImageLoader.loadImage("/Resources/3.png");
        h4 = ImageLoader.loadImage("/Resources/4.png");
        h5 = ImageLoader.loadImage("/Resources/5.png");
        h6 = ImageLoader.loadImage("/Resources/6.png");
        h7 = ImageLoader.loadImage("/Resources/7.png");
        h8 = ImageLoader.loadImage("/Resources/8.png");
        h9 = ImageLoader.loadImage("/Resources/9.png");
        h10 = ImageLoader.loadImage("/Resources/10.png");



        //states stuff
        startBackground = ImageLoader.loadImage("/Resources/back.jpg");
        creationBackground = ImageLoader.loadImage("/Resources/back2.jpg");
        smashPic = ImageLoader.loadImage("/Resources/Views/smasher.png");
        sneakPic = ImageLoader.loadImage("/Resources/Views/bow.png");
        summonerPic = ImageLoader.loadImage("/Resources/Views/staff.jpg");
        rightArrow = ImageLoader.loadImage("/Resources/Views/arrow1.png");
        leftArrow = ImageLoader.loadImage("/Resources/Views/arrow.png");

        //
        smasher = ImageLoader.loadImage("/Resources/entitys/entity-smasher-S.png");
        summoner = ImageLoader.loadImage("/Resources/entitys/entity-summoner-S.png");
        sneak = ImageLoader.loadImage("/Resources/entitys/entity-sneak-S.png");


    }
}
