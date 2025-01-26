package org.example.relicSet.cavern;

import org.example.util.Buff;
import org.example.util.BuffType;

public class Genius extends CavernRelicSet{
    // Genius of Brilliant Stars
    // 繁星璀璨的天才，旧量子套
    public Genius(int numPieces, int stacks, boolean hasMatchingEle) {
        super(numPieces, stacks, hasMatchingEle);
        if (stacks < 1 || stacks > 2){
            throw new IllegalArgumentException("stacks for Genius set must be 1 or 2");
        }
        if (numPieces >= 2 && hasMatchingEle){
            super.addSelfBuff(new Buff(BuffType.DMG_BOOST_ELEM, 10.0, "Relic-Genius-2"));
        }
        if (numPieces == 4){
            super.addSelfBuff(new Buff(BuffType.DEF_IGNORE, 10.0 * stacks, "Relic-Genius-4-stacks-"+stacks));
        }
    }
}
