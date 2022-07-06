package seleniumAdv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		//Get number of columns
		List<WebElement> column= driver.findElementsByTagName("th");
		int size = column.size();
		System.out.println("The number of column available is : "+size);
		
		//Get number of Rows
		List<WebElement> row= driver.findElementsByTagName("tr");
		int size2 = row.size();
		System.out.println("The number of row's available is :"+size2);
		
		//Get progress value of Learn Locators
		
		WebElement progress= driver.findElementByXPath("//td[normalize-space()='Learn Locators']//following::td[1]");
		String text = progress.getText();
		System.out.println("The progress value of Learn Locators is : "+text);
		
		
		//Find the lowest progress and check its vital task check box
		
		
		//Find the data in progress column
		List<WebElement> allProgress = driver.findElementsByXPath("//td[2]");
		
		//Store in Array List in the form of integer
		List<Integer> numberList= new ArrayList<Integer>();
		
		
		for (WebElement webElement : allProgress) {
			
			//Replace % with empty value to remove the % from the progress data
			String progressValue = webElement.getText().replace("%", "");
			//Covert string to integer
			int numValue = Integer.parseInt(progressValue);
			//add all the integer to numberList array
			numberList.add(numValue);
			
		}
		
		//print arrayList
		System.out.println("Final list : "+numberList);
		
		//Finding minimum value of integer
		int smallValue=Collections.min(numberList);
		System.out.println("Small value : "+smallValue);
		
		//convert integer to string and include % together for identifying the element in webpage
		String smallValueString = Integer.toString(smallValue)+"%";
		System.out.println(smallValueString);
		
	
		//xpath to locate the least progress vital task
		String xpath= "//td[normalize-space()='"+smallValueString+ "']//following::td";
		
		System.out.println(xpath);
		
		//check the least progress vital task
		WebElement checkBox = driver.findElementByXPath(xpath);
		checkBox.click();
		
		
	}

}
