package UIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");

		String headingText = driver.findElement(By.cssSelector(".example h3")).getText();
		System.out.println(headingText);
        /**
         * In order to interact elements inside frames 
         * we have to switch inside frame then only we can interact with elments inside frame
         * 
         * 1) We have to come out of frame to interact with elements that are outside frame
         * 
         * 2) If we have not switched into frame and elemnt we want to interact is inside a frame;
         * we will get NoSuchElementException
         * 
         * There are three ways to switch inside frame
         * 1) By frame Id
         * 2) By frame webelement
         * 3) By frame index
         */
		/**
		 * here we are switching inside frame using frame id
		 */
		driver.switchTo().frame("mce_0_ifr");
		System.out.println("Going inside Frame");
		// driver.switchTo().frame(driver.findElement(By.xpath("//*[@title='Rich Text Area']")));
		// driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("#tinymce")).clear();
		/**
		 * DefaultContent is used to switch out of frame
		 */
		driver.switchTo().defaultContent();
		System.out.println("Coming out of frame");
		System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());

		driver.quit();

	}

}
