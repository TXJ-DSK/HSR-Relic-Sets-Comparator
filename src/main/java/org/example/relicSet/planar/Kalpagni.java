package org.example.relicSet.planar;

import org.example.util.Buff;
import org.example.util.BuffType;

public class Kalpagni extends PlanarOrnamentSet{
    // Forge of the Kalpagni Lantern
    // 劫火莲灯铸炼宫，劫火套
    public Kalpagni(int numPieces, int stacks, boolean isBuffActivated) {
        super(numPieces, 0, isBuffActivated);
        if (numPieces < 2){
            return;
        }
        super.addSelfBuff(new Buff(BuffType.SPD_RATIO, 6.0, "Relic-Kalpagni-2"));
        if (isBuffActivated) {
            // TODO: Implement break effect buff
        }
    }

    public Kalpagni(int numPieces, boolean isBuffActivated) {
        this(numPieces, 0, isBuffActivated);
    }
}
