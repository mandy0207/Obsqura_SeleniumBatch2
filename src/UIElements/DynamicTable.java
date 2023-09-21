package UIElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicTable {

	static int index;
	public static void main(String[] args) {
        ChromeOptions opts = new ChromeOptions();
        opts.setBinary("C:\\Users\\msingh\\Desktop\\Chrome 115x\\chrome-win64//Chrome.exe");
        
        WebDriver driver = new ChromeDriver(opts);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/tables");
      
      
	}
	
}
