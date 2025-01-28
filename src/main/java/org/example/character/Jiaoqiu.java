package org.example.character;

import org.example.util.Buff;
import org.example.util.BuffType;

public class Jiaoqiu extends Character{
    public Jiaoqiu(){
        this(0);
    }

    public Jiaoqiu(Integer eidolon){
        super(1358.3, 601.52, 509.36, 98.0, eidolon);
        super.addSelfBuff(new Buff(BuffType.SPD_FLAT, 5.0, "Trace-minor"));
        super.addSelfBuff(new Buff(BuffType.DMG_BOOST_ELEM, 14.4, "Trace-minor"));

        super.addTeamBuff(new Buff(BuffType.VULN_ALL, 35.0, "Jiaoqiu-Talent"));
        super.addTeamBuff(new Buff(BuffType.VULN_ALL, 15.0, "Jiaoqiu-Ult-ultOnly"));
        if (eidolon >= 1){
            super.addTeamBuff(new Buff(BuffType.DMG_BOOST_ALL, 40.0, "Jiaoqiu-E1"));
        }
        // Todo: E2-6
    }
}
