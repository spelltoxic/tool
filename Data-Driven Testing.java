import java.time.Duration; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.Assert; 
import org.testng.annotations.AfterMethod; 
import org.testng.annotations.BeforeMethod; 
import org.testng.annotations.Test; 
public class Datadriven { 
 WebDriver driver; 
@BeforeMethod
public void setUp()throws InterruptedException 
 { driver=new ChromeDriver(); 
driver.get("https://www.makemytrip.com/railways/"); 
driver.manage().window().maximize(); 
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
 } 
@Test
public void verifyTitle()throws InterruptedException 
 { Thread.sleep(2000); 
 boolean
flag=driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div[2]/
div/div[1]/label/span")).isDisplayed(); 
 Assert.assertTrue(flag); 
 } 
@Test
public void verifyLogo()throws InterruptedException 
 { Thread.sleep(2000); 
boolean
flag=driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/a/picture/img"))
.isDisplayed(); 
 Assert.assertTrue(flag); 
 } 
@AfterMethod
public void tearDown() 
 { 
driver.quit(); 
 }}
