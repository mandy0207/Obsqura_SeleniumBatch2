package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		/**
		 * Syntaxes of Xpaths
		 * 1) //tagname[@attribute='value'] or //*[@attribute='value']
		 * 2) /parent//child[index]
		 * 3) //a[contains(text(),'Text')]    use when you have text present
		 * 4)  //tagname[contains(@attribute,'substringvalue')]   -- using regular expression
		 * 5) 
		 * 
		 */

	WebElement loginBtn=driver.findElement(By.xpath("//a[@class='ico-login']"));
	loginBtn.click();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("obsqura24@gmail.com");
	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("mypassword");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	driver.findElement(By.xpath("( //ul[@class='list'])[1]//li[4]//a")).click();
	
	//driver.findElement(By.xpath("//a[contains(text(),'Blue Jeans')]")).click();
	
	List<WebElement> productName = driver.findElements(By.xpath("//*[@class='product-title']//a"));
	
	System.out.println(productName.size());
	
	for(int i =0;i<productName.size();i++) {
		if(productName.get(i).getText().equals("Casual Golf Belt")) {
			productName.get(i).click();
			break;
		}
	}
	
	
	
	WebElement qtyBox = driver.findElement(By.xpath("//input[contains(@id,'_EnteredQuantity')]"));
	qtyBox.clear();
	qtyBox.sendKeys("4");
	
	driver.quit();
	
	
	}

}
