package org.example.relicSet.planar;

import org.example.util.Buff;
import org.example.util.BuffType;

public class Salsotto extends PlanarOrnamentSet{
    // Inert Salsotto
    // 停转的萨尔索图，停转套
    public Salsotto(int numPieces, int stacks, boolean isBuffActivated) {
        super(numPieces, 0, isBuffActivated);
        if (numPieces < 2){
            return;
        }
        super.addSelfBuff(new Buff(BuffType.CRIT_RATE, 8.0, "Relic-Salsotto-2"));
        if (isBuffActivated) {
            super.addSelfBuff(new Buff(BuffType.DMG_BOOST_ALL, 15.0, "Relic-Salsotto-2-Ult&FUA"));
        }
    }
}
