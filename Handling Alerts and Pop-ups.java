import org.openqa.selenium.Alert; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
public class s19 { 
public static void main(String[] args)throws Exception { 
 WebDriver driver=new ChromeDriver(); 
driver.manage().window().maximize(); 
driver.get("https://www.hyrtutorials.com/p/alertsdemo.html"); 
 
driver.findElement(By.id("alertBox")).click(); 
 Alert simpleAlert = driver.switchTo().alert(); 
 System.out.println(simpleAlert.getText()); 
 Thread.sleep(1000); 
simpleAlert.accept(); 
 System.out.println(driver.findElement(By.id("output")).getText()); 
driver.findElement(By.id("confirmBox")).click(); 
 Alert confirmationAlert=driver.switchTo().alert(); 
 System.out.println(confirmationAlert.getText()); 
 Thread.sleep(2000); 
confirmationAlert.dismiss(); 
 Thread.sleep(2000); 
 System.out.println(driver.findElement(By.id("output")).getText()); 
driver.findElement(By.id("promptBox")).click(); 
 Alert promptAlert=driver.switchTo().alert(); 
 System.out.println(promptAlert.getText()); 
promptAlert.sendKeys(" "); 
promptAlert.accept(); 
 System.out.println(driver.findElement(By.id("output")).getText()); 
driver.quit();}}
