package learning.framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HDFCBankCreditCard {
	
	@BeforeMethod
	public void bftLoan() {
		System.out.println("HDFC before Each Method Print Statement");
	}
	
	@AfterMethod
	public void aftLoan() {
		System.out.println("HDFC After Each Method Print Statement");
	}
	@Test(groups= {"smoke","sanity"})
	public void cardStatements() {
		System.out.println("HDFC Credit Card Statements");
	}
	
	@Test(groups= {"smoke"})
	public void cardOffers() {
		System.out.println("HDFC Credit Card Offers");
	}
	
	@Test
	public void creditCardCharges() {
		System.out.println("HDFC Credit Card Charges");
	}

}
