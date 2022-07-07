package seleniumAdv;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Ecomm {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		Actions action= new Actions(driver);
		WebElement woman = driver.findElementByXPath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
		action.moveToElement(woman).build().perform();
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a").click();
		Thread.sleep(2000);

		driver.findElementById("layered_id_attribute_group_3").click();
		Thread.sleep(5000);
		WebElement quickView=	driver.findElementByXPath("//div[@class='product-image-container']");
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("arguments[0].scrollIntoView();", quickView);
		action.moveToElement(quickView).click().build().perform();
		Thread.sleep(6000);

		driver.switchTo().frame(0);
		WebElement size= driver.findElementByXPath("//select[@id='group_1']");

		String text=	size.getText();
		System.out.println(text);

		Select select = new Select(size);
		select.selectByVisibleText("L");

		driver.findElementByXPath("//p[@id='add_to_cart']/button").click();
		driver.switchTo().defaultContent();
		driver.findElementByXPath("//a[@class='btn btn-default button button-medium']").click();







	}

}
