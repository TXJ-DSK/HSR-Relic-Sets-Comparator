package org.example.character;
import org.example.util.Buff;
import java.util.ArrayList;

public class Character {
    private final Double hp;
    private final Double atk;
    private final Double def;
    private final Double speed;
    // In percentage
    private final Double crit_rate = 5.0;
    private final Double crit_dmg = 50.0;
    // 星魂0-6，不是等级，等级默认满级
    private final Integer eidolon;

    private final ArrayList<Buff> selfBuffs;
    private final ArrayList<Buff> teamBuffs;

    public Character(Double hp, Double atk, Double def, Double speed, Integer eidolon) {
        validateParameters(hp, atk, def, speed, eidolon); // Validate parameters
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.speed = speed;
        this.eidolon = eidolon;
        this.selfBuffs = new ArrayList<>();
        this.teamBuffs = new ArrayList<>();
    }

    // Public constructor with default eidolon value
    public Character(Double hp, Double atk, Double def, Double speed) {
        this(hp, atk, def, speed, 0); // Default eidolon to 0
    }

    private void validateParameters(Double hp, Double atk, Double def, Double speed, Integer eidolon) {
        if (hp < 0) {
            throw new IllegalArgumentException("HP must be at least 0.");
        }
        if (atk < 0) {
            throw new IllegalArgumentException("ATK must be at least 0.");
        }
        if (def < 0) {
            throw new IllegalArgumentException("DEF must be at least 0.");
        }
        if (speed < 0) {
            throw new IllegalArgumentException("Speed must be at least 0.");
        }
        if (eidolon < 0 || eidolon > 6) {
            throw new IllegalArgumentException("Eidolon must be between 0 and 6.");
        }
    }

    @Override
    public String toString() {
        return "Character{" +
                "hp=" + hp +
                ", atk=" + atk +
                ", def=" + def +
                ", speed=" + speed +
                ", crit_rate=" + crit_rate +
                ", crit_dmg=" + crit_dmg +
                ", eidolon=" + eidolon +
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

    public Double getSpeed() {
        return speed;
    }

    public Double getCrit_rate() {
        return crit_rate;
    }

    public Double getCrit_dmg() {
        return crit_dmg;
    }

    public Integer getEidolon() {
        return eidolon;
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
}
