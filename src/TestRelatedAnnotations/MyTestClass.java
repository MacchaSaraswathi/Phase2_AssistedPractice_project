package TestRelatedAnnotations;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class MyTestClass {

    @Test
    public void testAddition() {
        // Test logic
        int result = 2 + 2;
        assertEquals(4, result);
    }

    @Test
    public void testSubtraction() {
        // Test logic
        int result = 5 - 3;
        assertEquals(2, result);

}
}
