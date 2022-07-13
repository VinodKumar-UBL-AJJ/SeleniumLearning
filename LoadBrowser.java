package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoadBrowser {

	ChromeDriver driver;
	long startTime;
	long endTime;

		
	//Before Suite
	//After Suite
	
	//Suite - Collection of test cases
	
	
	@BeforeSuite
	public void lauchBrowser() {	
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();			
	}
	

	@Test	
	public void openGoogle() {
		driver.get("https://www.google.co.in/");
	}
	
	

	@Test
	public void openBing() {
		driver.get("https://www.bing.com/");
	}
	
	
	

	@Test
	public void openYahoo() {
		driver.get("https://in.yahoo.com/");

	}
	
	
	   @AfterSuite
		public void closeBrowser() {
			driver.quit();
			endTime = System.currentTimeMillis();
			long Totaltime= endTime-startTime;
			System.out.println("Totel time taken: "+Totaltime);
		}
		
		
	}







