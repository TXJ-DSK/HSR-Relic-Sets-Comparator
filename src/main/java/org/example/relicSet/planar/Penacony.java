package org.example.relicSet.planar;

import org.example.util.Buff;
import org.example.util.BuffType;

public class Penacony extends PlanarOrnamentSet{
    // Penacony, Land of the Dreams
    // 梦想之地匹诺康尼
    public Penacony(int numPieces, int stacks, boolean isBuffActivated) {
        super(numPieces, 0, isBuffActivated);
        if (numPieces < 2){
            return;
        }
        // TODO: Energy regen buff
        if (isBuffActivated) {
            super.addTeamBuff(new Buff(BuffType.DMG_BOOST_ALL, 10.0, "Relic-Penacony-2"));
        }
    }

    public Penacony(int numPieces, boolean isBuffActivated) {
        this(numPieces, 0, isBuffActivated);
    }
}
