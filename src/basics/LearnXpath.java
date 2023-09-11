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
		 * 1) //tagname[@attribute='value'] or //*[@attribute='value']
		 * 2) /parent//child[index]
		 * 3) //a[contains(text(),'Text')]    use when you have text present
		 * 4)  
		 * 
		 * 
		 */

	WebElement loginBtn=driver.findElement(By.xpath("//a[@class='ico-login']"));
	loginBtn.click();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("obsqura24@gmail.com");
	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("mypassword");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	driver.findElement(By.xpath("( //ul[@class='list'])[1]//li[4]//a")).click();
	
	driver.findElement(By.xpath("//a[contains(text(),'Blue Jeans')]")).click();
	
	WebElement qtyBox = driver.findElement(By.xpath("//input[contains(@id,'_EnteredQuantity')]"));
	qtyBox.clear();
	
	}

}
