package TestRelatedAnnotations;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MyAdvancedTestClass {
	@Before
    public void setUp() {
        // Setup logic (executed before each test method)
    }

    @Test
    public void testMultiplication() {
        // Test logic
        int result = 3 * 4;
        assertEquals(12, result);
    }

    @Test
    public void testDivision() {
        // Test logic
        int result = 10 / 2;
        assertEquals(5, result);

}
}
