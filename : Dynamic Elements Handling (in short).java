import java.time.Duration; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.ExpectedConditions; 
import org.openqa.selenium.support.ui.WebDriverWait; 
public class s16 { 
public static void main(String[] args) { 
WebDriver driver=new ChromeDriver(); 
driver.get("https://store.steampowered.com/news/"); 
new
WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.elementToBe
Clickable(new By.ByXPath("//div[startswith(@class,'eventcalendar_FilterSettings')]//div[contains(., 'Options and 
Filters')]"))).click(); 
} 
} 
