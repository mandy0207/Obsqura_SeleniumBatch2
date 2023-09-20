package UIElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		
		List<WebElement> rowData = driver.findElements(By.xpath("//*[@id='dtBasicExample']//tbody//tr[7]//td"));
		
		for(WebElement data :rowData) {
			System.out.println(data.getText());
		}
		
		
		

	}

}
