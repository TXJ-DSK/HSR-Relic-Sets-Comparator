package org.example.lightCone;

import org.example.util.Buff;
import org.example.util.BuffType;

public class ResolutionShinesAsPearlsOfSweat extends LightCone{
    // 决心如汗珠般闪耀
    public ResolutionShinesAsPearlsOfSweat() {
        this(1);
    }

    public ResolutionShinesAsPearlsOfSweat(Integer rank) {
        super(952.6, 476.28, 330.75, rank);
        double value = 12.0 + 1.0 * (rank - 1);
        super.addTeamBuff(new Buff(BuffType.DEF_REDUCTION, value, "LC-Resolution-R"+rank));
    }
}
