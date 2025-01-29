import org.example.battle.CharacterBuild;
import org.example.character.Acheron;
import org.example.character.Character;
import org.example.lightCone.AlongThePassingShore;
import org.example.relic.MainStat;
import org.example.relic.MainStatType;
import org.example.relicSet.cavern.CavernRelicSet;
import org.example.relicSet.cavern.Genius;
import org.example.relicSet.planar.Izumo;
import org.junit.jupiter.api.Test;

public class CharacterBuildTest {
    @Test
    public void test1() {
        System.out.println("CharacterBuildTest.test1");
        Acheron acheron = new Acheron();
        CharacterBuild characterBuild = new CharacterBuild(acheron, null, null);
        System.out.println(characterBuild.getSelfBuffs());
    }
    @Test
    public void test2() {
        System.out.println("CharacterBuildTest.test2");
        Acheron acheron = new Acheron();
        AlongThePassingShore alongThePassingShore = new AlongThePassingShore();
        CharacterBuild characterBuild = new CharacterBuild(acheron, alongThePassingShore, null);
        System.out.println(characterBuild.getSelfBuffs());
    }
    @Test
    public void test3() {
        System.out.println("CharacterBuildTest.test3");
        Acheron acheron = new Acheron();
        AlongThePassingShore alongThePassingShore = new AlongThePassingShore();
        MainStat mainStat = new MainStat(MainStatType.CRIT_RATE, MainStatType.ATK, MainStatType.DMG_BOOST_ELEM, MainStatType.ATK);
        CharacterBuild characterBuild = new CharacterBuild(acheron, alongThePassingShore, mainStat);
        System.out.println(characterBuild.getSelfBuffs());
    }
    @Test
    public void test4() {
        System.out.println("CharacterBuildTest.test4");
        Acheron acheron = new Acheron();
        AlongThePassingShore alongThePassingShore = new AlongThePassingShore();
        MainStat mainStat = new MainStat(MainStatType.CRIT_RATE, MainStatType.ATK, MainStatType.DMG_BOOST_ELEM, MainStatType.ATK);
        CharacterBuild characterBuild = new CharacterBuild(acheron, alongThePassingShore, mainStat);
        characterBuild.addCavernRelicSet(new Genius(4, 2, false));
        System.out.println(characterBuild.getSelfBuffs());
    }
    @Test
    public void test5() {
        System.out.println("CharacterBuildTest.test5");
        Acheron acheron = new Acheron();
        AlongThePassingShore alongThePassingShore = new AlongThePassingShore();
        MainStat mainStat = new MainStat(MainStatType.CRIT_RATE, MainStatType.ATK, MainStatType.DMG_BOOST_ELEM, MainStatType.ATK);
        CharacterBuild characterBuild = new CharacterBuild(acheron, alongThePassingShore, mainStat);
        characterBuild.addCavernRelicSet(new Genius(4, 2, false));
        characterBuild.addPlanarOrnamentSet(new Izumo(2, true));
        System.out.println(characterBuild.getSelfBuffs());
        System.out.println(characterBuild.getTeamBuffs());
    }
    @Test
    public void test6() {
        System.out.println("CharacterBuildTest.test6");
        Acheron acheron = new Acheron(6);
        AlongThePassingShore alongThePassingShore = new AlongThePassingShore();
        MainStat mainStat = new MainStat(MainStatType.CRIT_RATE, MainStatType.ATK, MainStatType.DMG_BOOST_ELEM, MainStatType.ATK);
        CharacterBuild characterBuild = new CharacterBuild(acheron, alongThePassingShore, mainStat);
        characterBuild.addCavernRelicSet(new Genius(4, 2, false));
        characterBuild.addPlanarOrnamentSet(new Izumo(2, true));
        System.out.println(characterBuild.getSelfBuffs());
        System.out.println(characterBuild.getTeamBuffs());
    }
}
