package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");

		WebElement heading = driver.findElement(By.xpath("//*[@class='main-heading']"));
		/**
		 * Grab text inside any web element using getText() Method
		 */
		String headingText = heading.getText();
		System.out.println(headingText);
		/**
		 * grab tagname using below technique
		 */
		String tagName = heading.getTagName();
		System.out.println("Tagname=" + tagName);

		int numberofLinks = driver.findElements(By.tagName("a")).size();
		System.out.println(numberofLinks);
		
		/**
		 * grab any attribute value of any webElement
		 */

		WebElement hotel=driver.findElement(By.id("booking_engine_hotels"));
		System.out.println(hotel.getAttribute("title"));
		System.out.println(hotel.getAttribute("href"));
	
		/**
		 * ToolTip is nothing but having an attribute title and we just need to grab the
		 * value of that title attribute. That will become ToolTip
		 * 
		 */
		System.out.println("Tooltip:-"+hotel.getAttribute("title"));
		/**
		 * how to grab cssValue of any WebElement
		 */
		String colorCss=heading.getCssValue("color");
		String fontWeightCss=heading.getCssValue("font-weight");
		
		System.out.println(colorCss);

		System.out.println(fontWeightCss);
		
		driver.quit();
	}

}
