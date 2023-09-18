package UIElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
	String headingText = driver.findElement(By.cssSelector(".example h3")).getText();
	System.out.println(headingText);
	
	 driver.findElement(By.cssSelector("#tinymce")).clear();

	}

}
