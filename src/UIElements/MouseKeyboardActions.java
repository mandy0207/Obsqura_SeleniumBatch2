package UIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboardActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		/**
		 * When ever we have to handle anything with mouse or keyboard actions
		 * 1) Create object of Actions class
		 * 2)Perform operations using various methods in this class
		 * 3) We always have to build and perform our actions in order to execute it
		 */
		Actions act = new Actions(driver);
		
		WebElement others = driver.findElement(By.id("others"));
		/***
		 * We are hovering over element others
		 */
		act.moveToElement(others).build().perform();
		
		WebElement messageInput = driver.findElement(By.cssSelector("#single-input-field"));
		/**
		 * Sending data in input field using keyboard actions
		 */
		act.moveToElement(messageInput).click().sendKeys("aparna").build().perform();
		
		WebElement showMsg = driver.findElement(By.cssSelector("#button-one"));
		/**
		 * Clicking on an element
		 */
		//act.moveToElement(showMsg).click().build().perform();
		/**
		 * Double click action
		 */
		act.moveToElement(showMsg).doubleClick().build().perform();
		//messageInput.clear();
		/**
		 * key chord is used to send a combination of keys
		 * here we are clearing text present in the input field using keyboard events
		 */
		messageInput.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);

		/**
		 * keydown is used to hold any key on the keyboard
		 * Here we are holding shift key
		 */
		act.moveToElement(messageInput).click().keyDown(Keys.SHIFT).sendKeys("aparna").build().perform();
		
        /**
         * context click is used to right click on any WebElement
         */
		act.moveToElement(showMsg).contextClick().build().perform();
	}

}
