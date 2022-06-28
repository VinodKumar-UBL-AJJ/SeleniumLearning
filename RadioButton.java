package learning;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		
		WebElement radio1=  driver.findElementById("yes");
		radio1.click();
		
		
		WebElement FirstButton = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[1]");
		WebElement secondButton = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[2]");
		
		
		boolean status1 = FirstButton.isSelected();
		
		boolean status2 = secondButton.isSelected();
		
		
		System.out.println("Fisrt radio button is selected :"+status1);
		
		System.out.println("Second radio button is selected :"+status2);
		
		driver.quit();
		
		
		

	}

}
