package net.phptravels.PhpTravels;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flight1 extends browser{

	  public Flight1() throws IOException {
			log=Logger.getLogger(Flight1.class);
		}

	@BeforeTest
	  public void LaunchBrowser_Flight() throws IOException{
		  browser b= new browser();
		  
	  }
	  
	  @Test
	  public void run_Hotel() throws IOException, InterruptedException
	  {	
		Flight f=new Flight();
		log.info("Flight page");
		f.launchbrowser();
		f.Flight();
		f.Source_name();
		f.Destination_name();
		f.Departure_date();
		//f.roundtrip();
		//f.Return_date();
		f.AdultOption();
		Thread.sleep(1000);
		
	  }
	}
