package org.example.character;

import org.example.util.Buff;
import org.example.util.BuffType;

public class Fuxuan extends Character {
    public Fuxuan() {
        this(0);
    }
    public Fuxuan(Integer eidolon) {
        super(1474.7, 465.7, 606.38, 100.0, eidolon);
        super.addSelfBuff(new Buff(BuffType.CRIT_RATE, 18.7, "Trace-minor"));
        super.addSelfBuff(new Buff(BuffType.HP_RATIO, 18.0, "Trace-minor"));

        super.addTeamBuff(new Buff(BuffType.CRIT_RATE, 12.0, "Fuxuan-Skill"));
        if (eidolon >= 1) {
            super.addTeamBuff(new Buff(BuffType.CRIT_DMG, 30.0, "Fuxuan-E1"));
        }
    }
}
