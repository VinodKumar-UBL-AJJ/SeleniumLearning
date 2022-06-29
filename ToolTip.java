package seleniumAdv;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/tooltip.html");
		
		WebElement textBox= driver.findElementById("age");
		String toolTip = textBox.getAttribute("title");
		System.err.println("Tool tip text :"+toolTip);

	}

}
