package org.example.lightCone;

import org.example.util.Buff;
import org.example.util.BuffType;

public class ButTheBattleIsntOver extends LightCone{
    // Bronya LC
    // 但战斗还未结束，鸭专
    public ButTheBattleIsntOver() {
        this(1);
    }

    public ButTheBattleIsntOver(Integer rank) {
        super(1164.2, 529.2, 463.05, rank);
        double value = 30.0 + 5.0 * (rank - 1);
        super.addTeamBuff(new Buff(BuffType.DMG_BOOST_ALL, value, "LC-BronyaLC-R"+rank));
    }
}
