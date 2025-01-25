package org.example.character;

import org.example.util.Buff;
import org.example.util.BuffType;
import org.example.util.ConvertBuff;

public class Sparkle extends Character{
    public Sparkle() {
        this(0);
    }

    public Sparkle(Integer eidolon) {
        super(1397.1, 523.91, 485.1, 101.0, eidolon);
        // Trace
        super.addSelfBuff(new Buff(BuffType.CRIT_DMG, 24.0, "Trace-minor"));
        // Nocturne 夜想曲
        super.addTeamBuff(new Buff(BuffType.ATK_RATIO, 15.0, "Sparkle-Trace-major"));
        super.addTeamBuff(new Buff(BuffType.DMG_BOOST_ALL, 18.0, "Sparkle-Talent"));
        super.addTeamBuff(new Buff(BuffType.DMG_BOOST_ALL, 30.0, "Sparkle-Ult"));
        if (eidolon >= 3) {
            super.addInBattleConvertTeamBuff(new ConvertBuff(ConvertBuff.Type.CRIT_DMG
                    , 26.4, 48.6, "Sparkle-Skill-E3"));
        } else {
            super.addInBattleConvertTeamBuff(new ConvertBuff(ConvertBuff.Type.CRIT_DMG
                    , 24.0, 45.0, "Sparkle-Skill"));
        }
        AddEidolonBuffs(eidolon);
    }
    private void AddEidolonBuffs(Integer eidolon){
        if (eidolon >= 1) {
            super.addTeamBuff(new Buff(BuffType.ATK_RATIO, 40.0, "Sparkle-E1"));
        }
        if (eidolon >= 2) {
            super.addTeamBuff(new Buff(BuffType.DEF_IGNORE, 24.0, "Sparkle-E2"));
        }
        // TODO
    }
}
