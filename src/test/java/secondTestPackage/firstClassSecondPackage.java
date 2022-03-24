package secondTestPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firstClassSecondPackage {
	
	@BeforeSuite
	public void GlobalVariables () {
		System.out.println("This method should run before all test suites");
	}
	@AfterSuite
	public void GlobalVariablesReset() {
		System.out.println("This method should run after all test suites");
	}
	
	@BeforeTest
	public void RestoreDB () {
		System.out.println("This method should run before all tests in a test suite");
	}
	
	@AfterTest
	public void CleanDB() {
		System.out.println("This method should run after all tests in a test suite");
	}
	
	@BeforeMethod
	public void checkHealth() {
		System.out.println("Run this before each method");
	}
	
	@BeforeGroups
	public void DoThisBeforeGroups() {
		System.out.println ("This happens before each group");
	}
	
	@Test (groups = {"Smoke"})
	public void firstTestFirstClassSecondPackage() {
		System.out.println("First Test in first Class of Second Package");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("Run after each method");
	}
	
	@Test (enabled = false)
	public void secondTestFirstClassSecondPackage() {
		System.out.println("Test that should be excluded");
	}
	
	@Test
	public void thirdTestFirstClassSecondPackage() {
		System.out.println("Third Test in first class of Second Package");
	}
	
	@Test
	public void fourthTestSecondPackage() {
		System.out.println("Fourth Test in first class of Second Package");
	}
	

}
