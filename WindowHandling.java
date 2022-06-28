package SeleniumAdv;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/Window.html");
		
		WebElement homeButton= driver.findElementById("home");
		homeButton.click();
		
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> handles = driver.getWindowHandles();
		
		for (String allWindows : handles) {
			
			driver.switchTo().window(allWindows);
			
		}
		
		
		driver.findElementByXPath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img").click();
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		
		
		WebElement MultiWindow =driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[2]/div/div/button");
		MultiWindow.click();
		
		Set<String> AllWindow = driver.getWindowHandles();
		int size = AllWindow.size();
		System.out.println("Number of windows opened is :"+size);
		
		
		 WebElement colorButton=  driver.findElementById("color");
		 colorButton.click();
		 
		 Set<String> windowHandles = driver.getWindowHandles();
		 
		 for(String EachWindow : windowHandles) {
			 
			 if(!EachWindow.equals(parentWindow)) {
				 
				 driver.switchTo().window(EachWindow);
				 driver.close();
				 
			 }
			
		}
		
			

	}

}
