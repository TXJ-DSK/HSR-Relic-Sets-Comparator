import org.example.relic.MainStat;
import org.example.relic.MainStatType;
import org.junit.jupiter.api.Test;

public class RelicMainStatTest {
    @Test
    public void test1() {
        MainStat mainStat = new MainStat(MainStatType.CRIT_DMG, MainStatType.SPD, MainStatType.ATK, MainStatType.ATK);
        System.out.println(mainStat);
    }
    @Test
    public void test2() {
        MainStat mainStat = new MainStat(MainStatType.CRIT_RATE, MainStatType.ATK, MainStatType.DMG_BOOST_ELEM, MainStatType.ENERGY);
        System.out.println(mainStat);
    }
}
