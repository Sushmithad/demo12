package tours.tours;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driv;
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Documents\\Selenium\\BrowserDrivers\\chromedriver.exe" );
	      driv=new ChromeDriver();
	      driv.get("http://demowebshop.tricentis.com/");
	      driv.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	      List<WebElement> t_links=driv.findElements(By.tagName("a"));
	      int n_links=t_links.size();	
	      System.out.println(n_links);
	      for(int i=0;i<n_links;i++)
	      {
	    	  String l_linkname=t_links.get(i).getText();
	    	  System.out.println("The "+i +"th " + "link is :"+l_linkname);	    	  
	      }
	      
	      }

}
