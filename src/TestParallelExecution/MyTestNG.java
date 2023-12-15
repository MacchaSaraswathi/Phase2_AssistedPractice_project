package TestParallelExecution;

import org.junit.jupiter.api.Test;

public class MyTestNG {
	@Test(groups = "group1")
    public void testMethod1() {
        System.out.println("Test Method 1");
    }

    @Test(groups = "group2")
    public void testMethod2() {
        System.out.println("Test Method 2");
    }

    @Test(groups = "group1")
    public void testMethod3() {
        System.out.println("Test Method 3");
	

	    

}
}
