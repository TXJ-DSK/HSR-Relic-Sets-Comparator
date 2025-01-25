import org.example.character.Sparkle;
import org.junit.jupiter.api.Test;

public class SparkleEidolonTest {
    @Test
    public void test() {
        Sparkle sparkle = new Sparkle();
        System.out.println(sparkle);
    }
    @Test
    public void testE0() {
        Sparkle sparkle = new Sparkle(0);
        System.out.println(sparkle);
    }
    @Test
    public void testE1() {
        Sparkle sparkle = new Sparkle(1);
        System.out.println(sparkle);
    }
    @Test
    public void testE2() {
        Sparkle sparkle = new Sparkle(2);
        System.out.println(sparkle);
    }
    @Test
    public void testE3() {
        Sparkle sparkle = new Sparkle(3);
        System.out.println(sparkle);
    }
}
