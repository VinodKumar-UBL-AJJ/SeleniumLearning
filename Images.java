package seleniumAdv;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		
		//WebElement img1 = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img");
		//img1.click();
		
		WebElement img2 = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img");
		
		
		if (img2.getAttribute("naturalWidth").equals("0")) {
			
			System.out.println("Image is broken");
			
		}
			else {
				
				System.out.println("Image is not broken");
				
			}
			
		}
		
		
		
	//CSS PROPERTY : naturalWidth = 0 
		
		

	}


