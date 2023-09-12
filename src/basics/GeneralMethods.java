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

	}

}
