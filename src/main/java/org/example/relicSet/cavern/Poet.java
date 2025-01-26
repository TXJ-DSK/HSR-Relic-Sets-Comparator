package org.example.relicSet.cavern;

import org.example.util.Buff;
import org.example.util.BuffType;

public class Poet extends CavernRelicSet{
    // Poet of Mourning Collapse
    // 哀歌覆国的诗人，诗人套
    public Poet(int numPieces, int stacks, boolean hasMatchingEle){
        super(numPieces, stacks, hasMatchingEle);
        // 0 stacks: Before entering battle speed >= 110
        // 1 stacks: 110 > speed > 95
        // 2 stacks: 95 > speed
        if (stacks < 0 || stacks > 2){
            throw new IllegalArgumentException("stacks for Poet set must be 0, 1, or 2");
        }
        if (numPieces >= 2 && hasMatchingEle){
            super.addSelfBuff(new Buff(BuffType.DMG_BOOST_ELEM, 10.0, "Relic-Poet-2"));
        }
        if (numPieces == 4){
            super.addSelfBuff(new Buff(BuffType.SPD_RATIO, -8.0, "Relic-Poet-2"));
            if (stacks == 1){
                super.addSelfBuff(new Buff(BuffType.CRIT_RATE, 20.0, "Relic-Poet-4-stacks-"+stacks));
            }else if (stacks == 2){
                super.addSelfBuff(new Buff(BuffType.CRIT_RATE, 32.0, "Relic-Poet-4-stacks-"+stacks));
            }
        }
    }
}
