import org.testng.annotations.Test; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
public class paralleltesting { 
 WebDriver driver=null; 
 @SuppressWarnings("deprecation") 
@Test
 public void test1() throws InterruptedException { 
 System.out.println("test1 executed " +Thread.currentThread().getId()); 
 driver =new ChromeDriver(); 
 driver.get("https://www.makemytrip.com/"); 
 Thread.sleep(2000); 
 } 
 @SuppressWarnings("deprecation") 
@Test
 public void test2() throws InterruptedException { 
 System.out.println("test1 executed " +Thread.currentThread().getId()); 
 driver =new ChromeDriver(); 
 driver.get("https://www.irctc.co.in/"); 
 Thread.sleep(2000); 
 }} 
