package models.stats;

/**
 * Created by ben on 4/11/16.
 */
//Description:Interface used to modify any stat.  The actual modification will be done here on specification lv
public interface Modifier {
    void apply(int delta);
}
