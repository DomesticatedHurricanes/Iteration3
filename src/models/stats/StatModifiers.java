package models.stats;

import java.util.ArrayList;

/**
 * Created by ben on 4/11/16.
 */
public class StatModifiers {
    private ArrayList<StatModifier> statModifiers = new ArrayList<>();

    //Create a list of StatModifiers
    public StatModifiers(StatModifier... statModifiers){
        for (StatModifier statModifier : statModifiers) {
            this.statModifiers.add(statModifier);
        }
    }

    //Apply a list of StatModifiers
    public void apply(Stats stats){
        for(StatModifier statModifier: this.statModifiers){
            statModifier.apply(stats);
        }
    }

    //Remove a list of StatModifiers
    public void remove(Stats stats){
        for(StatModifier statModifier: this.statModifiers){
            statModifier.remove(stats);
        }
    }

}
