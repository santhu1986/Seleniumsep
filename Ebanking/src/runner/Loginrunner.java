package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"E:\\Mrngselaug\\Ebanking\\src\\Feature\\Login.feature",""
		+ "E:\\Mrngselaug\\Ebanking\\src\\Feature\\Role.feature"},
                  glue="stepdefination",monochrome=true,
                  plugin= {"pretty","json:Target/Reports/Role.json"})
public class Loginrunner
{

}
