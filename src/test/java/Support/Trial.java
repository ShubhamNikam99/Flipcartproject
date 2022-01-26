package Support;

public class Trial 
{

	   public static void main(String[]args) throws Throwable
		{
			//browser launch
			Object input[] = new Object [2];
			       input[0]="Chrome";
			       input[1]=  "D:\\Automation Support\\eclipse\\chromedriver.exe";
			     Operations.browserLaunch(input);
			      
			 	//open application
			   Object input1 [] = new Object [1];
	           input1[0]="https://www.flipkart.com/";
	           Operations.openApplication(input1);
		 
		       //synchronization
	           Operations.implicitWaittt();       
		            
		           //minimize window
	            Object input2 [] = new Object [1];
		        input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		        Operations.windowMini(input2);
		
		   	    //movetoelemnt
		        Thread.sleep(5000);
	            Object input3[] = new Object [1];	
		        input3[0]="//*[@class='_1_3w1N']";
		        Operations.move(input3);
		
			   	//movetoelemnt1
	            Object input4[] = new Object [1];
	            input4[0]="(//*[@class='_3vhnxf'])[1]";
	            Operations.move1(input4);
	                                                                            
	            //login and password
	            Object input5[] = new Object [2];
	            input5[0]="(//*[@type='text'])[2]";
	            input5[1]= "9359363302";                           //username
	            Operations.login(input5);
		      
	            Object input6[] = new Object [2];
	            input6[0]="//*[@type='password']";
	            input6[1]= "999999999";                           //password
	            Operations.login(input6);
	           
	            //click on login
	            Object input7[] = new Object [1];
	            input7[0]="(//*[@type='submit'])[2]";
	            Operations.login1(input7);
	            }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
