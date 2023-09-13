package UIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes_Radiobuttons {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/checkbox");
		
		/**
		 * Click operation is used to check any checkbox and Radio Button
		 */
		WebElement checkBox=driver.findElement(By.xpath("//*[@class='rct-checkbox']"));
		checkBox.click();
		
		driver.findElement(By.xpath("//*[contains(text(),'Radio Button')]")).click();
		WebElement radioBtn = driver.findElement(By.xpath("//label[@for='yesRadio']"));
		radioBtn.click();

	}

}
