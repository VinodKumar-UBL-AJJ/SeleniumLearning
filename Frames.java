package seleniumAdv;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/frame.html");
		
		
		driver.switchTo().frame(0);
		
		WebElement frame1 = driver.findElementById("Click");
		
		frame1.click();
		
		String text = frame1.getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement frame2= driver.findElementById("Click1");
		frame2.click();
		String text2 = frame2.getText();
		
		System.out.println(text2);

 
		driver.switchTo().defaultContent();
		
		List<WebElement> iframeCount= driver.findElementsByTagName("iframe");
		int size = iframeCount.size();
		System.out.println("Number of frames :"+size);
		
		

	}

}
