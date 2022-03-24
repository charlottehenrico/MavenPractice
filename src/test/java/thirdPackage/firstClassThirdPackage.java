package thirdPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class firstClassThirdPackage {
	
	@Test
	public void firstTestFirstClassThirdPackage() {
		System.out.println("First Test in first Class of Third Package");
	}
	
	@Parameters( {"URL"} )
	@Test
	public void secondTestFirstClassThirdPackage(String URL) {
		System.out.println("second Test in first Class of Third Package");
		System.out.println( "This is the URL parameter " + URL);
	}
	
	@Test
	public void thirdTestFirstClassThirdPackage() {
		System.out.println("Third Test in first class of Third Package");
	}

}
