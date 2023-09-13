package UIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Methods {

	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		/**
		 * IsEnabled, IsSelected, IsDisplayed methods are used to check whether an element is interactble or not
		 * 
		 */
		WebElement checkBox = driver.findElement(By.xpath("//*[@id='gridCheck']"));
		
		boolean is_Selected=checkBox.isSelected();
		System.out.println("cheeckbox is selected :-"+is_Selected);
		checkBox.click();
	    is_Selected=checkBox.isSelected();
		System.out.println("cheeckbox is selected :-"+is_Selected);
		
		System.out.println("Is displayed: "+checkBox.isDisplayed());
		
		System.out.println("Is Enabled:"+checkBox.isEnabled());
		driver.quit();
		
	}
}
