package tours.tours;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class pARAMETERISATION {
  @Test(dataProvider = "credentials")
	  
  public void login(String name, String password) {
	  WebDriver driv;
      System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Documents\\Selenium\\BrowserDrivers\\chromedriver.exe" );
      driv=new ChromeDriver();
      driv.get("http://172.31.36.202:443/TestMeApp/login.htm");
      driv.findElement(By.xpath("//input[@name='userName']")).sendKeys(name);
      driv.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
      driv.findElement(By.name("Login")).click();
      String E_title="Home";
      String A_title=driv.getTitle();
      Assert.assertEquals(A_title,E_title);	  
    
      
  }

  @DataProvider
  public Object[][] credentials() {
    return new Object[][] {
      new Object[] { "lalitha", "password123" },
      new Object[] { "Srini", "Password456" },
      new Object[] { "Swagatika", "Password13b" },
    };
  }
}
