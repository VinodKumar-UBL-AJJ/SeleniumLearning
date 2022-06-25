package learning;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		WebElement drop1= driver.findElementById("dropdown1");
		
		Select select = new Select(drop1);
		
		select.selectByIndex(1);
		
		
		WebElement drop2= driver.findElementByName("dropdown2");
		
		Select select2= new Select(drop2);
		
		select2.selectByVisibleText("Appium");
		
		
		WebElement drop3= driver.findElementById("dropdown3");
	
		Select select3 = new Select(drop3);
		select3.selectByValue("3");
		
		
		WebElement drop4=  driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[4]/select");
		
		Select select4= new Select(drop4);
		List<WebElement> options = select4.getOptions();
		int size = options.size();
		
		System.out.println("No. of options available :"+size);
		
		
		WebElement drop5= driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[5]/select");
		drop5.sendKeys("Selenium");
		
		
		
		WebElement drop6= driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[6]/select");
		
		Select select6= new Select(drop6);
		
		select6.selectByIndex(1);
		select6.selectByValue("2");
		
		
		
		

	}

}
