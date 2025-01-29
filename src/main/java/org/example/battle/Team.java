package org.example.battle;

import org.example.character.Character;

import java.util.ArrayList;

public class Team {
    public Team(ArrayList<CharacterBuild> characters) {
        int attackerPos = findAttacker(characters);
        if (attackerPos == -1) {
            throw new IllegalArgumentException("No attacker found");
        }
        System.out.println(attackerPos);
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
}
