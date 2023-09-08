package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		/**
		 * Sendkeys is used to feed any value inside WebElement 
		 */
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		

	}

}
