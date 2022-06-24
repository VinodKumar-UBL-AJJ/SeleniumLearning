package learning;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Edit.html");
		
		driver.manage().window().maximize();
		
		
		WebElement Box1 = driver.findElementById("email");
		Box1.sendKeys("vinodnk4771@gmail.com");
		
		
		WebElement Box2= driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[2]/div/div/input");
		Box2.sendKeys("TEST");
		
		WebElement Box3= driver.findElementByName("username");
		
		String DefaultText = Box3.getAttribute("value");
		
		System.out.println("Default text in Box3 is :"+DefaultText);
		
		
		WebElement Box4= driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[4]/div/div/input");
		Box4.clear();
		

		WebElement Box5= driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[5]/div/div/input");
		boolean status = Box5.isDisplayed();
		
		System.out.println("BOX5 is disabled :"+status);
	}

}
