package models.stats;

/**
 * Created by ben on 4/11/16.
 */
//Description: This class is used in npc and avatar
public class CharacterStats extends LivingStats {
    //Stats of Character Entities
    private int agility;
    private int intellect;
    private int experience;
    private int level;
    private int mana;
    private int armorRating;

    //Getters and modifiers for the Stats
    public int getAgility() {
        return agility;
    }

    public void modifyAgility(int agility) {
        this.agility += agility;
    }

    public int getIntellect() {
        return intellect;
    }

    public void modifyIntellect(int intellect) {
        this.intellect += intellect;
    }

    public int getExperience() {
        return experience;
    }

    public void modifyExperience(int experience) {
        this.experience += experience;
    }

    public int getLevel() {
        return level;
    }

    public void modifyLevel(int level) {
        this.level += level;
    }

    public int getMana() {
        return mana;
    }

    public void modifyMana(int mana) {
        this.mana += mana;
    }

    public int getArmorRating() {
        return armorRating;
    }

    public void modifyArmorRating(int armorRating) {
        this.armorRating += armorRating;
    }
}
