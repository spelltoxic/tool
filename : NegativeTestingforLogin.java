import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
public class st11{ 
 
public static void main(String[] args) throws Exception{ 
 WebDriver driver=new ChromeDriver(); 
 driver.get("http://lms.nmit.ac.in/moodle/login/index.php"); 
 WebElement mailid=driver.findElement(By.id("username")); 
 mailid.sendKeys("1NT21CS"); 
 WebElement pass=driver.findElement(By.id("password")); 
 pass.sendKeys("**************"); 
 WebElement submit=driver.findElement(By.id("loginbtn")); 
 submit.submit(); 
 Thread.sleep(5000); 
 driver.quit(); 
 } 
} 
