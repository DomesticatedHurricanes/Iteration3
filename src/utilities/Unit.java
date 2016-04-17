package utilities;

/**
 * Created by ben on 4/17/16.
 */
public final class Unit {//Essentially a decorator pattern implementation
    public static int SECOND = 1000;
    public static int LOWCOOLDOWN = 1000;
    public static int MIDCOOLDOWN = 2000;
    public static int HIGHCOOLDOWN = 3000;

    public static int CANNOTMOVE = 0;

    //In a sense the Stat Modifiers in items will multiply the respective constants
    //Examples
    //For a BlueHelmet Item it will be BLUE*HELMET
    //even though some constants are 1 include them anyways for ROO purposes
    //Another example is
    //Blue One Handed Sword
    //For the stat modifer do ONEHANDEDWEAPON*BLUE*SWORD as the stat modifier

    //Rules for items:Whatever description it has include it as a constant
    public static int ONEHANDEDWEAPON = 1;
    public static int TWOHANDEDWEAPON = 2;

    public static int SWORD = 5;
    public static int RANGEDWEAPON = 10;
    public static int STAFF = 10;

    public static int SLACKS = 5;
    public static int BOOTS = 5;
    public static int GLOVES = 5;
    public static int HELMET = 5;
    public static int CHESTPLATE = 5;

    public static int BLUE = 1;
    public static int GREEN = 2;
    public static int RED = 3;


}
