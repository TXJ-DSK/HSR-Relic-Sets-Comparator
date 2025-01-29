package org.example.battle;

import org.example.character.Character;
import org.example.lightCone.LightCone;
import org.example.relic.MainStat;
import org.example.relicSet.cavern.CavernRelicSet;
import org.example.relicSet.planar.PlanarOrnamentSet;
import org.example.util.Buff;

import java.util.ArrayList;

public class CharacterBuild {
    private Character character;
    private LightCone lightCone;
    private MainStat mainStat;
    private ArrayList<CavernRelicSet> cavernRelicSets;
    private ArrayList<PlanarOrnamentSet> planarOrnamentSets;

    public CharacterBuild(Character character, LightCone lightCone, MainStat mainStat) {
        this.character = character;
        this.lightCone = lightCone;
        this.mainStat = mainStat;
        this.cavernRelicSets = new ArrayList<>();
        this.planarOrnamentSets = new ArrayList<>();

    }

    public Character getCharacter() {
        return character;
    }

    public LightCone getLightCone() {
        return lightCone;
    }

    public MainStat getMainStat() {
        return mainStat;
    }

    public ArrayList<CavernRelicSet> getCavernRelicSets() {
        return cavernRelicSets;
    }

    public ArrayList<PlanarOrnamentSet> getPlanarOrnamentSets() {
        return planarOrnamentSets;
    }

    @Override
    public String toString() {
        return "CharacterBuild{" +
                "character=" + character +
                ", lightCone=" + lightCone +
                ", mainStat=" + mainStat +
                ", cavernRelicSets=" + cavernRelicSets +
                ", planarOrnamentSets=" + planarOrnamentSets +
                '}';
    }

    public void addCavernRelicSet(CavernRelicSet crs) {
        cavernRelicSets.add(crs);
    }
    public void addPlanarOrnamentSet(PlanarOrnamentSet ornamentSet) {
        planarOrnamentSets.add(ornamentSet);
    }

    public ArrayList<Buff> getSelfBuffs() {
        ArrayList<Buff> selfBuffs = new ArrayList<>(this.character.getSelfBuffs());
        if (this.lightCone != null) {
            selfBuffs.addAll(this.lightCone.getSelfBuffs());
        }
        if (this.mainStat != null) {
            selfBuffs.addAll(this.mainStat.getSelfBuffs());
        }
        if (!this.cavernRelicSets.isEmpty()) {
            for (CavernRelicSet crs : this.cavernRelicSets) {
                selfBuffs.addAll(crs.getSelfBuffs());
            }
        }
        if (!this.planarOrnamentSets.isEmpty()) {
            for (PlanarOrnamentSet pors : this.planarOrnamentSets) {
                selfBuffs.addAll(pors.getSelfBuffs());
            }
        }
        return selfBuffs;
    }

    public ArrayList<Buff> getTeamBuffs() {
        ArrayList<Buff> teamBuffs = new ArrayList<>(this.character.getTeamBuffs());
        if (this.lightCone != null) {
            teamBuffs.addAll(this.lightCone.getTeamBuffs());
        }
        if (!this.cavernRelicSets.isEmpty()) {
            for (CavernRelicSet crs : this.cavernRelicSets) {
                teamBuffs.addAll(crs.getTeamBuffs());
            }
        }
        if (!this.planarOrnamentSets.isEmpty()) {
            for (PlanarOrnamentSet pors : this.planarOrnamentSets) {
                teamBuffs.addAll(pors.getTeamBuffs());
            }
        }
        return teamBuffs;
    }
}
