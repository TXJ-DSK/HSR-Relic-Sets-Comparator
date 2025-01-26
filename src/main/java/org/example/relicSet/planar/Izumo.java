package org.example.relicSet.planar;

import org.example.util.Buff;
import org.example.util.BuffType;

public class Izumo extends PlanarOrnamentSet{
    // Izumo Gensei and Takama Divine Realm
    // 出云显世与高天神国，出云套
    public Izumo(int numPieces, int stacks, boolean isBuffActivated) {
        super(numPieces, 0, isBuffActivated);
        if (numPieces < 2){
            return;
        }
        super.addSelfBuff(new Buff(BuffType.ATK_RATIO, 12.0, "Relic-Izumo-2"));
        if (isBuffActivated) {
            super.addSelfBuff(new Buff(BuffType.CRIT_RATE, 12.0, "Relic-Izumo-2"));
        }
    }

    public Izumo(int numPieces, boolean isBuffActivated) {
        this(numPieces, 0, isBuffActivated);
    }
}
