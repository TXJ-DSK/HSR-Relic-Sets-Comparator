import org.example.battle.CharacterBuild;
import org.example.battle.Team;
import org.example.character.Acheron;
import org.example.character.Sparkle;
import org.example.lightCone.AlongThePassingShore;
import org.example.lightCone.ButTheBattleIsntOver;
import org.example.relic.MainStat;
import org.example.relic.MainStatType;
import org.example.relicSet.cavern.Genius;
import org.example.relicSet.cavern.Sacerdos;
import org.example.relicSet.planar.Izumo;
import org.example.relicSet.planar.Kalpagni;
import org.junit.jupiter.api.Test;

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
        System.out.println(team.getAttackerSelfBuffs());
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
        //System.out.println(team.getAttackerSelfBuffs());
        //System.out.println(team.getSupporterTeamBuffs());
        System.out.println(team.getSupporterCovertBuffs());
    }
}
