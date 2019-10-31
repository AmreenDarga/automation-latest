package net.phptravels.PhpTravels;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login1 extends browser{
	
	
	
  public Login1() throws IOException {
		log=Logger.getLogger(Login1.class);
	}

/*@BeforeTest
  public void LaunchBrowser_Login() throws IOException{
	  browser b= new browser();
	  
  }*/
  
  @Test
  public void run_Login() throws IOException
  {
	  login l=new login();
		l.launchbrowser();
		log.info("login page");
	   // driver.findElement(By.xpath("//*[@id=\"cookyGotItBtn\"]")).click();
		l.Login();
		l.email();
		l.Password();

		l.loginbutton();
		
  }
}
