package UIElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		
		driver.findElement(By.xpath("//*[contains(@class,'-selection--multiple')]")).sendKeys("new");
	    List<WebElement> states = driver.findElements(By.xpath("//*[@class='select2-results__options']/li"));
        System.out.println(states.size());
      /**
       * older way of writing for loop
       */
        for(int i =0; i<states.size();i++) {
        	if(states.get(i).getText().equalsIgnoreCase("new hampshire")) {
        		states.get(i).click();
        		break;
        	}
        }
    
        
    /**
     * Modern way of for loop or enhanced for loop    
     */
//        for(WebElement state : states) {
//        	if(state.getText().equalsIgnoreCase("New Jersey")) {
//        		state.click();
//        		break;
//        	}
//        }
        
        driver.quit();
	}
}
