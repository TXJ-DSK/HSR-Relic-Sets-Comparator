package org.example.lightCone;
import org.example.util.Buff;
import java.util.ArrayList;

public class LightCone {
    private final Double hp;
    private final Double atk;
    private final Double def;
    // 光锥叠影1-5，不是等级，等级默认满级
    private final Integer rank;

    private final ArrayList<Buff> selfBuffs;
    private final ArrayList<Buff> teamBuffs;

    public LightCone(Double hp, Double atk, Double def, Integer rank) {
        validateParameters(hp, atk, def, rank);
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.rank = rank;
        this.selfBuffs = new ArrayList<>();
        this.teamBuffs = new ArrayList<>();
    }

    private void validateParameters(Double hp, Double atk, Double def, Integer rank){
        if (hp == null || atk == null || def == null || rank == null) {
            throw new IllegalArgumentException("parameter cannot be null.");
        }
        if (rank < 1 || rank > 5) {
            throw new IllegalArgumentException("rank must be between 1 and 5.");
        }
    }

    @Override
    public String toString() {
        return "LightCone{" +
                "hp=" + hp +
                ", atk=" + atk +
                ", def=" + def +
                ", rank=" + rank +
                ", selfBuffs=" + selfBuffs +
                ", teamBuffs=" + teamBuffs +
                '}';
    }

    public Double getHp() {
        return hp;
    }

    public Double getAtk() {
        return atk;
    }

    public Double getDef() {
        return def;
    }

    public Integer getRank() {
        return rank;
    }

    public ArrayList<Buff> getSelfBuffs() {
        return selfBuffs;
    }

    public ArrayList<Buff> getTeamBuffs() {
        return teamBuffs;
    }

    public void addSelfBuff(Buff buff) {
        selfBuffs.add(buff);
    }
    public void addTeamBuff(Buff buff) {
        teamBuffs.add(buff);
    }
    public void removeSelfBuff(Buff buff) {
        selfBuffs.remove(buff);
    }
    public void removeTeamBuff(Buff buff) {
        teamBuffs.remove(buff);
    }
}
