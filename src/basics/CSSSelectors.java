package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectors {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		/**
		 * 1) If we have class attribute for any webElement css syntax would be=
		 * .className 
		 * 2) If we have Id attribute for any webElement css syntax would be
		 * hash following id= #Id 
		 * 3) If we have multiple classes for class attribute ;
		 * replace space with dot(.) (refer line 24) 
		 * 4) General sybtax for css = Tagname[attribute='Value'] or [attribute='Value'] (Tagname is optional)
		 * 
		 * 5) Regular path syntaxt= Tagname[attribute*='value'] 
		 */

		driver.findElement(By.cssSelector(".ico-login")).click();
		driver.findElement(By.cssSelector(".email")).sendKeys("obsqura24@gmail.com");
		driver.findElement(By.cssSelector("#Password")).sendKeys("mypassword");
		// driver.findElement(By.cssSelector(".button-1.login-button")).click();
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();

		/**
		 *1)  [class='block block-category-navigation'] div:nth-child(2) ul li:nth-child(4)
		 *2)  .block-category-navigation .list li:nth-child(4)
		 *3)   ul[class='list'] li:nth-child(4) a
		 */
		driver.findElement(By.cssSelector(".block-category-navigation .list li:nth-child(4)")).click();
		
		String text = driver.findElement(By.cssSelector("[class*='current-item']")).getText();
		System.out.println(text);
		

	}

}
