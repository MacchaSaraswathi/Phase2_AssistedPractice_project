package SoftHardAssertions;

import org.junit.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class Softassertions {
	@Test
    public void testWithSoftAssertions() {
        SoftAssert softAssert = new SoftAssert();

        // Test steps
        int actualResult = 10 + 5;

        // Soft assertions
        softAssert.assertEquals(actualResult, 15, "Sum is not as expected");
        softAssert.assertTrue(actualResult > 0, "Result should be positive");

        // Continue with more test steps

        // Assert all soft assertions
        softAssert.assertAll();

}
}
