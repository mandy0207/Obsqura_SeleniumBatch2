package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		/**
		 * Syntaxes of Xpaths
		 * 1) //tagname[@attribute='value']
		 * 2)
		 * 
		 * 
		 */

	WebElement loginBtn=	driver.findElement(By.xpath("//a[@class='ico-login']"));
	loginBtn.click();
	
	}

}
