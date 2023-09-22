package UIElements;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.obsqurazone.com/");
		/**
		 * 1) cast the driver with TakesScreenshot interface
		 * 2) use getScreenshot method to grab screenshot as a file
		 * 3) Copy file to destination 
		 */
		
	
		TakesScreenshot scrshot=(TakesScreenshot)driver;
		File srcfile = scrshot.getScreenshotAs(OutputType.FILE);
		File destfile = new File(System.getProperty("user.dir")+"\\Screenshot\\screenshot.png");
		FileUtils.copyFile(srcfile, destfile);
		
		driver.quit();
	
	}

}
