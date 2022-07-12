package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }
    @Test
    public void should_return_sum() {
        BaseDemo baseDemo = new BaseDemo();

        int expected1 = 6;

        assertEquals(expected1, baseDemo.sum(2,4));

        int expected2 = 100;

        assertEquals(expected2, baseDemo.sum(48,52));
    }

}
