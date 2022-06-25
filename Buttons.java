package learning;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();

		driver.get("http://leafground.com/pages/Button.html");

		driver.manage().window().maximize();


		WebElement Button2= driver.findElementById("position");
		Point XY_Location = Button2.getLocation();
		int x = XY_Location.getX();
		int y = XY_Location.getY();

		System.out.println("X position is :"+x);
		System.out.println("Y postion is :"+y);

		WebElement Button3= driver.findElementById("color");
		String Button3_color = Button3.getCssValue("background-color");

		System.out.println("Color of a button :"+Button3_color);

		WebElement Button4= driver.findElementById("size");
		int height = Button4.getSize().getHeight();
		int width = Button4.getSize().getWidth();


		System.out.println("Height of a button :"+height);
		System.out.println("Width of a button :"+width);

		WebElement Button1 = driver.findElementById("home");
		Button1.click();

	}

}
