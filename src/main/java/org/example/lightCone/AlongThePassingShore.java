package org.example.lightCone;

import org.example.util.Buff;
import org.example.util.BuffType;

public class AlongThePassingShore extends LightCone{
    // 行于流逝的岸，黄泉专武
    public AlongThePassingShore() {
        this(1);
    }

    public AlongThePassingShore(Integer rank) {
        super(1058.4, 635.04, 396.9, rank);
        double crit_dmg = 36.0 + 6.0 * (rank - 1);
        double dmg_boost = 24.0 + 4.0 * (rank - 1);
        double ult_dmg_boost = 24.0 + 4.0 * (rank - 1);
        super.addSelfBuff(new Buff(BuffType.CRIT_DMG, crit_dmg, "LC"));
        super.addSelfBuff(new Buff(BuffType.DMG_BOOST_ALL, dmg_boost, "LC"));
        super.addSelfBuff(new Buff(BuffType.DMG_BOOST_ALL, ult_dmg_boost, "LC-ult"));
    }
}
