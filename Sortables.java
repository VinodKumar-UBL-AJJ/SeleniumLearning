package seleniumAdv;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/sortable.html");

		driver.manage().window().maximize();


		List<WebElement> Lists= driver.findElementsByXPath("//*[@id=\"sortable\"]/li");

		int size = Lists.size();
		System.out.println(size);
		
		
		WebElement fromElement = Lists.get(6);
		WebElement toElement = Lists.get(0);
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(fromElement).moveToElement(toElement).release(toElement).build().perform();


	}

}
