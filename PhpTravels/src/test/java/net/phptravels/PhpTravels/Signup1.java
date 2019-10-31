package net.phptravels.PhpTravels;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Signup1 extends browser{
	public Signup1 () throws IOException {
		log=Logger.getLogger(Signup1.class);
		
	}
	
	
	
	@Test
	public void runsignup() throws IOException
	{
		signup s=new signup();
		log.info("Signup page");
		s.launchbrowser();
		s.My_account();
		s.Sign_up();
		s.firstname();
		s.lastname();
		s.email();
		s.password();
		s.confirm_password();

		s.signupbutton();
					

}
}