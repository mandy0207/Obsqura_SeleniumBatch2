package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		/**
		 * Selenium uses various kind of locators
		 * 
		 * we are using Id, name, className, LinkText, PartialLinktext
		 */
		/**
		 * Sendkeys is used to feed any value inside WebElement 
		 */
		
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.className("submit-button")).click();
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("About")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.findElement(By.partialLinkText("Logo")).click();

		driver.close();
	}

}
