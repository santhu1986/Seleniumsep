package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Adminlogin 
{

          WebDriver driver;

@Given("^User should on RanfordHome Page$")
public void user_should_on_RanfordHome_Page() throws Throwable 
{
   driver=new FirefoxDriver();
   driver.manage().window().maximize();
   driver.get("http://122.175.8.158/ranford2");
}

@When("^User enters \"(.*)\" and \"(.*)\" click on Login$")
public void user_enters_Username_Password_click_on_Login(String Un,String Pwd) throws Throwable 
{
	driver.findElement(By.id("txtuId")).sendKeys(Un);
	driver.findElement(By.id("txtPword")).sendKeys(Pwd);
	driver.findElement(By.xpath("//*[@id=\"login\"]")).click();

}

@Then("^User Validates Admin login$")
public void user_Validates_Admin_login() throws Throwable 
{
	String Expval="Welcome to Admin";
	
	String Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	
	//Comparision
	
	if (Expval.equalsIgnoreCase(Actval))
	{
	System.out.println("Admin Login Succ");	
	}
	else
	{
		System.out.println("Admin Login Failed");
	}

}


}
