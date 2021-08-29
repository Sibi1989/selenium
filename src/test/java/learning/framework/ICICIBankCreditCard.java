package learning.framework;

import org.testng.annotations.Test;

public class ICICIBankCreditCard {
	@Test(groups= {"smoke","sanity"})
	public void cardStatements() {
		System.out.println("ICICI Credit Card Statements");
	}
	
	@Test(groups= {"smoke"})
	public void cardOffers() {
		System.out.println("ICICI Credit Card Offers");
	}
	
	@Test
	public void creditCardCharges() {
		System.out.println("ICICI Credit Card Charges");
	}

}
