package tours.tours;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
	  driver=Stat123.gdriver("Ch");
	  driver.get("http://www.google.com");
	  WebElement s=driver.findElement(By.name("q"));
	  //s.sendKeys("accenture");
	  Actions act=new Actions(driver);
	  act.keyDown(s,Keys.SHIFT).sendKeys("accenture").keyUp(Keys.SHIFT).build().perform();
	  Thread.sleep(5000);
	  act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
	  act.sendKeys(Keys.ENTER).build().perform();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
