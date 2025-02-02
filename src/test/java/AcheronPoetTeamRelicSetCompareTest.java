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
import org.example.relic.RelicSubStatOptimizer;
import org.example.relicSet.cavern.Messenger;
import org.example.relicSet.cavern.Poet;
import org.example.relicSet.cavern.Sacerdos;
import org.example.relicSet.planar.*;
import org.example.util.Buff;
import org.example.util.BuffSummarizer;
import org.example.util.MultiplierCalc;
import org.example.util.ScalingType;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AcheronPoetTeamRelicSetCompareTest {
    @Test
    public void test1() {
        System.out.println("Poet-Izumo-NoResolution");
        System.out.println("Fuxuan Keel");
        ArrayList<CharacterBuild> characterBuilds = new ArrayList<>();

        Acheron acheron = new Acheron(2);
        AlongThePassingShore alongThePassingShore = new AlongThePassingShore();
        MainStat mainStat1 = new MainStat(MainStatType.CRIT_DMG, MainStatType.ATK, MainStatType.ATK, MainStatType.ATK);
        CharacterBuild characterBuild1 = new CharacterBuild(acheron, alongThePassingShore, mainStat1);
        characterBuild1.addCavernRelicSet(new Poet(4, 2, false));
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
        CharacterBuild characterBuild3 = new CharacterBuild(jiaoqiu, null, mainStat3);
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
        RelicSubStatOptimizer relicSubStatOptimizer = new RelicSubStatOptimizer(1333.58
                , ScalingType.ATK, allBuffs, 30);
        ArrayList<Buff> buffsWithRelicSub = new ArrayList<>(relicSubStatOptimizer.combineSubStatsBuffs(allBuffs));
        System.out.println(relicSubStatOptimizer.getSubStatsCount());
        MultiplierCalc multiplierCalc = new MultiplierCalc(1333.58
                , ScalingType.ATK, new BuffSummarizer(buffsWithRelicSub));
        System.out.println(multiplierCalc.getTotalMultiplier());
    }

    @Test
    public void test2() {
        System.out.println("Fuxuan Lushaka");
        ArrayList<CharacterBuild> characterBuilds = new ArrayList<>();

        Acheron acheron = new Acheron(2);
        AlongThePassingShore alongThePassingShore = new AlongThePassingShore();
        MainStat mainStat1 = new MainStat(MainStatType.CRIT_DMG, MainStatType.ATK, MainStatType.ATK, MainStatType.ATK);
        CharacterBuild characterBuild1 = new CharacterBuild(acheron, alongThePassingShore, mainStat1);
        characterBuild1.addCavernRelicSet(new Poet(4, 2, false));
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
        CharacterBuild characterBuild3 = new CharacterBuild(jiaoqiu, null, mainStat3);
        characterBuild3.addCavernRelicSet(new Sacerdos(2, 0));
        characterBuild3.addCavernRelicSet(new Messenger(2, 0));
        characterBuild3.addPlanarOrnamentSet(new Vonwacq(2, true));
        characterBuilds.add(characterBuild3);

        Fuxuan fuxuan = new Fuxuan();
        MainStat mainStat4 = new MainStat(MainStatType.HP, MainStatType.SPD, MainStatType.HP, MainStatType.ENERGY);
        CharacterBuild characterBuild4 = new CharacterBuild(fuxuan, null, mainStat4);
        characterBuild4.addPlanarOrnamentSet(new Lushaka(2, true));
        characterBuilds.add(characterBuild4);

        Team team = new Team(characterBuilds);
        ArrayList<Buff> allBuffs = new ArrayList<>(team.getAttackerSelfBuffs());
        allBuffs.addAll(team.getSupporterTeamBuffs());
        RelicSubStatOptimizer relicSubStatOptimizer = new RelicSubStatOptimizer(1333.58
                , ScalingType.ATK, allBuffs, 30);
        ArrayList<Buff> buffsWithRelicSub = new ArrayList<>(relicSubStatOptimizer.combineSubStatsBuffs(allBuffs));
        System.out.println(relicSubStatOptimizer.getSubStatsCount());
        MultiplierCalc multiplierCalc = new MultiplierCalc(1333.58
                , ScalingType.ATK, new BuffSummarizer(buffsWithRelicSub));
        System.out.println(multiplierCalc.getTotalMultiplier());
    }

    @Test
    public void test3() {
        System.out.println("Fuxuan Keel - 31sub");
        ArrayList<CharacterBuild> characterBuilds = new ArrayList<>();

        Acheron acheron = new Acheron(2);
        AlongThePassingShore alongThePassingShore = new AlongThePassingShore();
        MainStat mainStat1 = new MainStat(MainStatType.CRIT_DMG, MainStatType.ATK, MainStatType.ATK, MainStatType.ATK);
        CharacterBuild characterBuild1 = new CharacterBuild(acheron, alongThePassingShore, mainStat1);
        characterBuild1.addCavernRelicSet(new Poet(4, 2, false));
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
        CharacterBuild characterBuild3 = new CharacterBuild(jiaoqiu, null, mainStat3);
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
        RelicSubStatOptimizer relicSubStatOptimizer = new RelicSubStatOptimizer(1333.58
                , ScalingType.ATK, allBuffs, 31);
        ArrayList<Buff> buffsWithRelicSub = new ArrayList<>(relicSubStatOptimizer.combineSubStatsBuffs(allBuffs));
        System.out.println(relicSubStatOptimizer.getSubStatsCount());
        MultiplierCalc multiplierCalc = new MultiplierCalc(1333.58
                , ScalingType.ATK, new BuffSummarizer(buffsWithRelicSub));
        System.out.println(multiplierCalc.getTotalMultiplier());
    }
}
