package learning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");

		WebElement NormalAlert = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[1]/div/div/button");
		NormalAlert.click();
		
	   Alert alert1 = driver.switchTo().alert();
	   alert1.accept();
	   
	  WebElement confirmAlert= driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[2]/div/div/button");
	  confirmAlert.click();
	  Alert alert2 = driver.switchTo().alert();
	  
	  alert2.dismiss();
	   
	   
	  WebElement PromptAlert = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[3]/div/div/button");
	  PromptAlert.click();
	  
	  Alert alert3 = driver.switchTo().alert();
	  
	 alert3.sendKeys("Selenium learning");
	 alert3.accept();
	}

}
