package tours.tours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tours1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 WebDriver driv;
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Documents\\Selenium\\BrowserDrivers\\chromedriver.exe" );
	      driv=new ChromeDriver();
	      driv.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
          driv.findElement(By.linkText("SignUp")).click();
          WebElement sr=driv.findElement(By.xpath("//select[@id='securityQuestion']"));
          Select Sel=new Select(sr);
          Sel.selectByValue("411013");
          
          
          
	}

}
