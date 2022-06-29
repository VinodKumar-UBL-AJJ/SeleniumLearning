package seleniumAdv;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		
		WebElement DragElement = driver.findElementById("draggable");
		WebElement DropElement = driver.findElementById("droppable");
		
		
		Actions action = new Actions(driver);
		//action.clickAndHold(DragElement).moveToElement(DropElement).release(DropElement).build().perform();
		
		action.dragAndDrop(DragElement, DropElement).build().perform();
		
	
	}

}
