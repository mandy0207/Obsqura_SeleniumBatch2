package basics;

import java.io.File;
import java.util.Arrays;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddBlock {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions ops = new ChromeOptions();
		ops.setExperimentalOption("excludeSwitches",
	    Arrays.asList("disable-popup-blocking"));
		ops.addExtensions(new File("C:\\Users\\msingh\\Desktop\\My Projects\\extension_3_19_0_0.crx"));
		
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		Thread.sleep(14000);
		driver.get("https://jagbani.punjabkesari.in/");
		System.out.println(driver.getTitle());
		

	}

}
