package learning.framework;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SBIBankCreditCard {
	
	@BeforeSuite
	public void bftLoan() {
		System.out.println("SBI before Suite Print Statement");
	}
	
	@AfterSuite
	public void aftLoan() {
		System.out.println("SBI after Suite Print Statement");
	}
	
	@Test(groups= {"smoke","sanity"})
	public void cardStatements() {
		System.out.println("SBI Credit Card Statements");
	}
	
	@Test(groups= {"smoke"})
	public void cardOffers() {
		System.out.println("SBI Credit Card Offers");
	}
	
	@Test
	public void creditCardCharges() {
		System.out.println("SBI Credit Card Charges");
		Assert.assertTrue(false);
	}

}
