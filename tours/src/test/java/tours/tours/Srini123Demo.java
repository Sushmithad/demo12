package tours.tours;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Srini123Demo {
  @Test(dataProvider = "creds")
  public void f(String n, String s) {
	  System.out.println("this time user name is : " + n);
	  System.out.println("this time user name is : " + s);  
  }

  @DataProvider
  public Object[][] creds() {
    return new Object[][] {
      new Object[] { "demo", "Pass5464" },
      new Object[] { "tet56456", "Pass546454" },
    };
  }
}
