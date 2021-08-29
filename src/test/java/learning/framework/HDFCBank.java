package learning.framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HDFCBank {
	@Test(enabled=false)
	public void carLoan() {
		System.out.println("HDFC Car loan EMI rate is 5%");
	}
	
	@Parameters({"MasterUserEmail","MasterUserID","HDFCUserEmail","HDFCUserID"})
	@Test
	public void homeLoan(String MEmail,String MID,String LEmail,String LID) {
		System.out.println("HDFC Home loan EMI rate is 11%");
		System.out.println("Master User Email is" +MEmail);
		System.out.println("Master ID is" +MID);
		System.out.println("HDFC User Email is" +LEmail);
		System.out.println("HDFC ID is" +LID);
	}
	
	@Test(enabled=false)
	public void educationLoan() {
		System.out.println("HDFC Education loan EMI rate is 8%");
	}
	
	@Test
	public void readWriteMethod() {
		Properties data = new Properties();
		FileInputStream fis;
		FileOutputStream fos;
		try {
			fis = new FileInputStream("C:\\Users\\a3k7kzz\\Documents\\Udemy Learning\\Selenium Workspace\\seleniumframework\\testData.properties");
			data.load(fis);
			System.out.println(data.getProperty("browser"));
			System.out.println(data.getProperty("QAUrl"));
			data.setProperty("ProdUrl", "https://prodrealurl.com");
			System.out.println(data.getProperty("ProdUrl"));
			fos = new FileOutputStream("C:\\Users\\a3k7kzz\\Documents\\Udemy Learning\\Selenium Workspace\\seleniumframework\\testData.properties");
			data.store(fos, null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
