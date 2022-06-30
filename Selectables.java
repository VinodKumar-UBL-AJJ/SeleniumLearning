package seleniumAdv;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/selectable.html");
		driver.manage().window().maximize();


		List<WebElement> select = driver.findElementsByXPath("//*[@id=\'selectable\']/li");
		int size = select.size();
		System.out.println(size);



		Actions action = new Actions(driver);

		//action.keyDown(Keys.CONTROL).click(select.get(0)).click(select.get(1)).click(select.get(6)).build().perform();
		
		action.clickAndHold(select.get(0)).click(select.get(6)).build().perform();
		
		

	}

}
