package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Rolecre 
{
	WebDriver driver;
	
	@Given("^Tester should on Ranford Home Page$")
	public void tester_should_on_Ranford_Home_Page() throws Throwable 
	{
		 driver=new FirefoxDriver();
		   driver.manage().window().maximize();
		   driver.get("http://122.175.8.158/ranford2");

		
	}

	@When("^Tester Enters Username and Password$")
	public void tester_Enters_Username_and_Password() throws Throwable 
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Testing@");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();

	}

	@When("^Tester click on Role button$")
	public void tester_click_on_Role_button() throws Throwable 
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
	}

	@Then("^Tester click New Role and enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void tester_click_New_Role_and_enters_and(String Rname, String Rty) throws Throwable 
	{
		driver.findElement(By.xpath(".//*[@id='btnRoles']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("txtRname")).sendKeys(Rname);
		driver.findElement(By.id("lstRtypeN")).click();
		driver.findElement(By.id("lstRtypeN")).sendKeys(Rty);
		driver.findElement(By.xpath(".//*[@id='btninsert']")).click();
		Thread.sleep(4000);
	     driver.switchTo().alert().accept();
	     Thread.sleep(4000);
	     driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
	     
	}

	@Then("^Tester close the Application$")
	public void tester_close_the_Application() throws Throwable 
	{
	driver.close();
	}


}
