package org.example.relicSet.cavern;

import org.example.util.Buff;
import org.example.util.BuffType;

public class Messenger extends CavernRelicSet{
    // Messenger Traversing Hackerspace
    // 骇域漫游的信使，信使套
    public Messenger(int numPieces, int stacks, boolean hasMatchingEle) {
        super(numPieces, 0, false);
        if (numPieces >= 2){
            super.addSelfBuff(new Buff(BuffType.SPD_RATIO, 6.0, "Relic-Messenger-2"));
        }
        if (numPieces == 4 && stacks >= 1){
            super.addTeamBuff(new Buff(BuffType.SPD_RATIO, 12.0, "Relic-Messenger-4"));
        }
    }

    public Messenger(int numPieces, int stacks) {
        this(numPieces, 0, false);
    }

    public Messenger(int numPieces) {
        this(numPieces, 0, false);
    }
}
