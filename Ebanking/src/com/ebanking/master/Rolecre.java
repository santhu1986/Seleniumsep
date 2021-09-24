package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Rolecre
{

	//Element Properties
	
		@FindBy(id="txtRname")
		WebElement Rname;
		
		@FindBy(id="lstRtypeN")
		WebElement Rty;
		
		@FindBy(xpath=".//*[@id='btninsert']")
		WebElement Sub;
		
		//Element Method
		
		public void Rcre(String Rn,String Rtype) 
		{
		Rname.sendKeys(Rn);
		
		Select Rt=new Select(Rty);
		Rt.selectByVisibleText(Rtype);
		Sub.click();
		
		}
}
