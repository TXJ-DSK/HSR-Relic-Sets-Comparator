package org.example.relic;

import org.example.util.Buff;
import org.example.util.BuffType;

import java.util.ArrayList;
import java.util.EnumSet;

public class MainStat {
    private final MainStatType body;
    private final MainStatType feet;
    private final MainStatType sphere;
    private final MainStatType rope;
    private final ArrayList<Buff> selfBuffs;


    public MainStat(MainStatType body, MainStatType feet, MainStatType sphere, MainStatType rope) {
        validateMainStat(body, feet, sphere, rope);
        this.body = body;
        this.feet = feet;
        this.sphere = sphere;
        this.rope = rope;
        this.selfBuffs = new ArrayList<>();
        initSelfBuffs(body, "body");
        initSelfBuffs(feet, "feet");
        initSelfBuffs(sphere, "sphere");
        initSelfBuffs(rope, "rope");
    }

    public MainStatType getBody() {
        return body;
    }

    public MainStatType getFeet() {
        return feet;
    }

    public MainStatType getSphere() {
        return sphere;
    }

    public MainStatType getRope() {
        return rope;
    }

    public ArrayList<Buff> getSelfBuffs() {
        return selfBuffs;
    }

    @Override
    public String toString() {
        return "MainStat{" +
                "body=" + body +
                ", feet=" + feet +
                ", sphere=" + sphere +
                ", rope=" + rope +
                ", selfBuffs=" + selfBuffs +
                '}';
    }

    private void validateMainStat(MainStatType body, MainStatType feet, MainStatType sphere, MainStatType rope) {
        EnumSet<MainStatType> commonStats = EnumSet.of(MainStatType.HP, MainStatType.ATK, MainStatType.DEF);
        EnumSet<MainStatType> bodyStats = EnumSet.of(MainStatType.EFFECT, MainStatType.HEAL_BOOST, MainStatType.CRIT_RATE, MainStatType.CRIT_DMG);
        EnumSet<MainStatType> feetStats = EnumSet.of(MainStatType.SPD);
        EnumSet<MainStatType> sphereStats = EnumSet.of(MainStatType.DMG_BOOST_ELEM);
        EnumSet<MainStatType> ropeStats = EnumSet.of(MainStatType.BREAK, MainStatType.ENERGY);

        // Validate each MainStatType
        validateStatType(body, commonStats, bodyStats, "body");
        validateStatType(feet, commonStats, feetStats, "feet");
        validateStatType(sphere, commonStats, sphereStats, "sphere");
        validateStatType(rope, commonStats, ropeStats, "rope");
    }

    private void validateStatType(MainStatType stat, EnumSet<MainStatType> commonStats, EnumSet<MainStatType> specificStats, String partName) {
        if (!commonStats.contains(stat) && !specificStats.contains(stat)) {
            throw new IllegalArgumentException("Invalid MainStatType for " + partName + ": " + stat);
        }
    }

    private void initSelfBuffs(MainStatType type, String partName) {
        if (type.equals(MainStatType.HP_FLAT)) {
            this.selfBuffs.add(new Buff(BuffType.HP_FLAT, 705.6, "Relic-"+partName));
        } else if (type.equals(MainStatType.ATK_FLAT)) {
            this.selfBuffs.add(new Buff(BuffType.ATK_FLAT, 352.8, "Relic-"+partName));
        }
        // Common stats
        else if (type.equals(MainStatType.HP)) {
            this.selfBuffs.add(new Buff(BuffType.HP_RATIO, 43.2, "Relic-"+partName));
        } else if (type.equals(MainStatType.ATK)) {
            this.selfBuffs.add(new Buff(BuffType.ATK_RATIO, 43.2, "Relic-"+partName));
        }
        // Body
        else if (type.equals(MainStatType.CRIT_RATE)) {
            this.selfBuffs.add(new Buff(BuffType.CRIT_RATE, 32.4, "Relic-"+partName));
        } else if (type.equals(MainStatType.CRIT_DMG)) {
            this.selfBuffs.add(new Buff(BuffType.CRIT_DMG, 64.8, "Relic-"+partName));
        }
        // Feet
        else if (type.equals(MainStatType.SPD)) {
            this.selfBuffs.add(new Buff(BuffType.SPD_FLAT, 25.03, "Relic-"+partName));
        }
        // Sphere
        else if (type.equals(MainStatType.DMG_BOOST_ELEM)) {
            this.selfBuffs.add(new Buff(BuffType.DMG_BOOST_ELEM, 38.88, "Relic-"+partName));
        }
        // TODO: Implement DEF, EFFECT, BREAK, ENERGY
    }
}
