package org.example.relicSet.planar;

import org.example.util.Buff;
import org.example.util.BuffType;

public class Lushaka extends PlanarOrnamentSet{
    // Lushaka, the Sunken Seas
    // 沉陆海域露莎卡，沉陆套
    public Lushaka(int numPieces, int stacks, boolean isBuffActivated) {
        super(numPieces, 0, isBuffActivated);
        if (numPieces < 2){
            return;
        }
        // TODO: Energy regen buff
        if (isBuffActivated) {
            super.addTeamBuff(new Buff(BuffType.ATK_RATIO, 12.0, "Relic-Lushaka-2"));
        }
    }

    public Lushaka(int numPieces, boolean isBuffActivated) {
        this(numPieces, 0, isBuffActivated);
    }
}
