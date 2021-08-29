package learning.framework;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ICICIBank {
	@BeforeTest
	public void bftLoan() {
		System.out.println("ICICI before Test Print Statement");
	}
	
	@AfterTest
	public void aftLoan() {
		System.out.println("ICICI after Test Print Statement");
	}
	
	
	@Test
	public void carLoan() {
		System.out.println("ICICI Car loan EMI rate is 6%");
	}
	
	@Test(dataProvider= "getData")
	public void homeLoan(String userName, String password) {
		System.out.println("ICICI Home loan EMI rate is 12.5%");
		System.out.println("User Name is: "+userName);
		System.out.println("Password is: "+password);
	}
	
	@Test
	public void educationLoan() {
		System.out.println("ICICI Education loan EMI rate is 9%");
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		
		data[0][0] = "BankManagerID";
		data[0][1] = "BankManagerPass@123";
		data[1][0] = "BankCashierID";
		data[1][1] = "BankCashierPass@123";
		data[2][0] = "BankClerkID";
		data[2][1] = "BankClerkPass@123";
		
		return data;
	}
}
