package net.phptravels.PhpTravels;

import org.testng.annotations.Test;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hotel1 extends browser{

		
		
	  public Hotel1() throws IOException {
			log=Logger.getLogger(Hotel1.class);
		}

	@BeforeTest
	  public void LaunchBrowser_Hotel() throws IOException{
		  browser b = new browser();
		  
	  }
	  
	  @Test
	  public void run_Hotel() throws IOException, InterruptedException
	  {
			Hotel h=new Hotel();
			log.info("Hotel booking");
			h.launchbrowser();
			h.Hotel_name();
			h.Check_in();
		    h.Check_out();
			h.AdultOption();
		
	  }
	}





