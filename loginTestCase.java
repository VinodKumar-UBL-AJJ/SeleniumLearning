package dataDrivenFramework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginTestCase {


	String [][] data= {

			{"Admin", "admin123"},
			{"Admin","asadada"},
			{"assddf","admin123"},
			{"sdsdsds","fdggfgf"}	
	};




	@DataProvider(name="logindata")
	public String[][] loginTestData() {
		return data;

	}


	@Test(dataProvider="logindata")
	public void loginFunction(String uname, String pword) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		driver.findElementById("txtUsername").sendKeys(uname);
		driver.findElementById("txtPassword").sendKeys(pword);
		driver.findElementById("btnLogin").click();



	}

}
