package org.example.lightCone;
import org.example.util.Buff;
import java.util.ArrayList;

public class LightCone {
    Double hp;
    Double atk;
    Double def;
    // 光锥叠影1-5，不是等级，等级默认满级
    Integer rank;

    ArrayList<Buff> selfBuffs;
    ArrayList<Buff> teamBuffs;

    public LightCone(Double hp, Double atk, Double def, Integer rank) {
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.rank = rank;
    }

    public LightCone(Double hp, Double atk, Double def) {
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.rank = 1;
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

    public void addSelfBuff(Buff buff) {
        selfBuffs.add(buff);
    }
    public void addTeamBuff(Buff buff) {
        teamBuffs.add(buff);
    }
}
