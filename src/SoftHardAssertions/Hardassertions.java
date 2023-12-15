package SoftHardAssertions;

import org.junit.Assert;
import org.junit.Test;

public class Hardassertions {
	@Test
    public void testWithHardAssertions() {
        // Test steps
        int actualResult = 10 + 5;

        // Hard assertions
        Assert.assertEquals(actualResult, 15, "Sum is not as expected");
        Assert.assertTrue(actualResult > 0, "Result should be positive");

        // Additional test steps won't be executed if any of the above assertions fail
    }
}

