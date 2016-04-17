package models.stats.statusEffect;

/**
 * Created by ben on 4/17/16.
 */
public interface statusEffect {
    void apply();
    void unapply();
    void reset();
    void effect();
}
