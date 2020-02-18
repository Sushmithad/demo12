package tours.tours;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Handson { //1st
  @Test(enabled=false)
  public void f() throws InterruptedException {
	  WebDriver driver;
	  driver=Stat123.gdriver("Ch");
	  driver.get("http://demowebshop.tricentis.com/");
	  WebElement se=driver.findElement(By.name("q"));
	  Actions act=new Actions(driver);
	  act.keyDown(se,Keys.SHIFT).sendKeys("computer").keyUp(Keys.SHIFT).build().perform();
	  Thread.sleep(8000);
	  act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
	  Thread.sleep(5000);
	  act.sendKeys(Keys.ENTER).build().perform();
  }
  
  @Test
  public void f1() throws InterruptedException
  {
	  WebDriver driver;
	  driver=Stat123.gdriver("Ch");
	  driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
      WebElement mo=driver.findElement(By.xpath("//span[text()='AboutUs']"));
	  Actions act1=new Actions(driver);
	  act1.moveToElement(mo).build().perform();
	  //Thread.sleep(3000);
	  WebElement mo1=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"));
	  act1.moveToElement(mo1).build().perform();
	  
	driver.findElement(By.xpath("//span[text()='Bangalore']")).click();
	Set<String> Add=driver.getWindowHandles();
	for(String S:Add)
	{
		driver.switchTo().window(S);
	    String S1=driver.getWindowHandle();
	}
	driver.switchTo().frame(driver.findElement(By.name("main_page")));
	WebElement El1=driver.findElement(By.xpath("//address[@id='demo3']"));
	String Address=El1.getText();
	System.out.println(Address);
	
	   
  }
  
}
