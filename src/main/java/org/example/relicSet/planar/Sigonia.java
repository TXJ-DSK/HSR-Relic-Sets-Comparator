package org.example.relicSet.planar;

import org.example.util.Buff;
import org.example.util.BuffType;

public class Sigonia extends PlanarOrnamentSet{
    // Sigonia, the Unclaimed Desolation
    // 无主荒星茨冈尼亚
    public Sigonia(int numPieces, int stacks, boolean isBuffActivated) {
        super(numPieces, stacks, false);
        if (stacks < 0 || stacks > 10){
            throw new IllegalArgumentException("stacks for Sigonia set must between 0 and 10");
        }
        if (numPieces < 2){
            return;
        }
        super.addSelfBuff(new Buff(BuffType.CRIT_RATE, 4.0, "Relic-Sigonia-2"));
        if (stacks > 0){
            super.addSelfBuff(new Buff(BuffType.CRIT_DMG, 4.0 * stacks, "Relic-Sigonia-2"));
        }
    }

    public Sigonia(int numPieces, int stacks) {
        this(numPieces, stacks, false);
    }
}
