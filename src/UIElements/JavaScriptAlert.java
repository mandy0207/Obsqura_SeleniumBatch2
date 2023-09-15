package UIElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		
		driver.findElement(By.xpath("//*[@class='btn btn-success']")).click();
		
		/**
		 * In order to handle any javascript based alert we have to switch into Alert Mode
		 */
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();

	}

}
