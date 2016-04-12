package models.stats;



/**
 * Created by ben on 4/11/16.
 */
public class StatModifier{

    //Static Modifiers
    private static Modifier modifyMovement = new Modifier() {
        @Override
        public void apply(Stats stats, int delta) {
            stats.modifyMovement(delta);
        }
    };

    private static Modifier modifyHp = new Modifier() {
        @Override
        public void apply(Stats stats, int delta) {
            LivingStats ls = (LivingStats)stats;
            ls.modifyHp(delta);
        }
    };

    private static Modifier modifyStrength = new Modifier() {
        @Override
        public void apply(Stats stats, int delta) {
            LivingStats ls = (LivingStats)stats;
            ls.modifyStrength(delta);
        }
    };;

    private static Modifier modifyHardiness = new Modifier() {
        @Override
        public void apply(Stats stats, int delta) {
            LivingStats ls = (LivingStats)stats;
            ls.modifyHardiness(delta);
        }
    };;

    private static Modifier modifyLives = new Modifier() {
        @Override
        public void apply(Stats stats, int delta) {
            LivingStats ls = (LivingStats)stats;
            ls.modifyLives(delta);
        }
    };;

    private static Modifier modifyOffensiveRating = new Modifier() {
        @Override
        public void apply(Stats stats, int delta) {
            LivingStats ls = (LivingStats)stats;
            ls.modifyOffensiveRating(delta);
        }
    };;

    private static Modifier modifyDefensiveRating = new Modifier() {
        @Override
        public void apply(Stats stats, int delta) {
            LivingStats ls = (LivingStats)stats;
            ls.modifyDefensiveRating(delta);
        }
    };;

    private static Modifier modifyAgility = new Modifier() {
        @Override
        public void apply(Stats stats, int delta) {
            CharacterStats cs = (CharacterStats) stats;
            cs.modifyAgility(delta);
        }
    };;

    private static Modifier modifyIntellect = new Modifier() {
        @Override
        public void apply(Stats stats, int delta) {
            CharacterStats cs = (CharacterStats) stats;
            cs.modifyIntellect(delta);
        }
    };;

    private static Modifier modifyExperience = new Modifier() {
        @Override
        public void apply(Stats stats, int delta) {
            CharacterStats cs = (CharacterStats)stats;
            cs.modifyExperience(delta);
        }
    };;

    private static Modifier modifyLevel = new Modifier() {
        @Override
        public void apply(Stats stats, int delta) {
            CharacterStats cs = (CharacterStats) stats;
            cs.modifyLevel(delta);
        }
    };;

    private static Modifier modifyMana = new Modifier() {
        @Override
        public void apply(Stats stats, int delta) {
            CharacterStats cs = (CharacterStats) stats;
            cs.modifyMana(delta);
        }
    };;

    private static Modifier modifyArmorRating = new Modifier() {
        @Override
        public void apply(Stats stats, int delta) {
            CharacterStats cs = (CharacterStats) stats;
            cs.modifyArmorRating(delta);
        }
    };;

    private int myDelta;
    private Modifier myModifier;

    private StatModifier(int delta, Modifier modifier){
        myDelta = delta;
        myModifier = modifier;
    }

    //All of these methods return a StatModifier of a specific type.
    public static StatModifier makeMovementModifier(int delta){
        return new StatModifier(delta, modifyMovement );
    }

    public static StatModifier makeHpModifier(int delta){
        return new StatModifier(delta, modifyHp);
    }

    public static StatModifier makeStrengthModifier(int delta){
        return new StatModifier(delta, modifyStrength );
    }

    public static StatModifier makeHardinessModifier(int delta){
        return new StatModifier(delta, modifyHardiness );
    }

    public static StatModifier makeLivesModifier(int delta){
        return new StatModifier(delta, modifyLives );
    }

    public static StatModifier makeOffensiveRatingModifier(int delta){return new StatModifier(delta, modifyOffensiveRating );}

    public static StatModifier makeDefensiveModifier(int delta){return new StatModifier(delta, modifyDefensiveRating );}

    public static StatModifier makeAgilityModifier(int delta){
        return new StatModifier(delta, modifyAgility );
    }

    public static StatModifier makeIntellectModifier(int delta){
        return new StatModifier(delta, modifyIntellect );
    }

    public static StatModifier makeExperienceModifier(int delta){
        return new StatModifier(delta, modifyExperience );
    }

    public static StatModifier makeLevelModifier(int delta){
        return new StatModifier(delta, modifyLevel );
    }

    public static StatModifier makeManaModifier(int delta){
        return new StatModifier(delta, modifyMana );
    }

    public static StatModifier makeArmorRatingModifier(int delta){return new StatModifier(delta, modifyArmorRating );}


    //How to apply the modifier to an Entities Stats
    public void apply(Stats stats){
        myModifier.apply(stats, myDelta);
    }

    //How to undo a stat modifier
    public void remove(Stats stats){
        myModifier.apply(stats, -myDelta);
    }

}
