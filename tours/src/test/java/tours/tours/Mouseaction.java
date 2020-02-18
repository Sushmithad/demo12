package tours.tours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouseaction {
  @Test(enabled=false)
  public void f() throws InterruptedException {
	  WebDriver drive;
	  drive=Stat123.gdriver("Ch");
	  drive.get("https://www.spicejet.com/default.aspx");
	  WebElement mo=drive.findElement(By.xpath("//a[@id='highlight-addons']"));
	  Actions ac=new Actions(drive);
	  ac.moveToElement(mo).build().perform();
	  Thread.sleep(5000);
	  drive.findElement(By.xpath("//a[text()='MyFlexiPlan']")).click();
	  
	  
  }
  @Test(enabled=false)
  public void doubleclick()
  {
	  WebDriver drive;
	  drive=Stat123.gdriver("Ch");
	  drive.get("https://www.google.com");
	  WebElement el1=drive.findElement(By.xpath("//a[text()='Gmail']"));
	  Actions act1=new Actions(drive);
	  act1.contextClick(el1).build().perform();
	  
  }
  @Test(enabled=false)
  public void rightclick()
  {
	  WebDriver drive;
	  drive=Stat123.gdriver("Ch");
	  drive.get("http://demowebshop.tricentis.com/");
	  WebElement el2=drive.findElement(By.xpath("//span[text()='Sign up for our newsletter:']"));
	  Actions act2=new Actions(drive);
	  act2.doubleClick(el2).build().perform();
	  String s1=el2.getText();
  }
  @Test
  public void frame()
  {
	  WebDriver drive;
	  drive=Stat123.gdriver("Ch");
	  drive.get("https://www.w3schools.com/Js/tryit.asp?filename=tryjs_alert");
	  
	  drive.switchTo().frame(drive.findElement(By.className("iframeResult")));
	  drive.findElement(By.xpath("//button[text()='Try it']")).click();
	  drive.switchTo().defaultContent();//to come out from frame
  }
  
}

