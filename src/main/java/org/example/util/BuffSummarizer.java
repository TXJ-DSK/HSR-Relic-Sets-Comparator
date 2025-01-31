package org.example.util;

import java.util.ArrayList;

public class BuffSummarizer {
    double ATK_FLAT,ATK_RATIO;
    double HP_FLAT,HP_RATIO;
    double CRIT_RATE,CRIT_DMG;
    double DMG_BOOST;
    double DEF_RED;
    double RES_RED;
    double VULN;
    double TRUE_DMG;
    double OTHERS_RATIO;

    public BuffSummarizer(ArrayList<Buff> buffs) {
        for (Buff buff : buffs) {
            switch (buff.getType()) {
                case ATK_FLAT -> this.ATK_FLAT += buff.getValue();
                case ATK_RATIO -> this.ATK_RATIO += buff.getValue();
                case HP_FLAT -> this.HP_FLAT += buff.getValue();
                case HP_RATIO -> this.HP_RATIO += buff.getValue();
                case CRIT_RATE -> this.CRIT_RATE += buff.getValue();
                case CRIT_DMG -> this.CRIT_DMG += buff.getValue();
                case DMG_BOOST_ALL, DMG_BOOST_ELEM -> this.DMG_BOOST += buff.getValue();
                case DEF_IGNORE, DEF_REDUCTION -> this.DEF_RED += buff.getValue();
                case RES_PEN, RES_REDUCTION -> this.RES_RED += buff.getValue();
                case VULN_ALL, VULN_ELEM -> this.VULN += buff.getValue();
                case TRUE_DMG -> this.TRUE_DMG += buff.getValue();
                case OTHERS_RATIO -> this.OTHERS_RATIO += buff.getValue();
            }
        }
    }

    public double getATK_FLAT() {
        return ATK_FLAT;
    }

    public double getATK_RATIO() {
        return ATK_RATIO;
    }

    public double getHP_FLAT() {
        return HP_FLAT;
    }

    public double getHP_RATIO() {
        return HP_RATIO;
    }

    public double getCRIT_RATE() {
        return CRIT_RATE;
    }

    public double getCRIT_DMG() {
        return CRIT_DMG;
    }

    public double getDMG_BOOST() {
        return DMG_BOOST;
    }

    public double getDEF_RED() {
        return DEF_RED;
    }

    public double getRES_RED() {
        return RES_RED;
    }

    public double getVULN() {
        return VULN;
    }

    public double getTRUE_DMG() {
        return TRUE_DMG;
    }

    public double getOTHERS_RATIO() {
        return OTHERS_RATIO;
    }
}
