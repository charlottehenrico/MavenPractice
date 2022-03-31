package extraListener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class listenerClass {

	@Test(groups = { "Skip" })
	public void testThatIsSkipped() {
		throw new SkipException("This is the SkippedTest method");
	}

	@Test
	public void failedTest() {
		Assert.assertFalse(true);
		System.out.println("This method runs when the test fails");
	}

	@Test
	public void NormalTest() {
		System.out.println("This method should run when the normal test runs");

	}
}
