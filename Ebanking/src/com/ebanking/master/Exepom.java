package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exepom
{
	
	WebDriver driver;
	
	@BeforeTest
  public void login() throws InterruptedException
  {
		
	 driver=new FirefoxDriver();
		
		//maximise
		
		driver.manage().window().maximize();
		
		//URL
		
		driver.get("http://122.175.8.158/ranford2");
		
		//Pagefactory
		
		RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
		RHP.lgn();
		
  }
		
	//Role Creation
	
	@Test
	public void Rcreation() throws InterruptedException, IOException
	
	{
		
		//To get External File Excel
		
				FileInputStream Fis=new FileInputStream("E:\\Mrngselaug\\Ebanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
				
				//WorkBook
				
				XSSFWorkbook WB=new XSSFWorkbook(Fis);
				
				//Sheets
				
				XSSFSheet WS=WB.getSheet("Rdata");
				
				//Row Count
				
				int Rc=WS.getLastRowNum();
				System.out.println(Rc);
				
				//Multiple Iterations ---- For Loop
				
				for (int i=1;i<=Rc;i++)
				{
				    //Rows
					
					XSSFRow WR=WS.getRow(i);
					
					//Cell
					
					XSSFCell WC=WR.getCell(0);
					XSSFCell WC1=WR.getCell(1);
					
					XSSFCell WC2=WR.createCell(2);
					
					//Cell Values
					
					String Rname=WC.getStringCellValue();
					String Rty=WC1.getStringCellValue();
					
				
		
		AdminHP AHP=PageFactory.initElements(driver,AdminHP.class);
		AHP.Rol();
		
		Thread.sleep(3000);
		
		//New Role
		
		Roledetails RD=PageFactory.initElements(driver,Roledetails.class);
		RD.Newrol();
		
		//Role Creation
		
		Thread.sleep(3000);
		
		
		Rolecre RC=PageFactory.initElements(driver,Rolecre.class);
		RC.Rcre(Rname,Rty);
		
		Thread.sleep(3000);
		
		
		//Alert
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		//Home
		
		RD.Hom();
				}
	}
	
	@DataProvider    
	 
	 public Object [][] Rdata()
	 {
		 Object[][] Obj=new Object[3][2];
		 
		 Obj[0][0]="TestEnggaxz";
		 Obj[0][1]="E";
		 
		 Obj[1][0]="SeniorTEngg";
		 Obj[1][1]="E";
		 
		 Obj[2][0]="Testmanagerbn";
		 Obj[2][1]="E";
		 
		 return Obj;
		 
		}

	
}
	
	//	Thread.sleep(3000);
		
		//Branch
		
		//AHP.Br();
		
	
 