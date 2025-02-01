package org.example.relic;

import java.util.EnumMap;

public class SubStatValueStore {
    private final EnumMap<SubStatType, Double> values = new EnumMap<>(SubStatType.class);

    public SubStatValueStore() {
        // Average values for Subsidiary Stats
        values.put(SubStatType.SPD_FLAT, (2+2.3+2.6)/3);
        values.put(SubStatType.HP_FLAT, (33.87+38.103755+42.33751)/3);
        values.put(SubStatType.ATK_FLAT, (16.935+19.051877+21.168754)/3);
        values.put(SubStatType.DEF_FLAT, (16.935+19.051877+21.168754)/3);
        values.put(SubStatType.HP_RATIO, (3.456+3.888+4.32)/3);
        values.put(SubStatType.ATK_RATIO, (3.456+3.888+4.32)/3);
        values.put(SubStatType.DEF_RATIO, (4.32+4.86+5.4)/3);
        values.put(SubStatType.BREAK, (5.184+5.832+6.48)/3);
        values.put(SubStatType.EFFECT, (3.456+3.888+4.32)/3);
        values.put(SubStatType.EFF_RES, (3.456+3.888+4.32)/3);
        values.put(SubStatType.CRIT_RATE, (2.592+2.916+3.24)/3);
        values.put(SubStatType.CRIT_DMG, (5.184+5.832+6.48)/3);
    }

    public double getSubStatValue(SubStatType type) {
        return values.get(type);
    }

    @Override
    public String toString() {
        return "SubStatValueStore{" +
                "values=" + values +
                '}';
    }
}
