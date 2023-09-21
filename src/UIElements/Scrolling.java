package UIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.obsqurazone.com/");
		
		/**
		 * Way to cast driver to JSE
		 */
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		/**
		 * scroll up until particular pixels
		 */
		//js.executeScript("window.scrollBy(0,10000);");
		
		/**
		 * Scroll till bottom of the page
		 */
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
		
		WebElement desiredElement = driver.findElement(By.xpath("//a[@class='home-sec1-btn']"));
		
		/**
		 * This is how we can scroll using any webelement
		 */
		js.executeScript("arguments[0].scrollIntoView(true);",desiredElement);
		
		Thread.sleep(2000);
		/**
		 * This is how we can scroll on the top using - sign
		 */
		js.executeScript("window.scrollBy(0,-2000);");

	}

}
