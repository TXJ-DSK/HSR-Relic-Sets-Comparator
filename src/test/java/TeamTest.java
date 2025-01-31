import org.example.battle.CharacterBuild;
import org.example.battle.Team;
import org.example.character.Acheron;
import org.example.character.Fuxuan;
import org.example.character.Jiaoqiu;
import org.example.character.Sparkle;
import org.example.lightCone.AlongThePassingShore;
import org.example.lightCone.ButTheBattleIsntOver;
import org.example.lightCone.ResolutionShinesAsPearlsOfSweat;
import org.example.relic.MainStat;
import org.example.relic.MainStatType;
import org.example.relicSet.cavern.Genius;
import org.example.relicSet.cavern.Messenger;
import org.example.relicSet.cavern.Sacerdos;
import org.example.relicSet.planar.Izumo;
import org.example.relicSet.planar.Kalpagni;
import org.example.relicSet.planar.Keel;
import org.example.relicSet.planar.Vonwacq;
import org.example.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class TeamTest {
    @Test
    public void testTeam1() {
        System.out.println("Team 1");
        ArrayList<CharacterBuild> characterBuilds = new ArrayList<>();

        Acheron acheron = new Acheron(2);
        AlongThePassingShore alongThePassingShore = new AlongThePassingShore();
        MainStat mainStat = new MainStat(MainStatType.CRIT_RATE, MainStatType.ATK, MainStatType.ATK, MainStatType.ATK);
        CharacterBuild characterBuild1 = new CharacterBuild(acheron, alongThePassingShore, mainStat);
        characterBuild1.addCavernRelicSet(new Genius(4, 2, false));
        characterBuild1.addPlanarOrnamentSet(new Izumo(2, true));
        characterBuilds.add(characterBuild1);

        Team team = new Team(characterBuilds);
    }

    @Test
    public void testTeam2() {
        System.out.println("Team 2");
        ArrayList<CharacterBuild> characterBuilds = new ArrayList<>();

        Acheron acheron = new Acheron(2);
        AlongThePassingShore alongThePassingShore = new AlongThePassingShore();
        MainStat mainStat = new MainStat(MainStatType.CRIT_RATE, MainStatType.ATK, MainStatType.ATK, MainStatType.ATK);
        CharacterBuild characterBuild1 = new CharacterBuild(acheron, alongThePassingShore, mainStat);
        characterBuild1.addCavernRelicSet(new Genius(4, 2, false));
        characterBuild1.addPlanarOrnamentSet(new Izumo(2, true));
        characterBuilds.add(characterBuild1);

        Sparkle sparkle = new Sparkle();
        ButTheBattleIsntOver butTheBattleIsntOver = new ButTheBattleIsntOver();
        MainStat mainStat1 = new MainStat(MainStatType.CRIT_DMG, MainStatType.SPD, MainStatType.HP, MainStatType.ENERGY);
        CharacterBuild characterBuild2 = new CharacterBuild(sparkle, butTheBattleIsntOver, mainStat1);
        characterBuild2.addCavernRelicSet(new Sacerdos(4, 2));
        characterBuild2.addPlanarOrnamentSet(new Kalpagni(2, false));
        characterBuilds.add(characterBuild2);

        Team team = new Team(characterBuilds);
    }

    @Test
    public void testTeam3() {
        System.out.println("Team 3");
        ArrayList<CharacterBuild> characterBuilds = new ArrayList<>();

        Acheron acheron = new Acheron(2);
        AlongThePassingShore alongThePassingShore = new AlongThePassingShore();
        MainStat mainStat1 = new MainStat(MainStatType.CRIT_RATE, MainStatType.ATK, MainStatType.ATK, MainStatType.ATK);
        CharacterBuild characterBuild1 = new CharacterBuild(acheron, alongThePassingShore, mainStat1);
        characterBuild1.addCavernRelicSet(new Genius(4, 2, false));
        characterBuild1.addPlanarOrnamentSet(new Izumo(2, true));
        characterBuilds.add(characterBuild1);

        Sparkle sparkle = new Sparkle();
        ButTheBattleIsntOver butTheBattleIsntOver = new ButTheBattleIsntOver();
        MainStat mainStat2 = new MainStat(MainStatType.CRIT_DMG, MainStatType.SPD, MainStatType.HP, MainStatType.ENERGY);
        CharacterBuild characterBuild2 = new CharacterBuild(sparkle, butTheBattleIsntOver, mainStat2);
        characterBuild2.addCavernRelicSet(new Sacerdos(4, 2));
        characterBuild2.addPlanarOrnamentSet(new Kalpagni(2, false));
        characterBuilds.add(characterBuild2);

        Jiaoqiu jiaoqiu = new Jiaoqiu();
        ResolutionShinesAsPearlsOfSweat resolutionShinesAsPearlsOfSweat = new ResolutionShinesAsPearlsOfSweat(3);
        MainStat mainStat3 = new MainStat(MainStatType.EFFECT, MainStatType.SPD, MainStatType.DMG_BOOST_ELEM, MainStatType.ENERGY);
        CharacterBuild characterBuild3 = new CharacterBuild(jiaoqiu, resolutionShinesAsPearlsOfSweat, mainStat3);
        characterBuild3.addCavernRelicSet(new Sacerdos(2, 0));
        characterBuild3.addCavernRelicSet(new Messenger(2, 0));
        characterBuild3.addPlanarOrnamentSet(new Vonwacq(2, true));
        characterBuilds.add(characterBuild3);

        Fuxuan fuxuan = new Fuxuan();
        MainStat mainStat4 = new MainStat(MainStatType.HP, MainStatType.SPD, MainStatType.HP, MainStatType.ENERGY);
        CharacterBuild characterBuild4 = new CharacterBuild(fuxuan, null, mainStat4);
        characterBuild4.addPlanarOrnamentSet(new Keel(2, true));
        characterBuilds.add(characterBuild4);

        Team team = new Team(characterBuilds);

        ArrayList<Buff> allBuffs = new ArrayList<>(team.getAttackerSelfBuffs());
        allBuffs.addAll(team.getSupporterTeamBuffs());
        BuffSummarizer buffSummarizer = new BuffSummarizer(allBuffs);
        System.out.println(buffSummarizer.getATK_FLAT());
        for (Buff buff : allBuffs) {
            if (buff.getType().equals(BuffType.ATK_FLAT)){
                System.out.println(buff);
            }
        }
        System.out.println(buffSummarizer.getATK_RATIO());
        for (Buff buff : allBuffs) {
            if (buff.getType().equals(BuffType.ATK_RATIO)){
                System.out.println(buff);
            }
        }
        System.out.println(buffSummarizer.getCRIT_RATE());
        for (Buff buff : allBuffs) {
            if (buff.getType().equals(BuffType.CRIT_RATE)){
                System.out.println(buff);
            }
        }
        System.out.println(buffSummarizer.getDMG_BOOST());
        for (Buff buff : allBuffs) {
            if (buff.getType().equals(BuffType.DMG_BOOST_ALL) || buff.getType().equals(BuffType.DMG_BOOST_ELEM)){
                System.out.println(buff);
            }
        }
    }

    @Test
    public void testTeam4() {
        System.out.println("Team 4");
        ArrayList<CharacterBuild> characterBuilds = new ArrayList<>();

        Acheron acheron = new Acheron(2);
        AlongThePassingShore alongThePassingShore = new AlongThePassingShore();
        MainStat mainStat1 = new MainStat(MainStatType.CRIT_RATE, MainStatType.ATK, MainStatType.ATK, MainStatType.ATK);
        CharacterBuild characterBuild1 = new CharacterBuild(acheron, alongThePassingShore, mainStat1);
        characterBuild1.addCavernRelicSet(new Genius(4, 2, false));
        characterBuild1.addPlanarOrnamentSet(new Izumo(2, true));
        characterBuilds.add(characterBuild1);

        Sparkle sparkle = new Sparkle();
        ButTheBattleIsntOver butTheBattleIsntOver = new ButTheBattleIsntOver();
        MainStat mainStat2 = new MainStat(MainStatType.CRIT_DMG, MainStatType.SPD, MainStatType.HP, MainStatType.ENERGY);
        CharacterBuild characterBuild2 = new CharacterBuild(sparkle, butTheBattleIsntOver, mainStat2);
        characterBuild2.addCavernRelicSet(new Sacerdos(4, 2));
        characterBuild2.addPlanarOrnamentSet(new Kalpagni(2, false));
        characterBuilds.add(characterBuild2);

        Jiaoqiu jiaoqiu = new Jiaoqiu();
        ResolutionShinesAsPearlsOfSweat resolutionShinesAsPearlsOfSweat = new ResolutionShinesAsPearlsOfSweat(3);
        MainStat mainStat3 = new MainStat(MainStatType.EFFECT, MainStatType.SPD, MainStatType.DMG_BOOST_ELEM, MainStatType.ENERGY);
        CharacterBuild characterBuild3 = new CharacterBuild(jiaoqiu, resolutionShinesAsPearlsOfSweat, mainStat3);
        characterBuild3.addCavernRelicSet(new Sacerdos(2, 0));
        characterBuild3.addCavernRelicSet(new Messenger(2, 0));
        characterBuild3.addPlanarOrnamentSet(new Vonwacq(2, true));
        characterBuilds.add(characterBuild3);

        Fuxuan fuxuan = new Fuxuan();
        MainStat mainStat4 = new MainStat(MainStatType.HP, MainStatType.SPD, MainStatType.HP, MainStatType.ENERGY);
        CharacterBuild characterBuild4 = new CharacterBuild(fuxuan, null, mainStat4);
        characterBuild4.addPlanarOrnamentSet(new Keel(2, true));
        characterBuilds.add(characterBuild4);

        Team team = new Team(characterBuilds);
        ArrayList<Buff> allBuffs = new ArrayList<>(team.getAttackerSelfBuffs());
        allBuffs.addAll(team.getSupporterTeamBuffs());
        BuffSummarizer buffSummarizer = new BuffSummarizer(allBuffs);

        double acheronBaseATK = characterBuild1.getCharacter().getAtk() + characterBuild1.getLightCone().getAtk();
        assertEquals(1333.58, acheronBaseATK);
        MultiplierCalc multiplierCalc = new MultiplierCalc(acheronBaseATK, ScalingType.ATK, buffSummarizer);
        System.out.println(multiplierCalc);
        double baseMultiplier = 1333.58 * (1+0.28+0.432*3+0.12+0.15) + 352.8;
        assertEquals(baseMultiplier, multiplierCalc.getBaseMultiplier());
    }
}
