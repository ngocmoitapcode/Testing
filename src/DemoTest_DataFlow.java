import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DemoTest_DataFlow {
    @Test
    public void Test1() {
        Demo demo = new Demo();
        assertEquals("Không hợp lệ", demo.sumPoint(-5, 5, 5));
    }

    @Test
    public void Test2() {
        Demo demo = new Demo();
        assertEquals("Không hợp lệ", demo.sumPoint(5, 5, -5));
    }

    @Test
    public void Test3() {
        Demo demo = new Demo();
        assertEquals("Không hợp lệ", demo.sumPoint(5, -5, 5));
    }

    @Test
    public void Test4() {
        Demo demo = new Demo();
        assertEquals("Đỗ", demo.sumPoint(9.0, 8.0, 9.0));
    }
}
