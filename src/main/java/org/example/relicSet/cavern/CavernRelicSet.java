package org.example.relicSet.cavern;

import org.example.util.Buff;

import java.util.ArrayList;

public class CavernRelicSet {
    private final int numPieces;
    private final int stacks;
    private final ArrayList<Buff> selfBuffs;
    private final ArrayList<Buff> teamBuffs;
    private final boolean hasMatchingEle;

    public CavernRelicSet(int numPieces, int stacks){
        this(numPieces, stacks, false);
    }

    public CavernRelicSet(int numPieces, int stacks, boolean hasMatchingEle) {
        if (numPieces < 1 || numPieces > 4){
            throw new IllegalArgumentException("Number of pieces of cavern relic must be between 1 and 4");
        }
        this.numPieces = numPieces;
        this.stacks = stacks;
        this.hasMatchingEle = hasMatchingEle;
        this.selfBuffs = new ArrayList<>();
        this.teamBuffs = new ArrayList<>();
    }

    public int getNumPieces() {
        return numPieces;
    }

    public int getStacks() {
        return stacks;
    }

    public ArrayList<Buff> getSelfBuffs() {
        return selfBuffs;
    }

    public ArrayList<Buff> getTeamBuffs() {
        return teamBuffs;
    }

    public boolean isHasMatchingEle() {
        return hasMatchingEle;
    }

    @Override
    public String toString() {
        return "cavernRelicSet{" +
                "numPieces=" + numPieces +
                ", stacks=" + stacks +
                ", selfBuffs=" + selfBuffs +
                ", teamBuffs=" + teamBuffs +
                (hasMatchingEle ? ", hasMatchingEle=" + true : "") +
                '}';
    }

    public void addSelfBuff(Buff buff){
        selfBuffs.add(buff);
    }
    public void addTeamBuff(Buff buff){
        teamBuffs.add(buff);
    }
}
