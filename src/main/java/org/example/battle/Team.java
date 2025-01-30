package org.example.battle;

import org.example.util.Buff;
import org.example.util.ConvertBuff;

import java.util.ArrayList;

public class Team {
    private final ArrayList<CharacterBuild> characters;
    public Team(ArrayList<CharacterBuild> characters) {
        int attackerPos = findAttacker(characters);
        if (attackerPos == -1) {
            throw new IllegalArgumentException("No attacker found");
        }
        this.characters = characters;
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

    public ArrayList<Buff> getAttackerSelfBuffs() {
        int attackerPos = findAttacker(characters);
        return characters.get(attackerPos).getSelfBuffs();
    }

    public ArrayList<Buff> getSupporterTeamBuffs() {
        ArrayList<Buff> teamBuffs = new ArrayList<>();
        for(CharacterBuild c : characters){
            teamBuffs.addAll(c.getTeamBuffs());
        }
        return teamBuffs;
    }

    public ArrayList<ConvertBuff> getSupporterCovertBuffs() {
        ArrayList<ConvertBuff> convertBuffs = new ArrayList<>();
        for (CharacterBuild c : characters){
            convertBuffs.addAll(c.getInBattleConvertTeamBuffs());
        }
        return convertBuffs;
    }
}