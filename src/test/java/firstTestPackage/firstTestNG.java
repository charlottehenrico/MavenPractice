package firstTestPackage;

import org.testng.annotations.Test;

public class firstTestNG {
	
	@Test (groups = {"Smoke"})
	public void first() {
		System.out.println("First test in first class in first package");
	}
	
	@Test
	public void second() {
		System.out.println("Second test in first class in first package");
	}

}
