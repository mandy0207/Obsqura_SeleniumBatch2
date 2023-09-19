package UIElements;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/date-picker.php");
		driver.findElement(By.xpath("(//*[@class='input-group-append'])[1]")).click();
		WebElement month = driver.findElement(By.xpath("(//*[@class='datepicker-switch'])[1]"));
		
		
		
		while(!month.getText().contains("January")) {
			driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
		}
		
		List<WebElement> days = driver.findElements(By.cssSelector(".day"));
		
		for(WebElement day: days) {
			if(day.getText().equals("5")) {
				day.click();
				break;
			}
		}

	}

}
