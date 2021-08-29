package learning.framework;

import org.testng.annotations.Test;

public class SBIBank {
	@Test(dependsOnMethods= {"homeLoan","educationLoan"})
	public void carLoan() {
		System.out.println("SBI Car loan EMI rate is 4%");
	}
	
	@Test
	public void homeLoan() {
		System.out.println("SBI Home loan EMI rate is 9.5%");
	}
	
	@Test(dependsOnMethods= {"homeLoan"})
	public void educationLoan() {
		System.out.println("SBI Education loan EMI rate is 7%");
	}

}
