package org.example.relicSet.planar;

import org.example.util.Buff;
import org.example.util.BuffType;

public class Vonwacq extends PlanarOrnamentSet{
    // Sprightly Vonwacq
    // 生命的翁瓦克
    public Vonwacq(int numPieces, int stacks, boolean isBuffActivated) {
        super(numPieces, 0, isBuffActivated);
        if (numPieces < 2){
            return;
        }
        // TODO: Energy regen buff
        if (isBuffActivated) {
            // Advanced Forward by 40%
        }
    }

    public Vonwacq(int numPieces, boolean isBuffActivated) {
        this(numPieces, 0, isBuffActivated);
    }
}
