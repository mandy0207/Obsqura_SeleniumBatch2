package UIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		/**
		 * Way to cast driver to JSE
		 */
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		WebElement textBox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement msgBtn=driver.findElement(By.id("button-one"));
		/**
		 * we can send data into any text field using JSE 
		 */
		js.executeScript("arguments[0].value='Sajitha is a good girl';", textBox);
		
		/**
		 * way to click on any WebElement using JSE
		 */
		js.executeScript("arguments[0].click();", msgBtn);
		

		

	}

}
