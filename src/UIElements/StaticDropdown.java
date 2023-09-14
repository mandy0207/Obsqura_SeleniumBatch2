package UIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		
		WebElement dropdown = driver.findElement(By.id("single-input-field"));
		
		/**
		 *1) First we have to create object of select class
		 *2) Pass the dropdown webElement as an argument for select class
		 *3) Apply various methods to select element
		 *   selectByVisibleText, selectByIndex, selectByVlaue
		 */

		Select staticDropdown = new Select(dropdown);
		staticDropdown.selectByVisibleText("Green");
		
		Thread.sleep(2000);
		staticDropdown.selectByValue("Yellow");
		
		Thread.sleep(2000);
		staticDropdown.selectByIndex(1);
		
	
		
		driver.quit();
		
		
	}

}
