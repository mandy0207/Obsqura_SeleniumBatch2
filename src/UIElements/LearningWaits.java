package UIElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearningWaits {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/dynamic-load.php");
		
		/**
		 * Implicit wait- Global Wait
		 */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.xpath("//button[@id='save']")).click();
		String name = driver.findElement(By.xpath("//h5[@class='card-title']")).getText();
		System.out.println(name);
		
		driver.findElement(By.xpath("//a[@id='progress-bars']")).click();
		
		driver.findElement(By.xpath("//button[@id='downloadButton']")).click();
		
		/**
		 * Explicit wait
		 */

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    By locator = By.xpath("//div[@class='progress-label']");
		wait.until(ExpectedConditions.textToBe(locator, "Complete!"));
		
//		By locator = By.xpath("//div[@class='ui-progressbar-value ui-corner-left ui-widget-header ui-progressbar-complete ui-corner-right']");
//		wait.until(ExpectedConditions.attributeContains(locator, "style", "width: 260px"));
		
		WebElement element=driver.findElement(By.xpath("//button[@class='ui-button ui-corner-all ui-widget']"));
		System.out.println(element.getText());
		element.click();
		
		driver.quit();
	}

}
