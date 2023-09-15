package UIElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		
		driver.findElement(By.xpath("//*[@class='btn btn-success']")).click();
		
		/**
		 * In order to handle any javascript based alert we have to switch into Alert Mode
		 * we can perform following actions on alert
		 * 1) Get Text
		 * 2) Send Text
		 * 3) Accept Alert
		 * 4) Cancel or dismiss alert
		 */
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
		
		driver.findElement(By.xpath("//*[@class='btn btn-warning']")).click();
		Thread.sleep(2000);
		alert.dismiss();
		
		
		driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();
		Thread.sleep(2000);
		alert.sendKeys("My name is Mandy");
		alert.accept();
		
		driver.quit();

	}

}
