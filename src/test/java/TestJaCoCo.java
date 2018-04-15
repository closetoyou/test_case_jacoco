import cn.TestClass;
import org.testng.annotations.Test;

public class TestJaCoCo {

    @Test
    public void test() {
        TestClass testClass = new TestClass();
        testClass.test("lilei");
        testClass.test("hanmeimei");
    }
}
