package org.example.relic;

import org.example.util.Buff;
import org.example.util.BuffSummarizer;
import org.example.util.MultiplierCalc;
import org.example.util.ScalingType;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;

public class RelicSubStatOptimizer {
    private final EnumMap<SubStatType, Integer> subStatsCount;
    private final double baseStat;
    private final ScalingType scalingType;

    public RelicSubStatOptimizer(double baseStat, ScalingType scalingType, ArrayList<Buff> buffs, int numEffectiveSubStats) {
        if (numEffectiveSubStats < 0) {
            throw new IllegalArgumentException("Number of Effective SubStats must be at least 0");
        }
        this.baseStat = baseStat;
        this.scalingType = scalingType;
        this.subStatsCount = new EnumMap<>(SubStatType.class);
        addSubStats(buffs, numEffectiveSubStats);
    }

    private void addSubStats(ArrayList<Buff> buffs, int numEffectiveSubStats){
        for (int i = 0; i < numEffectiveSubStats; i++) {
            SubStatType optimalSubStatType = findOneOptimalSubStatType(buffs);
            addOneSubStat(optimalSubStatType);
        }
    }

    private SubStatType findOneOptimalSubStatType(ArrayList<Buff> buffs){
        ArrayList<Buff> existingBuffs = new ArrayList<>(combineSubStatsBuffs(buffs));
        EnumSet<SubStatType> availableSubStats = EnumSet.of(SubStatType.HP_FLAT,SubStatType.HP_RATIO
                ,SubStatType.ATK_FLAT,SubStatType.ATK_RATIO, SubStatType.CRIT_RATE, SubStatType.CRIT_DMG);
        SubStatType optimalSubStatType = SubStatType.HP_FLAT;
        double maxTotalMultiplier = 0.0;
        for (SubStatType subStatType : availableSubStats) {
            BuffSummarizer buffSummarizer = new BuffSummarizer(existingBuffs
                    , new Buff(SubStatData.getBuffType(subStatType), SubStatData.getSubStatValue(subStatType)));
            MultiplierCalc multiplierCalc = new MultiplierCalc(baseStat, scalingType, buffSummarizer);
            if (multiplierCalc.getTotalMultiplier() > maxTotalMultiplier) {
                maxTotalMultiplier = multiplierCalc.getTotalMultiplier();
                optimalSubStatType = subStatType;
            }
        }
        return optimalSubStatType;
    }

    private void addOneSubStat(SubStatType subStatType) {
        if (subStatsCount.containsKey(subStatType)) {
            subStatsCount.put(subStatType, subStatsCount.get(subStatType) + 1);
        }else {
            subStatsCount.put(subStatType, 1);
        }
    }

    public ArrayList<Buff> combineSubStatsBuffs(ArrayList<Buff> buffs) {
        // Return a new ArrayList which contains buffs in parameter and sub stats buffs in subStatsCount
        ArrayList<Buff> newBuffs = new ArrayList<>(buffs);
        for (SubStatType subStatType : subStatsCount.keySet()) {
            newBuffs.add(new Buff(
                    SubStatData.getBuffType(subStatType)
                    , SubStatData.getSubStatValue(subStatType) * subStatsCount.get(subStatType)
                    , "SubStat-" + subStatType + "-" + subStatsCount.get(subStatType)
            ));
        }
        return newBuffs;
    }

    public EnumMap<SubStatType, Integer> getSubStatsCount() {
        return subStatsCount;
    }
}
