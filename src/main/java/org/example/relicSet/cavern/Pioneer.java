package org.example.relicSet.cavern;

import org.example.util.Buff;
import org.example.util.BuffType;

public class Pioneer extends CavernRelicSet{
    // Pioneer Diver of Dead Waters
    // 死水深潜的先驱，死水套
    public Pioneer(int numPieces, int stacks, boolean hasMatchingEle){
        super(numPieces, stacks, false);
        // Stack = 1 means enemies with at least 2 debuffs
        // Stack = 2 means enemies with at least 3 debuffs
        if (stacks < 0){
            throw new IllegalArgumentException("Why are stacks less than zero? Change your set!");
        }
        if (numPieces >= 2){
            addSelfBuff(new Buff(BuffType.DMG_BOOST_ALL, 12.0, "Relic-Pioneer-2"));
        }
        if (numPieces == 4){
            // Assume the wearer can inflict a DEBUFF
            addSelfBuff(new Buff(BuffType.CRIT_RATE, 8.0, "Relic-Pioneer-4"));
            if (stacks == 1){
                addSelfBuff(new Buff(BuffType.CRIT_DMG, 16.0, "Relic-Pioneer-4"));
            }else if (stacks >= 2){
                addSelfBuff(new Buff(BuffType.CRIT_DMG, 24.0, "Relic-Pioneer-4"));
            }
        }
    }

    public Pioneer(int numPieces, int stacks){
        this(numPieces, stacks, false);
    }
}
