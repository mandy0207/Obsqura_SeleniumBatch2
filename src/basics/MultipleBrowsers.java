package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowsers {

	public static void main(String[] args) {
		WebDriver driver = null;
		
		String browserName = "Chrome";
		
		if(browserName.equals("Chrome")) {
			 driver = new ChromeDriver();
		}
		
		else if(browserName.equals("Edge")) {
			 driver = new EdgeDriver();
		}
		else if(browserName.equals("Firefox")) {
		 driver = new FirefoxDriver();
		}
		
		else {
			System.out.println("Please choose Correct driver");
		}
		
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.quit();

	}

}
