package seleniumAdv;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLab {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();


		driver.findElementById("user-name").sendKeys("standard_user");
		driver.findElementById("password").sendKeys("secret_sauce");
		driver.findElementById("login-button").click();


		List<WebElement> items= driver.findElementsByXPath("//div[@id='inventory_container'][@class='inventory_container']/child::div/div");
		int size = items.size();
		System.out.println(size);

		List<WebElement> labels = driver.findElementsByXPath("//div[@class='inventory_item_label']/a");

		for (WebElement webElement : labels) {
			String text = webElement.getText();
			System.out.println(text);
			if(text.equals("Sauce Labs Fleece Jacket")) {
				webElement.click();
				break;
			}

		}
		//Print the item names
		WebElement addCart= driver.findElementById("add-to-cart-sauce-labs-fleece-jacket");
		WebElement labelName = driver.findElementByXPath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]");
		String text = labelName.getText();
		if(text.equals("Sauce Labs Fleece Jacket")) {
			addCart.click();
			System.out.println("Fleece Jacket click proper");
		}


		driver.findElementByXPath("//*[@id=\"shopping_cart_container\"]").click();
		driver.findElementById("checkout").click();
		driver.findElementById("first-name").sendKeys("Vinod");
		driver.findElementById("last-name").sendKeys("Kumar");
		driver.findElementById("postal-code").sendKeys("600002");
		driver.findElementById("continue").click();
		driver.findElementById("finish").click();
		
		String text2 = driver.findElementByXPath("//div[@id='checkout_complete_container']/h2").getText();
		System.out.println(text2);

	}
}


