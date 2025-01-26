package org.example.relicSet.planar;

import org.example.util.Buff;
import org.example.util.BuffType;

public class Keel extends PlanarOrnamentSet{
    // Broken Keel
    // 折断的龙骨，龙骨套
    public Keel(int numPieces, int stacks, boolean isBuffActivated) {
        super(numPieces, 0, isBuffActivated);
        if (numPieces < 2){
            return;
        }
        // TODO: Effect Res buff
        if (isBuffActivated) {
            super.addTeamBuff(new Buff(BuffType.CRIT_DMG, 10.0, "Relic-Keel-2"));
        }
    }

    public Keel(int numPieces, boolean isBuffActivated) {
        this(numPieces, 0, isBuffActivated);
    }
}
