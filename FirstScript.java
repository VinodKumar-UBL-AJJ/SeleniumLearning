package learning;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {



		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();

		driver.get("https://www.google.co.in/");

		driver.manage().window().maximize();


		WebElement TextBox = driver.findElementByName("q");

		TextBox.sendKeys("India"+Keys.ENTER);



	}

}
