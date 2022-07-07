package seleniumAdv;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Calendar.html");
		driver.manage().window().maximize();
		
		WebElement dateInput= driver.findElementById("datepicker");
		dateInput.click();
		//dateInput.sendKeys("08/10/2022");
		
		
		WebElement Next = driver.findElementByXPath("//a[@title='Next']");
		Next.click();
		
		WebElement expectedDate = driver.findElementByXPath("//a[text()='10']");
		expectedDate.click();
		
		

	}

}
