package learning;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();

		driver.get("http://leafground.com/pages/checkbox.html");

		driver.manage().window().maximize();


		WebElement java= driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[1]/input[1]");
		java.click();


		WebElement checkbox2 = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[2]/input");

		boolean selected = checkbox2.isSelected();

		System.out.println("Check box is selected :"+selected);


		WebElement firstElement= driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[3]/input[1]");
		WebElement secondElement= driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[3]/input[2]");

		if(firstElement.isSelected()) {
			firstElement.click();
		}
	
		if (secondElement.isSelected()) {
			
			secondElement.click();
		}



	}

}
