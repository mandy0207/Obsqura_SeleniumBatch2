package demoJava;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Trick2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/date-picker.php");
		driver.findElement(By.xpath("(//*[@class='input-group-append'])[1]")).click();
		
		
		WebElement month = driver.findElement(By.xpath("(//*[@class='datepicker-switch'])[1]"));
		month.click();
		WebElement year = driver.findElement(By.xpath("(//*[@class='datepicker-switch'])[2]"));
		String currentYear=year.getText();
		int cy=Integer.parseInt(currentYear);
		String reqdYear= "2035";
		
		while (!year.getText().contains(reqdYear)) {
			if(cy<Integer.parseInt(reqdYear)) {
				driver.findElement(By.xpath("(//th[@class='next'])[2]")).click();
			}
			else {
				
				driver.findElement(By.xpath("(//th[@class='prev'])[2]")).click();
			}
			
		}

	}

}
