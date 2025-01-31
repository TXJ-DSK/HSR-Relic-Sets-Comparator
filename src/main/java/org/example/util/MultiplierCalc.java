package org.example.util;

public class MultiplierCalc {
    double baseMultiplier;
    double critMultiplier;
    double dmgBoostMultiplier;
    double weakenMultiplier = 1;
    double defMultiplier;
    double resMultiplier;
    double vulnMultiplier;
    double mitigationMultiplier = 1;
    double brokenMultiplier;
    double otherMultiplier;
    double trueDmgMultiplier;


    public MultiplierCalc(double baseStat, ScalingType scalingType, BuffSummarizer buffSummarizer) {
        this(baseStat, scalingType, buffSummarizer, new EnemyStat());
    }
    public MultiplierCalc(double baseStat, ScalingType scalingType, BuffSummarizer buffSummarizer, EnemyStat enemyStat) {
        calcBaseMultiplier(baseStat, scalingType, buffSummarizer);
        calcCritMultiplier(buffSummarizer);
        calcDmgBoostMultiplier(buffSummarizer);
        calcDefMultiplier(buffSummarizer, enemyStat);
        calcResMultiplier(buffSummarizer, enemyStat);
        calcVulnMultiplier(buffSummarizer);
        calcBrokenMultiplier(enemyStat);
        calcOtherMultiplier(buffSummarizer);
        calcTrueDmgMultiplier(buffSummarizer);
    }

    private void calcBaseMultiplier(double baseStat, ScalingType scalingType, BuffSummarizer buffSummarizer) {
        if (scalingType.equals(ScalingType.HP)){
            this.baseMultiplier = baseStat * (1 + buffSummarizer.getHP_RATIO()/100) + buffSummarizer.getHP_FLAT();
        }else if (scalingType.equals(ScalingType.ATK)){
            this.baseMultiplier = baseStat * (1 + buffSummarizer.getATK_RATIO()/100) + buffSummarizer.getATK_FLAT();
        }
    }
    private void calcCritMultiplier(BuffSummarizer buffSummarizer) {
        double critRate = Math.min(1.0, buffSummarizer.getCRIT_RATE()/100); // 80% crit rate -> 0.8
        double critDmg = buffSummarizer.getCRIT_DMG()/100; // 150% crit dmg -> 1.5
        // atk*cr*(1+cd) + atk*(1-cr) -> atk*(1 + cr*cd)
        this.critMultiplier = 1 + critRate * critDmg;
    }
    private void calcDmgBoostMultiplier(BuffSummarizer buffSummarizer) {
        this.dmgBoostMultiplier = 1 + buffSummarizer.getDMG_BOOST()/100;
    }
    private void calcDefMultiplier(BuffSummarizer buffSummarizer, EnemyStat enemyStat) {
        // Assume the attacker has level 80
        double numerator = 80 + 20;
        double denominator = (enemyStat.getLv() + 20) * (1 - buffSummarizer.getDEF_RED()/100) + 80 + 20;
        this.defMultiplier = numerator / denominator;
    }
    private void calcResMultiplier(BuffSummarizer buffSummarizer, EnemyStat enemyStat) {
        this.resMultiplier = 1 - (enemyStat.getRes() - buffSummarizer.getRES_RED());
    }
    private void calcVulnMultiplier(BuffSummarizer buffSummarizer) {
        this.vulnMultiplier = 1 + buffSummarizer.getVULN();
    }
    private void calcBrokenMultiplier(EnemyStat enemyStat) {
        if (enemyStat.isBroken()){
            // Toughness is broken
            this.brokenMultiplier = 1.0;
        } else {
            // Have toughness, less damage taken
            this.brokenMultiplier = 0.9;
        }
    }
    private void calcOtherMultiplier(BuffSummarizer buffSummarizer) {
        this.otherMultiplier = 1 + buffSummarizer.getOTHERS_RATIO()/100;
    }
    private void calcTrueDmgMultiplier(BuffSummarizer buffSummarizer) {
        this.trueDmgMultiplier = 1 + buffSummarizer.getTRUE_DMG()/100;
    }

    public double getTotalMultiplier() {
        return baseMultiplier * critMultiplier * dmgBoostMultiplier * weakenMultiplier
                * defMultiplier * resMultiplier * vulnMultiplier * mitigationMultiplier
                * brokenMultiplier * otherMultiplier * trueDmgMultiplier;
    }

    public double getBaseMultiplier() {
        return baseMultiplier;
    }

    public double getCritMultiplier() {
        return critMultiplier;
    }

    public double getDmgBoostMultiplier() {
        return dmgBoostMultiplier;
    }

    public double getWeakenMultiplier() {
        return weakenMultiplier;
    }

    public double getDefMultiplier() {
        return defMultiplier;
    }

    public double getResMultiplier() {
        return resMultiplier;
    }

    public double getVulnMultiplier() {
        return vulnMultiplier;
    }

    public double getMitigationMultiplier() {
        return mitigationMultiplier;
    }

    public double getBrokenMultiplier() {
        return brokenMultiplier;
    }

    public double getOtherMultiplier() {
        return otherMultiplier;
    }

    public double getTrueDmgMultiplier() {
        return trueDmgMultiplier;
    }

    @Override
    public String toString() {
        return "MultiplierCalc{" +
                "baseMultiplier=" + baseMultiplier +
                ", critMultiplier=" + critMultiplier +
                ", dmgBoostMultiplier=" + dmgBoostMultiplier +
                ", weakenMultiplier=" + weakenMultiplier +
                ", defMultiplier=" + defMultiplier +
                ", resMultiplier=" + resMultiplier +
                ", vulnMultiplier=" + vulnMultiplier +
                ", mitigationMultiplier=" + mitigationMultiplier +
                ", brokenMultiplier=" + brokenMultiplier +
                ", otherMultiplier=" + otherMultiplier +
                ", trueDmgMultiplier=" + trueDmgMultiplier +
                '}';
    }
}
