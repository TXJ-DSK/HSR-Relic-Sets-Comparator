import org.example.character.Acheron;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AcheronEidolonTest {
    @Test
    @Order(1)
    public void testAcheron() {
        Acheron acheron = new Acheron();
        System.out.println(acheron);
    }
    @Test
    @Order(2)
    public void testAcheronE0() {
        Acheron acheron = new Acheron(0);
        System.out.println(acheron);
    }
    @Test
    @Order(3)
    public void testAcheronE1() {
        Acheron acheron = new Acheron(1);
        System.out.println(acheron);
    }
    @Test
    @Order(4)
    public void testAcheronE4() {
        Acheron acheron = new Acheron(4);
        System.out.println(acheron);
    }
    @Test
    @Order(5)
    public void testAcheronE5() {
        Acheron acheron = new Acheron(5);
        System.out.println(acheron);
    }
    @Test
    @Order(6)
    public void testAcheronE6() {
        Acheron acheron = new Acheron(6);
        System.out.println(acheron);
    }
}
