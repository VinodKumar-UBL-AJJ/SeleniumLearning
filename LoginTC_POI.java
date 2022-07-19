package dataDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTC_POI {
	
	@DataProvider(name="logindata")
	public String[][] testCastData() throws IOException {		
		return ExcelClass.excelData();
	}
	
	
	@Test(dataProvider="logindata")
	public void loginTestCase(String uname, String pword) {	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		driver.findElementById("txtUsername").sendKeys(uname);
		driver.findElementById("txtPassword").sendKeys(pword);
		driver.findElementById("btnLogin").click();

	}

}
