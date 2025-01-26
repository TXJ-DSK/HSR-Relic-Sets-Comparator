package org.example.relicSet.planar;

import org.example.util.Buff;
import org.example.util.BuffType;

public class Station extends PlanarOrnamentSet{
    // Space Sealing Station
    // 太空封印站，空间站套
    public Station(int numPieces, int stacks, boolean isBuffActivated) {
        super(numPieces, 0, isBuffActivated);
        if (numPieces < 2){
            return;
        }
        super.addSelfBuff(new Buff(BuffType.ATK_RATIO, 12.0, "Relic-Station-2"));
        if (isBuffActivated) {
            super.addSelfBuff(new Buff(BuffType.ATK_RATIO, 12.0, "Relic-Station-2"));
        }
    }

    public Station(int numPieces, boolean isBuffActivated) {
        this(numPieces, 0, isBuffActivated);
    }
}
