package Mappingcodecucumberrr;



import java.util.Hashtable;

import Support.Operations;
import Utility.HTMLReportGenerator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CodeeOfFeatureFile 
{
	

	@Given("User open {string} browser with exe {string}")
	public void user_open_browser_with_exe(String string, String string2)
	{
		Object input[] = new Object [2];
	       input[0]=string;
	       input[1]=   string2;
	     Operations.browserLaunch(input);
	  
	}

	@Given("User open url as {string}")
	public void user_open_url_as(String string) 
	{
		  Object input1 [] = new Object [1];
          input1[0]=string;
          Operations.openApplication(input1);
	  
	}

	@When("user add synchronization")
	public void user_add_synchronization() 
	{
		
	
		 Hashtable<String,Object> output9 =  Operations.implicitWaittt();
         HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"user add synchronization", output9.get("MESSAGE").toString());
         
	}

	@When("user click on cancel button")
	public void user_click_on_cancel_button()
	{
		 Object input2 [] = new Object [1];
	        input2[0]="//*[@class='_2KpZ6l _2doB4z']";
	       
	        Hashtable<String,Object> output2 =  Operations.windowMini(input2);
	         HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),"user click on cancel button", output2.get("MESSAGE").toString());
	         
	
	}

	@When("user move on login dropdown")
	public void user_move_on_login_dropdown() throws Throwable 
	{
	     Thread.sleep(5000);
         Object input3[] = new Object [1];	
	        input3[0]="//*[@class='_1_3w1N']";
	        Hashtable<String,Object> output3 =    Operations.move(input3);
	        HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"user move on login dropdown", output3.get("MESSAGE").toString());
	         
	}

	@When("user click on my profile")
	public void user_click_on_my_profile() throws Throwable 
	{
	     Object input4[] = new Object [1];
         input4[0]="(//*[@class='_3vhnxf'])[1]";
         Hashtable<String,Object> output4 =  Operations.move1(input4);
         HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"user click on my profile", output4.get("MESSAGE").toString());
         
	}

	@When("user enter {string} as username")
	public void user_enter_as_username(String string) 
	{
		 Object input5[] = new Object [2];
         input5[0]="(//*[@type='text'])[2]";
         input5[1]= string;                           
         Hashtable<String,Object> output5 =  Operations.login(input5);
         HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "user enter {string} as username", output5.get("MESSAGE").toString());
	}

	@When("user enter {string} as password")
	public void user_enter_as_password(String string) 
	{
		Object input6[] = new Object [2];
        input6[0]="//*[@type='password']";
        input6[1]=string;                           
        Hashtable<String,Object> output6 = Operations.login(input6);
        HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "user enter {string} as password", output6.get("MESSAGE").toString());

	
	}

	@Then("user click on login button")
	public void user_click_on_login_button() 
	{
		 Object input7[] = new Object [1];
         input7[0]="(//*[@type='submit'])[2]";
         Hashtable<String,Object> output7 =    Operations.login1(input7);
         HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "user click on login button", output7.get("MESSAGE").toString());

	}

	@Then("application shows user profile to user")
	public void application_shows_user_profile_to_user() 
	{
		  Object input8[] = new Object [2];
          input8[0]="//*[@class='_14mvAI']";
          input8[1]="Hello";
          Hashtable<String,Object> output8 =   Operations.text(input8);
          HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "application shows user profile to user", output8.get("MESSAGE").toString());

	}

}
