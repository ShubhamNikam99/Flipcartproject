package Mappingcodecucumberrr;

import java.util.Hashtable;

import Support.Operations;
import Utility.HTMLReportGenerator;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageAddr 
{

	
	@When("user click on manage address")
	public void user_click_on_manage_address() 
	{
		 Object input1[] = new Object [1];
         input1[0]="(//*[@class='NS64GK'])[1]";
         Hashtable<String,Object> output1 =  Operations.login1(input1);
         HTMLReportGenerator.StepDetails(output1.get("STATUS").toString(),"user click on manage address", output1.get("MESSAGE").toString());
         
		
	}

	@When("user click on add adress")
	public void user_click_on_add_adress() 
	{
		 Object input2[] = new Object [1];
         input2[0]="//*[@class='_2KpZ6l _3lI646 _3dESVI']";
         Hashtable<String,Object> output2 =  Operations.login1(input2);
         HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),"user click on add adress", output2.get("MESSAGE").toString());
         
	
	}

	@When("user add name as {string}")
	public void user_add_name_as(String string) 
	{
		  Object input3[] = new Object [2];
          input3[0]="(//*[@class='_1w3ZZo _2mFmU7'])[1]";
          input3[1]= "Shubham";                           //name
          Hashtable<String,Object> output3 =  Operations.login(input3);
          HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"user add name as {string}", output3.get("MESSAGE").toString());

	}

	@When("user add number as {string}")
	public void user_add_number_as(String string) 
	{

		 Object input4[] = new Object [2];
         input4[0]="//*[@name='phone']";
         input4[1]= "9359363302";                           //number
         Hashtable<String,Object> output4 =  Operations.login(input4);
         HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"\"user add number as {string}\"", output4.get("MESSAGE").toString());


	}
	
	@When("user add pincode as {string}")
	public void user_add_pincode_as(String string) 
	{
		 Object input5[] = new Object [2];
         input5[0]="//*[@name='pincode']";
         input5[1]= "414601";                           //pincode
         Hashtable<String,Object> output5 =  Operations.login(input5);
         HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"user add pincode as {string}", output5.get("MESSAGE").toString());


	    
	}

	@When("user add localityr as {string}")
	public void user_add_localityr_as(String string) 
	{
		 Object input6[] = new Object [2];
         input6[0]="(//*[@class='_1w3ZZo _2mFmU7'])[4]";
         input6[1]= "Pimpalgaon Malvi";                           //locality
         Hashtable<String,Object> output6 =  Operations.login(input6);
         HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"user add localityr as {string}", output6.get("MESSAGE").toString());


	}

	@When("user add adress as {string}")
	public void user_add_adress_as(String string) 
	{
		 Object input7[] = new Object [2];
         input7[0]="//*[@name='addressLine1']";
         input7[1]= "Pimpalgaon Malvi Ahmednagar";                           //Adress
         Hashtable<String,Object> output7 =  Operations.login(input7);
         HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"user add adress as {string}", output7.get("MESSAGE").toString());



	}

	@When("user select address type as Home")
	public void user_select_address_type_as_home() 
	{
		 Object input8[] = new Object [1];
         input8[0]="(//*[@class='_2Fn-Ln _3iI7Qn'])[1]";
         Hashtable<String,Object> output8 =  Operations.login1(input8);
         HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"user select address type as Home", output8.get("MESSAGE").toString());
         
	}

	@When("user click on save")
	public void user_click_on_save() 
	{
		 Object input9[] = new Object [1];
         input9[0]="(//*[@type='button'])[2]";
         Hashtable<String,Object> output9 =  Operations.login1(input9);
         HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"user click on save", output9.get("MESSAGE").toString());
         
       }

	@Then("validate if address is added successfully")
	public void validate_if_address_is_added_successfully() 
	{
		  Object input10[] = new Object [2];
          input10[0]="	//*[@class='_3CfVDh']";
          input10[1]="Shubham";
          Hashtable<String,Object> output10 =  Operations.text(input10);
          HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(),"validate if address is added successfully", output10.get("MESSAGE").toString());
      

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
