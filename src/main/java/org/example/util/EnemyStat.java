package org.example.util;

public class EnemyStat {
    private final int lv;
    private final double res;
    private final boolean isBroken;

    public EnemyStat(){
        // Default value: lv 90, 0 RES (all type weaknesses), not broken
        // Memory of Chaos      Stage 12    Enemy Levels: 95
        // Apocalyptic Shadow   Stage 4     Enemy Levels: 90
        // Pure Fiction         Stage 4     Enemy Levels: 85
        this(90, 0.0, false);
    }

    public EnemyStat(int lv, double res, boolean isBroken) {
        this.lv = lv;
        this.res = res;
        this.isBroken = isBroken;
    }

    public int getLv() {
        return lv;
    }

    public double getRes() {
        return res;
    }

    public boolean isBroken() {
        return isBroken;
    }

    @Override
    public String toString() {
        return "EnemyStat{" +
                "lv=" + lv +
                ", res=" + res +
                ", isBroken=" + isBroken +
                '}';
    }
}
