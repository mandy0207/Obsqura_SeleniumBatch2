package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumCommands {

	public static void main(String[] args) throws InterruptedException {

		/**
		 * Driver Initilization Is responsible for opening a browser
		 */
		WebDriver driver = new ChromeDriver();

		// It will maximize the browser window
		driver.manage().window().maximize();

		/**
		 * is used to open any page or URL
		 */
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");

		/**
		 * Command to grab title of webpage
		 */
		String title = driver.getTitle();
		System.out.println(title);

		String Url = driver.getCurrentUrl();
		System.out.println("Url of my page : " + Url);

		Thread.sleep(2000);
		/**
		 * will always close the current window
		 *
		 */
		driver.close();

		/**
		 * will kill the driver & kill browser
		 */
		// driver.quit();
		

	}

}
