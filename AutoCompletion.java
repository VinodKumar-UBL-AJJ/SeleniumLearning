package seleniumAdv;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletion {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/autoComplete.html");

		driver.manage().window().maximize();

		WebElement input= driver.findElementById("tags");
		input.sendKeys("S");

		Thread.sleep(3000);

		List<WebElement> optionList = driver.findElementsByXPath("//*[@id=\"ui-id-1\"]/li");
		int size = optionList.size();
		System.out.println(size);


		for (WebElement webElement : optionList) {

			if (webElement.getText().equals("Web Services")) {

				webElement.click();

				break;

			}

		}


	}

}
