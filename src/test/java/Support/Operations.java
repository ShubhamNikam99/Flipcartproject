package Support;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Operations 
{

	public static WebDriver driver = null;
	
	public static Hashtable<String,Object> outputParameters= new Hashtable<String,Object>();
	
	//browser launch
	public static Hashtable<String,Object> browserLaunch(Object inputparameters[])
	{
		try {
		String browserName = (String) inputparameters[0];
		String webDriverExePath = (String) inputparameters[1];
	
	if(browserName.equalsIgnoreCase("Chrome"))	
	{
		System.setProperty("Webdriver.chrome.driver", webDriverExePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	else if(browserName.equalsIgnoreCase("fireFox"))
	{
		System.setProperty("Webdriver.gecko.driver", webDriverExePath);
		  driver=new FirefoxDriver ();
		  driver.manage().window().maximize();
	}
	
  outputParameters.put("STATUS", "PASS");
  outputParameters.put("MESSAGE", "methodUsed:browserLaunch,Input_Data : " + inputparameters[1].toString());  
	
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			  outputParameters.put("MESSAGE", "methodUsed:browserLaunch,Input_Data : " + inputparameters[1].toString());  
				
		}
		
	
	return outputParameters;
	
	}
	
	
	
	
	//open aaplication
	public static Hashtable<String,Object> openApplication(Object inputparameters[])
	{  
		try {
		String URL = (String) inputparameters[0]; 
		   driver.get(URL);
		   
		   outputParameters.put("STATUS", "PASS");
		   outputParameters.put("MESSAGE", "methodUsed:openApplication,Input_Data : " + inputparameters[0].toString());  
		 	
		}catch(Exception e)
		{
			   outputParameters.put("STATUS", "FAIL");
			   outputParameters.put("MESSAGE", "methodUsed:openApplication,Input_Data : " + inputparameters[0].toString());  
			 	
		}
		
		   
		return outputParameters;
		   
	}
	//synchronization
	public static Hashtable<String,Object> implicitWaittt()
	{
		try {
	driver.manage().timeouts().implicitlyWait(27,TimeUnit.SECONDS);
	
	  outputParameters.put("STATUS", "PASS");
//	  outputParameters.put("MESSAGE", "methodUsed:browserLaunch,Input_Data : " + inputparameters[1].toString());  
		
		
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
		}
		return outputParameters;
	}
	//minimize window
	public static Hashtable<String,Object> windowMini(Object[] inputparameters)
	{  
		try {
			driver.manage().timeouts().implicitlyWait(72,TimeUnit.SECONDS);
		String xpath = (String) inputparameters[0];
        driver.findElement(By.xpath(xpath)).click();
        outputParameters.put("STATUS", "PASS");
        outputParameters.put("MESSAGE", "methodUsed:windowMini,Input_Data : " + inputparameters[0].toString());  
      	
		
		}catch(Exception e)
		{
			   outputParameters.put("STATUS", "FAIL");
		        outputParameters.put("MESSAGE", "methodUsed:windowMini,Input_Data : " + inputparameters[0].toString());  
		      	
		}
		return outputParameters;
	}
	//movetoelemnt
	public static Hashtable<String,Object> move (Object inputparameters[]) throws Throwable
	{	
		try {
		Thread.sleep(5000);
		String xpath = (String) inputparameters[0];
		Actions act = new Actions (driver);
		WebElement obj = driver.findElement(By.xpath(xpath));
	    act.moveToElement(obj).build().perform();
		
	    outputParameters.put("STATUS", "PASS");
	    outputParameters.put("MESSAGE", "methodUsed:move,Input_Data : " + inputparameters[0].toString());  
	  	
		
		}catch(Exception e)
		{
			  outputParameters.put("STATUS", "FAIL");
			    outputParameters.put("MESSAGE", "methodUsed:move,Input_Data : " + inputparameters[0].toString());  
			  			}
		return outputParameters;
		}
	
	//movetoelemnt1
	public static Hashtable<String,Object> move1(Object inputparameters []) throws Throwable
	{  
		try {
		Thread.sleep(5000);
		String xpath = (String) inputparameters[0];
	    Actions act = new Actions(driver); 
	WebElement obj = driver.findElement(By.xpath(xpath));
	          act.moveToElement(obj).build().perform();
	          obj.click();
	         
	          outputParameters.put("STATUS", "PASS");
	          outputParameters.put("MESSAGE", "methodUsed:move1,Input_Data : " + inputparameters[0].toString());  
	        	
		
		}catch(Exception e)
		{
		     outputParameters.put("STATUS", "FAIL");
	          outputParameters.put("MESSAGE", "methodUsed:move1,Input_Data : " + inputparameters[0].toString());  
	        	
				}
		
		
		return outputParameters;
		}
    //login and password
	public static Hashtable<String,Object> login (Object inputparameters[])
	{
		try {
			
			driver.manage().timeouts().implicitlyWait(72,TimeUnit.SECONDS);
		String xpath = (String) inputparameters[0];
		String xpath1 = (String) inputparameters[1];
    WebElement number = driver.findElement(By.xpath(xpath));
               number.clear();
               number.sendKeys(xpath1);
             
               outputParameters.put("STATUS", "PASS");
               outputParameters.put("MESSAGE", "methodUsed:login,Input_Data : " + inputparameters[1].toString());  
             	
		
		}catch(Exception e)
		{
			  outputParameters.put("STATUS", "FAIL");
              outputParameters.put("MESSAGE", "methodUsed:login,Input_Data : " + inputparameters[1].toString());  
   		}
		
		return outputParameters;
	}
	 //click on login
	public static Hashtable<String,Object> login1 (Object inputparameters[])
	{
		try {
			driver.manage().timeouts().implicitlyWait(72,TimeUnit.SECONDS);
		String xpath = (String) inputparameters[0];
		driver.findElement(By.xpath(xpath)).click();
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:login1,Input_Data : " + inputparameters[0].toString());  
			
		
		
		
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:login1,Input_Data : " + inputparameters[0].toString());  
				
		}
		
		return outputParameters;
		}
	
	//gettext mth
	public static Hashtable<String,Object> text(Object inputparameters[]) 
	{    
		try {
			driver.manage().timeouts().implicitlyWait(72,TimeUnit.SECONDS);
       String path = (String) inputparameters[0];
          WebElement objj =driver.findElement(By.xpath(path));
             String objj1= objj.getText();
        String path1 = (String) inputparameters[1];
	if(objj1.equalsIgnoreCase(path1))
	{
		
	System.out.println("Test case passed ");
	}
	
	else
	{
		
		System.out.println("Test case failed ");
	}
	
	  outputParameters.put("STATUS", "PASS");
	  outputParameters.put("MESSAGE", "methodUsed: text,Input_Data : " + inputparameters[1].toString());  
		
		
		
		
		}catch(Exception e)
		{
			 outputParameters.put("STATUS", "FAIL");
			  outputParameters.put("MESSAGE", "methodUsed: text,Input_Data : " + inputparameters[1].toString());  
				
				
		}
		
		return outputParameters;
	}
	public static void main(String[]args) throws Throwable
	{
		//browser launch
		Object input[] = new Object [2];
		       input[0]="Chrome";
		       input[1]=  "D:\\Automation Support\\eclipse\\chromedriver.exe";
		       browserLaunch(input);
		      
		 	//open application
		   Object input1 [] = new Object [1];
           input1[0]="https://www.flipkart.com/";
	       openApplication(input1);
	 
	       //synchronization
	       implicitWaittt();       
	            
	           //minimize window
            Object input2 [] = new Object [1];
	        input2[0]="//*[@class='_2KpZ6l _2doB4z']";
	        windowMini(input2);
	
	   	    //movetoelemnt
	        Thread.sleep(5000);
            Object input3[] = new Object [1];	
	        input3[0]="//*[@class='_1_3w1N']";
	        move(input3);
	
		   	//movetoelemnt1
            Object input4[] = new Object [1];
            input4[0]="(//*[@class='_3vhnxf'])[1]";
            move1(input4);
                                                                            
            //login and password
            Object input5[] = new Object [2];
            input5[0]="(//*[@type='text'])[2]";
            input5[1]= "9359363302";                           //username
            login(input5);
	      
            Object input6[] = new Object [2];
            input6[0]="//*[@type='password']";
            input6[1]= "999999999";                           //password
            login(input6);
           
            //click on login
            Object input7[] = new Object [1];
            input7[0]="(//*[@type='submit'])[2]";
            login1(input7);
            
	       //gettext
            Object input8[] = new Object [2];
            input8[0]="//*[@class='_14mvAI']";
            input8[1]="Hello";
            text(input8);

//i have created this mth only for my understanding,it is not in login.feature
//           Object input9[] = new Object [2];
//            input9[0]="//*[@class='_14mvAI']";
//           input9[1]="Hello";
//           trry(input9);
   	}
    }


//	i have created this mth only for my understanding,it is not in login.feature 
//	public static Hashtable<String,Object> trry (Object inputparameters[])
//	{
//		 String xx = (String)  inputparameters[0];
		
//	     String oo = driver.findElement(By.xpath(xx)).getText();
//	            System.out.println(oo);  
	             //or
//	             driver.findElement(By.xpath(xx)).getText();
//	             System.out.println(driver.findElement(By.xpath(xx)).getText());
//	      String ll = (String)  inputparameters[1];
//	}
	
	
	
	
	
	