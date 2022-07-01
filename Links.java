package seleniumAdv;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();


		WebElement homeLink=  driver.findElementByLinkText("Go to Home Page");
		homeLink.click();

		driver.navigate().back();

		WebElement SecondLink=driver.findElementByPartialLinkText("Find where");
		String newPage= SecondLink.getAttribute("href");
		System.out.println("The page will be redirected to :"+newPage);


		WebElement VerifyLink = driver.findElementByLinkText("Verify am I broken?");
		VerifyLink.click();

		String title = driver.getTitle();

		if(title.contains("404")) {

			System.out.println("Page is broken");
		}

		
		driver.navigate().back();
		
		
		List<WebElement> LinkNumbers= driver.findElementsByTagName("a");
		int size = LinkNumbers.size();
		
		System.out.println("Total number of links available is: "+size);
		

	}

}
