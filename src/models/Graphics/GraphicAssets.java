package models.Graphics;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.nio.Buffer;
import java.util.ArrayList;

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
    public static BufferedImage GrassTile2;
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

    public static BufferedImage petS;
    public static BufferedImage petSE;
    public static BufferedImage petSW;
    public static BufferedImage petN;
    public static BufferedImage petNE;
    public static BufferedImage petNW;
    public static ArrayList<BufferedImage> petAll;

    public static BufferedImage sneakS;
    public static BufferedImage sneakSE;
    public static BufferedImage sneakSW;
    public static BufferedImage sneakN;
    public static BufferedImage sneakNE;
    public static BufferedImage sneakNW;
    public static ArrayList<BufferedImage> sneakAll;

    public static BufferedImage smasherS;
    public static BufferedImage smasherSE;
    public static BufferedImage smasherSW;
    public static BufferedImage smasherN;
    public static BufferedImage smasherNE;
    public static BufferedImage smasherNW;
    public static ArrayList<BufferedImage> smasherAll;

    public static BufferedImage summonerS;
    public static BufferedImage summonerSE;
    public static BufferedImage summonerSW;
    public static BufferedImage summonerN;
    public static BufferedImage summonerNE;
    public static BufferedImage summonerNW;
    public static ArrayList<BufferedImage> summonerAll;

    public static BufferedImage col;
    public static BufferedImage base;


    //Vehicle
    public static BufferedImage laprasS;
    public static BufferedImage laprasSE;
    public static BufferedImage laprasSW;
    public static BufferedImage laprasN;
    public static BufferedImage laprasNE;
    public static BufferedImage laprasNW;
    public static ArrayList<BufferedImage> laprasAll;

    public static BufferedImage mountS;

    public static BufferedImage rock;


    public static BufferedImage smasher;
    public static BufferedImage sneak;
    public static BufferedImage summoner;

    public static BufferedImage smashPic;
    public static BufferedImage sneakPic;
    public static BufferedImage summonerPic;
    public static BufferedImage rightArrow;
    public static BufferedImage leftArrow;

    //AreaEffects
    public static BufferedImage levelUp;
    public static BufferedImage takeDamage;
    public static BufferedImage trap;
    public static BufferedImage teleport;
    public static BufferedImage healDamage;


    public static BufferedImage boots;

    public static BufferedImage redSword;
    public static BufferedImage blueSword;
    public static BufferedImage greenSword;

    public static BufferedImage bow;
    public static BufferedImage bow2;
    public static BufferedImage slingshot;

    public static void init(){

        tile = ImageLoader.loadImage("/Resources/tile.png");
        test1 = ImageLoader.loadImage("/Resources/GroundGrassTile.png");
        GroundGrassTile = ImageLoader.loadImage("/Resources/GroundGrassTile.png");
        GrassTile = ImageLoader.loadImage("/Resources/GrassTile.png");
        GrassTile2 = ImageLoader.loadImage("/Resources/GrassTile2.png");
        GroundMountainTile = ImageLoader.loadImage("/Resources/GroundMountainTile.png");
        RunningWaterTile = ImageLoader.loadImage("/Resources/RunningWaterTile.png");
        MountainTile = ImageLoader.loadImage("/Resources/MountainTile.png");
        StillWaterTile = ImageLoader.loadImage("/Resources/StillWaterTile.png");
//        RunningWaterTile = ImageLoader.loadImage("/Resources/StillWaterTile.png");
        RockTile = ImageLoader.loadImage("/Resources/RockTile.png");
        RunningWaterTile = ImageLoader.loadImage("/Resources/StillWaterTile.png");

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


        //tile stuff
        base = ImageLoader.loadImage("/Resources/tiles/base.png");
        col = ImageLoader.loadImage("/Resources/tiles/col.png");



        //states stuff
        startBackground = ImageLoader.loadImage("/Resources/back.jpg");
        creationBackground = ImageLoader.loadImage("/Resources/back2.jpg");
        smashPic = ImageLoader.loadImage("/Resources/Views/smasher.png");
        sneakPic = ImageLoader.loadImage("/Resources/Views/bow.png");
        summonerPic = ImageLoader.loadImage("/Resources/Views/staff.png");
        rightArrow = ImageLoader.loadImage("/Resources/Views/arrow1.png");
        leftArrow = ImageLoader.loadImage("/Resources/Views/arrow.png");

        //
        smasher = ImageLoader.loadImage("/Resources/entitys/entity-smasher-S.png");
        summoner = ImageLoader.loadImage("/Resources/entitys/entity-summoner-S.png");
        sneak = ImageLoader.loadImage("/Resources/entitys/entity-sneak-S.png");


        //AreaEffects
        levelUp = ImageLoader.loadImage("/Resources/areaEffects/gold-star.png");
        takeDamage = ImageLoader.loadImage("/Resources/areaEffects/skull-and-crossbones.png");
        trap = ImageLoader.loadImage("/Resources/areaEffects/trap-sample.png");
        teleport = ImageLoader.loadImage("/Resources/areaEffects/teleport-sample.png");
        healDamage = ImageLoader.loadImage("/Resources/areaEffects/red-cross.png");

        //items
        redSword = ImageLoader.loadImage("/Resources/items/RED_SWORD.png");
        blueSword = ImageLoader.loadImage("/Resources/items/BLUE_SWORD.png");
        greenSword = ImageLoader.loadImage("/Resources/items/GREEN_SWORD.png");

        boots = ImageLoader.loadImage("/Resources/items/BOOTS.png");
        rock = ImageLoader.loadImage("/Resources/items/ROCK.png");

        bow = ImageLoader.loadImage("/Resources/items/BOW.png");
        bow2 = ImageLoader.loadImage("/Resources/items/BOW2.png");
        slingshot = ImageLoader.loadImage("/Resources/items/SLINGSHOT.png");



        //redSword = ImageLoader.loadImage("Resources/RED_SWORD.png");
    //    blueSword = ImageLoader.loadImage("/Resources/BLUE_SWORD.png");
        //greenSword = ImageLoader.loadImage("Resources/GREEN_SWORD.png");


        // Loading in sneak
        sneakS = ImageLoader.loadImage("/Resources/entitys/entity-sneak-S.png");
        sneakSW = ImageLoader.loadImage("/Resources/entitys/entity-sneak-SW.png");
        sneakSE = ImageLoader.loadImage("/Resources/entitys/entity-sneak-SE.png");
        sneakN = ImageLoader.loadImage("/Resources/entitys/entity-sneak-N.png");
        sneakNE = ImageLoader.loadImage("/Resources/entitys/entity-sneak-NE.png");
        sneakNW = ImageLoader.loadImage("/Resources/entitys/entity-sneak-NW.png");
        sneakAll = new ArrayList<>();
        sneakAll.add(sneakS);
        sneakAll.add(sneakSE);
        sneakAll.add(sneakSW);
        sneakAll.add(sneakN);
        sneakAll.add(sneakNE);
        sneakAll.add(sneakNW);

        // Loading in summoner
        summonerS = ImageLoader.loadImage("/Resources/entitys/entity-summoner-S.png");
        summonerSW = ImageLoader.loadImage("/Resources/entitys/entity-summoner-SW.png");
        summonerSE = ImageLoader.loadImage("/Resources/entitys/entity-summoner-SE.png");
        summonerN = ImageLoader.loadImage("/Resources/entitys/entity-summoner-N.png");
        summonerNE = ImageLoader.loadImage("/Resources/entitys/entity-summoner-NE.png");
        summonerNW = ImageLoader.loadImage("/Resources/entitys/entity-summoner-NW.png");
        summonerAll = new ArrayList<>();
        summonerAll.add(summonerS);
        summonerAll.add(summonerSE);
        summonerAll.add(summonerSW);
        summonerAll.add(summonerN);
        summonerAll.add(summonerNE);
        summonerAll.add(summonerNW);

        // Loading in smasher
        smasherS = ImageLoader.loadImage("/Resources/entitys/entity-smasher-S.png");
        smasherSW = ImageLoader.loadImage("/Resources/entitys/entity-smasher-SW.png");
        smasherSE = ImageLoader.loadImage("/Resources/entitys/entity-smasher-SE.png");
        smasherN = ImageLoader.loadImage("/Resources/entitys/entity-smasher-N.png");
        smasherNE = ImageLoader.loadImage("/Resources/entitys/entity-smasher-NE.png");
        smasherNW = ImageLoader.loadImage("/Resources/entitys/entity-smasher-NW.png");
        smasherAll = new ArrayList<>();
        smasherAll.add(smasherS);
        smasherAll.add(smasherSE);
        smasherAll.add(smasherSW);
        smasherAll.add(smasherN);
        smasherAll.add(smasherNE);
        smasherAll.add(smasherNW);

        // Loading in pet
        petS = ImageLoader.loadImage("/Resources/entitys/pet-samples/raichu/S.png");
        petSW = ImageLoader.loadImage("/Resources/entitys/pet-samples/raichu/SW.png");
        petSE = ImageLoader.loadImage("/Resources/entitys/pet-samples/raichu/SE.png");
        petN = ImageLoader.loadImage("/Resources/entitys/pet-samples/raichu/N.png");
        petNE = ImageLoader.loadImage("/Resources/entitys/pet-samples/raichu/NE.png");
        petNW = ImageLoader.loadImage("/Resources/entitys/pet-samples/raichu/NW.png");
        petAll = new ArrayList<>();
        petAll.add(petS);
        petAll.add(petSE);
        petAll.add(petSW);
        petAll.add(petN);
        petAll.add(petNE);
        petAll.add(petNW);


        // loading in vehicle
        // Loading in summoner
        laprasS = ImageLoader.loadImage("/Resources/entitys/entity-lapras-S.png");
        laprasSW = ImageLoader.loadImage("/Resources/entitys/entity-lapras-SW.png");
        laprasSE = ImageLoader.loadImage("/Resources/entitys/entity-lapras-SE.png");
        laprasN = ImageLoader.loadImage("/Resources/entitys/entity-lapras-N.png");
        laprasNE = ImageLoader.loadImage("/Resources/entitys/entity-lapras-NE.png");
        laprasNW = ImageLoader.loadImage("/Resources/entitys/entity-lapras-NW.png");
        laprasAll = new ArrayList<>();
        laprasAll.add(laprasS);
        laprasAll.add(laprasSE);
        laprasAll.add(laprasSW);
        laprasAll.add(laprasN);
        laprasAll.add(laprasNE);
        laprasAll.add(laprasNW);

        mountS = ImageLoader.loadImage("/Resources/entitys/mountS.png");
    }
}
