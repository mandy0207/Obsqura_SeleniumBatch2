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
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/tables");
      
        List<WebElement> columns = driver.findElements(By.xpath("//*[@id='table1']/thead/tr/th"));
        System.out.println("Columns count=: "+columns.size());
        for(int i =0;i<columns.size();i++) {
        	if(columns.get(i).getText().equals("Due")) {
        		index=i+1;
        		break;
        	}
        }
        System.out.println(index);
        
        List<WebElement> rows = driver.findElements(By.xpath("//*[@id='table1']/tbody/tr"));
        System.out.println("Row Count= "+rows.size());
        for(WebElement row:rows) {
        	System.out.println(row.findElement(By.xpath("td["+ index+"]")).getText());
        }
      
        driver.quit();
	}
	
}
