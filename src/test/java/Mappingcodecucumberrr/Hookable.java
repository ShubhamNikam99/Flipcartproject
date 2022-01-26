package Mappingcodecucumberrr;

import java.net.UnknownHostException;

import Utility.HTMLReportGenerator;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hookable 
{

	@Before
	public void before (Scenario scenario) throws UnknownHostException
	{
		HTMLReportGenerator.TestSuiteStart("D:\\Automation Support\\flipcart.html", "FlipcartProject");
		HTMLReportGenerator.TestCaseStart(scenario.getName(),scenario.getId());
		System.out.println("---------Scenario start---------");
	
		
	}
	
	
@After
    public void after (Scenario scenario)
    {
	
	System.out.println("---------Scenario end---------");

	HTMLReportGenerator.TestCaseEnd();
	HTMLReportGenerator.TestSuiteEnd();
	
      }
	
	
	
	
}
