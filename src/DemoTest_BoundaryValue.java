import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * Kiểm thử giá trị biên
 * min = 0.0; min+ = 0.1; nom = 5.0; max = 10.0; max- = 9.9
 */
public class DemoTest_BoundaryValue {
    @Test
    public void Test1() {
        Demo demo = new Demo();
        assertEquals("Trượt", demo.sumPoint(5, 5, 10));
    }
    @Test
    public void Test2() {
        Demo demo = new Demo();
        assertEquals("Trượt", demo.sumPoint(5, 5, 0));
    }
    @Test
    public void Test3() {
        Demo demo = new Demo();
        assertEquals("Trượt", demo.sumPoint(5, 5, 9.9));
    }
    @Test
    public void Test4() {
        Demo demo = new Demo();
        assertEquals("Trượt", demo.sumPoint(5, 5, 0.1));
    }
    @Test
    public void Test5() {
        Demo demo = new Demo();
        assertEquals("Trượt", demo.sumPoint(5, 5, 5.0));
    }
    @Test
    public void Test6() {
        Demo demo = new Demo();
        assertEquals("Trượt", demo.sumPoint(5, 10, 5));
    }
    @Test
    public void Test7() {
        Demo demo = new Demo();
        assertEquals("Trượt", demo.sumPoint(5, 9.9, 5));
    }
    @Test
    public void Test8() {
        Demo demo = new Demo();
        assertEquals("Trượt", demo.sumPoint(5, 0.1, 5));
    }
    @Test
    public void Test9() {
        Demo demo = new Demo();
        assertEquals("Trượt", demo.sumPoint(5, 0, 5));
    }
    @Test
    public void Test10() {
        Demo demo = new Demo();
        assertEquals("Trượt", demo.sumPoint(10, 5, 5));
    }
    @Test
    public void Test11() {
        Demo demo = new Demo();
        assertEquals("Trượt", demo.sumPoint(9.9, 5, 5));
    }
    @Test
    public void Test12() {
        Demo demo = new Demo();
        assertEquals("Trượt", demo.sumPoint(0.1, 5, 5));
    }
    @Test
    public void Test13() {
        Demo demo = new Demo();
        assertEquals("Trượt", demo.sumPoint(0.0, 5, 5));
    }
}
