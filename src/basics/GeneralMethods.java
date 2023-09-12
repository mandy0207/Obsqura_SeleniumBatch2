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
		
		WebElement heading = driver.findElement(By.xpath("//span[@class='main-heading']"));
		/**
		 * Grab text inside any web element using getText() Method
		 */
		String headingText= heading.getText();
		System.out.println(headingText);

	}

}
