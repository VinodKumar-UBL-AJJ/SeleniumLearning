package seleniumAdv;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarAdv {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Calendar.html");
		driver.manage().window().maximize();
		
		WebElement textBox = driver.findElementById("datepicker");
		textBox.click();
		
		
		 WebElement MonYearValue= driver.findElementByClassName("ui-datepicker-title");
		 String MonthYearValue = MonYearValue.getText();
		 
		 
		 String month = MonthYearValue.split(" ")[0].trim();
		 String year = MonthYearValue.split(" ")[1].trim();
		 
		// System.out.println(month);
		// System.out.println(year);
		 
		 while(!(month.equals("April")&& year.equals("2024"))) {
			 
			 driver.findElementByXPath("//a[@title='Next']").click();
			 
			 MonthYearValue= driver.findElementByClassName("ui-datepicker-title").getText();
			 System.out.println(MonthYearValue);
			 month= MonthYearValue.split(" ")[0].trim();
			 year=MonthYearValue.split(" ")[1].trim();
			 
		 }
		 
		 
		 WebElement expectedDate = driver.findElementByXPath("//a[text()='9']");
		 expectedDate.click();
		 
		 
		 
	

	}

}
