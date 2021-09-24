package com.ebanking.master;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sgrid 
{

	DesiredCapabilities cap;
	@Parameters("Browser")
	@Test
	public void gd(String Br) throws MalformedURLException, InterruptedException 
	
	{
		if (Br.equalsIgnoreCase("firefox"))
		{
			cap=new DesiredCapabilities();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
	    }
		else if (Br.equalsIgnoreCase("chrome"))
		{
			cap=new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
				
		}		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.44.1:4444/wd/hub"),cap);
		
       driver.manage().window().maximize();
		
		//URL
		
		driver.get("http://122.175.8.158/ranford2");
		
		//Pagefactory
		
		RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
		RHP.lgn();
		
		AdminHP AHP=PageFactory.initElements(driver,AdminHP.class);
		AHP.Rol();
		
		Thread.sleep(3000);
		
		//New Role
		
		Roledetails RD=PageFactory.initElements(driver,Roledetails.class);
		RD.Newrol();
		
		//Role Creation
		
		Thread.sleep(3000);
		
		
		Rolecre RC=PageFactory.initElements(driver,Rolecre.class);
		RC.Rcre("Tellerbv","E");
		
		Thread.sleep(3000);
		
		
		//Alert
		
		driver.switchTo().alert().accept();
		
	
		
	}
}
