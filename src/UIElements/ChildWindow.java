package UIElements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Click Here")).click();
		/**
		 * In order to grab window handle of any window we have to shift to that particular window
		 * 
		 */
		/**
		 * Here we are getting all window handles and using itertaor to grab window handles
		 */
	     Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		/**
		 * here we are iterating with iterator to grab windows
		 */
		String parentWindow = it.next();
		String childWindow = it.next();
		
		/**
		 * here we are switching to particular window
		 */
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		/**
		 * will close the current window i.e child window
		 */
		driver.close();
		/**
		 * shifting back to parent window
		 */
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}
