package org.example.relicSet.cavern;

import org.example.util.Buff;
import org.example.util.BuffType;

public class Sacerdos extends CavernRelicSet{
    // Sacerdos' Relived Ordeal
    // 重循苦旅的司铎，司铎套
    public Sacerdos(int numPieces, int stacks, boolean hasMatchingEle) {
        super(numPieces, stacks, false);
        if (stacks < 0 || stacks > 2){
            throw new IllegalArgumentException("stacks for Sacerdos set must be 0, 1, or 2");
        }
        if (numPieces >= 2){
            super.addSelfBuff(new Buff(BuffType.SPD_RATIO, 6.0, "Relic-Sacerdos-2"));
        }
        if (numPieces == 4 && stacks >= 1){
            super.addTeamBuff(new Buff(BuffType.CRIT_DMG, 18.0 * stacks, "Relic-Sacerdos-4"));
        }
    }

    public Sacerdos(int numPieces, int stacks) {
        this(numPieces, stacks, false);
    }
}
