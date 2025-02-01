package org.example.relic;

import org.example.util.BuffType;

import java.util.EnumMap;
import java.util.Map;
import java.util.Collections;

public class SubStatData {
    public record SubStatValue(double value) {}
    public record SubStatBuff(BuffType buff) {}

    private static final Map<SubStatType, SubStatValue> SUB_STAT_VALUES;
    private static final Map<SubStatType, SubStatBuff> SUB_STAT_BUFFS;

    static {
        Map<SubStatType, SubStatValue> valuesMap = new EnumMap<>(SubStatType.class);
        // Average values for Subsidiary Stats
        valuesMap.put(SubStatType.SPD_FLAT, new SubStatValue(2.3));
        valuesMap.put(SubStatType.HP_FLAT, new SubStatValue(38.103755));
        valuesMap.put(SubStatType.ATK_FLAT, new SubStatValue(19.051877));
        valuesMap.put(SubStatType.DEF_FLAT, new SubStatValue(19.051877));
        valuesMap.put(SubStatType.HP_RATIO, new SubStatValue(3.888));
        valuesMap.put(SubStatType.ATK_RATIO, new SubStatValue(3.888));
        valuesMap.put(SubStatType.DEF_RATIO, new SubStatValue(4.86));
        valuesMap.put(SubStatType.BREAK, new SubStatValue(5.832));
        valuesMap.put(SubStatType.EFFECT, new SubStatValue(3.888));
        valuesMap.put(SubStatType.EFF_RES, new SubStatValue(3.888));
        valuesMap.put(SubStatType.CRIT_RATE, new SubStatValue(2.916));
        valuesMap.put(SubStatType.CRIT_DMG, new SubStatValue(5.832));

        Map<SubStatType, SubStatBuff> buffsMap = new EnumMap<>(SubStatType.class);
        // Buff type for Subsidiary Stats
        buffsMap.put(SubStatType.SPD_FLAT, new SubStatBuff(BuffType.SPD_FLAT));
        buffsMap.put(SubStatType.HP_FLAT, new SubStatBuff(BuffType.HP_FLAT));
        buffsMap.put(SubStatType.ATK_FLAT, new SubStatBuff(BuffType.ATK_FLAT));
        buffsMap.put(SubStatType.HP_RATIO, new SubStatBuff(BuffType.HP_RATIO));
        buffsMap.put(SubStatType.ATK_RATIO, new SubStatBuff(BuffType.ATK_RATIO));
        buffsMap.put(SubStatType.CRIT_RATE, new SubStatBuff(BuffType.CRIT_RATE));
        buffsMap.put(SubStatType.CRIT_DMG, new SubStatBuff(BuffType.CRIT_DMG));

        // Create unmodifiable views for external access
        SUB_STAT_VALUES = Collections.unmodifiableMap(valuesMap);
        SUB_STAT_BUFFS = Collections.unmodifiableMap(buffsMap);
    }

    public static double getSubStatValue(SubStatType type) {
        SubStatValue subStatValue = SUB_STAT_VALUES.get(type); // Get the record
        return subStatValue != null ? subStatValue.value() : 0.0; // Handle potential null
    }

    public static BuffType getBuffType(SubStatType type) {
        SubStatBuff subStatBuff = SUB_STAT_BUFFS.get(type); // Get the record
        return subStatBuff != null ? subStatBuff.buff() : null; // Handle potential null
    }
}
