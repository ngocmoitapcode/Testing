import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * Kiểm thử phân hoạch tương đương
 * Chia các giá trị thành ba miền: A < 0; 0<=B<=10;C>10
 * Chọn a=5;b=5;c=15;
 */
public class DemoTest_EquivalencePartition {
    @Test
    public void Test1() {
        Demo demo = new Demo();
        assertEquals("Trượt", demo.sumPoint(5, 5, 5));
    }

    @Test
    public void Test2() {
        Demo demo = new Demo();
        assertEquals("Trượt", demo.sumPoint(-5, 5, 5));
    }

    @Test
    public void Test3() {
        Demo demo = new Demo();
        assertEquals("Trượt", demo.sumPoint(15, 5, 5));
    }

    @Test
    public void Test4() {
        Demo demo = new Demo();
        assertEquals("Trượt", demo.sumPoint(5, 5, -5));
    }

    @Test
    public void Test5() {
        Demo demo = new Demo();
        assertEquals("Trượt", demo.sumPoint(5, 5, 15));
    }

    @Test
    public void Test6() {
        Demo demo = new Demo();
        assertEquals("Trượt", demo.sumPoint(5, -5, 5));
    }

    @Test
    public void Test7() {
        Demo demo = new Demo();
        assertEquals("Trượt", demo.sumPoint(5, 15, 5));
    }
}
