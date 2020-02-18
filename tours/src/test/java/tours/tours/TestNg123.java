package tours.tours;

import org.testng.annotations.Test;

public class TestNg123 {
	  @Test(priority=2)
	  public void login()
	  {
		  System.out.println("loginn");
	  }
	  @Test(priority=1)
	  public void Registration()
	  {
		  System.out.println("Registrationnnn");
	  }
	  @Test(priority=3)
	  public void logout()
	  {
		  System.out.println("logouttt");
	  }

	
}
