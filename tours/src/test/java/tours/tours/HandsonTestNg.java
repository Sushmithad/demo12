package tours.tours;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class HandsonTestNg {
  @Test(dataProvider = "dp")
  public void f(String fn,String ln,String email,String pass, String cp) {
	  WebDriver driv;
	  driv=Stat123.gdriver("Ch");
	  driv.get("http://demowebshop.tricentis.com/");
	  driv.findElement(By.linkText("Register")).click();
	  driv.findElement(By.name("FirstName")).sendKeys(fn);
	  driv.findElement(By.name("LastName")).sendKeys(ln);
	  driv.findElement(By.id("Email")).sendKeys(email);
	  driv.findElement(By.name("Password")).sendKeys(pass);
	  driv.findElement(By.id("ConfirmPassword")).sendKeys(cp);
	  driv.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
	  String E_title="Demo Web Shop. Register";
	  String A_title=driv.getTitle();
	  Assert.assertEquals(A_title, E_title);
	  
	  
	  
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "nandini","bandaru","khgfjf@gmail.com","rsdedf","rsdedf"},
      new Object[] { "srija","chinthanippu","gahdfwydf@gmail.com","abcdefg","abcdefg"},
      new Object[] { "sri","chint","gahdff@gmail.com","abcgty","abcgty"},
    };
  }
}
