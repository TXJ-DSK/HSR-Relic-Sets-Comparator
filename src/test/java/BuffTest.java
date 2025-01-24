import org.example.util.Buff;
import org.example.util.BuffType;
import org.junit.jupiter.api.Test;

public class BuffTest {
    @Test
    public void test1() {
        Buff buff = new Buff(BuffType.ATK_FLAT, 123.4);
        System.out.println(buff.toString());
    }
    @Test
    public void test2() {
        Buff buff = new Buff(BuffType.ATK_FLAT, 123.4, 0.8);
        System.out.println(buff.toString());
    }
    @Test
    public void test3() {
        Buff buff = new Buff(BuffType.ATK_FLAT, 123.4, "flat atk 123.4");
        System.out.println(buff.toString());
    }
    @Test
    public void test4() {
        Buff buff = new Buff(BuffType.ATK_FLAT, 0.4, 0.1, "flat atk 0.4");
        System.out.println(buff.toString());
    }
}
