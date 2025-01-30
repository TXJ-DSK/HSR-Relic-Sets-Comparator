package org.example.battle;

import org.example.util.Buff;
import org.example.util.BuffType;
import org.example.util.ConvertBuff;

import java.util.ArrayList;
import java.util.Objects;

public class Team {
    private final ArrayList<CharacterBuild> characters;
    private final ArrayList<Buff> attackerSelfBuffs;
    private final ArrayList<Buff> supporterTeamBuffs;

    public Team(ArrayList<CharacterBuild> characters) {
        int attackerPos = findAttacker(characters);
        if (attackerPos == -1) {
            throw new IllegalArgumentException("No attacker found");
        }
        this.characters = characters;
        this.attackerSelfBuffs = new ArrayList<>();
        this.supporterTeamBuffs = new ArrayList<>();

        retrieveBuffs();

        System.out.println(this.attackerSelfBuffs);
        System.out.println(this.supporterTeamBuffs);
    }

    private int findAttacker(ArrayList<CharacterBuild> characters){
        int pos = 0;
        for(CharacterBuild c : characters){
            if (c.getCharacter().getClass().getName().equals("org.example.character.Acheron")){
                return pos;
            }
            pos++;
        }
        return -1;
    }

    private ArrayList<Buff> gatherAttackerSelfBuffs() {
        int attackerPos = findAttacker(characters);
        return characters.get(attackerPos).getSelfBuffs();
    }

    private ArrayList<Buff> gatherSupporterTeamBuffs() {
        ArrayList<Buff> teamBuffs = new ArrayList<>();
        for(CharacterBuild c : characters){
            teamBuffs.addAll(c.getTeamBuffs());
        }
        return teamBuffs;
    }

    private ArrayList<ConvertBuff> gatherSupporterCovertBuffs() {
        ArrayList<ConvertBuff> convertBuffs = new ArrayList<>();
        for (CharacterBuild c : characters){
            convertBuffs.addAll(c.getInBattleConvertTeamBuffs());
        }
        return convertBuffs;
    }

    private void retrieveBuffs() {
        attackerSelfBuffs.addAll(gatherAttackerSelfBuffs());
        supporterTeamBuffs.addAll(gatherSupporterTeamBuffs());
        calculateConvertBuffs();
    }

    private void calculateConvertBuffs() {
        ArrayList<ConvertBuff> convertBuffs = gatherSupporterCovertBuffs();
        for (ConvertBuff c : convertBuffs){
            if (Objects.equals(c.getDescription(), "Sparkle-Skill")){
                // TODO: Change char stats to non-fixed
                supporterTeamBuffs.add(new Buff(BuffType.CRIT_DMG
                        , 169.2 * c.getConvertRatio() * 0.01 + c.getFlat()
                        , "Sparkle Skill"));
            }
        }
    }

    public ArrayList<CharacterBuild> getCharacters() {
        return characters;
    }

    public ArrayList<Buff> getAttackerSelfBuffs() {
        return attackerSelfBuffs;
    }

    public ArrayList<Buff> getSupporterTeamBuffs() {
        return supporterTeamBuffs;
    }

    @Override
    public String toString() {
        return "Team{" +
                "characters=" + characters +
                ", attackerSelfBuffs=" + attackerSelfBuffs +
                ", supporterTeamBuffs=" + supporterTeamBuffs +
                '}';
    }
}