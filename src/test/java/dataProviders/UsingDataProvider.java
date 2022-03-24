package dataProviders;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class UsingDataProvider {
	
	@Test(dataProvider = "getData")
	public void CreatNameAndSurname (String username, String lastname) {
		System.out.println("Username and Lastname Test");
		System.out.println( username + " " + lastname);
	}
	
	@DataProvider
	public Object[][] getData(){
		
	//Iterations:
	//1st username and pass - good credit history
	//2nd username and pass - no credit history
	//3rd username and pass - fraudelant credit history
	
	//define a multi dimensional object array with 3 rows and 2 columns
	//3 rows for the number of test cases
	//2 columns for the number of values passed in
	Object[][] data = new Object[3][2];
	
	//1st set
	data[0][0] = "Sarah";
	data[0][1] = "Maxim";
	
	//2nd set
	data[1][0] = "Mark";
	data[1][1] = "Hamley";
	
	//3rd set
	data[2][0] = "Jenny";
	data[2][1] = "Rogers";
	
	return data;

}}
