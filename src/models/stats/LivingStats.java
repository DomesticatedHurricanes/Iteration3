package models.stats;

/**
 * Created by ben on 4/11/16.
 */
//Description:This class is used in pet,npc,avatar
public class LivingStats extends Stats{
    //Stats that all Living Entities have
    protected int hp;
    protected int strength;
    protected int hardiness;
    protected int lives;
    protected int offensiveRating;
    protected int defensiveRating;


    //Getters and modifiers for the stats
    public int getHp() {
        return hp;
    }

    public void modifyHp(int hp) {
        this.hp += hp;
    }

    public int getStrength() {
        return strength;
    }

    public void modifyStrength(int strength) {
        this.strength += strength;
    }

    public int getHardiness() {
        return hardiness;
    }

    public void modifyHardiness(int hardiness) {
        this.hardiness += hardiness;
    }

    public int getLives() {
        return lives;
    }

    public void modifyLives(int lives) {
        this.lives += lives;
    }

    public int getOffensiveRating() {
        return offensiveRating;
    }

    public void modifyOffensiveRating(int offensiveRating) {
        this.offensiveRating += offensiveRating;
    }

    public int getDefensiveRating() {
        return defensiveRating;
    }

    public void modifyDefensiveRating(int defensiveRating) {
        this.defensiveRating += defensiveRating;
    }
}