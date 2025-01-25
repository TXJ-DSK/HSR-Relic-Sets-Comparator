package org.example.character;

import org.example.util.Buff;
import org.example.util.BuffType;

public class Acheron extends Character {
    public Acheron() {
        this(0);
    }

    public Acheron(Integer eidolon){
        super(1125.4, 698.54, 436.59, 101.0, eidolon);
        // Trace
        super.addSelfBuff(new Buff(BuffType.ATK_RATIO, 28.0, "Trace-minor"));
        super.addSelfBuff(new Buff(BuffType.CRIT_DMG, 24.0, "Trace-minor"));
        super.addSelfBuff(new Buff(BuffType.DMG_BOOST_ELEM, 8.0, "Trace-minor"));
        // Thunder Core 雷心 大行迹
        super.addSelfBuff(new Buff(BuffType.DMG_BOOST_ALL, 90.0, "Trace-major"));

        // Talent
        super.addSelfBuff(new Buff(BuffType.RES_REDUCTION, 20.0, "Talent"));
        AddEidolonBuffs(eidolon);
    }

    private void AddEidolonBuffs(Integer eidolon){
        if (eidolon >= 1){
            super.addSelfBuff(new Buff(BuffType.CRIT_RATE, 18.0, "E1"));
        }
        if (eidolon >= 2){}
        if (eidolon >= 3){}
        if (eidolon >= 4){
            super.addTeamBuff(new Buff(BuffType.VULN_ALL, 8.0, "Acheron-E4-ult"));
        }
        if (eidolon >= 5){
            super.removeSelfBuff(new Buff(BuffType.RES_REDUCTION, 20.0, "Talent"));
            super.addSelfBuff(new Buff(BuffType.RES_REDUCTION, 22.0, "Talent"));
        }
        if (eidolon >= 6){
            super.addSelfBuff(new Buff(BuffType.RES_PEN, 20.0, "E6"));
        }
    }
}
