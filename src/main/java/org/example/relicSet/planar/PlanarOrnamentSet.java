package org.example.relicSet.planar;

import org.example.util.Buff;

import java.util.ArrayList;

public class PlanarOrnamentSet {
    private final int numPieces;
    private final int stacks;
    private final ArrayList<Buff> selfBuffs;
    private final ArrayList<Buff> teamBuffs;
    private final boolean isBuffActivated;

    public PlanarOrnamentSet(int numPieces, int stacks, boolean isBuffActivated) {
        if (numPieces < 1 || numPieces > 2){
            throw new IllegalArgumentException("Number of pieces of planar ornament must be 1 or 2");
        }
        this.numPieces = numPieces;
        this.stacks = stacks;
        this.isBuffActivated = isBuffActivated;
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

    public boolean isBuffActivated() {
        return isBuffActivated;
    }

    @Override
    public String toString() {
        return "PlanarOrnamentSet{" +
                "numPieces=" + numPieces +
                ", stacks=" + stacks +
                ", selfBuffs=" + selfBuffs +
                ", teamBuffs=" + teamBuffs +
                (isBuffActivated ? ", isBuffActivated=" + true : "") +
                '}';
    }

    public void addSelfBuff(Buff buff){
        selfBuffs.add(buff);
    }

    public void addTeamBuff(Buff buff){
        teamBuffs.add(buff);
    }
}
